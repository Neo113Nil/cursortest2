package androidx.work;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    private static final String f45281b = o.i("Data");

    /* renamed from: c, reason: collision with root package name */
    public static final e f45282c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    HashMap f45283a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private HashMap f45284a = new HashMap();

        @NonNull
        public final e a() {
            e eVar = new e(this.f45284a);
            e.e(eVar);
            return eVar;
        }

        @NonNull
        public final void b(@NonNull String str, Object obj) {
            HashMap hashMap = this.f45284a;
            if (obj == null) {
                hashMap.put(str, null);
                return;
            }
            Class<?> cls = obj.getClass();
            if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                hashMap.put(str, obj);
                return;
            }
            int i11 = 0;
            if (cls == boolean[].class) {
                boolean[] zArr = (boolean[]) obj;
                e eVar = e.f45282c;
                Boolean[] boolArr = new Boolean[zArr.length];
                while (i11 < zArr.length) {
                    boolArr[i11] = Boolean.valueOf(zArr[i11]);
                    i11++;
                }
                hashMap.put(str, boolArr);
                return;
            }
            if (cls == byte[].class) {
                byte[] bArr = (byte[]) obj;
                e eVar2 = e.f45282c;
                Byte[] bArr2 = new Byte[bArr.length];
                while (i11 < bArr.length) {
                    bArr2[i11] = Byte.valueOf(bArr[i11]);
                    i11++;
                }
                hashMap.put(str, bArr2);
                return;
            }
            if (cls == int[].class) {
                int[] iArr = (int[]) obj;
                e eVar3 = e.f45282c;
                Integer[] numArr = new Integer[iArr.length];
                while (i11 < iArr.length) {
                    numArr[i11] = Integer.valueOf(iArr[i11]);
                    i11++;
                }
                hashMap.put(str, numArr);
                return;
            }
            if (cls == long[].class) {
                long[] jArr = (long[]) obj;
                e eVar4 = e.f45282c;
                Long[] lArr = new Long[jArr.length];
                while (i11 < jArr.length) {
                    lArr[i11] = Long.valueOf(jArr[i11]);
                    i11++;
                }
                hashMap.put(str, lArr);
                return;
            }
            if (cls == float[].class) {
                float[] fArr = (float[]) obj;
                e eVar5 = e.f45282c;
                Float[] fArr2 = new Float[fArr.length];
                while (i11 < fArr.length) {
                    fArr2[i11] = Float.valueOf(fArr[i11]);
                    i11++;
                }
                hashMap.put(str, fArr2);
                return;
            }
            if (cls != double[].class) {
                throw new IllegalArgumentException("Key " + str + "has invalid type " + cls);
            }
            double[] dArr = (double[]) obj;
            e eVar6 = e.f45282c;
            Double[] dArr2 = new Double[dArr.length];
            while (i11 < dArr.length) {
                dArr2[i11] = Double.valueOf(dArr[i11]);
                i11++;
            }
            hashMap.put(str, dArr2);
        }

        @NonNull
        public final void c(@NonNull HashMap hashMap) {
            for (Map.Entry entry : hashMap.entrySet()) {
                b((String) entry.getKey(), entry.getValue());
            }
        }

        @NonNull
        public final void d(boolean z11) {
            this.f45284a.put("WORKER_PARAM_IS_FORCE", Boolean.valueOf(z11));
        }

        @NonNull
        public final void e(int i11, @NonNull String str) {
            this.f45284a.put(str, Integer.valueOf(i11));
        }

        @NonNull
        public final void f(@NonNull String str, String str2) {
            this.f45284a.put(str, str2);
        }
    }

    e() {
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0040 -> B:16:0x005f). Please report as a decompilation issue!!! */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e a(@NonNull byte[] bArr) {
        ObjectInputStream objectInputStream;
        Throwable e11;
        String str = f45281b;
        if (bArr.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        HashMap hashMap = new HashMap();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream2 = null;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (IOException e12) {
                Log.e(str, "Error in Data#fromByteArray: ", e12);
            }
            try {
                for (int readInt = objectInputStream.readInt(); readInt > 0; readInt--) {
                    hashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                }
                try {
                    objectInputStream.close();
                } catch (IOException e13) {
                    Log.e(str, "Error in Data#fromByteArray: ", e13);
                }
                byteArrayInputStream.close();
            } catch (IOException e14) {
                e11 = e14;
                Log.e(str, "Error in Data#fromByteArray: ", e11);
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (IOException e15) {
                        Log.e(str, "Error in Data#fromByteArray: ", e15);
                    }
                }
                byteArrayInputStream.close();
                return new e(hashMap);
            } catch (ClassNotFoundException e16) {
                e11 = e16;
                Log.e(str, "Error in Data#fromByteArray: ", e11);
                if (objectInputStream != null) {
                }
                byteArrayInputStream.close();
                return new e(hashMap);
            }
        } catch (IOException e17) {
            e = e17;
            Throwable th3 = e;
            objectInputStream = null;
            e11 = th3;
            Log.e(str, "Error in Data#fromByteArray: ", e11);
            if (objectInputStream != null) {
            }
            byteArrayInputStream.close();
            return new e(hashMap);
        } catch (ClassNotFoundException e18) {
            e = e18;
            Throwable th32 = e;
            objectInputStream = null;
            e11 = th32;
            Log.e(str, "Error in Data#fromByteArray: ", e11);
            if (objectInputStream != null) {
            }
            byteArrayInputStream.close();
            return new e(hashMap);
        } catch (Throwable th4) {
            th = th4;
            if (0 != 0) {
                try {
                    objectInputStream2.close();
                } catch (IOException e19) {
                    Log.e(str, "Error in Data#fromByteArray: ", e19);
                }
            }
            try {
                byteArrayInputStream.close();
                throw th;
            } catch (IOException e21) {
                Log.e(str, "Error in Data#fromByteArray: ", e21);
                throw th;
            }
        }
        return new e(hashMap);
    }

    @NonNull
    public static byte[] e(@NonNull e eVar) {
        ObjectOutputStream objectOutputStream;
        String str = f45281b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e11) {
            e = e11;
        }
        try {
            objectOutputStream.writeInt(eVar.f45283a.size());
            for (Map.Entry entry : eVar.f45283a.entrySet()) {
                objectOutputStream.writeUTF((String) entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException e12) {
                Log.e(str, "Error in Data#toByteArray: ", e12);
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e13) {
                Log.e(str, "Error in Data#toByteArray: ", e13);
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException e14) {
            e = e14;
            objectOutputStream2 = objectOutputStream;
            Log.e(str, "Error in Data#toByteArray: ", e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e15) {
                    Log.e(str, "Error in Data#toByteArray: ", e15);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e16) {
                Log.e(str, "Error in Data#toByteArray: ", e16);
            }
            return byteArray;
        } catch (Throwable th3) {
            th = th3;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e17) {
                    Log.e(str, "Error in Data#toByteArray: ", e17);
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException e18) {
                Log.e(str, "Error in Data#toByteArray: ", e18);
                throw th;
            }
        }
    }

    public final boolean b() {
        Object obj = this.f45283a.get("WORKER_PARAM_IS_FORCE");
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    public final int c(@NonNull String str, int i11) {
        Object obj = this.f45283a.get(str);
        return obj instanceof Integer ? ((Integer) obj).intValue() : i11;
    }

    public final String d(@NonNull String str) {
        Object obj = this.f45283a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && e.class == obj.getClass()) {
                HashMap hashMap = this.f45283a;
                Set<String> keySet = hashMap.keySet();
                HashMap hashMap2 = ((e) obj).f45283a;
                if (keySet.equals(hashMap2.keySet())) {
                    for (String str : keySet) {
                        Object obj2 = hashMap.get(str);
                        Object obj3 = hashMap2.get(str);
                        if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f45283a.hashCode() * 31;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Data {");
        HashMap hashMap = this.f45283a;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb2.append(str);
                sb2.append(" : ");
                Object obj = hashMap.get(str);
                if (obj instanceof Object[]) {
                    sb2.append(Arrays.toString((Object[]) obj));
                } else {
                    sb2.append(obj);
                }
                sb2.append(", ");
            }
        }
        sb2.append("}");
        return sb2.toString();
    }

    public e(@NonNull e eVar) {
        this.f45283a = new HashMap(eVar.f45283a);
    }

    public e(@NonNull HashMap hashMap) {
        this.f45283a = new HashMap(hashMap);
    }
}
