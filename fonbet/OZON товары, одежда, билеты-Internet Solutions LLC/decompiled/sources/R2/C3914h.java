package R2;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.Serializable;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", l = {42, 57}, m = "runMigrations")
/* renamed from: R2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3914h<T> extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Serializable f24366d;

    /* renamed from: e, reason: collision with root package name */
    Iterator f24367e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f24368f;

    /* renamed from: g, reason: collision with root package name */
    int f24369g;

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f24368f = obj;
        this.f24369g |= LinearLayoutManager.INVALID_OFFSET;
        return C3916j.a(null, null, this);
    }
}
