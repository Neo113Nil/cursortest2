package p000;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class qg0 implements ts0, fh1 {

    /* JADX INFO: renamed from: a */
    public final boolean f6489a = true;

    /* JADX INFO: renamed from: b */
    public final JsonWriter f6490b;

    /* JADX INFO: renamed from: c */
    public final Map f6491c;

    /* JADX INFO: renamed from: d */
    public final Map f6492d;

    /* JADX INFO: renamed from: e */
    public final ss0 f6493e;

    /* JADX INFO: renamed from: f */
    public final boolean f6494f;

    public qg0(BufferedWriter bufferedWriter, HashMap map, HashMap map2, kg0 kg0Var, boolean z) {
        this.f6490b = new JsonWriter(bufferedWriter);
        this.f6491c = map;
        this.f6492d = map2;
        this.f6493e = kg0Var;
        this.f6494f = z;
    }

    @Override // p000.ts0
    /* JADX INFO: renamed from: a */
    public final ts0 mo2741a(C0895xz c0895xz, Object obj) throws IOException {
        m4098g(obj, c0895xz.f9109a);
        return this;
    }

    @Override // p000.fh1
    /* JADX INFO: renamed from: b */
    public final fh1 mo1791b(String str) throws IOException {
        m4099h();
        this.f6490b.value(str);
        return this;
    }

    @Override // p000.fh1
    /* JADX INFO: renamed from: c */
    public final fh1 mo1792c(boolean z) throws IOException {
        m4099h();
        this.f6490b.value(z);
        return this;
    }

    @Override // p000.ts0
    /* JADX INFO: renamed from: d */
    public final ts0 mo2744d(C0895xz c0895xz, int i) throws IOException {
        String str = c0895xz.f9109a;
        m4099h();
        JsonWriter jsonWriter = this.f6490b;
        jsonWriter.name(str);
        m4099h();
        jsonWriter.value(i);
        return this;
    }

    @Override // p000.ts0
    /* JADX INFO: renamed from: e */
    public final ts0 mo2745e(C0895xz c0895xz, long j) throws IOException {
        String str = c0895xz.f9109a;
        m4099h();
        JsonWriter jsonWriter = this.f6490b;
        jsonWriter.name(str);
        m4099h();
        jsonWriter.value(j);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final qg0 m4097f(Object obj) throws IOException {
        JsonWriter jsonWriter = this.f6490b;
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
                    m4097f(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        m4098g(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new C0855ww(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            ss0 ss0Var = (ss0) this.f6491c.get(obj.getClass());
            if (ss0Var != null) {
                jsonWriter.beginObject();
                ss0Var.mo103a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            eh1 eh1Var = (eh1) this.f6492d.get(obj.getClass());
            if (eh1Var != null) {
                eh1Var.mo103a(obj, this);
                return this;
            }
            if (obj instanceof Enum) {
                String strName = ((Enum) obj).name();
                m4099h();
                jsonWriter.value(strName);
                return this;
            }
            jsonWriter.beginObject();
            this.f6493e.mo103a(obj, this);
            jsonWriter.endObject();
            return this;
        }
        if (obj instanceof byte[]) {
            m4099h();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i < length) {
                jsonWriter.value(iArr[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                m4099h();
                jsonWriter.value(j);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                m4097f(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                m4097f(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final qg0 m4098g(Object obj, String str) throws IOException {
        boolean z = this.f6494f;
        JsonWriter jsonWriter = this.f6490b;
        if (z) {
            if (obj == null) {
                return this;
            }
            m4099h();
            jsonWriter.name(str);
            m4097f(obj);
            return this;
        }
        m4099h();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        m4097f(obj);
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final void m4099h() {
        if (this.f6489a) {
            return;
        }
        C0270h1.m2191g("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
