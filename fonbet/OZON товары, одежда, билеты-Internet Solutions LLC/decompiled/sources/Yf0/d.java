package Yf0;

import Am.C2438a;
import R2.InterfaceC3917k;
import android.app.Application;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f35007a = {C2438a.c(d.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1)};

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final V2.e f35008b = V2.b.a("mockServerDataStore", null, null, null, 14);

    public static final InterfaceC3917k a(Application application) {
        return f35008b.getValue(application, f35007a[0]);
    }
}
