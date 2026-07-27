package Q2;

import b2.AbstractC0279e;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2487a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2488b;

    public /* synthetic */ f(int i2, Object obj) {
        this.f2487a = i2;
        this.f2488b = obj;
    }

    @Override // Q2.g
    public final String a() {
        switch (this.f2487a) {
            case 0:
                return (String) ((List) this.f2488b).stream().map(new A3.b(14)).collect(Collectors.joining(", ", "[", "]"));
            case 1:
                return (String) ((List) this.f2488b).stream().map(new A3.b(15)).collect(Collectors.joining(", ", "[", "]"));
            default:
                return (String) this.f2488b;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f2487a) {
            case 0:
                if (this != obj) {
                    if (obj instanceof g) {
                        if (Objects.equals((List) this.f2488b, ((g) obj).getValue())) {
                        }
                    }
                }
                break;
            case 1:
                if (this != obj) {
                    if (obj instanceof g) {
                        if (Objects.equals((List) this.f2488b, ((g) obj).getValue())) {
                        }
                    }
                }
                break;
            default:
                if (this != obj) {
                    if (obj instanceof g) {
                        if (Objects.equals((String) this.f2488b, ((g) obj).getValue())) {
                        }
                    }
                }
                break;
        }
        return true;
    }

    @Override // Q2.g
    public final int getType() {
        switch (this.f2487a) {
            case 0:
                return 6;
            case 1:
                return 5;
            default:
                return 1;
        }
    }

    @Override // Q2.g
    public final Object getValue() {
        switch (this.f2487a) {
            case 0:
                return (List) this.f2488b;
            case 1:
                return (List) this.f2488b;
            default:
                return (String) this.f2488b;
        }
    }

    public final int hashCode() {
        switch (this.f2487a) {
            case 0:
                return ((List) this.f2488b).hashCode();
            case 1:
                return ((List) this.f2488b).hashCode();
            default:
                return ((String) this.f2488b).hashCode();
        }
    }

    public final String toString() {
        switch (this.f2487a) {
            case 0:
                return "KeyValueList{" + a() + "}";
            case 1:
                return "ValueArray{" + a() + "}";
            default:
                return AbstractC0279e.h(new StringBuilder("ValueString{"), (String) this.f2488b, "}");
        }
    }
}
