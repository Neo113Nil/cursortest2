package com.google.firebase.datatransport;

import com.google.android.datatransport.i;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.sessions.FirebaseSessions;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements ComponentFactory {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i) {
        this.a = i;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        i lambda$getComponents$1;
        FirebaseSessions components$lambda$0;
        switch (this.a) {
            case 0:
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(componentContainer);
                return lambda$getComponents$1;
            default:
                components$lambda$0 = FirebaseSessionsRegistrar.getComponents$lambda$0(componentContainer);
                return components$lambda$0;
        }
    }
}
