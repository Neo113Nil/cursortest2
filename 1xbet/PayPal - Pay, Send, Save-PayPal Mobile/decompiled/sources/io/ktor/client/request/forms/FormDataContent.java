package io.ktor.client.request.forms;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u000f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lio/ktor/client/request/forms/FormDataContent;", "Lio/ktor/http/content/OutgoingContent$ByteArrayContent;", "Lio/ktor/http/Parameters;", "formData", "<init>", "(Lio/ktor/http/Parameters;)V", "", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "()[B", "Lio/ktor/http/Parameters;", "getFormData", "()Lio/ktor/http/Parameters;", "Camera2StreamConfigurationMap", "[B", "getHighResolutionOutputSizeshNQ4ISI", "", "contentLength", "J", "getContentLength", "()Ljava/lang/Long;", "Lio/ktor/http/ContentType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FormDataContent extends io.ktor.http.content.OutgoingContent.ByteArrayContent {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final byte[] getHighResolutionOutputSizeshNQ4ISI;
    private final long contentLength;
    private final io.ktor.http.ContentType contentType;
    private final io.ktor.http.Parameters formData;

    public final io.ktor.http.Parameters getFormData() {
        return this.formData;
    }

    public FormDataContent(io.ktor.http.Parameters parameters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "");
        this.formData = parameters;
        this.getHighResolutionOutputSizeshNQ4ISI = io.ktor.utils.io.core.StringsKt.toByteArray$default(io.ktor.http.HttpUrlEncodedKt.formUrlEncode(parameters), null, 1, null);
        this.contentLength = r3.length;
        this.contentType = io.ktor.http.ContentTypesKt.withCharset(io.ktor.http.ContentType.Application.INSTANCE.getFormUrlEncoded(), kotlin.text.Charsets.UTF_8);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final java.lang.Long getContentLength() {
        return java.lang.Long.valueOf(this.contentLength);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final io.ktor.http.ContentType getContentType() {
        return this.contentType;
    }

    @Override // io.ktor.http.content.OutgoingContent.ByteArrayContent
    /* renamed from: bytes, reason: from getter */
    public final byte[] getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
