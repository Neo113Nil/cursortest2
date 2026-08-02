package d1;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: d1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0954g {

    /* renamed from: b, reason: collision with root package name */
    public static final String f12355b = n.g("Data");

    /* renamed from: c, reason: collision with root package name */
    public static final C0954g f12356c;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f12357a;

    static {
        C0954g c0954g = new C0954g(new HashMap());
        c(c0954g);
        f12356c = c0954g;
    }

    public C0954g(C0954g c0954g) {
        this.f12357a = new HashMap(c0954g.f12357a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0040 -> B:16:0x005f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0954g a(byte[] bArr) {
        ObjectInputStream objectInputStream;
        Throwable e7;
        String str = f12355b;
        if (bArr.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        HashMap hashMap = new HashMap();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream2 = null;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (IOException e8) {
                Log.e(str, "Error in Data#fromByteArray: ", e8);
            }
            try {
                for (int readInt = objectInputStream.readInt(); readInt > 0; readInt--) {
                    hashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                }
                try {
                    objectInputStream.close();
                } catch (IOException e9) {
                    Log.e(str, "Error in Data#fromByteArray: ", e9);
                }
                byteArrayInputStream.close();
            } catch (IOException e10) {
                e7 = e10;
                Log.e(str, "Error in Data#fromByteArray: ", e7);
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (IOException e11) {
                        Log.e(str, "Error in Data#fromByteArray: ", e11);
                    }
                }
                byteArrayInputStream.close();
                return new C0954g(hashMap);
            } catch (ClassNotFoundException e12) {
                e7 = e12;
                Log.e(str, "Error in Data#fromByteArray: ", e7);
                if (objectInputStream != null) {
                }
                byteArrayInputStream.close();
                return new C0954g(hashMap);
            }
        } catch (IOException e13) {
            e = e13;
            Throwable th2 = e;
            objectInputStream = null;
            e7 = th2;
            Log.e(str, "Error in Data#fromByteArray: ", e7);
            if (objectInputStream != null) {
            }
            byteArrayInputStream.close();
            return new C0954g(hashMap);
        } catch (ClassNotFoundException e14) {
            e = e14;
            Throwable th22 = e;
            objectInputStream = null;
            e7 = th22;
            Log.e(str, "Error in Data#fromByteArray: ", e7);
            if (objectInputStream != null) {
            }
            byteArrayInputStream.close();
            return new C0954g(hashMap);
        } catch (Throwable th3) {
            th = th3;
            if (0 != 0) {
                try {
                    objectInputStream2.close();
                } catch (IOException e15) {
                    Log.e(str, "Error in Data#fromByteArray: ", e15);
                }
            }
            try {
                byteArrayInputStream.close();
                throw th;
            } catch (IOException e16) {
                Log.e(str, "Error in Data#fromByteArray: ", e16);
                throw th;
            }
        }
        return new C0954g(hashMap);
    }

    public static byte[] c(C0954g c0954g) {
        ObjectOutputStream objectOutputStream;
        String str = f12355b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e7) {
            e = e7;
        }
        try {
            objectOutputStream.writeInt(c0954g.f12357a.size());
            for (Map.Entry entry : c0954g.f12357a.entrySet()) {
                objectOutputStream.writeUTF((String) entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException e8) {
                Log.e(str, "Error in Data#toByteArray: ", e8);
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e9) {
                Log.e(str, "Error in Data#toByteArray: ", e9);
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException e10) {
            e = e10;
            objectOutputStream2 = objectOutputStream;
            Log.e(str, "Error in Data#toByteArray: ", e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e11) {
                    Log.e(str, "Error in Data#toByteArray: ", e11);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e12) {
                Log.e(str, "Error in Data#toByteArray: ", e12);
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e13) {
                    Log.e(str, "Error in Data#toByteArray: ", e13);
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException e14) {
                Log.e(str, "Error in Data#toByteArray: ", e14);
                throw th;
            }
        }
    }

    public final String b(String str) {
        Object obj = this.f12357a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0954g.class != obj.getClass()) {
            return false;
        }
        HashMap hashMap = this.f12357a;
        Set<String> keySet = hashMap.keySet();
        HashMap hashMap2 = ((C0954g) obj).f12357a;
        if (!keySet.equals(hashMap2.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj2 = hashMap.get(str);
            Object obj3 = hashMap2.get(str);
            if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f12357a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        HashMap hashMap = this.f12357a;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = hashMap.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public C0954g(HashMap hashMap) {
        this.f12357a = new HashMap(hashMap);
    }
}
