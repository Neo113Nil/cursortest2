package androidx.compose.runtime.collection;

@kotlin.Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u000f\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0006\u0089\u0001\u008a\u0001\u008b\u0001B!\b\u0000\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u000e\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u0012J#\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0015\u0010\u0017J\u001e\u0010\u0015\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0018J\u001e\u0010\u0015\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0019J\u001b\u0010\u0015\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0015\u0010\u001aJ#\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0004\b\u0015\u0010\u001cJ\u001b\u0010\u0015\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0004\b\u0015\u0010\u001dJ/\u0010 \u001a\u00020\r2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\u001eH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b \u0010!J/\u0010\"\u001a\u00020\r2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\u001eH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\"\u0010!J\u0013\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0011¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b(\u0010\u000fJ\u001b\u0010)\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b)\u0010\u0018J\u001b\u0010)\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0004\b)\u0010\u001dJ\u001b\u0010)\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b)\u0010\u0019J\u001b\u0010+\u001a\u00020\r2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b+\u0010\u0019J\u0018\u0010-\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u0006H\u0000¢\u0006\u0004\b/\u0010.J\r\u00100\u001a\u00028\u0000¢\u0006\u0004\b0\u00101J/\u00100\u001a\u00028\u00002\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\u001eH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b0\u00102J\u0010\u00104\u001a\u000203H\u0080\b¢\u0006\u0004\b4\u00105J\u0017\u00104\u001a\u0002032\u0006\u00107\u001a\u000206H\u0000¢\u0006\u0004\b4\u00108J\u0012\u00109\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\b9\u00101J1\u00109\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\u001eH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b9\u00102JH\u0010?\u001a\u00028\u0001\"\u0004\b\u0001\u0010:2\u0006\u0010;\u001a\u00028\u00012\u001d\u0010>\u001a\u0019\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b=\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010<H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b?\u0010@JS\u0010B\u001a\u00028\u0001\"\u0004\b\u0001\u0010:2\u0006\u0010;\u001a\u00028\u00012(\u0010>\u001a$\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b=\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b=\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010AH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\bB\u0010CJH\u0010D\u001a\u00028\u0001\"\u0004\b\u0001\u0010:2\u0006\u0010;\u001a\u00028\u00012\u001d\u0010>\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b=\u0012\u0004\u0012\u00028\u00010<H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\bD\u0010@JS\u0010E\u001a\u00028\u0001\"\u0004\b\u0001\u0010:2\u0006\u0010;\u001a\u00028\u00012(\u0010>\u001a$\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b=\u0012\u0004\u0012\u00028\u0000\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b=\u0012\u0004\u0012\u00028\u00010AH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\bE\u0010CJ/\u0010G\u001a\u00020\u00112\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00110\u001eH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bG\u0010HJ5\u0010I\u001a\u00020\u00112\u0018\u0010F\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00110<H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bI\u0010JJ/\u0010K\u001a\u00020\u00112\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00110\u001eH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bK\u0010HJ5\u0010L\u001a\u00020\u00112\u0018\u0010F\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00110<H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bL\u0010JJ\u0018\u0010M\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\bM\u0010NJ\u0015\u0010O\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\bO\u0010PJ/\u0010Q\u001a\u00020\u00062\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\u001eH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bQ\u0010RJ/\u0010S\u001a\u00020\u00062\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\u001eH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bS\u0010RJ\u0010\u0010T\u001a\u00020\rH\u0086\b¢\u0006\u0004\bT\u0010UJ\u0010\u0010V\u001a\u00020\rH\u0086\b¢\u0006\u0004\bV\u0010UJ\r\u0010W\u001a\u00028\u0000¢\u0006\u0004\bW\u00101J/\u0010W\u001a\u00028\u00002\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\u001eH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bW\u00102J\u0015\u0010X\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\bX\u0010PJ\u0012\u0010Y\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\bY\u00101J1\u0010Y\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\u001eH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bY\u00102J=\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0006\b\u0001\u0010:\u0018\u00012\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001eH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b[\u0010\\JH\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0006\b\u0001\u0010:\u0018\u00012\u001d\u0010Z\u001a\u0019\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b=\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010<H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b]\u0010^JJ\u0010_\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0006\b\u0001\u0010:\u0018\u00012\u001f\u0010Z\u001a\u001b\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b=\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010<H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b_\u0010`J?\u0010a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0006\b\u0001\u0010:\u0018\u00012\u0014\u0010Z\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u001eH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\ba\u0010bJ\u0018\u0010c\u001a\u00020\u00112\u0006\u0010\f\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\bc\u0010dJ\u0018\u0010e\u001a\u00020\u00112\u0006\u0010\f\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\be\u0010dJ\u0015\u0010f\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\bf\u0010\u000fJ\u001b\u0010g\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\bg\u0010\u0018J\u001b\u0010g\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\bg\u0010\u0019J\u001b\u0010g\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0004\bg\u0010\u001dJ\u0015\u0010h\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\bh\u0010NJ\u001d\u0010k\u001a\u00020\u00112\u0006\u0010i\u001a\u00020\u00062\u0006\u0010j\u001a\u00020\u0006¢\u0006\u0004\bk\u0010lJ\u0017\u0010n\u001a\u00020\u00112\u0006\u0010m\u001a\u00020\u0006H\u0000¢\u0006\u0004\bn\u0010.J$\u0010o\u001a\u00020\u00112\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\u001eH\u0086\b¢\u0006\u0004\bo\u0010HJ\u001b\u0010p\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0004\bp\u0010\u001dJ \u0010q\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\bq\u0010rJ%\u0010v\u001a\u00020\u00112\u0016\u0010u\u001a\u0012\u0012\u0004\u0012\u00028\u00000sj\b\u0012\u0004\u0012\u00028\u0000`t¢\u0006\u0004\bv\u0010wJ/\u0010y\u001a\u00020\u00062\u0012\u0010x\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u001eH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\by\u0010RR$\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00048\u0000@\u0000X\u0080\u000e¢\u0006\f\n\u0004\b\u0005\u0010z\u0012\u0004\b{\u0010'R\u001e\u0010~\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u007f\u001a\u00020\u00068\u0007@BX\u0086\u000e¢\u0006\u000f\n\u0005\b\u0007\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0015\u0010\u0084\u0001\u001a\u00020\u00068Ç\u0002¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0082\u0001R\u0016\u0010\u0088\u0001\u001a\u00030\u0085\u00018Ç\u0002¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector;", "T", "Ljava/util/RandomAccess;", "Lkotlin/collections/getHighResolutionOutputSizeshNQ4ISI;", "", "content", "", io.ktor.http.ContentDisposition.Parameters.Size, "<init>", "([Ljava/lang/Object;I)V", "getContent", "()[Ljava/lang/Object;", "element", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/lang/Object;)Z", "index", "", "(ILjava/lang/Object;)V", "", "elements", "addAll", "(ILjava/util/List;)Z", "(ILandroidx/compose/runtime/collection/MutableVector;)Z", "(Ljava/util/List;)Z", "(Landroidx/compose/runtime/collection/MutableVector;)Z", "([Ljava/lang/Object;)Z", "", "(ILjava/util/Collection;)Z", "(Ljava/util/Collection;)Z", "Lkotlin/Function1;", "predicate", "any", "(Lkotlin/jvm/functions/Function1;)Z", "reversedAny", "", "asMutableList", "()Ljava/util/List;", "clear", "()V", "contains", "containsAll", "other", "contentEquals", "capacity", "ensureCapacity", "(I)V", "resizeStorage", "first", "()Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", "throwNoSuchElementException", "()Ljava/lang/Void;", "", "message", "(Ljava/lang/String;)Ljava/lang/Void;", "firstOrNull", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "initial", "Lkotlin/Function2;", "Lkotlin/ParameterName;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlin/Function3;", "foldIndexed", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "block", "forEach", "(Lkotlin/jvm/functions/Function1;)V", "forEachIndexed", "(Lkotlin/jvm/functions/Function2;)V", "forEachReversed", "forEachReversedIndexed", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "indexOfFirst", "(Lkotlin/jvm/functions/Function1;)I", "indexOfLast", "isEmpty", "()Z", "isNotEmpty", "last", "lastIndexOf", "lastOrNull", "transform", "map", "(Lkotlin/jvm/functions/Function1;)[Ljava/lang/Object;", "mapIndexed", "(Lkotlin/jvm/functions/Function2;)[Ljava/lang/Object;", "mapIndexedNotNull", "(Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/collection/MutableVector;", "mapNotNull", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/collection/MutableVector;", "plusAssign", "(Ljava/lang/Object;)V", "minusAssign", "remove", "removeAll", "removeAt", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "removeRange", "(II)V", "newSize", "setSize", "removeIf", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "Ljava/util/Comparator;", "Lkotlin/getOutputStallDuration;", "comparator", "sortWith", "(Ljava/util/Comparator;)V", "selector", "sumBy", "[Ljava/lang/Object;", "getContent$annotations", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "getHighSpeedVideoSizes", "p0", com.visa.cbp.getEncExpo.warmup, "getSize", "()I", "getLastIndex", "lastIndex", "Lkotlin/ranges/IntRange;", "getIndices", "()Lkotlin/ranges/IntRange;", "indices", "VectorListIterator", "MutableVectorList", "SubList"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MutableVector<T> implements java.util.RandomAccess {
    public static final int $stable = 8;
    public T[] content;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private java.util.List<T> getHighSpeedVideoSizes;
    private int size;

    public static /* synthetic */ void getContent$annotations() {
    }

    public MutableVector(T[] tArr, int i) {
        this.content = tArr;
        this.size = i;
    }

    public final int getSize() {
        return this.size;
    }

    public final int getLastIndex() {
        return getSize() - 1;
    }

    public final kotlin.ranges.IntRange getIndices() {
        return kotlin.ranges.RangesKt.until(0, getSize());
    }

    public final T[] getContent() {
        return this.content;
    }

    public final boolean add(T element) {
        int i = this.size + 1;
        if (this.content.length < i) {
            resizeStorage(i);
        }
        T[] tArr = this.content;
        int i2 = this.size;
        tArr[i2] = element;
        this.size = i2 + 1;
        return true;
    }

    public final void add(int index, T element) {
        int i = this.size + 1;
        if (this.content.length < i) {
            resizeStorage(i);
        }
        T[] tArr = this.content;
        int i2 = this.size;
        if (index != i2) {
            java.lang.System.arraycopy(tArr, index, tArr, index + 1, i2 - index);
        }
        tArr[index] = element;
        this.size++;
    }

    public final boolean addAll(int index, java.util.List<? extends T> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        int size = elements.size();
        int i = this.size + size;
        if (this.content.length < i) {
            resizeStorage(i);
        }
        T[] tArr = this.content;
        int i2 = this.size;
        if (index != i2) {
            java.lang.System.arraycopy(tArr, index, tArr, index + size, i2 - index);
        }
        int size2 = elements.size();
        for (int i3 = 0; i3 < size2; i3++) {
            tArr[index + i3] = elements.get(i3);
        }
        this.size += size;
        return true;
    }

    public final boolean addAll(int index, androidx.compose.runtime.collection.MutableVector<T> elements) {
        int i = elements.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size + i;
        if (this.content.length < i2) {
            resizeStorage(i2);
        }
        T[] tArr = this.content;
        int i3 = this.size;
        if (index != i3) {
            java.lang.System.arraycopy(tArr, index, tArr, index + i, i3 - index);
        }
        java.lang.System.arraycopy(elements.content, 0, tArr, index, i);
        this.size += i;
        return true;
    }

    public final boolean addAll(java.util.List<? extends T> elements) {
        return addAll(getSize(), (java.util.List) elements);
    }

    public final boolean addAll(androidx.compose.runtime.collection.MutableVector<T> elements) {
        return addAll(getSize(), elements);
    }

    public final boolean addAll(T[] elements) {
        int length = elements.length;
        if (length == 0) {
            return false;
        }
        int i = this.size + length;
        if (this.content.length < i) {
            resizeStorage(i);
        }
        java.lang.System.arraycopy(elements, 0, this.content, this.size, length);
        this.size += length;
        return true;
    }

    public final boolean addAll(int index, java.util.Collection<? extends T> elements) {
        int i = 0;
        if (elements.isEmpty()) {
            return false;
        }
        int size = elements.size();
        int i2 = this.size + size;
        if (this.content.length < i2) {
            resizeStorage(i2);
        }
        T[] tArr = this.content;
        int i3 = this.size;
        if (index != i3) {
            java.lang.System.arraycopy(tArr, index, tArr, index + size, i3 - index);
        }
        for (T t : elements) {
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            tArr[i + index] = t;
            i++;
        }
        this.size += size;
        return true;
    }

    public final boolean addAll(java.util.Collection<? extends T> elements) {
        return addAll(this.size, elements);
    }

    public final boolean any(kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> predicate) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            if (predicate.invoke(tArr[i]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean reversedAny(kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> predicate) {
        T[] tArr = this.content;
        for (int size = getSize() - 1; size >= 0; size--) {
            if (predicate.invoke(tArr[size]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final java.util.List<T> asMutableList() {
        java.util.List<T> list = this.getHighSpeedVideoSizes;
        if (list != null) {
            return list;
        }
        androidx.compose.runtime.collection.MutableVector.MutableVectorList mutableVectorList = new androidx.compose.runtime.collection.MutableVector.MutableVectorList(this);
        this.getHighSpeedVideoSizes = mutableVectorList;
        return mutableVectorList;
    }

    public final void clear() {
        T[] tArr = this.content;
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            tArr[i2] = null;
        }
        this.size = 0;
    }

    public final boolean containsAll(java.util.List<? extends T> elements) {
        int size = elements.size();
        for (int i = 0; i < size; i++) {
            if (!contains(elements.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean containsAll(java.util.Collection<? extends T> elements) {
        java.util.Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean contentEquals(androidx.compose.runtime.collection.MutableVector<T> other) {
        if (other.size != this.size) {
            return false;
        }
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i = 0; kotlin.jvm.internal.Intrinsics.areEqual(other.content[i], this.content[i]); i++) {
                if (i != size) {
                }
            }
            return false;
        }
        return true;
    }

    public final void ensureCapacity(int capacity) {
        if (this.content.length < capacity) {
            resizeStorage(capacity);
        }
    }

    public final void resizeStorage(int capacity) {
        T[] tArr = this.content;
        int length = tArr.length;
        T[] tArr2 = (T[]) new java.lang.Object[java.lang.Math.max(capacity, length * 2)];
        java.lang.System.arraycopy(tArr, 0, tArr2, 0, length);
        this.content = tArr2;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
    public final T first(kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> predicate) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            ?? r3 = (java.lang.Object) tArr[i];
            if (predicate.invoke(r3).booleanValue()) {
                return r3;
            }
        }
        throwNoSuchElementException("MutableVector contains no element matching the predicate.");
        throw new kotlin.KotlinNothingValueException();
    }

    public final java.lang.Void throwNoSuchElementException() {
        throwNoSuchElementException("MutableVector is empty.");
        throw new kotlin.KotlinNothingValueException();
    }

    public final java.lang.Void throwNoSuchElementException(java.lang.String message) {
        throw new java.util.NoSuchElementException(message);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
    public final T firstOrNull(kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> predicate) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            ?? r3 = (java.lang.Object) tArr[i];
            if (predicate.invoke(r3).booleanValue()) {
                return r3;
            }
        }
        return null;
    }

    public final <R> R fold(R initial, kotlin.jvm.functions.Function2<? super R, ? super T, ? extends R> operation) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            initial = operation.invoke(initial, tArr[i]);
        }
        return initial;
    }

    public final <R> R foldIndexed(R initial, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super R, ? super T, ? extends R> operation) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            initial = operation.invoke(java.lang.Integer.valueOf(i), initial, tArr[i]);
        }
        return initial;
    }

    public final <R> R foldRight(R initial, kotlin.jvm.functions.Function2<? super T, ? super R, ? extends R> operation) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size >= tArr.length) {
            return initial;
        }
        while (size >= 0) {
            initial = operation.invoke(tArr[size], initial);
            size--;
        }
        return initial;
    }

    public final <R> R foldRightIndexed(R initial, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super T, ? super R, ? extends R> operation) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size >= tArr.length) {
            return initial;
        }
        while (size >= 0) {
            initial = operation.invoke(java.lang.Integer.valueOf(size), tArr[size], initial);
            size--;
        }
        return initial;
    }

    public final void forEach(kotlin.jvm.functions.Function1<? super T, kotlin.Unit> block) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            block.invoke(tArr[i]);
        }
    }

    public final void forEachIndexed(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, kotlin.Unit> block) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            block.invoke(java.lang.Integer.valueOf(i), tArr[i]);
        }
    }

    public final void forEachReversed(kotlin.jvm.functions.Function1<? super T, kotlin.Unit> block) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size < tArr.length) {
            while (size >= 0) {
                block.invoke(tArr[size]);
                size--;
            }
        }
    }

    public final void forEachReversedIndexed(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, kotlin.Unit> block) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size < tArr.length) {
            while (size >= 0) {
                block.invoke(java.lang.Integer.valueOf(size), tArr[size]);
                size--;
            }
        }
    }

    public final T get(int index) {
        return this.content[index];
    }

    public final int indexOf(T element) {
        T[] tArr = this.content;
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(element, tArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final int indexOfFirst(kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> predicate) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            if (predicate.invoke(tArr[i]).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    public final int indexOfLast(kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> predicate) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size >= tArr.length) {
            return -1;
        }
        while (size >= 0) {
            if (predicate.invoke(tArr[size]).booleanValue()) {
                return size;
            }
            size--;
        }
        return -1;
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final boolean isNotEmpty() {
        return getSize() != 0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    public final T last(kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> predicate) {
        T[] tArr = this.content;
        for (int size = getSize() - 1; size >= 0; size--) {
            ?? r2 = (java.lang.Object) tArr[size];
            if (predicate.invoke(r2).booleanValue()) {
                return r2;
            }
        }
        throwNoSuchElementException("MutableVector contains no element matching the predicate.");
        throw new kotlin.KotlinNothingValueException();
    }

    public final int lastIndexOf(T element) {
        T[] tArr = this.content;
        for (int i = this.size - 1; i >= 0; i--) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(element, tArr[i])) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    public final T lastOrNull(kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> predicate) {
        T[] tArr = this.content;
        for (int size = getSize() - 1; size >= 0; size--) {
            ?? r2 = (java.lang.Object) tArr[size];
            if (predicate.invoke(r2).booleanValue()) {
                return r2;
            }
        }
        return null;
    }

    public final /* synthetic */ <R> R[] map(kotlin.jvm.functions.Function1<? super T, ? extends R> transform) {
        int size = getSize();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(0, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE);
        R[] rArr = (R[]) new java.lang.Object[size];
        for (int i = 0; i < size; i++) {
            rArr[i] = transform.invoke(this.content[i]);
        }
        return rArr;
    }

    public final /* synthetic */ <R> R[] mapIndexed(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends R> transform) {
        int size = getSize();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(0, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE);
        R[] rArr = (R[]) new java.lang.Object[size];
        for (int i = 0; i < size; i++) {
            rArr[i] = transform.invoke(java.lang.Integer.valueOf(i), this.content[i]);
        }
        return rArr;
    }

    public final /* synthetic */ <R> androidx.compose.runtime.collection.MutableVector<R> mapIndexedNotNull(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends R> transform) {
        int size = getSize();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(0, "R?");
        java.lang.Object[] objArr = new java.lang.Object[size];
        T[] tArr = this.content;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            R invoke = transform.invoke(java.lang.Integer.valueOf(i2), tArr[i2]);
            if (invoke != null) {
                objArr[i] = invoke;
                i++;
            }
        }
        return new androidx.compose.runtime.collection.MutableVector<>(objArr, i);
    }

    public final /* synthetic */ <R> androidx.compose.runtime.collection.MutableVector<R> mapNotNull(kotlin.jvm.functions.Function1<? super T, ? extends R> transform) {
        int size = getSize();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(0, "R?");
        java.lang.Object[] objArr = new java.lang.Object[size];
        T[] tArr = this.content;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            R invoke = transform.invoke(tArr[i2]);
            if (invoke != null) {
                objArr[i] = invoke;
                i++;
            }
        }
        return new androidx.compose.runtime.collection.MutableVector<>(objArr, i);
    }

    public final void plusAssign(T element) {
        add(element);
    }

    public final void minusAssign(T element) {
        remove(element);
    }

    public final boolean remove(T element) {
        int indexOf = indexOf(element);
        if (indexOf < 0) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    public final boolean removeAll(java.util.List<? extends T> elements) {
        int i = this.size;
        int size = elements.size();
        for (int i2 = 0; i2 < size; i2++) {
            remove(elements.get(i2));
        }
        return i != this.size;
    }

    public final boolean removeAll(androidx.compose.runtime.collection.MutableVector<T> elements) {
        int i = this.size;
        int size = elements.getSize() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                remove(elements.content[i2]);
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return i != this.size;
    }

    public final boolean removeAll(java.util.Collection<? extends T> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        int i = this.size;
        java.util.Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i != this.size;
    }

    public final T removeAt(int index) {
        T[] tArr = this.content;
        T t = tArr[index];
        if (index != getSize() - 1) {
            int i = index + 1;
            java.lang.System.arraycopy(tArr, i, tArr, index, this.size - i);
        }
        int i2 = this.size - 1;
        this.size = i2;
        tArr[i2] = null;
        return t;
    }

    public final void removeRange(int start, int end) {
        if (end > start) {
            int i = this.size;
            if (end < i) {
                T[] tArr = this.content;
                java.lang.System.arraycopy(tArr, end, tArr, start, i - end);
            }
            int i2 = this.size - (end - start);
            int size = getSize() - 1;
            if (i2 <= size) {
                int i3 = i2;
                while (true) {
                    this.content[i3] = null;
                    if (i3 == size) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.size = i2;
        }
    }

    public final void setSize(int newSize) {
        this.size = newSize;
    }

    public final void removeIf(kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> predicate) {
        int size = getSize();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (predicate.invoke(this.content[i2]).booleanValue()) {
                i++;
            } else if (i > 0) {
                T[] tArr = this.content;
                tArr[i2 - i] = tArr[i2];
            }
        }
        int i3 = size - i;
        kotlin.collections.ArraysKt.fill(this.content, (java.lang.Object) null, i3, size);
        setSize(i3);
    }

    public final boolean retainAll(java.util.Collection<? extends T> elements) {
        int i = this.size;
        for (int size = getSize() - 1; size >= 0; size--) {
            if (!elements.contains(this.content[size])) {
                removeAt(size);
            }
        }
        return i != this.size;
    }

    public final T set(int index, T element) {
        T[] tArr = this.content;
        T t = tArr[index];
        tArr[index] = element;
        return t;
    }

    public final void sortWith(java.util.Comparator<T> comparator) {
        kotlin.collections.ArraysKt.sortWith(this.content, comparator, 0, this.size);
    }

    public final int sumBy(kotlin.jvm.functions.Function1<? super T, java.lang.Integer> selector) {
        T[] tArr = this.content;
        int i = 0;
        for (int i2 = 0; i2 < getSize(); i2++) {
            i += selector.invoke(tArr[i2]).intValue();
        }
        return i;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\rJ\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0019\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$VectorListIterator;", "T", "", "", "p0", "", "p1", "<init>", "(Ljava/util/List;I)V", "", "hasNext", "()Z", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "", "remove", "()V", "hasPrevious", "nextIndex", "()I", "previous", "previousIndex", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/lang/Object;)V", "set", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class VectorListIterator<T> implements java.util.ListIterator<T>, kotlin.jvm.internal.markers.KMutableListIterator {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private int getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final java.util.List<T> getHighResolutionOutputSizeshNQ4ISI;

        public VectorListIterator(java.util.List<T> list, int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = list;
            this.getHighSpeedVideoFpsRanges = i;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.getHighSpeedVideoFpsRanges < this.getHighResolutionOutputSizeshNQ4ISI.size();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            java.util.List<T> list = this.getHighResolutionOutputSizeshNQ4ISI;
            int i = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = i + 1;
            return list.get(i);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            int i = this.getHighSpeedVideoFpsRanges - 1;
            this.getHighSpeedVideoFpsRanges = i;
            this.getHighResolutionOutputSizeshNQ4ISI.remove(i);
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.getHighSpeedVideoFpsRanges > 0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            int i = this.getHighSpeedVideoFpsRanges - 1;
            this.getHighSpeedVideoFpsRanges = i;
            return this.getHighResolutionOutputSizeshNQ4ISI.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.getHighSpeedVideoFpsRanges - 1;
        }

        @Override // java.util.ListIterator
        public final void add(T p0) {
            this.getHighResolutionOutputSizeshNQ4ISI.add(this.getHighSpeedVideoFpsRanges, p0);
            this.getHighSpeedVideoFpsRanges++;
        }

        @Override // java.util.ListIterator
        public final void set(T p0) {
            this.getHighResolutionOutputSizeshNQ4ISI.set(this.getHighSpeedVideoFpsRanges, p0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010+\n\u0002\b\u000f\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0011J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\tJ\u001f\u0010\u0018\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u001bJ%\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001c\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\nH\u0016¢\u0006\u0004\b\u001c\u0010\fJ\u000f\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010 H\u0016¢\u0006\u0004\b!\u0010\"J\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010 2\u0006\u0010\u0004\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010#J\u0017\u0010$\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b$\u0010\tJ\u001d\u0010%\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\nH\u0016¢\u0006\u0004\b%\u0010\fJ\u0017\u0010&\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00020\rH\u0016¢\u0006\u0004\b&\u0010\u000fJ\u001d\u0010'\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\nH\u0016¢\u0006\u0004\b'\u0010\fJ \u0010(\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b(\u0010)J%\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\rH\u0016¢\u0006\u0004\b*\u0010+R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010&\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010/"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$MutableVectorList;", "T", "", "Landroidx/compose/runtime/collection/MutableVector;", "p0", "<init>", "(Landroidx/compose/runtime/collection/MutableVector;)V", "", "contains", "(Ljava/lang/Object;)Z", "", "containsAll", "(Ljava/util/Collection;)Z", "", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "p1", "", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "()V", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "getHighSpeedVideoFpsRanges", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "(II)Ljava/util/List;", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/collection/MutableVector;", "getHighSpeedVideoFpsRangesFor", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class MutableVectorList<T> implements java.util.List<T>, kotlin.jvm.internal.markers.KMutableList {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final androidx.compose.runtime.collection.MutableVector<T> getHighSpeedVideoFpsRangesFor;

        public MutableVectorList(androidx.compose.runtime.collection.MutableVector<T> mutableVector) {
            this.getHighSpeedVideoFpsRangesFor = mutableVector;
        }

        @Override // java.util.List
        public final T remove(int i) {
            return getHighSpeedVideoFpsRanges(i);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return Camera2StreamConfigurationMap();
        }

        private int Camera2StreamConfigurationMap() {
            return this.getHighSpeedVideoFpsRangesFor.getSize();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(java.lang.Object p0) {
            return this.getHighSpeedVideoFpsRangesFor.contains(p0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(java.util.Collection<?> p0) {
            return this.getHighSpeedVideoFpsRangesFor.containsAll(p0);
        }

        @Override // java.util.List
        public final T get(int p0) {
            androidx.compose.runtime.collection.MutableVectorKt.checkIndex(this, p0);
            return this.getHighSpeedVideoFpsRangesFor.content[p0];
        }

        @Override // java.util.List
        public final int indexOf(java.lang.Object p0) {
            return this.getHighSpeedVideoFpsRangesFor.indexOf(p0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.getHighSpeedVideoFpsRangesFor.getSize() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final java.util.Iterator<T> iterator() {
            return new androidx.compose.runtime.collection.MutableVector.VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(java.lang.Object p0) {
            return this.getHighSpeedVideoFpsRangesFor.lastIndexOf(p0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T p0) {
            return this.getHighSpeedVideoFpsRangesFor.add(p0);
        }

        @Override // java.util.List
        public final void add(int p0, T p1) {
            this.getHighSpeedVideoFpsRangesFor.add(p0, p1);
        }

        @Override // java.util.List
        public final boolean addAll(int p0, java.util.Collection<? extends T> p1) {
            return this.getHighSpeedVideoFpsRangesFor.addAll(p0, p1);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(java.util.Collection<? extends T> p0) {
            return this.getHighSpeedVideoFpsRangesFor.addAll(p0);
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            this.getHighSpeedVideoFpsRangesFor.clear();
        }

        @Override // java.util.List
        public final java.util.ListIterator<T> listIterator() {
            return new androidx.compose.runtime.collection.MutableVector.VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public final java.util.ListIterator<T> listIterator(int p0) {
            return new androidx.compose.runtime.collection.MutableVector.VectorListIterator(this, p0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(java.lang.Object p0) {
            return this.getHighSpeedVideoFpsRangesFor.remove(p0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(java.util.Collection<?> p0) {
            return this.getHighSpeedVideoFpsRangesFor.removeAll(p0);
        }

        private T getHighSpeedVideoFpsRanges(int p0) {
            androidx.compose.runtime.collection.MutableVectorKt.checkIndex(this, p0);
            return this.getHighSpeedVideoFpsRangesFor.removeAt(p0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(java.util.Collection<?> p0) {
            return this.getHighSpeedVideoFpsRangesFor.retainAll(p0);
        }

        @Override // java.util.List
        public final T set(int p0, T p1) {
            androidx.compose.runtime.collection.MutableVectorKt.checkIndex(this, p0);
            return this.getHighSpeedVideoFpsRangesFor.set(p0, p1);
        }

        @Override // java.util.List
        public final java.util.List<T> subList(int p0, int p1) {
            androidx.compose.runtime.collection.MutableVector.MutableVectorList<T> mutableVectorList = this;
            androidx.compose.runtime.collection.MutableVectorKt.checkSubIndex(mutableVectorList, p0, p1);
            return new androidx.compose.runtime.collection.MutableVector.SubList(mutableVectorList, p0, p1);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) kotlin.jvm.internal.CollectionToArray.toArray(this, tArr);
        }

        @Override // java.util.List, java.util.Collection
        public final java.lang.Object[] toArray() {
            return kotlin.jvm.internal.CollectionToArray.toArray(this);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\b\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010+\n\u0002\b\u0012\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00028\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0012J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u000bJ\u001f\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u001bJ%\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001c\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\u001c\u0010\u000eJ\u000f\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010 H\u0016¢\u0006\u0004\b!\u0010\"J\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010 2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010#J\u0017\u0010$\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b$\u0010\u000bJ\u001d\u0010%\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b%\u0010\u000eJ\u0017\u0010&\u001a\u00028\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010\u0010J\u001d\u0010'\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b'\u0010\u000eJ \u0010(\u001a\u00028\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b(\u0010)J%\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b*\u0010+R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00101\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010,\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u00100R\u0014\u0010/\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u00102"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$SubList;", "T", "", "p0", "", "p1", "p2", "<init>", "(Ljava/util/List;II)V", "", "contains", "(Ljava/lang/Object;)Z", "", "containsAll", "(Ljava/util/Collection;)Z", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "()V", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "getHighSpeedVideoFpsRangesFor", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "(II)Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class SubList<T> implements java.util.List<T>, kotlin.jvm.internal.markers.KMutableList {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final java.util.List<T> getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private int getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final int Camera2StreamConfigurationMap;

        public SubList(java.util.List<T> list, int i, int i2) {
            this.getHighSpeedVideoFpsRanges = list;
            this.Camera2StreamConfigurationMap = i;
            this.getHighResolutionOutputSizeshNQ4ISI = i2;
        }

        @Override // java.util.List
        public final T remove(int i) {
            return getHighSpeedVideoFpsRangesFor(i);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return getHighSpeedVideoFpsRangesFor();
        }

        private int getHighSpeedVideoFpsRangesFor() {
            return this.getHighResolutionOutputSizeshNQ4ISI - this.Camera2StreamConfigurationMap;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(java.lang.Object p0) {
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            for (int i2 = this.Camera2StreamConfigurationMap; i2 < i; i2++) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges.get(i2), p0)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(java.util.Collection<?> p0) {
            java.util.Iterator<T> it = p0.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int p0) {
            androidx.compose.runtime.collection.MutableVectorKt.checkIndex(this, p0);
            return this.getHighSpeedVideoFpsRanges.get(p0 + this.Camera2StreamConfigurationMap);
        }

        @Override // java.util.List
        public final int indexOf(java.lang.Object p0) {
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            for (int i2 = this.Camera2StreamConfigurationMap; i2 < i; i2++) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges.get(i2), p0)) {
                    return i2 - this.Camera2StreamConfigurationMap;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.getHighResolutionOutputSizeshNQ4ISI == this.Camera2StreamConfigurationMap;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final java.util.Iterator<T> iterator() {
            return new androidx.compose.runtime.collection.MutableVector.VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(java.lang.Object p0) {
            int i = this.getHighResolutionOutputSizeshNQ4ISI - 1;
            int i2 = this.Camera2StreamConfigurationMap;
            if (i2 > i) {
                return -1;
            }
            while (!kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges.get(i), p0)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.Camera2StreamConfigurationMap;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T p0) {
            java.util.List<T> list = this.getHighSpeedVideoFpsRanges;
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = i + 1;
            list.add(i, p0);
            return true;
        }

        @Override // java.util.List
        public final void add(int p0, T p1) {
            this.getHighSpeedVideoFpsRanges.add(p0 + this.Camera2StreamConfigurationMap, p1);
            this.getHighResolutionOutputSizeshNQ4ISI++;
        }

        @Override // java.util.List
        public final boolean addAll(int p0, java.util.Collection<? extends T> p1) {
            this.getHighSpeedVideoFpsRanges.addAll(p0 + this.Camera2StreamConfigurationMap, p1);
            int size = p1.size();
            this.getHighResolutionOutputSizeshNQ4ISI += size;
            return size > 0;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(java.util.Collection<? extends T> p0) {
            this.getHighSpeedVideoFpsRanges.addAll(this.getHighResolutionOutputSizeshNQ4ISI, p0);
            int size = p0.size();
            this.getHighResolutionOutputSizeshNQ4ISI += size;
            return size > 0;
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            int i = this.getHighResolutionOutputSizeshNQ4ISI - 1;
            int i2 = this.Camera2StreamConfigurationMap;
            if (i2 <= i) {
                while (true) {
                    this.getHighSpeedVideoFpsRanges.remove(i);
                    if (i == i2) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            this.getHighResolutionOutputSizeshNQ4ISI = this.Camera2StreamConfigurationMap;
        }

        @Override // java.util.List
        public final java.util.ListIterator<T> listIterator() {
            return new androidx.compose.runtime.collection.MutableVector.VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public final java.util.ListIterator<T> listIterator(int p0) {
            return new androidx.compose.runtime.collection.MutableVector.VectorListIterator(this, p0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(java.lang.Object p0) {
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            for (int i2 = this.Camera2StreamConfigurationMap; i2 < i; i2++) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges.get(i2), p0)) {
                    this.getHighSpeedVideoFpsRanges.remove(i2);
                    this.getHighResolutionOutputSizeshNQ4ISI--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(java.util.Collection<?> p0) {
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            java.util.Iterator<T> it = p0.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i != this.getHighResolutionOutputSizeshNQ4ISI;
        }

        private T getHighSpeedVideoFpsRangesFor(int p0) {
            androidx.compose.runtime.collection.MutableVectorKt.checkIndex(this, p0);
            this.getHighResolutionOutputSizeshNQ4ISI--;
            return this.getHighSpeedVideoFpsRanges.remove(p0 + this.Camera2StreamConfigurationMap);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(java.util.Collection<?> p0) {
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            int i2 = i - 1;
            int i3 = this.Camera2StreamConfigurationMap;
            if (i3 <= i2) {
                while (true) {
                    if (!p0.contains(this.getHighSpeedVideoFpsRanges.get(i2))) {
                        this.getHighSpeedVideoFpsRanges.remove(i2);
                        this.getHighResolutionOutputSizeshNQ4ISI--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            return i != this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // java.util.List
        public final T set(int p0, T p1) {
            androidx.compose.runtime.collection.MutableVectorKt.checkIndex(this, p0);
            return this.getHighSpeedVideoFpsRanges.set(p0 + this.Camera2StreamConfigurationMap, p1);
        }

        @Override // java.util.List
        public final java.util.List<T> subList(int p0, int p1) {
            androidx.compose.runtime.collection.MutableVector.SubList<T> subList = this;
            androidx.compose.runtime.collection.MutableVectorKt.checkSubIndex(subList, p0, p1);
            return new androidx.compose.runtime.collection.MutableVector.SubList(subList, p0, p1);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) kotlin.jvm.internal.CollectionToArray.toArray(this, tArr);
        }

        @Override // java.util.List, java.util.Collection
        public final java.lang.Object[] toArray() {
            return kotlin.jvm.internal.CollectionToArray.toArray(this);
        }
    }

    public final boolean contains(T element) {
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i = 0; !kotlin.jvm.internal.Intrinsics.areEqual(this.content[i], element); i++) {
                if (i != size) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean containsAll(androidx.compose.runtime.collection.MutableVector<T> elements) {
        kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(0, elements.getSize());
        int first = until.getFirst();
        int last = until.getLast();
        if (first > last) {
            return true;
        }
        while (contains(elements.content[first])) {
            if (first == last) {
                return true;
            }
            first++;
        }
        return false;
    }

    public final T first() {
        if (getSize() == 0) {
            throwNoSuchElementException("MutableVector is empty.");
            throw new kotlin.KotlinNothingValueException();
        }
        return this.content[0];
    }

    public final T firstOrNull() {
        if (getSize() == 0) {
            return null;
        }
        return this.content[0];
    }

    public final T last() {
        if (getSize() == 0) {
            throwNoSuchElementException("MutableVector is empty.");
            throw new kotlin.KotlinNothingValueException();
        }
        return this.content[getSize() - 1];
    }

    public final T lastOrNull() {
        if (getSize() == 0) {
            return null;
        }
        return this.content[getSize() - 1];
    }
}
