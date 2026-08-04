package p023d1;

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

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f12361b = n.g("Data");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f12362c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f12363a;

    static {
        g gVar = new g(new HashMap());
        c(gVar);
        f12362c = gVar;
    }

    public g(g gVar) {
        this.f12363a = new HashMap(gVar.f12363a);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static g a(byte[] bArr) throws Throwable {
        ObjectInputStream objectInputStream;
        Throwable e7;
        String str = f12361b;
        if (bArr.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        HashMap map = new HashMap();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        for (int i7 = objectInputStream.readInt(); i7 > 0; i7--) {
                            map.put(objectInputStream.readUTF(), objectInputStream.readObject());
                        }
                        try {
                            objectInputStream.close();
                        } catch (IOException e8) {
                            Log.e(str, "Error in Data#fromByteArray: ", e8);
                        }
                        byteArrayInputStream.close();
                    } catch (IOException e9) {
                        e7 = e9;
                        Log.e(str, "Error in Data#fromByteArray: ", e7);
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (IOException e10) {
                                Log.e(str, "Error in Data#fromByteArray: ", e10);
                            }
                        }
                        byteArrayInputStream.close();
                    } catch (ClassNotFoundException e11) {
                        e7 = e11;
                        Log.e(str, "Error in Data#fromByteArray: ", e7);
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                        byteArrayInputStream.close();
                    }
                } catch (IOException e12) {
                    Log.e(str, "Error in Data#fromByteArray: ", e12);
                }
            } catch (IOException e13) {
                e = e13;
                Throwable th = e;
                objectInputStream = null;
                e7 = th;
                Log.e(str, "Error in Data#fromByteArray: ", e7);
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                byteArrayInputStream.close();
                return new g(map);
            } catch (ClassNotFoundException e14) {
                e = e14;
                Throwable th2 = e;
                objectInputStream = null;
                e7 = th2;
                Log.e(str, "Error in Data#fromByteArray: ", e7);
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                byteArrayInputStream.close();
                return new g(map);
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
            return new g(map);
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static byte[] c(g gVar) throws Throwable {
        String str = f12361b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(gVar.f12363a.size());
                    for (Map.Entry entry : gVar.f12363a.entrySet()) {
                        objectOutputStream2.writeUTF((String) entry.getKey());
                        objectOutputStream2.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e7) {
                        Log.e(str, "Error in Data#toByteArray: ", e7);
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e8) {
                        Log.e(str, "Error in Data#toByteArray: ", e8);
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException e9) {
                    e = e9;
                    objectOutputStream = objectOutputStream2;
                    Log.e(str, "Error in Data#toByteArray: ", e);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e10) {
                            Log.e(str, "Error in Data#toByteArray: ", e10);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e11) {
                        Log.e(str, "Error in Data#toByteArray: ", e11);
                    }
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e12) {
                            Log.e(str, "Error in Data#toByteArray: ", e12);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e13) {
                        Log.e(str, "Error in Data#toByteArray: ", e13);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e14) {
            e = e14;
        }
    }

    public final String b(String str) {
        Object obj = this.f12363a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        HashMap map = this.f12363a;
        Set<String> setKeySet = map.keySet();
        HashMap map2 = ((g) obj).f12363a;
        if (!setKeySet.equals(map2.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj2 = map.get(str);
            Object obj3 = map2.get(str);
            if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f12363a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        HashMap map = this.f12363a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = map.get(str);
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

    public g(HashMap map) {
        this.f12363a = new HashMap(map);
    }
}
