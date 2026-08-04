package J2;

import android.util.JsonWriter;
import io.sentry.protocol.Message;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f3813a;

    @Override // J2.f
    public void c(JsonWriter jsonWriter) throws IOException {
        Object obj = g.f3814b;
        jsonWriter.name(Message.JsonKeys.PARAMS).beginObject();
        String str = this.f3813a;
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }
}
