package com.onesignal.session.internal.outcomes.impl;

import D4.InterfaceC0022w;
import android.content.ContentValues;
import com.onesignal.core.internal.database.IDatabaseProvider;
import com.onesignal.session.internal.influence.InfluenceType;
import e5.g;
import f4.v;
import java.util.Locale;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import org.json.JSONArray;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository$saveOutcomeEvent$2", f = "OutcomeEventsRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OutcomeEventsRepository$saveOutcomeEvent$2 extends h implements InterfaceC1445p {
    final /* synthetic */ OutcomeEventParams $eventParams;
    int label;
    final /* synthetic */ OutcomeEventsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutcomeEventsRepository$saveOutcomeEvent$2(OutcomeEventParams outcomeEventParams, OutcomeEventsRepository outcomeEventsRepository, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.$eventParams = outcomeEventParams;
        this.this$0 = outcomeEventsRepository;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new OutcomeEventsRepository$saveOutcomeEvent$2(this.$eventParams, this.this$0, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((OutcomeEventsRepository$saveOutcomeEvent$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        InfluenceType influenceType;
        IDatabaseProvider iDatabaseProvider;
        OutcomeSourceBody indirectBody;
        OutcomeSourceBody directBody;
        InfluenceType influenceType2;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.y(obj);
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        InfluenceType influenceType3 = InfluenceType.UNATTRIBUTED;
        OutcomeSource outcomeSource = this.$eventParams.getOutcomeSource();
        if (outcomeSource == null || (directBody = outcomeSource.getDirectBody()) == null) {
            influenceType = influenceType3;
        } else {
            JSONArray notificationIds = directBody.getNotificationIds();
            if (notificationIds == null || notificationIds.length() <= 0) {
                influenceType2 = influenceType3;
            } else {
                influenceType2 = InfluenceType.DIRECT;
                jSONArray = notificationIds;
            }
            JSONArray inAppMessagesIds = directBody.getInAppMessagesIds();
            if (inAppMessagesIds != null && inAppMessagesIds.length() > 0) {
                influenceType3 = InfluenceType.DIRECT;
                jSONArray2 = inAppMessagesIds;
            }
            influenceType = influenceType3;
            influenceType3 = influenceType2;
        }
        OutcomeSource outcomeSource2 = this.$eventParams.getOutcomeSource();
        if (outcomeSource2 != null && (indirectBody = outcomeSource2.getIndirectBody()) != null) {
            JSONArray notificationIds2 = indirectBody.getNotificationIds();
            if (notificationIds2 != null && notificationIds2.length() > 0) {
                influenceType3 = InfluenceType.INDIRECT;
                jSONArray = notificationIds2;
            }
            JSONArray inAppMessagesIds2 = indirectBody.getInAppMessagesIds();
            if (inAppMessagesIds2 != null && inAppMessagesIds2.length() > 0) {
                influenceType = InfluenceType.INDIRECT;
                jSONArray2 = inAppMessagesIds2;
            }
        }
        ContentValues contentValues = new ContentValues();
        OutcomeEventParams outcomeEventParams = this.$eventParams;
        contentValues.put("notification_ids", jSONArray.toString());
        contentValues.put(OutcomeEventsTable.COLUMN_NAME_IAM_IDS, jSONArray2.toString());
        String obj2 = influenceType3.toString();
        Locale ROOT = Locale.ROOT;
        i.d(ROOT, "ROOT");
        String lowerCase = obj2.toLowerCase(ROOT);
        i.d(lowerCase, "toLowerCase(...)");
        contentValues.put(OutcomeEventsTable.COLUMN_NAME_NOTIFICATION_INFLUENCE_TYPE, lowerCase);
        String obj3 = influenceType.toString();
        i.d(ROOT, "ROOT");
        String lowerCase2 = obj3.toLowerCase(ROOT);
        i.d(lowerCase2, "toLowerCase(...)");
        contentValues.put(OutcomeEventsTable.COLUMN_NAME_IAM_INFLUENCE_TYPE, lowerCase2);
        contentValues.put("name", outcomeEventParams.getOutcomeId());
        contentValues.put("weight", new Float(outcomeEventParams.getWeight()));
        contentValues.put("timestamp", new Long(outcomeEventParams.getTimestamp()));
        contentValues.put("session_time", new Long(outcomeEventParams.getSessionTime()));
        iDatabaseProvider = this.this$0._databaseProvider;
        iDatabaseProvider.getOs().insert("outcome", null, contentValues);
        return contentValues;
    }
}
