package Od;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import kd.C7665d;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* renamed from: Od.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3680a extends Pd.a {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public static final C3680a f20214f = new C3680a(1, 0, 7);

    /* renamed from: Od.a$a, reason: collision with other inner class name */
    public static final class C0407a {
        @NotNull
        public static C3680a a(@NotNull InputStream stream) {
            Intrinsics.checkNotNullParameter(stream, "stream");
            DataInputStream dataInputStream = new DataInputStream(stream);
            IntRange intRange = new IntRange(1, dataInputStream.readInt(), 1);
            ArrayList arrayList = new ArrayList(C7714v.z(intRange, 10));
            C7665d it = intRange.iterator();
            while (it.hasNext()) {
                it.b();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] T02 = C7714v.T0(arrayList);
            return new C3680a(Arrays.copyOf(T02, T02.length));
        }
    }

    static {
        new C3680a(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3680a(@NotNull int... numbers) {
        super(Arrays.copyOf(numbers, numbers.length));
        Intrinsics.checkNotNullParameter(numbers, "numbers");
    }

    public final boolean g() {
        return f(f20214f);
    }
}
