package com.onesignal.session.internal.outcomes.impl;

import B4.l;
import com.onesignal.common.NetworkUtils;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.device.IDeviceService;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.session.internal.influence.IInfluenceManager;
import com.onesignal.session.internal.influence.Influence;
import com.onesignal.session.internal.influence.InfluenceChannel;
import com.onesignal.session.internal.influence.InfluenceType;
import com.onesignal.session.internal.outcomes.IOutcomeEventsController;
import com.onesignal.session.internal.session.ISessionLifecycleHandler;
import com.onesignal.session.internal.session.ISessionService;
import com.onesignal.user.internal.backend.SubscriptionObjectType;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.subscriptions.ISubscriptionManager;
import e5.g;
import f4.v;
import g4.AbstractC0465j;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class OutcomeEventsController implements IOutcomeEventsController, IStartableService, ISessionLifecycleHandler {
    private final ConfigModelStore _configModelStore;
    private final IDeviceService _deviceService;
    private final IdentityModelStore _identityModelStore;
    private final IInfluenceManager _influenceManager;
    private final IOutcomeEventsBackendService _outcomeEventsBackend;
    private final IOutcomeEventsRepository _outcomeEventsCache;
    private final IOutcomeEventsPreferences _outcomeEventsPreferences;
    private final ISessionService _session;
    private final ISubscriptionManager _subscriptionManager;
    private final ITime _time;
    private Set<String> unattributedUniqueOutcomeEventsSentOnSession;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[InfluenceType.values().length];
            try {
                iArr[InfluenceType.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InfluenceType.INDIRECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InfluenceType.UNATTRIBUTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InfluenceType.DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InfluenceChannel.values().length];
            try {
                iArr2[InfluenceChannel.IAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[InfluenceChannel.NOTIFICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public OutcomeEventsController(ISessionService _session, IInfluenceManager _influenceManager, IOutcomeEventsRepository _outcomeEventsCache, IOutcomeEventsPreferences _outcomeEventsPreferences, IOutcomeEventsBackendService _outcomeEventsBackend, ConfigModelStore _configModelStore, IdentityModelStore _identityModelStore, ISubscriptionManager _subscriptionManager, IDeviceService _deviceService, ITime _time) {
        i.e(_session, "_session");
        i.e(_influenceManager, "_influenceManager");
        i.e(_outcomeEventsCache, "_outcomeEventsCache");
        i.e(_outcomeEventsPreferences, "_outcomeEventsPreferences");
        i.e(_outcomeEventsBackend, "_outcomeEventsBackend");
        i.e(_configModelStore, "_configModelStore");
        i.e(_identityModelStore, "_identityModelStore");
        i.e(_subscriptionManager, "_subscriptionManager");
        i.e(_deviceService, "_deviceService");
        i.e(_time, "_time");
        this._session = _session;
        this._influenceManager = _influenceManager;
        this._outcomeEventsCache = _outcomeEventsCache;
        this._outcomeEventsPreferences = _outcomeEventsPreferences;
        this._outcomeEventsBackend = _outcomeEventsBackend;
        this._configModelStore = _configModelStore;
        this._identityModelStore = _identityModelStore;
        this._subscriptionManager = _subscriptionManager;
        this._deviceService = _deviceService;
        this._time = _time;
        this.unattributedUniqueOutcomeEventsSentOnSession = new LinkedHashSet();
        Set<String> unattributedUniqueOutcomeEventsSentByChannel = _outcomeEventsPreferences.getUnattributedUniqueOutcomeEventsSentByChannel();
        this.unattributedUniqueOutcomeEventsSentOnSession = unattributedUniqueOutcomeEventsSentByChannel != null ? AbstractC0465j.W0(unattributedUniqueOutcomeEventsSentByChannel) : new LinkedHashSet<>();
        _session.subscribe(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0045 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getUniqueIds(String str, List<Influence> list, InterfaceC1218d interfaceC1218d) {
        OutcomeEventsController$getUniqueIds$1 outcomeEventsController$getUniqueIds$1;
        int i2;
        List list2;
        if (interfaceC1218d instanceof OutcomeEventsController$getUniqueIds$1) {
            outcomeEventsController$getUniqueIds$1 = (OutcomeEventsController$getUniqueIds$1) interfaceC1218d;
            int i3 = outcomeEventsController$getUniqueIds$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                outcomeEventsController$getUniqueIds$1.label = i3 - Integer.MIN_VALUE;
                Object obj = outcomeEventsController$getUniqueIds$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = outcomeEventsController$getUniqueIds$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    IOutcomeEventsRepository iOutcomeEventsRepository = this._outcomeEventsCache;
                    outcomeEventsController$getUniqueIds$1.label = 1;
                    obj = iOutcomeEventsRepository.getNotCachedUniqueInfluencesForOutcome(str, list, outcomeEventsController$getUniqueIds$1);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g.y(obj);
                }
                list2 = (List) obj;
                if (list2.isEmpty()) {
                    return list2;
                }
                return null;
            }
        }
        outcomeEventsController$getUniqueIds$1 = new OutcomeEventsController$getUniqueIds$1(this, interfaceC1218d);
        Object obj2 = outcomeEventsController$getUniqueIds$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = outcomeEventsController$getUniqueIds$1.label;
        if (i2 != 0) {
        }
        list2 = (List) obj2;
        if (list2.isEmpty()) {
        }
    }

    private final List<Influence> removeDisabledInfluences(List<Influence> list) {
        ArrayList U02 = AbstractC0465j.U0(list);
        for (Influence influence : list) {
            if (influence.getInfluenceType().isDisabled()) {
                Logging.debug$default("OutcomeEventsController.removeDisabledInfluences: Outcomes disabled for channel: " + influence.getInfluenceChannel(), null, 2, null);
                U02.remove(influence);
            }
        }
        return U02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object requestMeasureOutcomeEvent(OutcomeEventParams outcomeEventParams, InterfaceC1218d interfaceC1218d) {
        String appId = this._configModelStore.getModel().getAppId();
        String id = this._subscriptionManager.getSubscriptions().getPush().getId();
        String value = SubscriptionObjectType.Companion.fromDeviceType(this._deviceService.getDeviceType()).getValue();
        if (id.length() == 0 || value.length() == 0) {
            throw new BackendException(0, null, null, 6, null);
        }
        OutcomeEvent fromOutcomeEventParamstoOutcomeEvent = OutcomeEvent.Companion.fromOutcomeEventParamstoOutcomeEvent(outcomeEventParams);
        int i2 = WhenMappings.$EnumSwitchMapping$0[fromOutcomeEventParamstoOutcomeEvent.getSession().ordinal()];
        Object sendOutcomeEvent = this._outcomeEventsBackend.sendOutcomeEvent(appId, this._identityModelStore.getModel().getOnesignalId(), id, value, i2 != 1 ? i2 != 2 ? null : Boolean.FALSE : Boolean.TRUE, fromOutcomeEventParamstoOutcomeEvent, interfaceC1218d);
        return sendOutcomeEvent == EnumC1260a.f11058a ? sendOutcomeEvent : v.f5689a;
    }

    private final void saveAttributedUniqueOutcomeNotifications(OutcomeEventParams outcomeEventParams) {
        ThreadUtilsKt.suspendifyOnIO(new OutcomeEventsController$saveAttributedUniqueOutcomeNotifications$1(this, outcomeEventParams, null));
    }

    private final void saveUnattributedUniqueOutcomeEvents() {
        this._outcomeEventsPreferences.setUnattributedUniqueOutcomeEventsSentByChannel(this.unattributedUniqueOutcomeEventsSentOnSession);
    }

    private final void saveUniqueOutcome(OutcomeEventParams outcomeEventParams) {
        if (outcomeEventParams.isUnattributed()) {
            saveUnattributedUniqueOutcomeEvents();
        } else {
            saveAttributedUniqueOutcomeNotifications(outcomeEventParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendAndCreateOutcomeEvent(String str, float f3, long j2, List<Influence> list, InterfaceC1218d interfaceC1218d) {
        OutcomeEventsController$sendAndCreateOutcomeEvent$1 outcomeEventsController$sendAndCreateOutcomeEvent$1;
        int i2;
        String str2;
        BackendException backendException;
        OutcomeEventsController outcomeEventsController;
        OutcomeEventParams outcomeEventParams;
        long j6;
        OutcomeEventsController outcomeEventsController2;
        String str3;
        NetworkUtils.ResponseStatusType responseStatusType;
        if (interfaceC1218d instanceof OutcomeEventsController$sendAndCreateOutcomeEvent$1) {
            outcomeEventsController$sendAndCreateOutcomeEvent$1 = (OutcomeEventsController$sendAndCreateOutcomeEvent$1) interfaceC1218d;
            int i3 = outcomeEventsController$sendAndCreateOutcomeEvent$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                outcomeEventsController$sendAndCreateOutcomeEvent$1.label = i3 - Integer.MIN_VALUE;
                Object obj = outcomeEventsController$sendAndCreateOutcomeEvent$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = outcomeEventsController$sendAndCreateOutcomeEvent$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    long currentTimeMillis = this._time.getCurrentTimeMillis() / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
                    boolean z = false;
                    OutcomeSourceBody outcomeSourceBody = null;
                    OutcomeSourceBody outcomeSourceBody2 = null;
                    for (Influence influence : list) {
                        int i6 = WhenMappings.$EnumSwitchMapping$0[influence.getInfluenceType().ordinal()];
                        if (i6 == 1) {
                            if (outcomeSourceBody == null) {
                                outcomeSourceBody = new OutcomeSourceBody(null, null, 3, null);
                            }
                            outcomeSourceBody = setSourceChannelIds(influence, outcomeSourceBody);
                        } else if (i6 == 2) {
                            if (outcomeSourceBody2 == null) {
                                outcomeSourceBody2 = new OutcomeSourceBody(null, null, 3, null);
                            }
                            outcomeSourceBody2 = setSourceChannelIds(influence, outcomeSourceBody2);
                        } else if (i6 == 3) {
                            z = true;
                        } else if (i6 == 4) {
                            Logging.verbose$default("OutcomeEventsController.sendAndCreateOutcomeEvent: Outcomes disabled for channel: " + influence.getInfluenceChannel(), null, 2, null);
                        }
                    }
                    if (outcomeSourceBody == null && outcomeSourceBody2 == null && !z) {
                        Logging.verbose$default("OutcomeEventsController.sendAndCreateOutcomeEvent: Outcomes disabled for all channels", null, 2, null);
                        return null;
                    }
                    OutcomeEventParams outcomeEventParams2 = new OutcomeEventParams(str, new OutcomeSource(outcomeSourceBody, outcomeSourceBody2), f3, j2, 0L);
                    try {
                        outcomeEventsController$sendAndCreateOutcomeEvent$1.L$0 = this;
                        str2 = str;
                    } catch (BackendException e3) {
                        e = e3;
                        str2 = str;
                    }
                    try {
                        outcomeEventsController$sendAndCreateOutcomeEvent$1.L$1 = str2;
                        outcomeEventsController$sendAndCreateOutcomeEvent$1.L$2 = outcomeEventParams2;
                        outcomeEventsController$sendAndCreateOutcomeEvent$1.J$0 = currentTimeMillis;
                        outcomeEventsController$sendAndCreateOutcomeEvent$1.label = 1;
                        if (requestMeasureOutcomeEvent(outcomeEventParams2, outcomeEventsController$sendAndCreateOutcomeEvent$1) == enumC1260a) {
                            return enumC1260a;
                        }
                        outcomeEventsController2 = this;
                        outcomeEventParams = outcomeEventParams2;
                        j6 = currentTimeMillis;
                        str3 = str2;
                    } catch (BackendException e6) {
                        e = e6;
                        backendException = e;
                        outcomeEventsController = this;
                        outcomeEventParams = outcomeEventParams2;
                        j6 = currentTimeMillis;
                        responseStatusType = NetworkUtils.INSTANCE.getResponseStatusType(backendException.getStatusCode());
                        String str4 = "OutcomeEventsController.sendAndCreateOutcomeEvent: Sending outcome with name: " + str2 + " failed with status code: " + backendException.getStatusCode() + " and response: " + backendException.getResponse();
                        if (responseStatusType != NetworkUtils.ResponseStatusType.RETRYABLE) {
                        }
                        return null;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2 && i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        g.y(obj);
                        return null;
                    }
                    j6 = outcomeEventsController$sendAndCreateOutcomeEvent$1.J$0;
                    outcomeEventParams = (OutcomeEventParams) outcomeEventsController$sendAndCreateOutcomeEvent$1.L$2;
                    str3 = (String) outcomeEventsController$sendAndCreateOutcomeEvent$1.L$1;
                    outcomeEventsController2 = (OutcomeEventsController) outcomeEventsController$sendAndCreateOutcomeEvent$1.L$0;
                    try {
                        g.y(obj);
                    } catch (BackendException e7) {
                        String str5 = str3;
                        backendException = e7;
                        outcomeEventsController = outcomeEventsController2;
                        str2 = str5;
                        responseStatusType = NetworkUtils.INSTANCE.getResponseStatusType(backendException.getStatusCode());
                        String str42 = "OutcomeEventsController.sendAndCreateOutcomeEvent: Sending outcome with name: " + str2 + " failed with status code: " + backendException.getStatusCode() + " and response: " + backendException.getResponse();
                        if (responseStatusType != NetworkUtils.ResponseStatusType.RETRYABLE) {
                            Logging.info$default(str42 + " Outcome event was cached and will be reattempted on app cold start", null, 2, null);
                            outcomeEventParams.setTimestamp(j6);
                            IOutcomeEventsRepository iOutcomeEventsRepository = outcomeEventsController._outcomeEventsCache;
                            outcomeEventsController$sendAndCreateOutcomeEvent$1.L$0 = null;
                            outcomeEventsController$sendAndCreateOutcomeEvent$1.L$1 = null;
                            outcomeEventsController$sendAndCreateOutcomeEvent$1.L$2 = null;
                            outcomeEventsController$sendAndCreateOutcomeEvent$1.label = 2;
                            if (iOutcomeEventsRepository.saveOutcomeEvent(outcomeEventParams, outcomeEventsController$sendAndCreateOutcomeEvent$1) == enumC1260a) {
                                return enumC1260a;
                            }
                        } else {
                            Logging.warn$default(str42 + " Outcome event will be omitted!", null, 2, null);
                            IOutcomeEventsRepository iOutcomeEventsRepository2 = outcomeEventsController._outcomeEventsCache;
                            outcomeEventsController$sendAndCreateOutcomeEvent$1.L$0 = null;
                            outcomeEventsController$sendAndCreateOutcomeEvent$1.L$1 = null;
                            outcomeEventsController$sendAndCreateOutcomeEvent$1.L$2 = null;
                            outcomeEventsController$sendAndCreateOutcomeEvent$1.label = 3;
                            if (iOutcomeEventsRepository2.deleteOldOutcomeEvent(outcomeEventParams, outcomeEventsController$sendAndCreateOutcomeEvent$1) == enumC1260a) {
                                return enumC1260a;
                            }
                        }
                        return null;
                    }
                }
                outcomeEventsController2.saveUniqueOutcome(outcomeEventParams);
                return OutcomeEvent.Companion.fromOutcomeEventParamstoOutcomeEvent(outcomeEventParams);
            }
        }
        outcomeEventsController$sendAndCreateOutcomeEvent$1 = new OutcomeEventsController$sendAndCreateOutcomeEvent$1(this, interfaceC1218d);
        Object obj2 = outcomeEventsController$sendAndCreateOutcomeEvent$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = outcomeEventsController$sendAndCreateOutcomeEvent$1.label;
        if (i2 != 0) {
        }
        outcomeEventsController2.saveUniqueOutcome(outcomeEventParams);
        return OutcomeEvent.Companion.fromOutcomeEventParamstoOutcomeEvent(outcomeEventParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(3:(1:(1:12)(2:16|17))(2:18|19)|13|14)(2:20|21))(4:25|26|27|(1:29)(1:30))|22|(1:24)|13|14))|41|6|7|(0)(0)|22|(0)|13|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0043, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendSavedOutcomeEvent(OutcomeEventParams outcomeEventParams, InterfaceC1218d interfaceC1218d) {
        OutcomeEventsController$sendSavedOutcomeEvent$1 outcomeEventsController$sendSavedOutcomeEvent$1;
        EnumC1260a enumC1260a;
        OutcomeEventsController outcomeEventsController;
        OutcomeEventsController outcomeEventsController2;
        IOutcomeEventsRepository iOutcomeEventsRepository;
        if (interfaceC1218d instanceof OutcomeEventsController$sendSavedOutcomeEvent$1) {
            outcomeEventsController$sendSavedOutcomeEvent$1 = (OutcomeEventsController$sendSavedOutcomeEvent$1) interfaceC1218d;
            int i2 = outcomeEventsController$sendSavedOutcomeEvent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                outcomeEventsController$sendSavedOutcomeEvent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = outcomeEventsController$sendSavedOutcomeEvent$1.result;
                enumC1260a = EnumC1260a.f11058a;
                outcomeEventsController = outcomeEventsController$sendSavedOutcomeEvent$1.label;
                if (outcomeEventsController != 0) {
                    g.y(obj);
                    try {
                        outcomeEventsController$sendSavedOutcomeEvent$1.L$0 = this;
                        outcomeEventsController$sendSavedOutcomeEvent$1.L$1 = outcomeEventParams;
                        outcomeEventsController$sendSavedOutcomeEvent$1.label = 1;
                        if (requestMeasureOutcomeEvent(outcomeEventParams, outcomeEventsController$sendSavedOutcomeEvent$1) == enumC1260a) {
                            return enumC1260a;
                        }
                        outcomeEventsController2 = this;
                    } catch (BackendException e3) {
                        e = e3;
                        outcomeEventsController = this;
                        NetworkUtils.ResponseStatusType responseStatusType = NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode());
                        String str = "OutcomeEventsController.sendSavedOutcomeEvent: Sending outcome with name: " + outcomeEventParams.getOutcomeId() + " failed with status code: " + e.getStatusCode() + " and response: " + e.getResponse();
                        if (responseStatusType == NetworkUtils.ResponseStatusType.RETRYABLE) {
                            Logging.info$default(str + " Outcome event was cached and will be reattempted on app cold start", null, 2, null);
                        } else {
                            Logging.warn$default(str + " Outcome event will be omitted!", null, 2, null);
                            IOutcomeEventsRepository iOutcomeEventsRepository2 = outcomeEventsController._outcomeEventsCache;
                            outcomeEventsController$sendSavedOutcomeEvent$1.L$0 = null;
                            outcomeEventsController$sendSavedOutcomeEvent$1.L$1 = null;
                            outcomeEventsController$sendSavedOutcomeEvent$1.label = 3;
                            if (iOutcomeEventsRepository2.deleteOldOutcomeEvent(outcomeEventParams, outcomeEventsController$sendSavedOutcomeEvent$1) == enumC1260a) {
                                return enumC1260a;
                            }
                        }
                        return v.f5689a;
                    }
                } else {
                    if (outcomeEventsController != 1) {
                        if (outcomeEventsController == 2) {
                            g.y(obj);
                        } else {
                            if (outcomeEventsController != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            g.y(obj);
                        }
                        return v.f5689a;
                    }
                    outcomeEventParams = (OutcomeEventParams) outcomeEventsController$sendSavedOutcomeEvent$1.L$1;
                    outcomeEventsController2 = (OutcomeEventsController) outcomeEventsController$sendSavedOutcomeEvent$1.L$0;
                    g.y(obj);
                }
                iOutcomeEventsRepository = outcomeEventsController2._outcomeEventsCache;
                outcomeEventsController$sendSavedOutcomeEvent$1.L$0 = outcomeEventsController2;
                outcomeEventsController$sendSavedOutcomeEvent$1.L$1 = outcomeEventParams;
                outcomeEventsController$sendSavedOutcomeEvent$1.label = 2;
                if (iOutcomeEventsRepository.deleteOldOutcomeEvent(outcomeEventParams, outcomeEventsController$sendSavedOutcomeEvent$1) == enumC1260a) {
                    return enumC1260a;
                }
                return v.f5689a;
            }
        }
        outcomeEventsController$sendSavedOutcomeEvent$1 = new OutcomeEventsController$sendSavedOutcomeEvent$1(this, interfaceC1218d);
        Object obj2 = outcomeEventsController$sendSavedOutcomeEvent$1.result;
        enumC1260a = EnumC1260a.f11058a;
        outcomeEventsController = outcomeEventsController$sendSavedOutcomeEvent$1.label;
        if (outcomeEventsController != 0) {
        }
        iOutcomeEventsRepository = outcomeEventsController2._outcomeEventsCache;
        outcomeEventsController$sendSavedOutcomeEvent$1.L$0 = outcomeEventsController2;
        outcomeEventsController$sendSavedOutcomeEvent$1.L$1 = outcomeEventParams;
        outcomeEventsController$sendSavedOutcomeEvent$1.label = 2;
        if (iOutcomeEventsRepository.deleteOldOutcomeEvent(outcomeEventParams, outcomeEventsController$sendSavedOutcomeEvent$1) == enumC1260a) {
        }
        return v.f5689a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendSavedOutcomes(InterfaceC1218d interfaceC1218d) {
        OutcomeEventsController$sendSavedOutcomes$1 outcomeEventsController$sendSavedOutcomes$1;
        int i2;
        OutcomeEventsController outcomeEventsController;
        OutcomeEventsController outcomeEventsController2;
        Iterator it;
        if (interfaceC1218d instanceof OutcomeEventsController$sendSavedOutcomes$1) {
            outcomeEventsController$sendSavedOutcomes$1 = (OutcomeEventsController$sendSavedOutcomes$1) interfaceC1218d;
            int i3 = outcomeEventsController$sendSavedOutcomes$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                outcomeEventsController$sendSavedOutcomes$1.label = i3 - Integer.MIN_VALUE;
                Object obj = outcomeEventsController$sendSavedOutcomes$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = outcomeEventsController$sendSavedOutcomes$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    IOutcomeEventsRepository iOutcomeEventsRepository = this._outcomeEventsCache;
                    outcomeEventsController$sendSavedOutcomes$1.L$0 = this;
                    outcomeEventsController$sendSavedOutcomes$1.label = 1;
                    obj = iOutcomeEventsRepository.getAllEventsToSend(outcomeEventsController$sendSavedOutcomes$1);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                    outcomeEventsController = this;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (Iterator) outcomeEventsController$sendSavedOutcomes$1.L$1;
                        outcomeEventsController2 = (OutcomeEventsController) outcomeEventsController$sendSavedOutcomes$1.L$0;
                        g.y(obj);
                        while (it.hasNext()) {
                            OutcomeEventParams outcomeEventParams = (OutcomeEventParams) it.next();
                            outcomeEventsController$sendSavedOutcomes$1.L$0 = outcomeEventsController2;
                            outcomeEventsController$sendSavedOutcomes$1.L$1 = it;
                            outcomeEventsController$sendSavedOutcomes$1.label = 2;
                            if (outcomeEventsController2.sendSavedOutcomeEvent(outcomeEventParams, outcomeEventsController$sendSavedOutcomes$1) == enumC1260a) {
                                return enumC1260a;
                            }
                        }
                        return v.f5689a;
                    }
                    outcomeEventsController = (OutcomeEventsController) outcomeEventsController$sendSavedOutcomes$1.L$0;
                    g.y(obj);
                }
                outcomeEventsController2 = outcomeEventsController;
                it = ((List) obj).iterator();
                while (it.hasNext()) {
                }
                return v.f5689a;
            }
        }
        outcomeEventsController$sendSavedOutcomes$1 = new OutcomeEventsController$sendSavedOutcomes$1(this, interfaceC1218d);
        Object obj2 = outcomeEventsController$sendSavedOutcomes$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = outcomeEventsController$sendSavedOutcomes$1.label;
        if (i2 != 0) {
        }
        outcomeEventsController2 = outcomeEventsController;
        it = ((List) obj2).iterator();
        while (it.hasNext()) {
        }
        return v.f5689a;
    }

    private final OutcomeSourceBody setSourceChannelIds(Influence influence, OutcomeSourceBody outcomeSourceBody) {
        int i2 = WhenMappings.$EnumSwitchMapping$1[influence.getInfluenceChannel().ordinal()];
        if (i2 == 1) {
            outcomeSourceBody.setInAppMessagesIds(influence.getIds());
        } else if (i2 == 2) {
            outcomeSourceBody.setNotificationIds(influence.getIds());
        }
        return outcomeSourceBody;
    }

    @Override // com.onesignal.session.internal.session.ISessionLifecycleHandler
    public void onSessionActive() {
    }

    @Override // com.onesignal.session.internal.session.ISessionLifecycleHandler
    public void onSessionEnded(long j2) {
    }

    @Override // com.onesignal.session.internal.session.ISessionLifecycleHandler
    public void onSessionStarted() {
        Logging.debug$default("OutcomeEventsController.sessionStarted: Cleaning outcomes for new session", null, 2, null);
        this.unattributedUniqueOutcomeEventsSentOnSession = new LinkedHashSet();
        saveUnattributedUniqueOutcomeEvents();
    }

    @Override // com.onesignal.session.internal.outcomes.IOutcomeEventsController
    public Object sendOutcomeEvent(String str, InterfaceC1218d interfaceC1218d) {
        return sendAndCreateOutcomeEvent(str, 0.0f, 0L, this._influenceManager.getInfluences(), interfaceC1218d);
    }

    @Override // com.onesignal.session.internal.outcomes.IOutcomeEventsController
    public Object sendOutcomeEventWithValue(String str, float f3, InterfaceC1218d interfaceC1218d) {
        return sendAndCreateOutcomeEvent(str, f3, 0L, this._influenceManager.getInfluences(), interfaceC1218d);
    }

    @Override // com.onesignal.session.internal.outcomes.IOutcomeEventsController
    public Object sendSessionEndOutcomeEvent(long j2, InterfaceC1218d interfaceC1218d) {
        return sendAndCreateOutcomeEvent("os__session_duration", 0.0f, j2, this._influenceManager.getInfluences(), interfaceC1218d);
    }

    @Override // com.onesignal.session.internal.outcomes.IOutcomeEventsController
    public Object sendUniqueOutcomeEvent(String str, InterfaceC1218d interfaceC1218d) {
        return sendUniqueOutcomeEvent(str, this._influenceManager.getInfluences(), interfaceC1218d);
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        ThreadUtilsKt.suspendifyOnIO(new OutcomeEventsController$start$1(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendUniqueOutcomeEvent(String str, List<Influence> list, InterfaceC1218d interfaceC1218d) {
        OutcomeEventsController$sendUniqueOutcomeEvent$2 outcomeEventsController$sendUniqueOutcomeEvent$2;
        int i2;
        OutcomeEventsController outcomeEventsController;
        String str2;
        List<Influence> list2;
        List<Influence> list3;
        if (interfaceC1218d instanceof OutcomeEventsController$sendUniqueOutcomeEvent$2) {
            outcomeEventsController$sendUniqueOutcomeEvent$2 = (OutcomeEventsController$sendUniqueOutcomeEvent$2) interfaceC1218d;
            int i3 = outcomeEventsController$sendUniqueOutcomeEvent$2.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                outcomeEventsController$sendUniqueOutcomeEvent$2.label = i3 - Integer.MIN_VALUE;
                OutcomeEventsController$sendUniqueOutcomeEvent$2 outcomeEventsController$sendUniqueOutcomeEvent$22 = outcomeEventsController$sendUniqueOutcomeEvent$2;
                Object obj = outcomeEventsController$sendUniqueOutcomeEvent$22.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = outcomeEventsController$sendUniqueOutcomeEvent$22.label;
                if (i2 != 0) {
                    g.y(obj);
                    List<Influence> removeDisabledInfluences = removeDisabledInfluences(list);
                    if (removeDisabledInfluences.isEmpty()) {
                        Logging.debug$default("OutcomeEventsController.sendUniqueOutcomeEvent: Unique Outcome disabled for current session", null, 2, null);
                        return null;
                    }
                    Iterator<Influence> it = removeDisabledInfluences.iterator();
                    while (it.hasNext()) {
                        if (it.next().getInfluenceType().isAttributed()) {
                            outcomeEventsController$sendUniqueOutcomeEvent$22.L$0 = this;
                            outcomeEventsController$sendUniqueOutcomeEvent$22.L$1 = str;
                            outcomeEventsController$sendUniqueOutcomeEvent$22.L$2 = removeDisabledInfluences;
                            outcomeEventsController$sendUniqueOutcomeEvent$22.label = 1;
                            obj = getUniqueIds(str, removeDisabledInfluences, outcomeEventsController$sendUniqueOutcomeEvent$22);
                            if (obj == enumC1260a) {
                                return enumC1260a;
                            }
                            outcomeEventsController = this;
                            str2 = str;
                            list2 = removeDisabledInfluences;
                            list3 = (List) obj;
                            if (list3 != null) {
                            }
                        }
                    }
                    if (this.unattributedUniqueOutcomeEventsSentOnSession.contains(str)) {
                        Logging.debug$default(l.E("\n                    Measure endpoint will not send because unique outcome already sent for:\n                    Session: " + InfluenceType.UNATTRIBUTED + "\n                    Outcome name: " + str + "\n                    "), null, 2, null);
                        return null;
                    }
                    this.unattributedUniqueOutcomeEventsSentOnSession.add(str);
                    outcomeEventsController$sendUniqueOutcomeEvent$22.label = 3;
                    obj = sendAndCreateOutcomeEvent(str, 0.0f, 0L, removeDisabledInfluences, outcomeEventsController$sendUniqueOutcomeEvent$22);
                    return obj == enumC1260a ? enumC1260a : obj;
                }
                if (i2 == 1) {
                    list2 = (List) outcomeEventsController$sendUniqueOutcomeEvent$22.L$2;
                    str2 = (String) outcomeEventsController$sendUniqueOutcomeEvent$22.L$1;
                    outcomeEventsController = (OutcomeEventsController) outcomeEventsController$sendUniqueOutcomeEvent$22.L$0;
                    g.y(obj);
                    list3 = (List) obj;
                    if (list3 != null) {
                        Logging.debug$default(l.E("\n                    Measure endpoint will not send because unique outcome already sent for:\n                    SessionInfluences: " + list2 + "\n                    Outcome name: " + str2 + "\n                    "), null, 2, null);
                        return null;
                    }
                    outcomeEventsController$sendUniqueOutcomeEvent$22.L$0 = null;
                    outcomeEventsController$sendUniqueOutcomeEvent$22.L$1 = null;
                    outcomeEventsController$sendUniqueOutcomeEvent$22.L$2 = null;
                    outcomeEventsController$sendUniqueOutcomeEvent$22.label = 2;
                    obj = outcomeEventsController.sendAndCreateOutcomeEvent(str2, 0.0f, 0L, list3, outcomeEventsController$sendUniqueOutcomeEvent$22);
                    if (obj == enumC1260a) {
                        return enumC1260a;
                    }
                } else {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            g.y(obj);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g.y(obj);
                }
                return obj;
            }
        }
        outcomeEventsController$sendUniqueOutcomeEvent$2 = new OutcomeEventsController$sendUniqueOutcomeEvent$2(this, interfaceC1218d);
        OutcomeEventsController$sendUniqueOutcomeEvent$2 outcomeEventsController$sendUniqueOutcomeEvent$222 = outcomeEventsController$sendUniqueOutcomeEvent$2;
        Object obj2 = outcomeEventsController$sendUniqueOutcomeEvent$222.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = outcomeEventsController$sendUniqueOutcomeEvent$222.label;
        if (i2 != 0) {
        }
        return obj2;
    }
}
