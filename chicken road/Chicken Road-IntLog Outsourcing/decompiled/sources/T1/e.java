package T1;

import R1.f;
import R1.g;
import android.util.Base64;
import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class e implements R1.e, g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2793a = true;

    /* renamed from: b, reason: collision with root package name */
    public final JsonWriter f2794b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2795c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f2796d;

    /* renamed from: e, reason: collision with root package name */
    public final a f2797e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2798f;

    public e(BufferedWriter bufferedWriter, HashMap hashMap, HashMap hashMap2, a aVar, boolean z) {
        this.f2794b = new JsonWriter(bufferedWriter);
        this.f2795c = hashMap;
        this.f2796d = hashMap2;
        this.f2797e = aVar;
        this.f2798f = z;
    }

    @Override // R1.e
    public final R1.e a(R1.c cVar, Object obj) {
        g(obj, cVar.f2617a);
        return this;
    }

    @Override // R1.g
    public final g b(String str) {
        h();
        this.f2794b.value(str);
        return this;
    }

    @Override // R1.g
    public final g c(boolean z) {
        h();
        this.f2794b.value(z);
        return this;
    }

    @Override // R1.e
    public final R1.e d(R1.c cVar, int i2) {
        String str = cVar.f2617a;
        h();
        JsonWriter jsonWriter = this.f2794b;
        jsonWriter.name(str);
        h();
        jsonWriter.value(i2);
        return this;
    }

    @Override // R1.e
    public final R1.e e(R1.c cVar, long j2) {
        String str = cVar.f2617a;
        h();
        JsonWriter jsonWriter = this.f2794b;
        jsonWriter.name(str);
        h();
        jsonWriter.value(j2);
        return this;
    }

    public final void f(Object obj) {
        JsonWriter jsonWriter = this.f2794b;
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    f(it.next());
                }
                jsonWriter.endArray();
                return;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        g(entry.getValue(), (String) key);
                    } catch (ClassCastException e3) {
                        throw new R1.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e3);
                    }
                }
                jsonWriter.endObject();
                return;
            }
            R1.d dVar = (R1.d) this.f2795c.get(obj.getClass());
            if (dVar != null) {
                jsonWriter.beginObject();
                dVar.a(obj, this);
                jsonWriter.endObject();
                return;
            }
            f fVar = (f) this.f2796d.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.f2797e.a(obj, this);
                throw null;
            }
            String name = ((Enum) obj).name();
            h();
            jsonWriter.value(name);
            return;
        }
        if (obj instanceof byte[]) {
            h();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return;
        }
        jsonWriter.beginArray();
        int i2 = 0;
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i2 < length) {
                jsonWriter.value(r6[i2]);
                i2++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i2 < length2) {
                long j2 = jArr[i2];
                h();
                jsonWriter.value(j2);
                i2++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i2 < length3) {
                jsonWriter.value(dArr[i2]);
                i2++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i2 < length4) {
                jsonWriter.value(zArr[i2]);
                i2++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i2 < length5) {
                f(numberArr[i2]);
                i2++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i2 < length6) {
                f(objArr[i2]);
                i2++;
            }
        }
        jsonWriter.endArray();
    }

    public final void g(Object obj, String str) {
        boolean z = this.f2798f;
        JsonWriter jsonWriter = this.f2794b;
        if (z) {
            if (obj == null) {
                return;
            }
            h();
            jsonWriter.name(str);
            f(obj);
            return;
        }
        h();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            f(obj);
        }
    }

    public final void h() {
        if (!this.f2793a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
