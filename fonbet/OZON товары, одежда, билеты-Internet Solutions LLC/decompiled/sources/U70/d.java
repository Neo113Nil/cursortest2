package U70;

import Jb.j;
import U70.e;
import We.E;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import ru.ozon.fintech.features.recordaudio.network.AudioRecordNetwork;

/* loaded from: classes3.dex */
public final class d implements Jb.e<AudioRecordNetwork> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<E> f27438a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<ru.ozon.fintech.settings.domain.a> f27439b;

    public d(Pc.a<E> aVar, Pc.a<ru.ozon.fintech.settings.domain.a> aVar2) {
        this.f27438a = aVar;
        this.f27439b = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        E okHttpClient = (E) ((e.d) this.f27438a).get();
        ru.ozon.fintech.settings.domain.a fintechSettings = (ru.ozon.fintech.settings.domain.a) ((e.c) this.f27439b).get();
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        String baseUrl = fintechSettings.f() + "/";
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Object create = new Retrofit.Builder().baseUrl(baseUrl).client(okHttpClient).addConverterFactory(MoshiConverterFactory.create()).build().create(AudioRecordNetwork.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        AudioRecordNetwork audioRecordNetwork = (AudioRecordNetwork) create;
        j.d(audioRecordNetwork);
        return audioRecordNetwork;
    }
}
