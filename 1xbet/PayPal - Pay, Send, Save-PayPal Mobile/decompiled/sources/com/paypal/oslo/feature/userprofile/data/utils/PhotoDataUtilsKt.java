package com.paypal.oslo.feature.userprofile.data.utils;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0080@¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Ljava/io/File;", "file", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lcom/paypal/oslo/feature/userprofile/domain/model/ImageMetadata;", "extractImageMetadata", "(Ljava/io/File;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "boundary", "countryCode", com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.BankFieldStateManagerKt.FieldNameAccountNumber, "Lokhttp3/RequestBody;", "buildMultipartRequestBody", "(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Lokhttp3/RequestBody;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "callError", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/userprofile/domain/model/FailureMessage;", "extractUgcmErrorFromExtensions", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;Landroid/content/Context;)Lcom/paypal/oslo/feature/userprofile/domain/model/FailureMessage;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PhotoDataUtilsKt {
    public static /* synthetic */ java.lang.Object extractImageMetadata$default(java.io.File file, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            coroutineDispatcher = kotlinx.coroutines.Dispatchers.getIO();
        }
        return extractImageMetadata(file, coroutineDispatcher, continuation);
    }

    public static final java.lang.Object extractImageMetadata(java.io.File file, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.domain.model.ImageMetadata> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(coroutineDispatcher, new com.paypal.oslo.feature.userprofile.data.utils.PhotoDataUtilsKt$extractImageMetadata$2(file, null), continuation);
    }

    public static final okhttp3.RequestBody buildMultipartRequestBody(java.lang.String str, java.io.File file, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\n        {\n            \"business_intent\": \"PROFILE_AVATAR\",\n            \"country_code\": \"");
        sb.append(str2);
        sb.append("\",\n            \"account_number\": \"");
        sb.append(str3);
        sb.append("\"\n        }\n    ");
        java.lang.String trimIndent = kotlin.text.StringsKt.trimIndent(sb.toString());
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        android.graphics.BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        java.lang.String str5 = options.outMimeType;
        if (str5 == null) {
            str5 = "image/jpeg";
        }
        int hashCode = str5.hashCode();
        if (hashCode == -1487394660) {
            str5.equals("image/jpeg");
        } else {
            if (hashCode != -1487018032) {
                if (hashCode == -879258763 && str5.equals(androidx.media3.common.MimeTypes.IMAGE_PNG)) {
                    str4 = "png";
                }
            } else if (str5.equals("image/webp")) {
                str4 = "webp";
            }
            java.lang.String nameWithoutExtension = kotlin.io.FilesKt.getNameWithoutExtension(file);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(nameWithoutExtension);
            sb2.append(".");
            sb2.append(str4);
            java.lang.String obj = sb2.toString();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("--");
            sb4.append(str);
            sb4.append(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
            sb3.append(sb4.toString());
            sb3.append("Content-Disposition: form-data; name=\"metadata\"\r\nContent-Type: application/json\r\n\r\n");
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(trimIndent);
            sb5.append(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
            sb3.append(sb5.toString());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("--");
            sb6.append(str);
            sb6.append(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
            sb3.append(sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Content-Disposition: form-data; name=\"inputFile\"; filename=\"");
            sb7.append(obj);
            sb7.append("\"\r\n");
            sb3.append(sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("Content-Type: ");
            sb8.append(str5);
            sb8.append("\r\n\r\n");
            sb3.append(sb8.toString());
            byte[] readBytes = kotlin.io.FilesKt.readBytes(file);
            java.lang.String obj2 = sb3.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
            byte[] bytes = obj2.getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
            byte[] plus = kotlin.collections.ArraysKt.plus(bytes, readBytes);
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("\r\n--");
            sb9.append(str);
            sb9.append("--\r\n");
            byte[] bytes2 = sb9.toString().getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes2, "");
            return okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody.INSTANCE, kotlin.collections.ArraysKt.plus(plus, bytes2), okhttp3.MediaType.INSTANCE.parse("multipart/mixed; boundary=".concat(java.lang.String.valueOf(str))), 0, 0, 6, (java.lang.Object) null);
        }
        str4 = "jpg";
        java.lang.String nameWithoutExtension2 = kotlin.io.FilesKt.getNameWithoutExtension(file);
        java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
        sb22.append(nameWithoutExtension2);
        sb22.append(".");
        sb22.append(str4);
        java.lang.String obj3 = sb22.toString();
        java.lang.StringBuilder sb32 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb42 = new java.lang.StringBuilder("--");
        sb42.append(str);
        sb42.append(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
        sb32.append(sb42.toString());
        sb32.append("Content-Disposition: form-data; name=\"metadata\"\r\nContent-Type: application/json\r\n\r\n");
        java.lang.StringBuilder sb52 = new java.lang.StringBuilder();
        sb52.append(trimIndent);
        sb52.append(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
        sb32.append(sb52.toString());
        java.lang.StringBuilder sb62 = new java.lang.StringBuilder("--");
        sb62.append(str);
        sb62.append(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
        sb32.append(sb62.toString());
        java.lang.StringBuilder sb72 = new java.lang.StringBuilder("Content-Disposition: form-data; name=\"inputFile\"; filename=\"");
        sb72.append(obj3);
        sb72.append("\"\r\n");
        sb32.append(sb72.toString());
        java.lang.StringBuilder sb82 = new java.lang.StringBuilder("Content-Type: ");
        sb82.append(str5);
        sb82.append("\r\n\r\n");
        sb32.append(sb82.toString());
        byte[] readBytes2 = kotlin.io.FilesKt.readBytes(file);
        java.lang.String obj22 = sb32.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj22, "");
        byte[] bytes3 = obj22.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes3, "");
        byte[] plus2 = kotlin.collections.ArraysKt.plus(bytes3, readBytes2);
        java.lang.StringBuilder sb92 = new java.lang.StringBuilder("\r\n--");
        sb92.append(str);
        sb92.append("--\r\n");
        byte[] bytes22 = sb92.toString().getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes22, "");
        return okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody.INSTANCE, kotlin.collections.ArraysKt.plus(plus2, bytes22), okhttp3.MediaType.INSTANCE.parse("multipart/mixed; boundary=".concat(java.lang.String.valueOf(str))), 0, 0, 6, (java.lang.Object) null);
    }

    public static final com.paypal.oslo.feature.userprofile.domain.model.FailureMessage extractUgcmErrorFromExtensions(com.paypal.oslo.core.network.graphql.error.CallError callError, android.content.Context context) {
        java.lang.String str;
        java.lang.Object obj;
        com.paypal.oslo.feature.userprofile.domain.model.FailureMessage failureMessage;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            return null;
        }
        java.util.Iterator<E> it = arrow.core.NonEmptyList.m9567boximpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY()).iterator();
        while (it.hasNext()) {
            java.util.Iterator<T> it2 = com.paypal.oslo.feature.userprofile.domain.utils.GraphQLErrorExtensionsKt.extractDetails((com.paypal.oslo.core.network.graphql.error.GraphQLError) it.next()).iterator();
            while (true) {
                boolean hasNext = it2.hasNext();
                str = com.paypal.oslo.feature.userprofile.domain.model.FailureMessage.UGCM_CSAM_ERROR_CODE;
                if (!hasNext) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.userprofile.domain.model.GraphQLErrorDetail) obj).getIssue(), com.paypal.oslo.feature.userprofile.domain.model.FailureMessage.UGCM_CSAM_ERROR_CODE)) {
                    break;
                }
            }
            com.paypal.oslo.feature.userprofile.domain.model.GraphQLErrorDetail graphQLErrorDetail = (com.paypal.oslo.feature.userprofile.domain.model.GraphQLErrorDetail) obj;
            if (graphQLErrorDetail != null) {
                java.lang.String issue = graphQLErrorDetail.getIssue();
                if (issue != null) {
                    str = issue;
                }
                java.lang.String description = graphQLErrorDetail.getDescription();
                if (description == null) {
                    description = context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_something_went_wrong);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(description, "");
                }
                failureMessage = new com.paypal.oslo.feature.userprofile.domain.model.FailureMessage(str, description);
            } else {
                failureMessage = null;
            }
            if (failureMessage != null) {
                return failureMessage;
            }
        }
        return null;
    }
}
