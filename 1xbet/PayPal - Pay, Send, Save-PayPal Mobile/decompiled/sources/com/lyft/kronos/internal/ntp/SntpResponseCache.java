package com.lyft.kronos.internal.ntp;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/lyft/kronos/internal/ntp/SntpResponseCache;", "", "", "clear", "()V", "Lcom/lyft/kronos/internal/ntp/SntpClient$Response;", "get", "()Lcom/lyft/kronos/internal/ntp/SntpClient$Response;", "response", "update", "(Lcom/lyft/kronos/internal/ntp/SntpClient$Response;)V"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public interface SntpResponseCache {
    void clear();

    com.lyft.kronos.internal.ntp.SntpClient.Response get();

    void update(com.lyft.kronos.internal.ntp.SntpClient.Response response);
}
