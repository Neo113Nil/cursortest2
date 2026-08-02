package io.ktor.http.content;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/ktor/http/content/MultiPartData;", "", "Lio/ktor/http/content/PartData;", "readPart", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Empty"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface MultiPartData {
    java.lang.Object readPart(kotlin.coroutines.Continuation<? super io.ktor.http.content.PartData> continuation);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/http/content/MultiPartData$Empty;", "Lio/ktor/http/content/MultiPartData;", "<init>", "()V", "Lio/ktor/http/content/PartData;", "readPart", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class Empty implements io.ktor.http.content.MultiPartData {
        public static final io.ktor.http.content.MultiPartData.Empty INSTANCE = new io.ktor.http.content.MultiPartData.Empty();

        @Override // io.ktor.http.content.MultiPartData
        public final java.lang.Object readPart(kotlin.coroutines.Continuation<? super io.ktor.http.content.PartData> continuation) {
            return null;
        }

        private Empty() {
        }
    }
}
