package com.onesignal.inAppMessages.internal.triggers;

import com.onesignal.common.modeling.SimpleModelStore;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public class TriggerModelStore extends SimpleModelStore<TriggerModel> {

    /* renamed from: com.onesignal.inAppMessages.internal.triggers.TriggerModelStore$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements InterfaceC1430a {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // t4.InterfaceC1430a
        public final TriggerModel invoke() {
            return new TriggerModel();
        }
    }

    public TriggerModelStore() {
        super(AnonymousClass1.INSTANCE, null, null, 6, null);
    }
}
