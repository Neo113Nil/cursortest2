package Pg0;

import Am.C2438a;
import R2.InterfaceC3917k;
import android.app.Application;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.m<Object>[] f22549a = {C2438a.c(m.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1)};

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final V2.e f22550b = V2.b.a("dialog_state", null, null, null, 14);

    @NotNull
    public static final InterfaceC3917k a(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "<this>");
        return f22550b.getValue(application, f22549a[0]);
    }
}
