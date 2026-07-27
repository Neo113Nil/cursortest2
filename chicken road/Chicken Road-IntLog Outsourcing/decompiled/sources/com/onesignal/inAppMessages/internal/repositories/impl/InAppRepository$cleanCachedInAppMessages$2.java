package com.onesignal.inAppMessages.internal.repositories.impl;

import D4.InterfaceC0022w;
import com.onesignal.common.JSONUtils;
import com.onesignal.core.internal.database.ICursor;
import com.onesignal.core.internal.database.IDatabase;
import com.onesignal.core.internal.database.IDatabaseProvider;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController;
import e5.g;
import f4.v;
import java.util.LinkedHashSet;
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

@e(c = "com.onesignal.inAppMessages.internal.repositories.impl.InAppRepository$cleanCachedInAppMessages$2", f = "InAppRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class InAppRepository$cleanCachedInAppMessages$2 extends h implements InterfaceC1445p {
    int label;
    final /* synthetic */ InAppRepository this$0;

    /* renamed from: com.onesignal.inAppMessages.internal.repositories.impl.InAppRepository$cleanCachedInAppMessages$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements InterfaceC1441l {
        final /* synthetic */ Set<String> $oldClickedClickIds;
        final /* synthetic */ Set<String> $oldMessageIds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Set<String> set, Set<String> set2) {
            super(1);
            this.$oldMessageIds = set;
            this.$oldClickedClickIds = set2;
        }

        @Override // t4.InterfaceC1441l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ICursor) obj);
            return v.f5689a;
        }

        public final void invoke(ICursor it) {
            i.e(it, "it");
            if (it.getCount() == 0) {
                Logging.debug$default("Attempted to clean 6 month old IAM data, but none exists!", null, 2, null);
                return;
            }
            if (it.moveToFirst()) {
                do {
                    String string = it.getString(OneSignalDbContract.InAppMessageTable.COLUMN_NAME_MESSAGE_ID);
                    String string2 = it.getString(OneSignalDbContract.InAppMessageTable.COLUMN_CLICK_IDS);
                    this.$oldMessageIds.add(string);
                    this.$oldClickedClickIds.addAll(JSONUtils.INSTANCE.newStringSetFromJSONArray(new JSONArray(string2)));
                } while (it.moveToNext());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppRepository$cleanCachedInAppMessages$2(InAppRepository inAppRepository, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.this$0 = inAppRepository;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new InAppRepository$cleanCachedInAppMessages$2(this.this$0, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((InAppRepository$cleanCachedInAppMessages$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        LinkedHashSet linkedHashSet;
        LinkedHashSet linkedHashSet2;
        IDatabaseProvider iDatabaseProvider;
        IInAppPreferencesController iInAppPreferencesController;
        IInAppPreferencesController iInAppPreferencesController2;
        IDatabaseProvider iDatabaseProvider2;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.y(obj);
        String[] strArr = {OneSignalDbContract.InAppMessageTable.COLUMN_NAME_MESSAGE_ID, OneSignalDbContract.InAppMessageTable.COLUMN_CLICK_IDS};
        String[] strArr2 = {String.valueOf((System.currentTimeMillis() / 1000) - InAppRepository.IAM_CACHE_DATA_LIFETIME)};
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        try {
            iDatabaseProvider2 = this.this$0._databaseProvider;
            linkedHashSet = linkedHashSet4;
            linkedHashSet2 = linkedHashSet3;
            try {
                IDatabase.DefaultImpls.query$default(iDatabaseProvider2.getOs(), OneSignalDbContract.InAppMessageTable.TABLE_NAME, strArr, "last_display < ?", strArr2, null, null, null, null, new AnonymousClass1(linkedHashSet3, linkedHashSet4), 240, null);
            } catch (JSONException e3) {
                e = e3;
                e.printStackTrace();
                iDatabaseProvider = this.this$0._databaseProvider;
                iDatabaseProvider.getOs().delete(OneSignalDbContract.InAppMessageTable.TABLE_NAME, "last_display < ?", strArr2);
                iInAppPreferencesController = this.this$0._prefs;
                iInAppPreferencesController.cleanInAppMessageIds(linkedHashSet2);
                iInAppPreferencesController2 = this.this$0._prefs;
                iInAppPreferencesController2.cleanInAppMessageClickedClickIds(linkedHashSet);
                return v.f5689a;
            }
        } catch (JSONException e6) {
            e = e6;
            linkedHashSet = linkedHashSet4;
            linkedHashSet2 = linkedHashSet3;
        }
        iDatabaseProvider = this.this$0._databaseProvider;
        iDatabaseProvider.getOs().delete(OneSignalDbContract.InAppMessageTable.TABLE_NAME, "last_display < ?", strArr2);
        iInAppPreferencesController = this.this$0._prefs;
        iInAppPreferencesController.cleanInAppMessageIds(linkedHashSet2);
        iInAppPreferencesController2 = this.this$0._prefs;
        iInAppPreferencesController2.cleanInAppMessageClickedClickIds(linkedHashSet);
        return v.f5689a;
    }
}
