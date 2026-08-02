package J2;

import android.util.JsonWriter;
import io.sentry.protocol.Message;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public String f3813a;

    @Override // J2.f
    public void c(JsonWriter jsonWriter) {
        Object obj = g.f3814b;
        jsonWriter.name(Message.JsonKeys.PARAMS).beginObject();
        String str = this.f3813a;
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }
}
