package l1;

import android.util.Base64;
import android.util.JsonWriter;
import j1.C1054b;
import j1.C1055c;
import j1.InterfaceC1056d;
import j1.InterfaceC1057e;
import j1.InterfaceC1058f;
import j1.InterfaceC1059g;
import java.io.BufferedWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class e implements InterfaceC1057e, InterfaceC1059g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9927a = true;

    /* renamed from: b, reason: collision with root package name */
    public final JsonWriter f9928b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f9929c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f9930d;

    /* renamed from: e, reason: collision with root package name */
    public final C1107a f9931e;
    public final boolean f;

    public e(BufferedWriter bufferedWriter, HashMap hashMap, HashMap hashMap2, C1107a c1107a, boolean z3) {
        this.f9928b = new JsonWriter(bufferedWriter);
        this.f9929c = hashMap;
        this.f9930d = hashMap2;
        this.f9931e = c1107a;
        this.f = z3;
    }

    @Override // j1.InterfaceC1057e
    public final InterfaceC1057e a(C1055c c1055c, Object obj) {
        f(obj, c1055c.f9526a);
        return this;
    }

    @Override // j1.InterfaceC1059g
    public final InterfaceC1059g b(String str) {
        g();
        this.f9928b.value(str);
        return this;
    }

    @Override // j1.InterfaceC1059g
    public final InterfaceC1059g c(boolean z3) {
        g();
        this.f9928b.value(z3);
        return this;
    }

    @Override // j1.InterfaceC1057e
    public final InterfaceC1057e d(C1055c c1055c, long j3) {
        String str = c1055c.f9526a;
        g();
        JsonWriter jsonWriter = this.f9928b;
        jsonWriter.name(str);
        g();
        jsonWriter.value(j3);
        return this;
    }

    public final e e(Object obj) {
        JsonWriter jsonWriter = this.f9928b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    e(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        f(entry.getValue(), (String) key);
                    } catch (ClassCastException e3) {
                        throw new C1054b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e3);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            InterfaceC1056d interfaceC1056d = (InterfaceC1056d) this.f9929c.get(obj.getClass());
            if (interfaceC1056d != null) {
                jsonWriter.beginObject();
                interfaceC1056d.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            InterfaceC1058f interfaceC1058f = (InterfaceC1058f) this.f9930d.get(obj.getClass());
            if (interfaceC1058f != null) {
                interfaceC1058f.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.f9931e.a(obj, this);
                throw null;
            }
            String name = ((Enum) obj).name();
            g();
            jsonWriter.value(name);
            return this;
        }
        if (obj instanceof byte[]) {
            g();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i3 = 0;
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i3 < length) {
                jsonWriter.value(r6[i3]);
                i3++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i3 < length2) {
                long j3 = jArr[i3];
                g();
                jsonWriter.value(j3);
                i3++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i3 < length3) {
                jsonWriter.value(dArr[i3]);
                i3++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i3 < length4) {
                jsonWriter.value(zArr[i3]);
                i3++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i3 < length5) {
                e(numberArr[i3]);
                i3++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i3 < length6) {
                e(objArr[i3]);
                i3++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final e f(Object obj, String str) {
        boolean z3 = this.f;
        JsonWriter jsonWriter = this.f9928b;
        if (z3) {
            if (obj == null) {
                return this;
            }
            g();
            jsonWriter.name(str);
            e(obj);
            return this;
        }
        g();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        e(obj);
        return this;
    }

    public final void g() {
        if (!this.f9927a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
