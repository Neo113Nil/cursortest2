package io.appmetrica.analytics.networktasks.internal;

import android.net.Uri;
import io.appmetrica.analytics.networktasks.impl.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class FullUrlFormer<T> {

    /* renamed from: a, reason: collision with root package name */
    private List f8893a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private int f8894b = -1;

    /* renamed from: c, reason: collision with root package name */
    private String f8895c;

    /* renamed from: d, reason: collision with root package name */
    private final IParamsAppender f8896d;

    /* renamed from: e, reason: collision with root package name */
    private final ConfigProvider f8897e;

    public FullUrlFormer(IParamsAppender<T> iParamsAppender, ConfigProvider<T> configProvider) {
        this.f8896d = iParamsAppender;
        this.f8897e = configProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void buildAndSetFullHostUrl() {
        Uri.Builder buildUpon = Uri.parse((String) this.f8893a.get(this.f8894b)).buildUpon();
        this.f8896d.appendParams(buildUpon, this.f8897e.getConfig());
        this.f8895c = buildUpon.build().toString();
    }

    public List<String> getAllHosts() {
        return this.f8893a;
    }

    public String getUrl() {
        return new c(this.f8895c).f8869a;
    }

    public boolean hasMoreHosts() {
        return this.f8894b + 1 < this.f8893a.size();
    }

    public void incrementAttemptNumber() {
        this.f8894b++;
    }

    public void setHosts(List<String> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f8893a = list;
    }
}
