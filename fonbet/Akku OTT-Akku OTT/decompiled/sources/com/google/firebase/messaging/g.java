package com.google.firebase.messaging;

import com.google.firebase.inject.Provider;

/* loaded from: classes4.dex */
public final /* synthetic */ class g implements Provider {
    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        com.google.android.datatransport.i lambda$clearTransportFactoryForTest$12;
        lambda$clearTransportFactoryForTest$12 = FirebaseMessaging.lambda$clearTransportFactoryForTest$12();
        return lambda$clearTransportFactoryForTest$12;
    }
}
