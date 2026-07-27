package b3;

import java.util.Map;

/* renamed from: b3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0281b implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4821a;

    /* renamed from: b, reason: collision with root package name */
    public final Map.Entry f4822b;

    public C0281b(Object obj, Map.Entry entry) {
        this.f4821a = obj;
        this.f4822b = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4821a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4822b.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        return this.f4822b.setValue(obj);
    }
}
