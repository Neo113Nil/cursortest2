package com.onesignal.inAppMessages.internal.repositories.impl;

import D4.InterfaceC0022w;
import com.onesignal.common.JSONUtils;
import com.onesignal.core.internal.database.ICursor;
import com.onesignal.core.internal.database.IDatabase;
import com.onesignal.core.internal.database.IDatabaseProvider;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.inAppMessages.internal.InAppMessage;
import com.onesignal.inAppMessages.internal.InAppMessageRedisplayStats;
import e5.g;
import f4.v;
import java.util.List;
import java.util.Set;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import org.json.JSONArray;
import org.json.JSONException;
import t4.InterfaceC1441l;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.inAppMessages.internal.repositories.impl.InAppRepository$listInAppMessages$2", f = "InAppRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class InAppRepository$listInAppMessages$2 extends h implements InterfaceC1445p {
    final /* synthetic */ List<InAppMessage> $inAppMessages;
    int label;
    final /* synthetic */ InAppRepository this$0;

    /* renamed from: com.onesignal.inAppMessages.internal.repositories.impl.InAppRepository$listInAppMessages$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements InterfaceC1441l {
        final /* synthetic */ List<InAppMessage> $inAppMessages;
        final /* synthetic */ InAppRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InAppRepository inAppRepository, List<InAppMessage> list) {
            super(1);
            this.this$0 = inAppRepository;
            this.$inAppMessages = list;
        }

        @Override // t4.InterfaceC1441l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ICursor) obj);
            return v.f5689a;
        }

        public final void invoke(ICursor it) {
            ITime iTime;
            ITime iTime2;
            i.e(it, "it");
            if (it.moveToFirst()) {
                do {
                    String string = it.getString(OneSignalDbContract.InAppMessageTable.COLUMN_NAME_MESSAGE_ID);
                    String string2 = it.getString(OneSignalDbContract.InAppMessageTable.COLUMN_CLICK_IDS);
                    int i2 = it.getInt(OneSignalDbContract.InAppMessageTable.COLUMN_NAME_DISPLAY_QUANTITY);
                    long j2 = it.getLong(OneSignalDbContract.InAppMessageTable.COLUMN_NAME_LAST_DISPLAY);
                    boolean z = it.getInt(OneSignalDbContract.InAppMessageTable.COLUMN_DISPLAYED_IN_SESSION) == 1;
                    Set<String> newStringSetFromJSONArray = JSONUtils.INSTANCE.newStringSetFromJSONArray(new JSONArray(string2));
                    iTime = this.this$0._time;
                    InAppMessageRedisplayStats inAppMessageRedisplayStats = new InAppMessageRedisplayStats(i2, j2, iTime);
                    iTime2 = this.this$0._time;
                    this.$inAppMessages.add(new InAppMessage(string, newStringSetFromJSONArray, z, inAppMessageRedisplayStats, iTime2));
                } while (it.moveToNext());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppRepository$listInAppMessages$2(InAppRepository inAppRepository, List<InAppMessage> list, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.this$0 = inAppRepository;
        this.$inAppMessages = list;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new InAppRepository$listInAppMessages$2(this.this$0, this.$inAppMessages, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((InAppRepository$listInAppMessages$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        IDatabaseProvider iDatabaseProvider;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.y(obj);
        try {
            iDatabaseProvider = this.this$0._databaseProvider;
            IDatabase.DefaultImpls.query$default(iDatabaseProvider.getOs(), OneSignalDbContract.InAppMessageTable.TABLE_NAME, null, null, null, null, null, null, null, new AnonymousClass1(this.this$0, this.$inAppMessages), 254, null);
        } catch (JSONException e3) {
            Logging.error("Generating JSONArray from iam click ids:JSON Failed.", e3);
        }
        return v.f5689a;
    }
}
