package io.ktor.http.content;

import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Multipart.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a8\u0010\n\u001a\u00020\u0007*\u00020\u00002\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@¢\u0006\u0004\b\n\u0010\u000b\u001a\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f*\u00020\u0000H\u0087@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/http/content/MultiPartData;", "Lkotlinx/coroutines/flow/Flow;", "Lio/ktor/http/content/PartData;", "asFlow", "(Lio/ktor/http/content/MultiPartData;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "partHandler", "forEachPart", "(Lio/ktor/http/content/MultiPartData;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "readAllParts", "(Lio/ktor/http/content/MultiPartData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MultipartKt {
    public static final Flow<PartData> asFlow(MultiPartData multiPartData) {
        Intrinsics.checkNotNullParameter(multiPartData, "<this>");
        return FlowKt.flow(new MultipartKt$asFlow$1(multiPartData, null));
    }

    public static final Object forEachPart(MultiPartData multiPartData, Function2<? super PartData, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object collect = asFlow(multiPartData).collect(new MultipartKt$sam$kotlinx_coroutines_flow_FlowCollector$0(function2), continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0071 -> B:11:0x0074). Please report as a decompilation issue!!! */
    @Deprecated(level = DeprecationLevel.ERROR, message = "This method can deadlock on large requests. Use `forEachPart` instead.")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readAllParts(MultiPartData multiPartData, Continuation<? super List<? extends PartData>> continuation) {
        MultipartKt$readAllParts$1 multipartKt$readAllParts$1;
        int i;
        PartData partData;
        MultiPartData multiPartData2;
        ArrayList arrayList;
        PartData partData2;
        if (continuation instanceof MultipartKt$readAllParts$1) {
            multipartKt$readAllParts$1 = (MultipartKt$readAllParts$1) continuation;
            if ((multipartKt$readAllParts$1.label & Integer.MIN_VALUE) != 0) {
                multipartKt$readAllParts$1.label -= Integer.MIN_VALUE;
                Object obj = multipartKt$readAllParts$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = multipartKt$readAllParts$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    multipartKt$readAllParts$1.L$0 = multiPartData;
                    multipartKt$readAllParts$1.label = 1;
                    obj = multiPartData.readPart(multipartKt$readAllParts$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 1) {
                    multiPartData = (MultiPartData) multipartKt$readAllParts$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    arrayList = (ArrayList) multipartKt$readAllParts$1.L$1;
                    multiPartData2 = (MultiPartData) multipartKt$readAllParts$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    partData2 = (PartData) obj;
                    if (partData2 == null) {
                        return arrayList;
                    }
                    arrayList.add(partData2);
                    multipartKt$readAllParts$1.L$0 = multiPartData2;
                    multipartKt$readAllParts$1.L$1 = arrayList;
                    multipartKt$readAllParts$1.label = 2;
                    obj = multiPartData2.readPart(multipartKt$readAllParts$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    partData2 = (PartData) obj;
                    if (partData2 == null) {
                    }
                }
                partData = (PartData) obj;
                if (partData != null) {
                    return CollectionsKt.emptyList();
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(partData);
                multiPartData2 = multiPartData;
                arrayList = arrayList2;
                multipartKt$readAllParts$1.L$0 = multiPartData2;
                multipartKt$readAllParts$1.L$1 = arrayList;
                multipartKt$readAllParts$1.label = 2;
                obj = multiPartData2.readPart(multipartKt$readAllParts$1);
                if (obj == coroutine_suspended) {
                }
                partData2 = (PartData) obj;
                if (partData2 == null) {
                }
            }
        }
        multipartKt$readAllParts$1 = new MultipartKt$readAllParts$1(continuation);
        Object obj2 = multipartKt$readAllParts$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = multipartKt$readAllParts$1.label;
        if (i != 0) {
        }
        partData = (PartData) obj2;
        if (partData != null) {
        }
    }
}
