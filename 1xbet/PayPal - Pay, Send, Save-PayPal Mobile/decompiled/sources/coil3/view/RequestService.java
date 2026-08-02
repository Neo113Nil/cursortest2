package coil3.view;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcoil3/request/RequestService;", "", "Lcoil3/request/ImageRequest;", "request", "Lkotlinx/coroutines/Job;", "job", "", "findLifecycle", "Lcoil3/request/RequestDelegate;", "requestDelegate", "(Lcoil3/request/ImageRequest;Lkotlinx/coroutines/Job;Z)Lcoil3/request/RequestDelegate;", "updateRequest", "(Lcoil3/request/ImageRequest;)Lcoil3/request/ImageRequest;", "Lcoil3/size/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "Lcoil3/request/Options;", "options", "(Lcoil3/request/ImageRequest;Lcoil3/size/Size;)Lcoil3/request/Options;", "updateOptions", "(Lcoil3/request/Options;)Lcoil3/request/Options;", "Lcoil3/memory/MemoryCache$Value;", "cacheValue", "isCacheValueValidForHardware", "(Lcoil3/request/ImageRequest;Lcoil3/memory/MemoryCache$Value;)Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RequestService {
    boolean isCacheValueValidForHardware(coil3.view.ImageRequest request, coil3.memory.MemoryCache.Value cacheValue);

    coil3.view.Options options(coil3.view.ImageRequest request, coil3.view.Size size);

    coil3.view.RequestDelegate requestDelegate(coil3.view.ImageRequest request, kotlinx.coroutines.Job job, boolean findLifecycle);

    coil3.view.Options updateOptions(coil3.view.Options options);

    coil3.view.ImageRequest updateRequest(coil3.view.ImageRequest request);
}
