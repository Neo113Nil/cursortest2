package com.onesignal.session.internal.session;

import com.onesignal.common.modeling.SimpleModelStore;
import com.onesignal.common.modeling.SingletonModelStore;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public class SessionModelStore extends SingletonModelStore<SessionModel> {

    /* renamed from: com.onesignal.session.internal.session.SessionModelStore$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements InterfaceC1430a {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // t4.InterfaceC1430a
        public final SessionModel invoke() {
            return new SessionModel();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionModelStore(IPreferencesService prefs) {
        super(new SimpleModelStore(AnonymousClass1.INSTANCE, OutcomeEventsTable.COLUMN_NAME_SESSION, prefs));
        i.e(prefs, "prefs");
    }
}
