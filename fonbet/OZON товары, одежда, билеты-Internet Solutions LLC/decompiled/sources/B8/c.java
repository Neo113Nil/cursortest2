package B8;

import B8.a;
import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import k8.e;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private File f3036a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final e f3037b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a ATTEMPT_MIGRATION;
        public static final a NOT_GENERATED;
        public static final a REGISTERED;
        public static final a REGISTER_ERROR;
        public static final a UNREGISTERED;

        static {
            a aVar = new a("ATTEMPT_MIGRATION", 0);
            ATTEMPT_MIGRATION = aVar;
            a aVar2 = new a("NOT_GENERATED", 1);
            NOT_GENERATED = aVar2;
            a aVar3 = new a("UNREGISTERED", 2);
            UNREGISTERED = aVar3;
            a aVar4 = new a("REGISTERED", 3);
            REGISTERED = aVar4;
            a aVar5 = new a("REGISTER_ERROR", 4);
            REGISTER_ERROR = aVar5;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public c(@NonNull e eVar) {
        this.f3037b = eVar;
    }

    private File a() {
        if (this.f3036a == null) {
            synchronized (this) {
                try {
                    if (this.f3036a == null) {
                        this.f3036a = new File(this.f3037b.i().getFilesDir(), "PersistedInstallation." + this.f3037b.m() + ".json");
                    }
                } finally {
                }
            }
        }
        return this.f3036a;
    }

    @NonNull
    public final void b(@NonNull d dVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", dVar.c());
            jSONObject.put("Status", dVar.f().ordinal());
            jSONObject.put("AuthToken", dVar.a());
            jSONObject.put("RefreshToken", dVar.e());
            jSONObject.put("TokenCreationEpochInSecs", dVar.g());
            jSONObject.put("ExpiresInSecs", dVar.b());
            jSONObject.put("FisError", dVar.d());
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f3037b.i().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(a())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    @NonNull
    public final d c() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(a());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        a aVar = a.ATTEMPT_MIGRATION;
        int optInt = jSONObject.optInt("Status", aVar.ordinal());
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i11 = d.f3038a;
        a.C0075a c0075a = new a.C0075a();
        c0075a.h(0L);
        c0075a.g(aVar);
        c0075a.c(0L);
        c0075a.d(optString);
        c0075a.g(a.values()[optInt]);
        c0075a.b(optString2);
        c0075a.f(optString3);
        c0075a.h(optLong);
        c0075a.c(optLong2);
        c0075a.e(optString4);
        return c0075a.a();
    }
}
