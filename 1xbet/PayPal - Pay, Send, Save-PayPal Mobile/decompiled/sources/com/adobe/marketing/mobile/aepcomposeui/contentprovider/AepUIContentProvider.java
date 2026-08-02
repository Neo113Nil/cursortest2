package com.adobe.marketing.mobile.aepcomposeui.contentprovider;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/adobe/marketing/mobile/aepcomposeui/contentprovider/AepUIContentProvider;", "", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "", "Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/AepUITemplate;", "getContent", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "refreshContent"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public interface AepUIContentProvider {
    java.lang.Object getContent(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends kotlin.Result<? extends java.util.List<? extends com.adobe.marketing.mobile.aepcomposeui.uimodels.AepUITemplate>>>> continuation);

    java.lang.Object refreshContent(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
