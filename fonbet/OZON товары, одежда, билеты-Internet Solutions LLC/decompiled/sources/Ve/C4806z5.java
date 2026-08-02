package Ve;

import android.content.Context;
import java.util.Arrays;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.z5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4806z5 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f32624a;

    public C4806z5(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f32624a = context;
    }

    public final String a(int i11, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        Object[] args2 = Arrays.copyOf(args, args.length);
        Intrinsics.checkNotNullParameter(args2, "args");
        return E.f(new Pq(i11, C7705l.f0(args2)), this.f32624a);
    }
}
