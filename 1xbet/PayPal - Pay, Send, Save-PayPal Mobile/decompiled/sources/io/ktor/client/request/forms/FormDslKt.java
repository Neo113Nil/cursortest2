package io.ktor.client.request.forms;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u001a\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000\"\u0006\u0012\u0002\b\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a,\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0004\b\u0005\u0010\f\u001a]\u0010\u0015\u001a\u00020\t*\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0019\b\u0004\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0004 \u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a_\u0010\u0015\u001a\u00020\t*\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0005 \u0001¢\u0006\u0004\b\u0015\u0010\u001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"", "Lio/ktor/client/request/forms/FormPart;", "values", "", "Lio/ktor/http/content/PartData;", "formData", "([Lio/ktor/client/request/forms/FormPart;)Ljava/util/List;", "Lkotlin/Function1;", "Lio/ktor/client/request/forms/FormBuilder;", "", "Lkotlin/ExtensionFunctionType;", "block", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "", "key", "Lio/ktor/http/Headers;", "headers", "", io.ktor.http.ContentDisposition.Parameters.Size, "Lkotlinx/io/Sink;", "bodyBuilder", "append", "(Lio/ktor/client/request/forms/FormBuilder;Ljava/lang/String;Lio/ktor/http/Headers;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V", "filename", "Lio/ktor/http/ContentType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "(Lio/ktor/client/request/forms/FormBuilder;Ljava/lang/String;Ljava/lang/String;Lio/ktor/http/ContentType;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FormDslKt {
    public static final java.util.List<io.ktor.http.content.PartData> formData(io.ktor.client.request.forms.FormPart<?>... formPartArr) {
        io.ktor.http.content.PartData binaryChannelItem;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formPartArr, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (io.ktor.client.request.forms.FormPart<?> formPart : formPartArr) {
            java.lang.String key = formPart.getKey();
            final java.lang.Object component2 = formPart.component2();
            io.ktor.http.Headers headers = formPart.getHeaders();
            io.ktor.http.HeadersBuilder headersBuilder = new io.ktor.http.HeadersBuilder(0, 1, null);
            java.lang.String contentDisposition = io.ktor.http.HttpHeaders.INSTANCE.getContentDisposition();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("form-data; name=");
            sb.append(io.ktor.http.HeaderValueWithParametersKt.escapeIfNeeded(key));
            headersBuilder.append(contentDisposition, sb.toString());
            headersBuilder.appendAll(headers);
            if (component2 instanceof java.lang.String) {
                binaryChannelItem = new io.ktor.http.content.PartData.FormItem((java.lang.String) component2, new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.request.forms.FormDslKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                }, headersBuilder.build());
            } else if (component2 instanceof java.lang.Number) {
                binaryChannelItem = new io.ktor.http.content.PartData.FormItem(component2.toString(), new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.request.forms.FormDslKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                }, headersBuilder.build());
            } else if (component2 instanceof java.lang.Boolean) {
                binaryChannelItem = new io.ktor.http.content.PartData.FormItem(java.lang.String.valueOf(((java.lang.Boolean) component2).booleanValue()), new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.request.forms.FormDslKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                }, headersBuilder.build());
            } else if (component2 instanceof byte[]) {
                headersBuilder.append(io.ktor.http.HttpHeaders.INSTANCE.getContentLength(), java.lang.String.valueOf(((byte[]) component2).length));
                binaryChannelItem = new io.ktor.http.content.PartData.BinaryItem(new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.request.forms.FormDslKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlinx.io.Source ByteReadPacket$default;
                        ByteReadPacket$default = io.ktor.utils.io.core.ByteReadPacketKt.ByteReadPacket$default((byte[]) component2, 0, 0, 6, null);
                        return ByteReadPacket$default;
                    }
                }, new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.request.forms.FormDslKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                }, headersBuilder.build());
            } else if (component2 instanceof kotlinx.io.Source) {
                if (component2 instanceof kotlinx.io.Buffer) {
                    headersBuilder.append(io.ktor.http.HttpHeaders.INSTANCE.getContentLength(), java.lang.String.valueOf(io.ktor.utils.io.core.ByteReadPacketKt.getRemaining((kotlinx.io.Source) component2)));
                }
                binaryChannelItem = new io.ktor.http.content.PartData.BinaryItem(new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.request.forms.FormDslKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlinx.io.Source peek;
                        peek = ((kotlinx.io.Source) component2).peek();
                        return peek;
                    }
                }, new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.request.forms.FormDslKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return io.ktor.client.request.forms.FormDslKt.$r8$lambda$ATGybI4GllETi1jbE7ehFfVxY8A(component2);
                    }
                }, headersBuilder.build());
            } else if (component2 instanceof io.ktor.client.request.forms.InputProvider) {
                io.ktor.client.request.forms.InputProvider inputProvider = (io.ktor.client.request.forms.InputProvider) component2;
                java.lang.Long size = inputProvider.getSize();
                if (size != null) {
                    headersBuilder.append(io.ktor.http.HttpHeaders.INSTANCE.getContentLength(), size.toString());
                }
                binaryChannelItem = new io.ktor.http.content.PartData.BinaryItem(inputProvider.getBlock(), new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.request.forms.FormDslKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                }, headersBuilder.build());
            } else if (component2 instanceof io.ktor.client.request.forms.ChannelProvider) {
                io.ktor.client.request.forms.ChannelProvider channelProvider = (io.ktor.client.request.forms.ChannelProvider) component2;
                java.lang.Long size2 = channelProvider.getSize();
                if (size2 != null) {
                    headersBuilder.append(io.ktor.http.HttpHeaders.INSTANCE.getContentLength(), size2.toString());
                }
                binaryChannelItem = new io.ktor.http.content.PartData.BinaryChannelItem(channelProvider.getBlock(), headersBuilder.build());
            } else {
                throw new java.lang.IllegalStateException("Unknown form content type: ".concat(java.lang.String.valueOf(component2)).toString());
            }
            arrayList.add(binaryChannelItem);
        }
        return arrayList;
    }

    public static final java.util.List<io.ktor.http.content.PartData> formData(kotlin.jvm.functions.Function1<? super io.ktor.client.request.forms.FormBuilder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        io.ktor.client.request.forms.FormBuilder formBuilder = new io.ktor.client.request.forms.FormBuilder();
        function1.invoke(formBuilder);
        io.ktor.client.request.forms.FormPart[] formPartArr = (io.ktor.client.request.forms.FormPart[]) formBuilder.build$ktor_client_core().toArray(new io.ktor.client.request.forms.FormPart[0]);
        return formData((io.ktor.client.request.forms.FormPart<?>[]) java.util.Arrays.copyOf(formPartArr, formPartArr.length));
    }

    public static /* synthetic */ void append$default(io.ktor.client.request.forms.FormBuilder formBuilder, java.lang.String str, io.ktor.http.Headers headers, java.lang.Long l, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            headers = io.ktor.http.Headers.INSTANCE.getEmpty();
        }
        if ((i & 4) != 0) {
            l = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        formBuilder.append(new io.ktor.client.request.forms.FormPart(str, new io.ktor.client.request.forms.InputProvider(l, new io.ktor.client.request.forms.FormDslKt$append$1(function1)), headers));
    }

    public static final void append(io.ktor.client.request.forms.FormBuilder formBuilder, java.lang.String str, io.ktor.http.Headers headers, java.lang.Long l, kotlin.jvm.functions.Function1<? super kotlinx.io.Sink, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        formBuilder.append(new io.ktor.client.request.forms.FormPart(str, new io.ktor.client.request.forms.InputProvider(l, new io.ktor.client.request.forms.FormDslKt$append$1(function1)), headers));
    }

    public static final void append(io.ktor.client.request.forms.FormBuilder formBuilder, java.lang.String str, java.lang.String str2, io.ktor.http.ContentType contentType, java.lang.Long l, kotlin.jvm.functions.Function1<? super kotlinx.io.Sink, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        io.ktor.http.HeadersBuilder headersBuilder = new io.ktor.http.HeadersBuilder(0, 1, null);
        java.lang.String contentDisposition = io.ktor.http.HttpHeaders.INSTANCE.getContentDisposition();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("filename=");
        sb.append(io.ktor.http.HeaderValueWithParametersKt.escapeIfNeeded(str2));
        headersBuilder.set(contentDisposition, sb.toString());
        if (contentType != null) {
            headersBuilder.set(io.ktor.http.HttpHeaders.INSTANCE.getContentType(), contentType.toString());
        }
        formBuilder.append(new io.ktor.client.request.forms.FormPart(str, new io.ktor.client.request.forms.InputProvider(l, new io.ktor.client.request.forms.FormDslKt$append$1(function1)), headersBuilder.build()));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ATGybI4GllETi1jbE7ehFfVxY8A(java.lang.Object obj) {
        ((kotlinx.io.Source) obj).close();
        return kotlin.Unit.INSTANCE;
    }
}
