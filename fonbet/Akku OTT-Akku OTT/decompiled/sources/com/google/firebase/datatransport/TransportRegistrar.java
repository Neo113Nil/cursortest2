package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.datatransport.i;
import com.google.android.datatransport.runtime.q;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes4.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i lambda$getComponents$0(ComponentContainer componentContainer) {
        q.b((Context) componentContainer.get(Context.class));
        return q.a().c(com.google.android.datatransport.cct.a.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i lambda$getComponents$1(ComponentContainer componentContainer) {
        q.b((Context) componentContainer.get(Context.class));
        return q.a().c(com.google.android.datatransport.cct.a.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i lambda$getComponents$2(ComponentContainer componentContainer) {
        q.b((Context) componentContainer.get(Context.class));
        return q.a().c(com.google.android.datatransport.cct.a.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(i.class).name(LIBRARY_NAME).add(Dependency.required((Class<?>) Context.class)).factory(new a()).build(), Component.builder(Qualified.qualified(LegacyTransportBackend.class, i.class)).add(Dependency.required((Class<?>) Context.class)).factory(new b(0)).build(), Component.builder(Qualified.qualified(TransportBackend.class, i.class)).add(Dependency.required((Class<?>) Context.class)).factory(new c(0)).build(), LibraryVersionComponent.create(LIBRARY_NAME, "19.0.0"));
    }
}
