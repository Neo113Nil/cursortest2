package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public class FullUrlFormer<T> {

    /* renamed from: a, reason: collision with root package name */
    private java.util.List f7394a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private int f7395b = -1;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f7396c;

    /* renamed from: d, reason: collision with root package name */
    private final io.appmetrica.analytics.networktasks.internal.IParamsAppender f7397d;

    /* renamed from: e, reason: collision with root package name */
    private final io.appmetrica.analytics.networktasks.internal.ConfigProvider f7398e;

    public FullUrlFormer(io.appmetrica.analytics.networktasks.internal.IParamsAppender<T> iParamsAppender, io.appmetrica.analytics.networktasks.internal.ConfigProvider<T> configProvider) {
        this.f7397d = iParamsAppender;
        this.f7398e = configProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void buildAndSetFullHostUrl() {
        android.net.Uri.Builder buildUpon = android.net.Uri.parse((java.lang.String) this.f7394a.get(this.f7395b)).buildUpon();
        this.f7397d.appendParams(buildUpon, this.f7398e.getConfig());
        this.f7396c = buildUpon.build().toString();
    }

    public java.util.List<java.lang.String> getAllHosts() {
        return this.f7394a;
    }

    public java.lang.String getUrl() {
        return new io.appmetrica.analytics.networktasks.impl.c(this.f7396c).f7369a;
    }

    public boolean hasMoreHosts() {
        return this.f7395b + 1 < this.f7394a.size();
    }

    public void incrementAttemptNumber() {
        this.f7395b++;
    }

    public void setHosts(java.util.List<java.lang.String> list) {
        if (list == null) {
            list = new java.util.ArrayList<>();
        }
        this.f7394a = list;
    }
}
