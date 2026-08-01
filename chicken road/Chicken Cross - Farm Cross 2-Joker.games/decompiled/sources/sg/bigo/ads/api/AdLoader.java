package sg.bigo.ads.api;

/* loaded from: classes3.dex */
public interface AdLoader<T> {

    public interface Builder<T extends Ad, S extends Builder, U extends AdLoader> {
        U build();

        S withAdLoadListener(AdLoadListener<T> adLoadListener);

        S withExt(String str);
    }

    void loadAd(T t);
}
