package com.onesignal.inAppMessages.internal.repositories.impl;

import D4.InterfaceC0022w;
import android.content.ContentValues;
import com.onesignal.core.internal.database.IDatabaseProvider;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.inAppMessages.internal.InAppMessage;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.inAppMessages.internal.repositories.impl.InAppRepository$saveInAppMessage$2", f = "InAppRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class InAppRepository$saveInAppMessage$2 extends h implements InterfaceC1445p {
    final /* synthetic */ InAppMessage $inAppMessage;
    final /* synthetic */ ContentValues $values;
    int label;
    final /* synthetic */ InAppRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppRepository$saveInAppMessage$2(InAppRepository inAppRepository, ContentValues contentValues, InAppMessage inAppMessage, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.this$0 = inAppRepository;
        this.$values = contentValues;
        this.$inAppMessage = inAppMessage;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new InAppRepository$saveInAppMessage$2(this.this$0, this.$values, this.$inAppMessage, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((InAppRepository$saveInAppMessage$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        IDatabaseProvider iDatabaseProvider;
        IDatabaseProvider iDatabaseProvider2;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.y(obj);
        iDatabaseProvider = this.this$0._databaseProvider;
        if (iDatabaseProvider.getOs().update(OneSignalDbContract.InAppMessageTable.TABLE_NAME, this.$values, "message_id = ?", new String[]{this.$inAppMessage.getMessageId()}) == 0) {
            iDatabaseProvider2 = this.this$0._databaseProvider;
            iDatabaseProvider2.getOs().insert(OneSignalDbContract.InAppMessageTable.TABLE_NAME, null, this.$values);
        }
        return v.f5689a;
    }
}
