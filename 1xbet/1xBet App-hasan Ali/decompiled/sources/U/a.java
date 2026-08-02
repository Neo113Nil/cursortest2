package U;

import java.util.Map;

/* loaded from: classes.dex */
public class a implements Map.Entry, j4.a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5805k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f5806l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f5807m;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.f5805k = i;
        this.f5806l = obj;
        this.f5807m = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.f5805k) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && kotlin.jvm.internal.l.a(entry.getKey(), this.f5806l) && kotlin.jvm.internal.l.a(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.f5805k) {
        }
        return this.f5806l;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.f5805k) {
        }
        return this.f5807m;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.f5805k) {
            case 0:
                Object obj = this.f5806l;
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return (value != null ? value.hashCode() : 0) ^ hashCode;
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.f5805k) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.f5805k) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(this.f5806l);
                sb.append('=');
                sb.append(getValue());
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
