package p000;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: renamed from: ga */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0242ga {

    /* JADX INFO: renamed from: a */
    public final long f2675a;

    public C0242ga(long j) {
        this.f2675a = j;
    }

    /* JADX INFO: renamed from: a */
    public static C0242ga m2009a(BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        C0242ga c0242ga = new C0242ga(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return c0242ga;
                    }
                    C0242ga c0242ga2 = new C0242ga(jsonReader.nextLong());
                    jsonReader.close();
                    return c0242ga2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th) {
            jsonReader.close();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C0242ga) && this.f2675a == ((C0242ga) obj).f2675a;
    }

    public final int hashCode() {
        long j = this.f2675a;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f2675a + "}";
    }
}
