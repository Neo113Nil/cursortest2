package com.onesignal.inAppMessages.internal.repositories.impl;

import D4.AbstractC0024y;
import D4.E;
import K4.c;
import android.content.ContentValues;
import com.onesignal.core.internal.database.IDatabaseProvider;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.inAppMessages.internal.InAppMessage;
import com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController;
import com.onesignal.inAppMessages.internal.repositories.IInAppRepository;
import e5.g;
import f4.v;
import java.util.ArrayList;
import java.util.List;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class InAppRepository implements IInAppRepository {
    public static final Companion Companion = new Companion(null);
    public static final long IAM_CACHE_DATA_LIFETIME = 15552000;
    private final IDatabaseProvider _databaseProvider;
    private final IInAppPreferencesController _prefs;
    private final ITime _time;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public InAppRepository(IDatabaseProvider _databaseProvider, ITime _time, IInAppPreferencesController _prefs) {
        i.e(_databaseProvider, "_databaseProvider");
        i.e(_time, "_time");
        i.e(_prefs, "_prefs");
        this._databaseProvider = _databaseProvider;
        this._time = _time;
        this._prefs = _prefs;
    }

    @Override // com.onesignal.inAppMessages.internal.repositories.IInAppRepository
    public Object cleanCachedInAppMessages(InterfaceC1218d interfaceC1218d) {
        Object w3 = AbstractC0024y.w(E.f461c, new InAppRepository$cleanCachedInAppMessages$2(this, null), interfaceC1218d);
        return w3 == EnumC1260a.f11058a ? w3 : v.f5689a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.inAppMessages.internal.repositories.IInAppRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listInAppMessages(InterfaceC1218d interfaceC1218d) {
        InAppRepository$listInAppMessages$1 inAppRepository$listInAppMessages$1;
        int i2;
        if (interfaceC1218d instanceof InAppRepository$listInAppMessages$1) {
            inAppRepository$listInAppMessages$1 = (InAppRepository$listInAppMessages$1) interfaceC1218d;
            int i3 = inAppRepository$listInAppMessages$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                inAppRepository$listInAppMessages$1.label = i3 - Integer.MIN_VALUE;
                Object obj = inAppRepository$listInAppMessages$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = inAppRepository$listInAppMessages$1.label;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list = (List) inAppRepository$listInAppMessages$1.L$0;
                    g.y(obj);
                    return list;
                }
                g.y(obj);
                ArrayList arrayList = new ArrayList();
                c cVar = E.f461c;
                InAppRepository$listInAppMessages$2 inAppRepository$listInAppMessages$2 = new InAppRepository$listInAppMessages$2(this, arrayList, null);
                inAppRepository$listInAppMessages$1.L$0 = arrayList;
                inAppRepository$listInAppMessages$1.label = 1;
                return AbstractC0024y.w(cVar, inAppRepository$listInAppMessages$2, inAppRepository$listInAppMessages$1) == enumC1260a ? enumC1260a : arrayList;
            }
        }
        inAppRepository$listInAppMessages$1 = new InAppRepository$listInAppMessages$1(this, interfaceC1218d);
        Object obj2 = inAppRepository$listInAppMessages$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = inAppRepository$listInAppMessages$1.label;
        if (i2 == 0) {
        }
    }

    @Override // com.onesignal.inAppMessages.internal.repositories.IInAppRepository
    public Object saveInAppMessage(InAppMessage inAppMessage, InterfaceC1218d interfaceC1218d) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(OneSignalDbContract.InAppMessageTable.COLUMN_NAME_MESSAGE_ID, inAppMessage.getMessageId());
        contentValues.put(OneSignalDbContract.InAppMessageTable.COLUMN_NAME_DISPLAY_QUANTITY, new Integer(inAppMessage.getRedisplayStats().getDisplayQuantity()));
        contentValues.put(OneSignalDbContract.InAppMessageTable.COLUMN_NAME_LAST_DISPLAY, new Long(inAppMessage.getRedisplayStats().getLastDisplayTime()));
        contentValues.put(OneSignalDbContract.InAppMessageTable.COLUMN_CLICK_IDS, inAppMessage.getClickedClickIds().toString());
        contentValues.put(OneSignalDbContract.InAppMessageTable.COLUMN_DISPLAYED_IN_SESSION, Boolean.valueOf(inAppMessage.isDisplayedInSession()));
        Object w3 = AbstractC0024y.w(E.f461c, new InAppRepository$saveInAppMessage$2(this, contentValues, inAppMessage, null), interfaceC1218d);
        return w3 == EnumC1260a.f11058a ? w3 : v.f5689a;
    }
}
