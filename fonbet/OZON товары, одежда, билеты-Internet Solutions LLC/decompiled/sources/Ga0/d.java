package Ga0;

import Am.C2438a;
import R2.InterfaceC3917k;
import W2.f;
import W2.i;
import android.content.Context;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f9895a = {C2438a.c(d.class, "envDataStore", "getEnvDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1)};

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final f.a<String> f9896b = i.c("SELECTED_ENV");

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final V2.e f9897c = V2.b.a("host_config_store", null, null, null, 14);

    public static final InterfaceC3917k a(Context context) {
        return f9897c.getValue(context, f9895a[0]);
    }
}
