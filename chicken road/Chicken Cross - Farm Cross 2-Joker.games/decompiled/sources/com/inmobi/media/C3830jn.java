package com.inmobi.media;

import android.content.Context;
import android.location.Location;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.appset.AppSetIdInfo;
import com.inmobi.media.core.config.models.SignalsConfig;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* renamed from: com.inmobi.media.jn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3830jn extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7188a;
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3830jn(Context context, Continuation continuation) {
        super(2, continuation);
        this.b = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3830jn(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3830jn(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:191:0x0052, code lost:
    
        if (com.inmobi.media.C3829jm.b(r18) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0054, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0049, code lost:
    
        if (r2 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x025d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Context context;
        String string;
        String string2;
        String string3;
        String string4;
        int i;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f7188a;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            C3859kn c3859kn = C3859kn.f7207a;
            Intrinsics.checkNotNullExpressionValue("kn", "access$getTAG$p(...)");
            if (C3859kn.b) {
                Intrinsics.checkNotNullExpressionValue("kn", "access$getTAG$p(...)");
                return Unit.INSTANCE;
            }
            J4 j4 = AbstractC4260z4.f7518a;
            this.f7188a = 1;
            Object b = AbstractC4260z4.f7518a.b(this);
            if (b != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                b = Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Mm.a();
                AppSetIdInfo appSetIdInfo = V1.f6903a;
                String str2 = AbstractC3648d9.f7066a;
                Y5 y5 = Y5.f6965a;
                y5.getClass();
                Y5.h();
                Y5.q();
                ((Boolean) Y5.q.getValue()).getClass();
                ((Number) Y5.f.getValue(y5, Y5.b[0])).intValue();
                C4235y7 c4235y7 = C4235y7.f7495a;
                c4235y7.getClass();
                SignalsConfig.FraudSignals config = C4235y7.b();
                C4235y7.c = config;
                if (config.getJailBrokenEnabled()) {
                    Intrinsics.checkNotNullParameter(config, "config");
                    if (config.getJailBrokenEnabled()) {
                        ((Boolean) C4235y7.d.getValue(c4235y7, C4235y7.b[0])).booleanValue();
                    }
                }
                if (config.getDebuggerAttachedEnabled()) {
                    Intrinsics.checkNotNullParameter(config, "config");
                    if (config.getDebuggerAttachedEnabled()) {
                        ((Boolean) C4235y7.e.getValue(c4235y7, C4235y7.b[1])).booleanValue();
                    }
                }
                if (config.getHookEnabled()) {
                    Intrinsics.checkNotNullParameter(config, "config");
                    if (config.getHookEnabled()) {
                        ((Boolean) C4235y7.f.getValue(c4235y7, C4235y7.b[2])).booleanValue();
                    }
                }
                if (config.getAppInstallTimeEnabled()) {
                    Intrinsics.checkNotNullParameter(config, "config");
                    if (config.getAppInstallTimeEnabled()) {
                        ((Number) C4235y7.g.getValue(c4235y7, C4235y7.b[3])).longValue();
                    }
                }
                if (config.getInstallSourceEnabled()) {
                    Intrinsics.checkNotNullParameter(config, "config");
                    if (config.getInstallSourceEnabled()) {
                    }
                }
                int i3 = AbstractC3940ni.f7268a;
                Context context2 = AbstractC3914mk.f7252a;
                if (i3 != Integer.MIN_VALUE) {
                    AbstractC3940ni.f7268a = i3;
                    if (context2 != null) {
                        ConcurrentHashMap concurrentHashMap = Db.b;
                        Cb.a(context2, "user_info_store").a("user_age", i3, false);
                    }
                }
                String str3 = AbstractC3940ni.c;
                Context context3 = AbstractC3914mk.f7252a;
                if (str3 != null) {
                    AbstractC3940ni.c = str3;
                    if (context3 != null) {
                        ConcurrentHashMap concurrentHashMap2 = Db.b;
                        Cb.a(context3, "user_info_store").a("user_age_group", str3, false);
                    }
                }
                String str4 = AbstractC3940ni.d;
                Context context4 = AbstractC3914mk.f7252a;
                AbstractC3940ni.d = str4;
                if (context4 != null && str4 != null) {
                    ConcurrentHashMap concurrentHashMap3 = Db.b;
                    Cb.a(context4, "user_info_store").a("user_area_code", str4, false);
                }
                String str5 = AbstractC3940ni.e;
                Context context5 = AbstractC3914mk.f7252a;
                if (str5 != null) {
                    AbstractC3940ni.e = str5;
                    if (context5 != null) {
                        ConcurrentHashMap concurrentHashMap4 = Db.b;
                        Cb.a(context5, "user_info_store").a("user_post_code", str5, false);
                    }
                }
                String str6 = AbstractC3940ni.f;
                Context context6 = AbstractC3914mk.f7252a;
                if (str6 != null) {
                    AbstractC3940ni.f = str6;
                    if (context6 != null) {
                        ConcurrentHashMap concurrentHashMap5 = Db.b;
                        Cb.a(context6, "user_info_store").a("user_city_code", str6, false);
                    }
                }
                String str7 = AbstractC3940ni.g;
                Context context7 = AbstractC3914mk.f7252a;
                if (str7 != null) {
                    AbstractC3940ni.g = str7;
                    if (context7 != null) {
                        ConcurrentHashMap concurrentHashMap6 = Db.b;
                        Cb.a(context7, "user_info_store").a("user_state_code", str7, false);
                    }
                }
                String str8 = AbstractC3940ni.h;
                Context context8 = AbstractC3914mk.f7252a;
                if (str8 != null) {
                    AbstractC3940ni.h = str8;
                    if (context8 != null) {
                        ConcurrentHashMap concurrentHashMap7 = Db.b;
                        Cb.a(context8, "user_info_store").a("user_country_code", str8, false);
                    }
                }
                int i4 = AbstractC3940ni.i;
                Context context9 = AbstractC3914mk.f7252a;
                if (i4 != Integer.MIN_VALUE) {
                    AbstractC3940ni.i = i4;
                    if (context9 != null) {
                        ConcurrentHashMap concurrentHashMap8 = Db.b;
                        Cb.a(context9, "user_info_store").a("user_yob", i4, false);
                    }
                }
                String str9 = AbstractC3940ni.j;
                Context context10 = AbstractC3914mk.f7252a;
                if (str9 != null) {
                    AbstractC3940ni.j = str9;
                    if (context10 != null) {
                        ConcurrentHashMap concurrentHashMap9 = Db.b;
                        Cb.a(context10, "user_info_store").a(AuthenticationTokenClaims.JSON_KEY_USER_GENDER, str9, false);
                    }
                }
                String str10 = AbstractC3940ni.k;
                Context context11 = AbstractC3914mk.f7252a;
                if (str10 != null) {
                    AbstractC3940ni.k = str10;
                    if (context11 != null) {
                        ConcurrentHashMap concurrentHashMap10 = Db.b;
                        Cb.a(context11, "user_info_store").a("user_education", str10, false);
                    }
                }
                String str11 = AbstractC3940ni.l;
                Context context12 = AbstractC3914mk.f7252a;
                if (str11 != null) {
                    AbstractC3940ni.l = str11;
                    if (context12 != null) {
                        ConcurrentHashMap concurrentHashMap11 = Db.b;
                        Cb.a(context12, "user_info_store").a("user_language", str11, false);
                    }
                }
                String str12 = AbstractC3940ni.m;
                Context context13 = AbstractC3914mk.f7252a;
                if (str12 != null) {
                    AbstractC3940ni.m = str12;
                    if (context13 != null) {
                        ConcurrentHashMap concurrentHashMap12 = Db.b;
                        Cb.a(context13, "user_info_store").a("user_interest", str12, false);
                    }
                }
                Location location = AbstractC3940ni.n;
                Context context14 = AbstractC3914mk.f7252a;
                if (location != null) {
                    AbstractC3940ni.n = location;
                    if (context14 != null) {
                        String a2 = AbstractC3940ni.a(location);
                        ConcurrentHashMap concurrentHashMap13 = Db.b;
                        str = "user_interest";
                        Cb.a(context14, "user_info_store").a(AuthenticationTokenClaims.JSON_KEY_USER_LOCATION, a2, false);
                        int i5 = Integer.MIN_VALUE;
                        if (AbstractC3940ni.f7268a == Integer.MIN_VALUE) {
                            Context context15 = AbstractC3914mk.f7252a;
                            if (context15 != null) {
                                ConcurrentHashMap concurrentHashMap14 = Db.b;
                                Db a3 = Cb.a(context15, "user_info_store");
                                Intrinsics.checkNotNullParameter("user_age", "key");
                                i5 = a3.f6510a.getInt("user_age", Integer.MIN_VALUE);
                            }
                            AbstractC3940ni.f7268a = i5;
                        }
                        if (AbstractC3940ni.c == null) {
                            Context context16 = AbstractC3914mk.f7252a;
                            if (context16 == null) {
                                string10 = null;
                            } else {
                                ConcurrentHashMap concurrentHashMap15 = Db.b;
                                Db a4 = Cb.a(context16, "user_info_store");
                                Intrinsics.checkNotNullParameter("user_age_group", "key");
                                string10 = a4.f6510a.getString("user_age_group", null);
                            }
                            AbstractC3940ni.c = string10;
                        }
                        if (AbstractC3940ni.d == null) {
                            Context context17 = AbstractC3914mk.f7252a;
                            if (context17 == null) {
                                string9 = null;
                            } else {
                                ConcurrentHashMap concurrentHashMap16 = Db.b;
                                Db a5 = Cb.a(context17, "user_info_store");
                                Intrinsics.checkNotNullParameter("user_area_code", "key");
                                string9 = a5.f6510a.getString("user_area_code", null);
                            }
                            AbstractC3940ni.d = string9;
                        }
                        if (AbstractC3940ni.e == null) {
                            Context context18 = AbstractC3914mk.f7252a;
                            if (context18 == null) {
                                string8 = null;
                            } else {
                                ConcurrentHashMap concurrentHashMap17 = Db.b;
                                Db a6 = Cb.a(context18, "user_info_store");
                                Intrinsics.checkNotNullParameter("user_post_code", "key");
                                string8 = a6.f6510a.getString("user_post_code", null);
                            }
                            AbstractC3940ni.e = string8;
                        }
                        if (AbstractC3940ni.f == null) {
                            Context context19 = AbstractC3914mk.f7252a;
                            if (context19 == null) {
                                string7 = null;
                            } else {
                                ConcurrentHashMap concurrentHashMap18 = Db.b;
                                Db a7 = Cb.a(context19, "user_info_store");
                                Intrinsics.checkNotNullParameter("user_city_code", "key");
                                string7 = a7.f6510a.getString("user_city_code", null);
                            }
                            AbstractC3940ni.f = string7;
                        }
                        if (AbstractC3940ni.g == null) {
                            Context context20 = AbstractC3914mk.f7252a;
                            if (context20 == null) {
                                string6 = null;
                            } else {
                                ConcurrentHashMap concurrentHashMap19 = Db.b;
                                Db a8 = Cb.a(context20, "user_info_store");
                                Intrinsics.checkNotNullParameter("user_state_code", "key");
                                string6 = a8.f6510a.getString("user_state_code", null);
                            }
                            AbstractC3940ni.g = string6;
                        }
                        if (AbstractC3940ni.h == null) {
                            Context context21 = AbstractC3914mk.f7252a;
                            if (context21 == null) {
                                string5 = null;
                            } else {
                                ConcurrentHashMap concurrentHashMap20 = Db.b;
                                Db a9 = Cb.a(context21, "user_info_store");
                                Intrinsics.checkNotNullParameter("user_country_code", "key");
                                string5 = a9.f6510a.getString("user_country_code", null);
                            }
                            AbstractC3940ni.h = string5;
                        }
                        if (AbstractC3940ni.i == Integer.MIN_VALUE) {
                            Context context22 = AbstractC3914mk.f7252a;
                            if (context22 == null) {
                                i = Integer.MIN_VALUE;
                            } else {
                                ConcurrentHashMap concurrentHashMap21 = Db.b;
                                Db a10 = Cb.a(context22, "user_info_store");
                                Intrinsics.checkNotNullParameter("user_yob", "key");
                                i = a10.f6510a.getInt("user_yob", Integer.MIN_VALUE);
                            }
                            AbstractC3940ni.i = i;
                        }
                        if (AbstractC3940ni.j == null) {
                            Context context23 = AbstractC3914mk.f7252a;
                            if (context23 == null) {
                                string4 = null;
                            } else {
                                ConcurrentHashMap concurrentHashMap22 = Db.b;
                                Db a11 = Cb.a(context23, "user_info_store");
                                Intrinsics.checkNotNullParameter(AuthenticationTokenClaims.JSON_KEY_USER_GENDER, "key");
                                string4 = a11.f6510a.getString(AuthenticationTokenClaims.JSON_KEY_USER_GENDER, null);
                            }
                            AbstractC3940ni.j = string4;
                        }
                        if (AbstractC3940ni.k == null) {
                            Context context24 = AbstractC3914mk.f7252a;
                            if (context24 == null) {
                                string3 = null;
                            } else {
                                ConcurrentHashMap concurrentHashMap23 = Db.b;
                                Db a12 = Cb.a(context24, "user_info_store");
                                Intrinsics.checkNotNullParameter("user_education", "key");
                                string3 = a12.f6510a.getString("user_education", null);
                            }
                            AbstractC3940ni.k = string3;
                        }
                        if (AbstractC3940ni.l == null) {
                            Context context25 = AbstractC3914mk.f7252a;
                            if (context25 == null) {
                                string2 = null;
                            } else {
                                ConcurrentHashMap concurrentHashMap24 = Db.b;
                                Db a13 = Cb.a(context25, "user_info_store");
                                Intrinsics.checkNotNullParameter("user_language", "key");
                                string2 = a13.f6510a.getString("user_language", null);
                            }
                            AbstractC3940ni.l = string2;
                        }
                        if (AbstractC3940ni.m == null) {
                            Context context26 = AbstractC3914mk.f7252a;
                            if (context26 == null) {
                                string = null;
                            } else {
                                ConcurrentHashMap concurrentHashMap25 = Db.b;
                                Db a14 = Cb.a(context26, "user_info_store");
                                String key = str;
                                Intrinsics.checkNotNullParameter(key, "key");
                                string = a14.f6510a.getString(key, null);
                            }
                            AbstractC3940ni.m = string;
                        }
                        AbstractC3940ni.b();
                        if (AbstractC3940ni.b == null && (context = AbstractC3914mk.f7252a) != null) {
                            ConcurrentHashMap concurrentHashMap26 = Db.b;
                            Db a15 = Cb.a(context, "user_info_store");
                            Intrinsics.checkNotNullParameter("user_age_restricted", "key");
                            AbstractC3940ni.b = Boolean.valueOf(a15.f6510a.getBoolean("user_age_restricted", false));
                        }
                        C3802in runnable = new C3802in(this.b, null);
                        Intrinsics.checkNotNullParameter(runnable, "runnable");
                        BuildersKt__Builders_commonKt.launch$default(AbstractC3914mk.i, null, null, new C3886lk(runnable, null), 3, null);
                        return Unit.INSTANCE;
                    }
                }
                str = "user_interest";
                int i52 = Integer.MIN_VALUE;
                if (AbstractC3940ni.f7268a == Integer.MIN_VALUE) {
                }
                if (AbstractC3940ni.c == null) {
                }
                if (AbstractC3940ni.d == null) {
                }
                if (AbstractC3940ni.e == null) {
                }
                if (AbstractC3940ni.f == null) {
                }
                if (AbstractC3940ni.g == null) {
                }
                if (AbstractC3940ni.h == null) {
                }
                if (AbstractC3940ni.i == Integer.MIN_VALUE) {
                }
                if (AbstractC3940ni.j == null) {
                }
                if (AbstractC3940ni.k == null) {
                }
                if (AbstractC3940ni.l == null) {
                }
                if (AbstractC3940ni.m == null) {
                }
                AbstractC3940ni.b();
                if (AbstractC3940ni.b == null) {
                    ConcurrentHashMap concurrentHashMap262 = Db.b;
                    Db a152 = Cb.a(context, "user_info_store");
                    Intrinsics.checkNotNullParameter("user_age_restricted", "key");
                    AbstractC3940ni.b = Boolean.valueOf(a152.f6510a.getBoolean("user_age_restricted", false));
                }
                C3802in runnable2 = new C3802in(this.b, null);
                Intrinsics.checkNotNullParameter(runnable2, "runnable");
                BuildersKt__Builders_commonKt.launch$default(AbstractC3914mk.i, null, null, new C3886lk(runnable2, null), 3, null);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        this.f7188a = 2;
    }
}
