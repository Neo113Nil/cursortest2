package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.C1190e;
import okio.InterfaceC1191f;
import retrofit2.Converter;

/* loaded from: classes5.dex */
final class GsonRequestBodyConverter<T> implements Converter<T, RequestBody> {
    static final MediaType MEDIA_TYPE = MediaType.get("application/json; charset=UTF-8");
    private final TypeAdapter<T> adapter;
    private final Gson gson;
    private final boolean streaming;

    public GsonRequestBodyConverter(Gson gson, TypeAdapter<T> typeAdapter, boolean z) {
        this.gson = gson;
        this.adapter = typeAdapter;
        this.streaming = z;
    }

    public static <T> void writeJson(InterfaceC1191f interfaceC1191f, Gson gson, TypeAdapter<T> typeAdapter, T t) throws IOException {
        JsonWriter newJsonWriter = gson.newJsonWriter(new OutputStreamWriter(interfaceC1191f.S(), StandardCharsets.UTF_8));
        typeAdapter.write(newJsonWriter, t);
        newJsonWriter.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // retrofit2.Converter
    public /* bridge */ /* synthetic */ RequestBody convert(Object obj) throws IOException {
        return convert((GsonRequestBodyConverter<T>) obj);
    }

    @Override // retrofit2.Converter
    public RequestBody convert(T t) throws IOException {
        if (this.streaming) {
            return new GsonStreamingRequestBody(this.gson, this.adapter, t);
        }
        C1190e c1190e = new C1190e();
        writeJson(c1190e, this.gson, this.adapter, t);
        return RequestBody.create(MEDIA_TYPE, c1190e.C(c1190e.b));
    }
}
