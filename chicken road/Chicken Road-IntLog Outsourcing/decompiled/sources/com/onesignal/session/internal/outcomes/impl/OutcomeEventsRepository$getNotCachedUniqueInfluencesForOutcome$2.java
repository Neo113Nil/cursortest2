package com.onesignal.session.internal.outcomes.impl;

import D4.InterfaceC0022w;
import com.onesignal.core.internal.database.ICursor;
import com.onesignal.core.internal.database.IDatabase;
import com.onesignal.core.internal.database.IDatabaseProvider;
import com.onesignal.session.internal.influence.Influence;
import e5.g;
import f4.v;
import java.util.List;
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

@e(c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$2", f = "OutcomeEventsRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OutcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$2 extends h implements InterfaceC1445p {
    final /* synthetic */ List<Influence> $influences;
    final /* synthetic */ String $name;
    final /* synthetic */ List<Influence> $uniqueInfluences;
    int label;
    final /* synthetic */ OutcomeEventsRepository this$0;

    /* renamed from: com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements InterfaceC1441l {
        final /* synthetic */ JSONArray $availableInfluenceIds;
        final /* synthetic */ String $channelInfluenceId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(JSONArray jSONArray, String str) {
            super(1);
            this.$availableInfluenceIds = jSONArray;
            this.$channelInfluenceId = str;
        }

        @Override // t4.InterfaceC1441l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ICursor) obj);
            return v.f5689a;
        }

        public final void invoke(ICursor it) {
            i.e(it, "it");
            if (it.getCount() == 0) {
                this.$availableInfluenceIds.put(this.$channelInfluenceId);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$2(List<Influence> list, String str, OutcomeEventsRepository outcomeEventsRepository, List<Influence> list2, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.$influences = list;
        this.$name = str;
        this.this$0 = outcomeEventsRepository;
        this.$uniqueInfluences = list2;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new OutcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$2(this.$influences, this.$name, this.this$0, this.$uniqueInfluences, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((OutcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
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
            for (Influence influence : this.$influences) {
                JSONArray jSONArray = new JSONArray();
                JSONArray ids = influence.getIds();
                if (ids != null) {
                    int length = ids.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        String string = ids.getString(i2);
                        String[] strArr = {string, influence.getInfluenceChannel().toString(), this.$name};
                        iDatabaseProvider = this.this$0._databaseProvider;
                        IDatabase.DefaultImpls.query$default(iDatabaseProvider.getOs(), "cached_unique_outcome", new String[0], "channel_influence_id = ? AND channel_type = ? AND name = ?", strArr, null, null, null, "1", new AnonymousClass1(jSONArray, string), 112, null);
                    }
                    if (jSONArray.length() > 0) {
                        Influence copy = influence.copy();
                        copy.setIds(jSONArray);
                        this.$uniqueInfluences.add(copy);
                    }
                }
            }
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        return v.f5689a;
    }
}
