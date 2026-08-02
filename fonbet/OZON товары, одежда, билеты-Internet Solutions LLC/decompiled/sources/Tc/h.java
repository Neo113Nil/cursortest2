package Tc;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0001\bB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"LTc/h;", "Ljava/io/Externalizable;", "<init>", "()V", "", "readResolve", "()Ljava/lang/Object;", "c", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements Externalizable {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private Object f27035a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27036b;

    public h() {
        this(0, K.f71697a);
    }

    /* renamed from: readResolve, reason: from getter */
    private final Object getF27035a() {
        return this.f27035a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(@NotNull ObjectInput input) {
        Object B11;
        Intrinsics.checkNotNullParameter(input, "input");
        byte readByte = input.readByte();
        int i11 = readByte & 1;
        if ((readByte & (-2)) != 0) {
            throw new InvalidObjectException(P4.f.c("Unsupported flags value: ", readByte, '.'));
        }
        int readInt = input.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(P4.f.c("Illegal size value: ", readInt, '.'));
        }
        int i12 = 0;
        if (i11 == 0) {
            b builder = new b(readInt);
            while (i12 < readInt) {
                builder.add(input.readObject());
                i12++;
            }
            Intrinsics.checkNotNullParameter(builder, "builder");
            B11 = builder.B();
        } else {
            if (i11 != 1) {
                throw new InvalidObjectException(P4.f.c("Unsupported collection type tag: ", i11, '.'));
            }
            j builder2 = new j(new d(readInt));
            while (i12 < readInt) {
                builder2.add(input.readObject());
                i12++;
            }
            Intrinsics.checkNotNullParameter(builder2, "builder");
            B11 = builder2.b();
        }
        this.f27035a = B11;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Collection] */
    @Override // java.io.Externalizable
    public final void writeExternal(@NotNull ObjectOutput output) {
        Intrinsics.checkNotNullParameter(output, "output");
        output.writeByte(this.f27036b);
        output.writeInt(this.f27035a.size());
        Iterator it = this.f27035a.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }

    public h(int i11, @NotNull Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        this.f27035a = collection;
        this.f27036b = i11;
    }
}
