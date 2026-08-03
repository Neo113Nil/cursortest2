package androidx.compose.ui.semantics;

/* compiled from: SemanticsProperties.kt */
@kotlin.Metadata(d1 = {"\u0000Ò\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0089\u0001\u001a\n\u0012\u0005\u0012\u0003H\u008b\u00010\u008a\u0001\"\u0005\b\u0000\u0010\u008b\u00012\u0007\u0010\u008c\u0001\u001a\u00020\u0012H\u0000\u001aD\u0010\u0089\u0001\u001a\n\u0012\u0005\u0012\u0003H\u008b\u00010\u008a\u0001\"\u0005\b\u0000\u0010\u008b\u00012\u0007\u0010\u008c\u0001\u001a\u00020\u00122!\u0010\u008d\u0001\u001a\u001c\u0012\u0007\u0012\u0005\u0018\u0001H\u008b\u0001\u0012\u0005\u0012\u0003H\u008b\u0001\u0012\u0007\u0012\u0005\u0018\u0001H\u008b\u00010\u008e\u0001H\u0000\u001a4\u0010\u008f\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u0003H\u008b\u00010\u0090\u00010\u008a\u0001\"\u0010\b\u0000\u0010\u008b\u0001*\t\u0012\u0004\u0012\u00020'0\u0091\u00012\u0007\u0010\u008c\u0001\u001a\u00020\u0012H\u0082\b\u001a\u0017\u0010\u0092\u0001\u001a\u0003H\u008b\u0001\"\u0005\b\u0000\u0010\u008b\u0001H\u0002¢\u0006\u0003\u0010\u0093\u0001\u001a+\u0010\u0094\u0001\u001a\u00030\u0095\u0001*\u00020\u00032\u000b\b\u0002\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00122\u0010\u0010\u0097\u0001\u001a\u000b\u0012\u0004\u0012\u00020'\u0018\u00010\u0098\u0001\u001a+\u0010\u0099\u0001\u001a\u00030\u0095\u0001*\u00020\u00032\u000b\b\u0002\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00122\u0010\u0010\u0097\u0001\u001a\u000b\u0012\u0004\u0012\u00020'\u0018\u00010\u0098\u0001\u001a+\u0010\u009a\u0001\u001a\u00030\u0095\u0001*\u00020\u00032\u000b\b\u0002\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00122\u0010\u0010\u0097\u0001\u001a\u000b\u0012\u0004\u0012\u00020'\u0018\u00010\u0098\u0001\u001a+\u0010\u009b\u0001\u001a\u00030\u0095\u0001*\u00020\u00032\u000b\b\u0002\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00122\u0010\u0010\u0097\u0001\u001a\u000b\u0012\u0004\u0012\u00020'\u0018\u00010\u0098\u0001\u001a\f\u0010\u009c\u0001\u001a\u00030\u0095\u0001*\u00020\u0003\u001a\f\u0010\u009d\u0001\u001a\u00030\u0095\u0001*\u00020\u0003\u001a+\u0010\u009e\u0001\u001a\u00030\u0095\u0001*\u00020\u00032\u000b\b\u0002\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00122\u0010\u0010\u0097\u0001\u001a\u000b\u0012\u0004\u0012\u00020'\u0018\u00010\u0098\u0001\u001a\u0015\u0010\u009f\u0001\u001a\u00030\u0095\u0001*\u00020\u00032\u0007\u0010 \u0001\u001a\u00020\u0012\u001a+\u0010¡\u0001\u001a\u00030\u0095\u0001*\u00020\u00032\u000b\b\u0002\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00122\u0010\u0010\u0097\u0001\u001a\u000b\u0012\u0004\u0012\u00020'\u0018\u00010\u0098\u0001\u001a9\u0010¢\u0001\u001a\u00030\u0095\u0001*\u00020\u00032\u000b\b\u0002\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00122\u001e\u0010\u0097\u0001\u001a\u0019\u0012\f\u0012\n\u0012\u0005\u0012\u00030¥\u00010¤\u0001\u0012\u0004\u0012\u00020'\u0018\u00010£\u0001\u001a\f\u0010¦\u0001\u001a\u00030\u0095\u0001*\u00020\u0003\u001a$\u0010§\u0001\u001a\u00030\u0095\u0001*\u00020\u00032\u0016\u0010¨\u0001\u001a\u0011\u0012\u0005\u0012\u00030©\u0001\u0012\u0005\u0012\u00030ª\u00010£\u0001\u001a1\u0010«\u0001\u001a\u00030\u0095\u0001*\u00020\u00032\u000b\b\u0002\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00122\u0016\u0010\u0097\u0001\u001a\u0011\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020'\u0018\u00010£\u0001\u001a\u000e\u0010¬\u0001\u001a\u00030\u0095\u0001*\u00020\u0003H\u0007\u001a+\u0010\u00ad\u0001\u001a\u00030\u0095\u0001*\u00020\u00032\u000b\b\u0002\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00122\u0010\u0010\u0097\u0001\u001a\u000b\u0012\u0004\u0012\u00020'\u0018\u00010\u0098\u0001\u001a@\u0010®\u0001\u001a\u00030\u0095\u0001*\u00020\u00032\u0007\u0010¯\u0001\u001a\u0002052\u000b\b\u0002\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00122\u0010\u0010\u0097\u0001\u001a\u000b\u0012\u0004\u0012\u00020'\u0018\u00010\u0098\u0001ø\u0001\u0000¢\u0006\u0006\b°\u0001\u0010±\u0001\u001a+\u0010²\u0001\u001a\u00030\u0095\u0001*\u00020\u00032\u000b\b\u0002\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00122\u0010\u0010\u0097\u0001\u001a\u000b\u0012\u0004\u0012\u00020'\u0018\u00010\u0098\u0001\u001a+\u0010³\u0001\u001a\u00030\u0095\u0001*\u00020\u00032\u000b\b\u0002\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00122\u0010\u0010\u0097\u0001\u001a\u000b\u0012\u0004\u0012\u00020'\u0018\u00010\u0098\u0001\u001a+\u0010´\u0001\u001a\u00030\u0095\u0001*\u00020\u00032\u000b\b\u0002\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00122\u0010\u0010\u0097\u0001\u001a\u000b\u0012\u0004\u0012\u00020'\u0018\u00010\u0098\u0001\u001a+\u0010µ\u0001\u001a\u00030\u0095\u0001*\u00020\u00032\u000b\b\u0002\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00122\u0010\u0010\u0097\u0001\u001a\u000b\u0012\u0004\u0012\u00020'\u0018\u00010\u0098\u0001\u001a+\u0010¶\u0001\u001a\u00030\u0095\u0001*\u00020\u00032\u000b\b\u0002\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00122\u0010\u0010\u0097\u0001\u001a\u000b\u0012\u0004\u0012\u00020'\u0018\u00010\u0098\u0001\u001a\f\u0010·\u0001\u001a\u00030\u0095\u0001*\u00020\u0003\u001a+\u0010¸\u0001\u001a\u00030\u0095\u0001*\u00020\u00032\u000b\b\u0002\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00122\u0010\u0010\u0097\u0001\u001a\u000b\u0012\u0004\u0012\u00020'\u0018\u00010\u0098\u0001\u001a-\u0010¹\u0001\u001a\u00030\u0095\u0001*\u00020\u00032\u000b\b\u0002\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00122\u0010\u0010\u0097\u0001\u001a\u000b\u0012\u0004\u0012\u00020'\u0018\u00010\u0098\u0001H\u0007\u001a\f\u0010º\u0001\u001a\u00030\u0095\u0001*\u00020\u0003\u001a+\u0010»\u0001\u001a\u00030\u0095\u0001*\u00020\u00032\u000b\b\u0002\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00122\u0010\u0010\u0097\u0001\u001a\u000b\u0012\u0004\u0012\u00020'\u0018\u00010\u0098\u0001\u001a[\u0010¼\u0001\u001a\u00030\u0095\u0001*\u00020\u00032\u000b\b\u0002\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00122@\u0010\u0097\u0001\u001a;\u0012\u0016\u0012\u00140~¢\u0006\u000f\b½\u0001\u0012\n\b\u008c\u0001\u0012\u0005\b\b(¾\u0001\u0012\u0016\u0012\u00140~¢\u0006\u000f\b½\u0001\u0012\n\b\u008c\u0001\u0012\u0005\b\b(¿\u0001\u0012\u0004\u0012\u00020'\u0018\u00010\u008e\u0001\u001a0\u0010À\u0001\u001a\u00030\u0095\u0001*\u00020\u00032\u000b\b\u0002\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00122\u0015\u0010\u0097\u0001\u001a\u0010\u0012\u0005\u0012\u00030ª\u0001\u0012\u0004\u0012\u00020'0£\u0001\u001a\f\u0010Á\u0001\u001a\u00030\u0095\u0001*\u00020\u0003\u001a1\u0010Â\u0001\u001a\u00030\u0095\u0001*\u00020\u00032\u000b\b\u0002\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00122\u0016\u0010\u0097\u0001\u001a\u0011\u0012\u0004\u0012\u00020~\u0012\u0004\u0012\u00020'\u0018\u00010£\u0001\u001au\u0010Ã\u0001\u001a\u00030\u0095\u0001*\u00020\u00032\u000b\b\u0002\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00122Z\u0010\u0097\u0001\u001aU\u0012\u0017\u0012\u00150ª\u0001¢\u0006\u000f\b½\u0001\u0012\n\b\u008c\u0001\u0012\u0005\b\b(Å\u0001\u0012\u0017\u0012\u00150ª\u0001¢\u0006\u000f\b½\u0001\u0012\n\b\u008c\u0001\u0012\u0005\b\b(Æ\u0001\u0012\u0016\u0012\u00140'¢\u0006\u000f\b½\u0001\u0012\n\b\u008c\u0001\u0012\u0005\b\b(Ç\u0001\u0012\u0004\u0012\u00020'\u0018\u00010Ä\u0001\u001a0\u0010k\u001a\u00030\u0095\u0001*\u00020\u00032\u000b\b\u0002\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00122\u0016\u0010\u0097\u0001\u001a\u0011\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020'\u0018\u00010£\u0001\u001a0\u0010v\u001a\u00030\u0095\u0001*\u00020\u00032\u000b\b\u0002\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00122\u0016\u0010\u0097\u0001\u001a\u0011\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020'\u0018\u00010£\u0001\u001a1\u0010È\u0001\u001a\u00030\u0095\u0001*\u00020\u00032\u000b\b\u0002\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00122\u0016\u0010\u0097\u0001\u001a\u0011\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020'\u0018\u00010£\u0001\"/\u0010\u0002\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00018F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t*\u0004\b\u0004\u0010\u0005\"/\u0010\u000b\u001a\u00020\n*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010*\u0004\b\f\u0010\u0005\"(\u0010\u0013\u001a\u00020\u0012*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\";\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018*\u00020\u00032\f\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f*\u0004\b\u001b\u0010\u0005\"/\u0010!\u001a\u00020 *\u00020\u00032\u0006\u0010\u0000\u001a\u00020 8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&*\u0004\b\"\u0010\u0005\"/\u0010(\u001a\u00020'*\u00020\u00032\u0006\u0010\u0000\u001a\u00020'8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-*\u0004\b)\u0010\u0005\"/\u0010/\u001a\u00020.*\u00020\u00032\u0006\u0010\u0000\u001a\u00020.8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b1\u00102\"\u0004\b3\u00104*\u0004\b0\u0010\u0005\"5\u00106\u001a\u000205*\u00020\u00032\u0006\u0010\u0000\u001a\u0002058G@GX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\b7\u00108\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=*\u0004\b9\u0010\u0005\"5\u0010>\u001a\u00020'*\u00020\u00032\u0006\u0010\u0000\u001a\u00020'8F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\b?\u00108\u001a\u0004\b>\u0010+\"\u0004\bA\u0010-*\u0004\b@\u0010\u0005\"/\u0010B\u001a\u00020'*\u00020\u00032\u0006\u0010\u0000\u001a\u00020'8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bB\u0010+\"\u0004\bD\u0010-*\u0004\bC\u0010\u0005\"/\u0010E\u001a\u00020'*\u00020\u00032\u0006\u0010\u0000\u001a\u00020'8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bE\u0010+\"\u0004\bG\u0010-*\u0004\bF\u0010\u0005\"/\u0010I\u001a\u00020H*\u00020\u00032\u0006\u0010\u0000\u001a\u00020H8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bK\u0010;\"\u0004\bL\u0010=*\u0004\bJ\u0010\u0005\"/\u0010M\u001a\u00020\u0012*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00128F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bO\u0010\u0015\"\u0004\bP\u0010\u0017*\u0004\bN\u0010\u0005\"/\u0010R\u001a\u00020Q*\u00020\u00032\u0006\u0010\u0000\u001a\u00020Q8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W*\u0004\bS\u0010\u0005\"/\u0010Y\u001a\u00020X*\u00020\u00032\u0006\u0010\u0000\u001a\u00020X8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b[\u0010;\"\u0004\b\\\u0010=*\u0004\bZ\u0010\u0005\"/\u0010]\u001a\u00020'*\u00020\u00032\u0006\u0010\u0000\u001a\u00020'8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b_\u0010+\"\u0004\b`\u0010-*\u0004\b^\u0010\u0005\"/\u0010a\u001a\u00020\u0012*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00128F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bc\u0010\u0015\"\u0004\bd\u0010\u0017*\u0004\bb\u0010\u0005\"/\u0010e\u001a\u00020\u0012*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00128F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bg\u0010\u0015\"\u0004\bh\u0010\u0017*\u0004\bf\u0010\u0005\"(\u0010i\u001a\u00020 *\u00020\u00032\u0006\u0010\u0011\u001a\u00020 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bj\u0010$\"\u0004\bk\u0010&\"/\u0010m\u001a\u00020l*\u00020\u00032\u0006\u0010\u0000\u001a\u00020l8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bo\u0010p\"\u0004\bq\u0010r*\u0004\bn\u0010\u0005\"/\u0010s\u001a\u00020 *\u00020\u00032\u0006\u0010\u0000\u001a\u00020 8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bu\u0010$\"\u0004\bv\u0010&*\u0004\bt\u0010\u0005\"/\u0010x\u001a\u00020w*\u00020\u00032\u0006\u0010\u0000\u001a\u00020w8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}*\u0004\by\u0010\u0005\"4\u0010\u007f\u001a\u00020~*\u00020\u00032\u0006\u0010\u0000\u001a\u00020~8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001*\u0005\b\u0080\u0001\u0010\u0005\"3\u0010\u0085\u0001\u001a\u00020.*\u00020\u00032\u0006\u0010\u0000\u001a\u00020.8F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u0087\u0001\u00102\"\u0005\b\u0088\u0001\u00104*\u0005\b\u0086\u0001\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006É\u0001"}, d2 = {"<set-?>", "Landroidx/compose/ui/semantics/CollectionInfo;", "collectionInfo", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "getCollectionInfo$delegate", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/Object;", "getCollectionInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", "setCollectionInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/CollectionInfo;)V", "Landroidx/compose/ui/semantics/CollectionItemInfo;", "collectionItemInfo", "getCollectionItemInfo$delegate", "getCollectionItemInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", "setCollectionItemInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/CollectionItemInfo;)V", "value", "", "contentDescription", "getContentDescription", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", "setContentDescription", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;)V", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "customActions", "getCustomActions$delegate", "getCustomActions", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", "setCustomActions", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/util/List;)V", "Landroidx/compose/ui/text/AnnotatedString;", "editableText", "getEditableText$delegate", "getEditableText", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", "setEditableText", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/text/AnnotatedString;)V", "", "focused", "getFocused$delegate", "getFocused", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", "setFocused", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Z)V", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "horizontalScrollAxisRange", "getHorizontalScrollAxisRange$delegate", "getHorizontalScrollAxisRange", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", "setHorizontalScrollAxisRange", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/ScrollAxisRange;)V", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "getImeAction$annotations", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "getImeAction$delegate", "getImeAction", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", "setImeAction-4L7nppU", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;I)V", "isContainer", "isContainer$annotations", "isContainer$delegate", "setContainer", "isShowingTextSubstitution", "isShowingTextSubstitution$delegate", "setShowingTextSubstitution", "isTraversalGroup", "isTraversalGroup$delegate", "setTraversalGroup", "Landroidx/compose/ui/semantics/LiveRegionMode;", "liveRegion", "getLiveRegion$delegate", "getLiveRegion", "setLiveRegion-hR3wRGc", "paneTitle", "getPaneTitle$delegate", "getPaneTitle", "setPaneTitle", "Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "progressBarRangeInfo", "getProgressBarRangeInfo$delegate", "getProgressBarRangeInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "setProgressBarRangeInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/ProgressBarRangeInfo;)V", "Landroidx/compose/ui/semantics/Role;", "role", "getRole$delegate", "getRole", "setRole-kuIjeqM", "selected", "getSelected$delegate", "getSelected", "setSelected", "stateDescription", "getStateDescription$delegate", "getStateDescription", "setStateDescription", "testTag", "getTestTag$delegate", "getTestTag", "setTestTag", "text", "getText", "setText", "Landroidx/compose/ui/text/TextRange;", "textSelectionRange", "getTextSelectionRange$delegate", "getTextSelectionRange", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", "setTextSelectionRange-FDrldGo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;J)V", "textSubstitution", "getTextSubstitution$delegate", "getTextSubstitution", "setTextSubstitution", "Landroidx/compose/ui/state/ToggleableState;", "toggleableState", "getToggleableState$delegate", "getToggleableState", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", "setToggleableState", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/state/ToggleableState;)V", "", "traversalIndex", "getTraversalIndex$delegate", "getTraversalIndex", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", "setTraversalIndex", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;F)V", "verticalScrollAxisRange", "getVerticalScrollAxisRange$delegate", "getVerticalScrollAxisRange", "setVerticalScrollAxisRange", "AccessibilityKey", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "T", "name", "mergePolicy", "Lkotlin/Function2;", "ActionPropertyKey", "Landroidx/compose/ui/semantics/AccessibilityAction;", "Lkotlin/Function;", "throwSemanticsGetNotSupported", "()Ljava/lang/Object;", "clearTextSubstitution", "", "label", "action", "Lkotlin/Function0;", "collapse", "copyText", "cutText", "dialog", com.ironsource.C2945a2.e, "dismiss", "error", "description", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.e, "getTextLayoutResult", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/TextLayoutResult;", "heading", "indexForKey", "mapping", "", "", "insertTextAtCursor", "invisibleToUser", "onClick", "onImeAction", "imeActionType", "onImeAction-9UiTYpY", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;ILjava/lang/String;Lkotlin/jvm/functions/Function0;)V", "onLongClick", "pageDown", "pageLeft", "pageRight", "pageUp", androidx.autofill.HintConstants.AUTOFILL_HINT_PASSWORD, "pasteText", "performImeAction", "popup", "requestFocus", "scrollBy", "Lkotlin/ParameterName;", "x", "y", "scrollToIndex", "selectableGroup", "setProgress", "setSelection", "Lkotlin/Function3;", "startIndex", "endIndex", "relativeToOriginalText", "showTextSubstitution", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SemanticsPropertiesKt {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1))};

    @kotlin.Deprecated(message = "Pass the ImeAction to onImeAction instead.")
    public static /* synthetic */ void getImeAction$annotations(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    @kotlin.Deprecated(message = "Use `isTraversalGroup` instead.", replaceWith = @kotlin.ReplaceWith(expression = "isTraversalGroup", imports = {}))
    public static /* synthetic */ void isContainer$annotations(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T throwSemanticsGetNotSupported() {
        throw new java.lang.UnsupportedOperationException("You cannot retrieve a semantics property directly - use one of the SemanticsConfiguration.getOr* methods instead");
    }

    public static final <T> androidx.compose.ui.semantics.SemanticsPropertyKey<T> AccessibilityKey(java.lang.String str) {
        return new androidx.compose.ui.semantics.SemanticsPropertyKey<>(str, true);
    }

    public static final <T> androidx.compose.ui.semantics.SemanticsPropertyKey<T> AccessibilityKey(java.lang.String str, kotlin.jvm.functions.Function2<? super T, ? super T, ? extends T> function2) {
        return new androidx.compose.ui.semantics.SemanticsPropertyKey<>(str, true, function2);
    }

    private static final <T extends kotlin.Function<? extends java.lang.Boolean>> androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.AccessibilityAction<T>> ActionPropertyKey(java.lang.String str) {
        return AccessibilityKey(str, androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1.INSTANCE);
    }

    public static final java.lang.String getContentDescription(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return (java.lang.String) throwSemanticsGetNotSupported();
    }

    public static final void setContentDescription(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getContentDescription(), kotlin.collections.CollectionsKt.listOf(str));
    }

    static {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getStateDescription();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getProgressBarRangeInfo();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getPaneTitle();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getLiveRegion();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getFocused();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsTraversalGroup();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsTraversalGroup();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTraversalIndex();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getVerticalScrollAxisRange();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getRole();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTestTag();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTextSubstitution();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsShowingTextSubstitution();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getEditableText();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTextSelectionRange();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getImeAction();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getSelected();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getCollectionInfo();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getCollectionItemInfo();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getToggleableState();
        androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getCustomActions();
    }

    public static final java.lang.String getStateDescription(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getStateDescription().getValue(semanticsPropertyReceiver, $$delegatedProperties[0]);
    }

    public static final void setStateDescription(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getStateDescription().setValue(semanticsPropertyReceiver, $$delegatedProperties[0], str);
    }

    public static final androidx.compose.ui.semantics.ProgressBarRangeInfo getProgressBarRangeInfo(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getProgressBarRangeInfo().getValue(semanticsPropertyReceiver, $$delegatedProperties[1]);
    }

    public static final void setProgressBarRangeInfo(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, androidx.compose.ui.semantics.ProgressBarRangeInfo progressBarRangeInfo) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getProgressBarRangeInfo().setValue(semanticsPropertyReceiver, $$delegatedProperties[1], progressBarRangeInfo);
    }

    public static final void heading(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getHeading(), kotlin.Unit.INSTANCE);
    }

    public static final java.lang.String getPaneTitle(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getPaneTitle().getValue(semanticsPropertyReceiver, $$delegatedProperties[2]);
    }

    public static final void setPaneTitle(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getPaneTitle().setValue(semanticsPropertyReceiver, $$delegatedProperties[2], str);
    }

    public static final void disabled(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getDisabled(), kotlin.Unit.INSTANCE);
    }

    public static final int getLiveRegion(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getLiveRegion().getValue(semanticsPropertyReceiver, $$delegatedProperties[3]).getValue();
    }

    /* renamed from: setLiveRegion-hR3wRGc, reason: not valid java name */
    public static final void m3807setLiveRegionhR3wRGc(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, int i) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getLiveRegion().setValue(semanticsPropertyReceiver, $$delegatedProperties[3], androidx.compose.ui.semantics.LiveRegionMode.m3776boximpl(i));
    }

    public static final boolean getFocused(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getFocused().getValue(semanticsPropertyReceiver, $$delegatedProperties[4]).booleanValue();
    }

    public static final void setFocused(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getFocused().setValue(semanticsPropertyReceiver, $$delegatedProperties[4], java.lang.Boolean.valueOf(z));
    }

    public static final boolean isContainer(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsTraversalGroup().getValue(semanticsPropertyReceiver, $$delegatedProperties[5]).booleanValue();
    }

    public static final void setContainer(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsTraversalGroup().setValue(semanticsPropertyReceiver, $$delegatedProperties[5], java.lang.Boolean.valueOf(z));
    }

    public static final boolean isTraversalGroup(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsTraversalGroup().getValue(semanticsPropertyReceiver, $$delegatedProperties[6]).booleanValue();
    }

    public static final void setTraversalGroup(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsTraversalGroup().setValue(semanticsPropertyReceiver, $$delegatedProperties[6], java.lang.Boolean.valueOf(z));
    }

    public static final void invisibleToUser(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getInvisibleToUser(), kotlin.Unit.INSTANCE);
    }

    public static final float getTraversalIndex(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTraversalIndex().getValue(semanticsPropertyReceiver, $$delegatedProperties[7]).floatValue();
    }

    public static final void setTraversalIndex(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, float f) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTraversalIndex().setValue(semanticsPropertyReceiver, $$delegatedProperties[7], java.lang.Float.valueOf(f));
    }

    public static final androidx.compose.ui.semantics.ScrollAxisRange getHorizontalScrollAxisRange(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange().getValue(semanticsPropertyReceiver, $$delegatedProperties[8]);
    }

    public static final void setHorizontalScrollAxisRange(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, androidx.compose.ui.semantics.ScrollAxisRange scrollAxisRange) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange().setValue(semanticsPropertyReceiver, $$delegatedProperties[8], scrollAxisRange);
    }

    public static final androidx.compose.ui.semantics.ScrollAxisRange getVerticalScrollAxisRange(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getVerticalScrollAxisRange().getValue(semanticsPropertyReceiver, $$delegatedProperties[9]);
    }

    public static final void setVerticalScrollAxisRange(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, androidx.compose.ui.semantics.ScrollAxisRange scrollAxisRange) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getVerticalScrollAxisRange().setValue(semanticsPropertyReceiver, $$delegatedProperties[9], scrollAxisRange);
    }

    public static final void popup(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsPopup(), kotlin.Unit.INSTANCE);
    }

    public static final void dialog(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsDialog(), kotlin.Unit.INSTANCE);
    }

    public static final int getRole(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getRole().getValue(semanticsPropertyReceiver, $$delegatedProperties[10]).getValue();
    }

    /* renamed from: setRole-kuIjeqM, reason: not valid java name */
    public static final void m3808setRolekuIjeqM(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, int i) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getRole().setValue(semanticsPropertyReceiver, $$delegatedProperties[10], androidx.compose.ui.semantics.Role.m3785boximpl(i));
    }

    public static final java.lang.String getTestTag(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTestTag().getValue(semanticsPropertyReceiver, $$delegatedProperties[11]);
    }

    public static final void setTestTag(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTestTag().setValue(semanticsPropertyReceiver, $$delegatedProperties[11], str);
    }

    public static final androidx.compose.ui.text.AnnotatedString getText(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return (androidx.compose.ui.text.AnnotatedString) throwSemanticsGetNotSupported();
    }

    public static final void setText(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, androidx.compose.ui.text.AnnotatedString annotatedString) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getText(), kotlin.collections.CollectionsKt.listOf(annotatedString));
    }

    public static final androidx.compose.ui.text.AnnotatedString getTextSubstitution(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTextSubstitution().getValue(semanticsPropertyReceiver, $$delegatedProperties[12]);
    }

    public static final void setTextSubstitution(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, androidx.compose.ui.text.AnnotatedString annotatedString) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTextSubstitution().setValue(semanticsPropertyReceiver, $$delegatedProperties[12], annotatedString);
    }

    public static final boolean isShowingTextSubstitution(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsShowingTextSubstitution().getValue(semanticsPropertyReceiver, $$delegatedProperties[13]).booleanValue();
    }

    public static final void setShowingTextSubstitution(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsShowingTextSubstitution().setValue(semanticsPropertyReceiver, $$delegatedProperties[13], java.lang.Boolean.valueOf(z));
    }

    public static final androidx.compose.ui.text.AnnotatedString getEditableText(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getEditableText().getValue(semanticsPropertyReceiver, $$delegatedProperties[14]);
    }

    public static final void setEditableText(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, androidx.compose.ui.text.AnnotatedString annotatedString) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getEditableText().setValue(semanticsPropertyReceiver, $$delegatedProperties[14], annotatedString);
    }

    public static final long getTextSelectionRange(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTextSelectionRange().getValue(semanticsPropertyReceiver, $$delegatedProperties[15]).getPackedValue();
    }

    /* renamed from: setTextSelectionRange-FDrldGo, reason: not valid java name */
    public static final void m3809setTextSelectionRangeFDrldGo(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, long j) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTextSelectionRange().setValue(semanticsPropertyReceiver, $$delegatedProperties[15], androidx.compose.ui.text.TextRange.m3952boximpl(j));
    }

    @kotlin.Deprecated(message = "Pass the ImeAction to onImeAction instead.")
    public static final int getImeAction(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getImeAction().getValue(semanticsPropertyReceiver, $$delegatedProperties[16]).getValue();
    }

    @kotlin.Deprecated(message = "Pass the ImeAction to onImeAction instead.")
    /* renamed from: setImeAction-4L7nppU, reason: not valid java name */
    public static final void m3806setImeAction4L7nppU(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, int i) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getImeAction().setValue(semanticsPropertyReceiver, $$delegatedProperties[16], androidx.compose.ui.text.input.ImeAction.m4128boximpl(i));
    }

    public static final boolean getSelected(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getSelected().getValue(semanticsPropertyReceiver, $$delegatedProperties[17]).booleanValue();
    }

    public static final void setSelected(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getSelected().setValue(semanticsPropertyReceiver, $$delegatedProperties[17], java.lang.Boolean.valueOf(z));
    }

    public static final androidx.compose.ui.semantics.CollectionInfo getCollectionInfo(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getCollectionInfo().getValue(semanticsPropertyReceiver, $$delegatedProperties[18]);
    }

    public static final void setCollectionInfo(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, androidx.compose.ui.semantics.CollectionInfo collectionInfo) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getCollectionInfo().setValue(semanticsPropertyReceiver, $$delegatedProperties[18], collectionInfo);
    }

    public static final androidx.compose.ui.semantics.CollectionItemInfo getCollectionItemInfo(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getCollectionItemInfo().getValue(semanticsPropertyReceiver, $$delegatedProperties[19]);
    }

    public static final void setCollectionItemInfo(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, androidx.compose.ui.semantics.CollectionItemInfo collectionItemInfo) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getCollectionItemInfo().setValue(semanticsPropertyReceiver, $$delegatedProperties[19], collectionItemInfo);
    }

    public static final androidx.compose.ui.state.ToggleableState getToggleableState(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getToggleableState().getValue(semanticsPropertyReceiver, $$delegatedProperties[20]);
    }

    public static final void setToggleableState(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, androidx.compose.ui.state.ToggleableState toggleableState) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getToggleableState().setValue(semanticsPropertyReceiver, $$delegatedProperties[20], toggleableState);
    }

    public static final void password(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getPassword(), kotlin.Unit.INSTANCE);
    }

    public static final void error(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getError(), str);
    }

    public static final void indexForKey(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Integer> function1) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIndexForKey(), function1);
    }

    public static final void selectableGroup(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getSelectableGroup(), kotlin.Unit.INSTANCE);
    }

    public static final java.util.List<androidx.compose.ui.semantics.CustomAccessibilityAction> getCustomActions(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getCustomActions().getValue(semanticsPropertyReceiver, $$delegatedProperties[21]);
    }

    public static final void setCustomActions(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.util.List<androidx.compose.ui.semantics.CustomAccessibilityAction> list) {
        androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getCustomActions().setValue(semanticsPropertyReceiver, $$delegatedProperties[21], list);
    }

    public static /* synthetic */ void getTextLayoutResult$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        getTextLayoutResult(semanticsPropertyReceiver, str, function1);
    }

    public static final void getTextLayoutResult(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function1<? super java.util.List<androidx.compose.ui.text.TextLayoutResult>, java.lang.Boolean> function1) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getGetTextLayoutResult(), new androidx.compose.ui.semantics.AccessibilityAction(str, function1));
    }

    public static /* synthetic */ void onClick$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        onClick(semanticsPropertyReceiver, str, function0);
    }

    public static final void onClick(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getOnClick(), new androidx.compose.ui.semantics.AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void onLongClick$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        onLongClick(semanticsPropertyReceiver, str, function0);
    }

    public static final void onLongClick(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getOnLongClick(), new androidx.compose.ui.semantics.AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void scrollBy$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        scrollBy(semanticsPropertyReceiver, str, function2);
    }

    public static final void scrollBy(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Float, java.lang.Boolean> function2) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getScrollBy(), new androidx.compose.ui.semantics.AccessibilityAction(str, function2));
    }

    public static /* synthetic */ void scrollToIndex$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        scrollToIndex(semanticsPropertyReceiver, str, function1);
    }

    public static final void scrollToIndex(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> function1) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getScrollToIndex(), new androidx.compose.ui.semantics.AccessibilityAction(str, function1));
    }

    public static /* synthetic */ void setProgress$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        setProgress(semanticsPropertyReceiver, str, function1);
    }

    public static final void setProgress(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function1<? super java.lang.Float, java.lang.Boolean> function1) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetProgress(), new androidx.compose.ui.semantics.AccessibilityAction(str, function1));
    }

    public static /* synthetic */ void setText$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        setText(semanticsPropertyReceiver, str, function1);
    }

    public static final void setText(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.AnnotatedString, java.lang.Boolean> function1) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetText(), new androidx.compose.ui.semantics.AccessibilityAction(str, function1));
    }

    public static /* synthetic */ void setTextSubstitution$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        setTextSubstitution(semanticsPropertyReceiver, str, function1);
    }

    public static final void setTextSubstitution(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.AnnotatedString, java.lang.Boolean> function1) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetTextSubstitution(), new androidx.compose.ui.semantics.AccessibilityAction(str, function1));
    }

    public static /* synthetic */ void showTextSubstitution$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        showTextSubstitution(semanticsPropertyReceiver, str, function1);
    }

    public static final void showTextSubstitution(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function1<? super java.lang.Boolean, java.lang.Boolean> function1) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getShowTextSubstitution(), new androidx.compose.ui.semantics.AccessibilityAction(str, function1));
    }

    public static /* synthetic */ void clearTextSubstitution$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        clearTextSubstitution(semanticsPropertyReceiver, str, function0);
    }

    public static final void clearTextSubstitution(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getClearTextSubstitution(), new androidx.compose.ui.semantics.AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void insertTextAtCursor$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        insertTextAtCursor(semanticsPropertyReceiver, str, function1);
    }

    public static final void insertTextAtCursor(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.AnnotatedString, java.lang.Boolean> function1) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getInsertTextAtCursor(), new androidx.compose.ui.semantics.AccessibilityAction(str, function1));
    }

    /* renamed from: onImeAction-9UiTYpY$default, reason: not valid java name */
    public static /* synthetic */ void m3805onImeAction9UiTYpY$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, int i, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        m3804onImeAction9UiTYpY(semanticsPropertyReceiver, i, str, function0);
    }

    /* renamed from: onImeAction-9UiTYpY, reason: not valid java name */
    public static final void m3804onImeAction9UiTYpY(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, int i, java.lang.String str, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getImeAction(), androidx.compose.ui.text.input.ImeAction.m4128boximpl(i));
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getOnImeAction(), new androidx.compose.ui.semantics.AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void performImeAction$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        performImeAction(semanticsPropertyReceiver, str, function0);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use `SemanticsPropertyReceiver.onImeAction` instead.", replaceWith = @kotlin.ReplaceWith(expression = "onImeAction(imeActionType = ImeAction.Default, label = label, action = action)", imports = {"androidx.compose.ui.semantics.onImeAction", "androidx.compose.ui.text.input.ImeAction"}))
    public static final void performImeAction(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getOnImeAction(), new androidx.compose.ui.semantics.AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void setSelection$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function3 function3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        setSelection(semanticsPropertyReceiver, str, function3);
    }

    public static final void setSelection(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Boolean, java.lang.Boolean> function3) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetSelection(), new androidx.compose.ui.semantics.AccessibilityAction(str, function3));
    }

    public static /* synthetic */ void copyText$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        copyText(semanticsPropertyReceiver, str, function0);
    }

    public static final void copyText(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getCopyText(), new androidx.compose.ui.semantics.AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void cutText$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        cutText(semanticsPropertyReceiver, str, function0);
    }

    public static final void cutText(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getCutText(), new androidx.compose.ui.semantics.AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void pasteText$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        pasteText(semanticsPropertyReceiver, str, function0);
    }

    public static final void pasteText(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPasteText(), new androidx.compose.ui.semantics.AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void expand$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        expand(semanticsPropertyReceiver, str, function0);
    }

    public static final void expand(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getExpand(), new androidx.compose.ui.semantics.AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void collapse$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        collapse(semanticsPropertyReceiver, str, function0);
    }

    public static final void collapse(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getCollapse(), new androidx.compose.ui.semantics.AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void dismiss$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        dismiss(semanticsPropertyReceiver, str, function0);
    }

    public static final void dismiss(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getDismiss(), new androidx.compose.ui.semantics.AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void requestFocus$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        requestFocus(semanticsPropertyReceiver, str, function0);
    }

    public static final void requestFocus(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getRequestFocus(), new androidx.compose.ui.semantics.AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void pageUp$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        pageUp(semanticsPropertyReceiver, str, function0);
    }

    public static final void pageUp(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPageUp(), new androidx.compose.ui.semantics.AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void pageDown$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        pageDown(semanticsPropertyReceiver, str, function0);
    }

    public static final void pageDown(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPageDown(), new androidx.compose.ui.semantics.AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void pageLeft$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        pageLeft(semanticsPropertyReceiver, str, function0);
    }

    public static final void pageLeft(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPageLeft(), new androidx.compose.ui.semantics.AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void pageRight$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        pageRight(semanticsPropertyReceiver, str, function0);
    }

    public static final void pageRight(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPageRight(), new androidx.compose.ui.semantics.AccessibilityAction(str, function0));
    }
}
