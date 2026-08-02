package P4;

import android.database.sqlite.SQLiteStatement;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class i extends h implements O4.f {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final SQLiteStatement f21837b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@NotNull SQLiteStatement delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f21837b = delegate;
    }

    @Override // O4.f
    public final int C() {
        return this.f21837b.executeUpdateDelete();
    }

    @Override // O4.f
    public final long s1() {
        return this.f21837b.executeInsert();
    }
}
