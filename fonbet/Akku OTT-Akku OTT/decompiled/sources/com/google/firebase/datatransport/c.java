package com.google.firebase.datatransport;

import com.google.android.datatransport.i;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements ComponentFactory {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i) {
        this.a = i;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        i lambda$getComponents$2;
        FirebaseSessionsComponent components$lambda$1;
        switch (this.a) {
            case 0:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(componentContainer);
                return lambda$getComponents$2;
            default:
                components$lambda$1 = FirebaseSessionsRegistrar.getComponents$lambda$1(componentContainer);
                return components$lambda$1;
        }
    }
}
