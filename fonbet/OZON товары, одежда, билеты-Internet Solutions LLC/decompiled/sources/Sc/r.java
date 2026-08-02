package Sc;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ed.InterfaceC6346b;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\b\u0087@\u0018\u0000 \u0004*\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0002\u0005\u0004\u0088\u0001\u0006\u0092\u0001\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"LSc/r;", "T", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "b", "a", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r<T> implements Serializable {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final Object f26106a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSc/r$a;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Sc.r$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static final class b implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final Throwable f26107a;

        public b(@NotNull Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.f26107a = exception;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return Intrinsics.d(this.f26107a, ((b) obj).f26107a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f26107a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Failure(" + this.f26107a + ')';
        }
    }

    private /* synthetic */ r(Object obj) {
        this.f26106a = obj;
    }

    public static final /* synthetic */ r a(Object obj) {
        return new r(obj);
    }

    public static final Throwable b(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f26107a;
        }
        return null;
    }

    /* renamed from: d, reason: from getter */
    public final /* synthetic */ Object getF26106a() {
        return this.f26106a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return Intrinsics.d(this.f26106a, ((r) obj).f26106a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f26106a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @NotNull
    public final String toString() {
        Object obj = this.f26106a;
        if (obj instanceof b) {
            return obj.toString();
        }
        return "Success(" + obj + ')';
    }
}
