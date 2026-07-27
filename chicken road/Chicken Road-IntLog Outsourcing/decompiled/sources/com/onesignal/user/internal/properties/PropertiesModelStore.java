package com.onesignal.user.internal.properties;

import com.onesignal.common.modeling.SimpleModelStore;
import com.onesignal.common.modeling.SingletonModelStore;
import com.onesignal.core.internal.preferences.IPreferencesService;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public class PropertiesModelStore extends SingletonModelStore<PropertiesModel> {

    /* renamed from: com.onesignal.user.internal.properties.PropertiesModelStore$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements InterfaceC1430a {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // t4.InterfaceC1430a
        public final PropertiesModel invoke() {
            return new PropertiesModel();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertiesModelStore(IPreferencesService prefs) {
        super(new SimpleModelStore(AnonymousClass1.INSTANCE, "properties", prefs));
        i.e(prefs, "prefs");
    }
}
