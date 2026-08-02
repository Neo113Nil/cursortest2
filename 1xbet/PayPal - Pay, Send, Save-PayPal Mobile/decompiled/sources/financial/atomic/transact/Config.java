package financial.atomic.transact;

@kotlin.Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\b\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001:.\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001 \u0001¡\u0001¢\u0001£\u0001¤\u0001¥\u0001¦\u0001B¯\u0002\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\t\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u001e\u0012\b\b\u0002\u0010!\u001a\u00020\u001e\u0012\b\b\u0002\u0010#\u001a\u00020\"\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b-\u0010.B\u0091\u0002\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\t\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u001e\u0012\b\b\u0002\u0010!\u001a\u00020\u001e\u0012\b\b\u0002\u0010#\u001a\u00020\"\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b-\u0010/B\u008b\u0002\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\t\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u001e\u0012\b\b\u0002\u0010!\u001a\u00020\u001e\u0012\b\b\u0002\u0010#\u001a\u00020\"\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b-\u00100BC\b\u0016\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u001e\u0012\b\b\u0002\u0010!\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b-\u00101J\r\u0010%\u001a\u00020\u0002¢\u0006\u0004\b%\u00102J\u0010\u00103\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b3\u00102J\u0010\u00104\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b6\u00105J\u0010\u00107\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b7\u00108J\u0018\u00109\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u00102J\u0012\u0010<\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b<\u00105J\u0012\u0010=\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0012\u0010E\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0018\u0010I\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bI\u0010:J\u0012\u0010J\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\u001eHÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020\u001eHÆ\u0003¢\u0006\u0004\bN\u0010MJ\u0010\u0010O\u001a\u00020\u001eHÆ\u0003¢\u0006\u0004\bO\u0010MJ\u0010\u0010P\u001a\u00020\"HÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0012\u0010R\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bR\u00102J\u0012\u0010S\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\bS\u00102J\u0012\u0010T\u001a\u0004\u0018\u00010&HÆ\u0003¢\u0006\u0004\bT\u0010UJ\u0012\u0010V\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\bV\u0010WJ\u0012\u0010X\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bX\u00102J\u0012\u0010Y\u001a\u0004\u0018\u00010+HÆ\u0003¢\u0006\u0004\bY\u0010ZJº\u0002\u0010[\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\t2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020\u001e2\b\b\u0002\u0010#\u001a\u00020\"2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+HÆ\u0001¢\u0006\u0004\b[\u0010\\J\u001a\u0010^\u001a\u00020\u001e2\b\u0010]\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b^\u0010_J\u0010\u0010a\u001a\u00020`HÖ\u0001¢\u0006\u0004\ba\u0010bJ\u0010\u0010c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bc\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010d\u001a\u0004\be\u00102R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010f\u001a\u0004\bg\u00105R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010f\u001a\u0004\bh\u00105R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010i\u001a\u0004\bj\u00108R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010k\u001a\u0004\bl\u0010:R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010d\u001a\u0004\bm\u00102R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010f\u001a\u0004\bn\u00105R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010o\u001a\u0004\bp\u0010>R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010q\u001a\u0004\br\u0010@R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010s\u001a\u0004\bt\u0010BR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010u\u001a\u0004\bv\u0010DR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010w\u001a\u0004\bx\u0010FR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010y\u001a\u0004\bz\u0010HR\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010k\u001a\u0004\b{\u0010:R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010|\u001a\u0004\b}\u0010KR\u001a\u0010\u001f\u001a\u00020\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010~\u001a\u0004\b\u007f\u0010MR\u001b\u0010 \u001a\u00020\u001e8\u0007X\u0087\u0004¢\u0006\r\n\u0004\b \u0010~\u001a\u0005\b\u0080\u0001\u0010MR\u001b\u0010!\u001a\u00020\u001e8\u0007X\u0087\u0004¢\u0006\r\n\u0004\b!\u0010~\u001a\u0005\b\u0081\u0001\u0010MR\u001c\u0010#\u001a\u00020\"8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b#\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010QR\u001d\u0010$\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\r\n\u0004\b$\u0010d\u001a\u0005\b\u0084\u0001\u00102R\u0016\u0010%\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010dR\u001e\u0010'\u001a\u0004\u0018\u00010&8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b'\u0010\u0085\u0001\u001a\u0005\b\u0086\u0001\u0010UR\u001e\u0010)\u001a\u0004\u0018\u00010(8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b)\u0010\u0087\u0001\u001a\u0005\b\u0088\u0001\u0010WR\u001d\u0010*\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\r\n\u0004\b*\u0010d\u001a\u0005\b\u0089\u0001\u00102R\u001e\u0010,\u001a\u0004\u0018\u00010+8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b,\u0010\u008a\u0001\u001a\u0005\b\u008b\u0001\u0010ZR\u001a\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010dR\u0018\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001"}, d2 = {"Lfinancial/atomic/transact/Config;", "", "", "publicToken", "Lfinancial/atomic/transact/Config$Product;", "product", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "Lfinancial/atomic/transact/Config$Environment;", "environment", "", "Lfinancial/atomic/transact/Config$Task;", "tasks", "linkedAccount", "additionalProduct", "Lfinancial/atomic/transact/Config$Distribution;", "distribution", "Lfinancial/atomic/transact/Config$Theme;", com.ingo.sdk.android.ux.activity.IngoSdkActivity.THEME, "Lfinancial/atomic/transact/Config$Deeplink;", "deeplink", "Lorg/json/JSONObject;", "metadata", "Lfinancial/atomic/transact/Config$Language;", com.datadog.trace.api.DDTags.LANGUAGE_TAG_KEY, "Lfinancial/atomic/transact/Config$Search;", com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.Analytics.FEATURE_SEARCH, "Lfinancial/atomic/transact/Config$Handoff;", "handoff", "Lfinancial/atomic/transact/Config$Experiments;", "experiments", "", "nativeAuthentication", "clearCookies", "webContentsDebuggingEnabled", "Lfinancial/atomic/transact/Config$Scope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "sessionContext", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Lfinancial/atomic/transact/Config$Customer;", "customer", "Lfinancial/atomic/transact/Config$Features;", "features", "environmentURL", "Lfinancial/atomic/transact/Config$DeferredPaymentMethodStrategy;", "deferredPaymentMethodStrategy", "<init>", "(Ljava/lang/String;Lfinancial/atomic/transact/Config$Product;Lfinancial/atomic/transact/Config$Product;Lfinancial/atomic/transact/Config$Environment;Ljava/util/List;Ljava/lang/String;Lfinancial/atomic/transact/Config$Product;Lfinancial/atomic/transact/Config$Distribution;Lfinancial/atomic/transact/Config$Theme;Lfinancial/atomic/transact/Config$Deeplink;Lorg/json/JSONObject;Lfinancial/atomic/transact/Config$Language;Lfinancial/atomic/transact/Config$Search;Ljava/util/List;Lfinancial/atomic/transact/Config$Experiments;ZZZLfinancial/atomic/transact/Config$Scope;Ljava/lang/String;Ljava/lang/String;Lfinancial/atomic/transact/Config$Customer;Lfinancial/atomic/transact/Config$Features;Ljava/lang/String;Lfinancial/atomic/transact/Config$DeferredPaymentMethodStrategy;)V", "(Ljava/lang/String;Lfinancial/atomic/transact/Config$Product;Lfinancial/atomic/transact/Config$Environment;Ljava/lang/String;Lfinancial/atomic/transact/Config$Product;Lfinancial/atomic/transact/Config$Distribution;Lfinancial/atomic/transact/Config$Theme;Lfinancial/atomic/transact/Config$Deeplink;Lorg/json/JSONObject;Lfinancial/atomic/transact/Config$Language;Lfinancial/atomic/transact/Config$Search;Ljava/util/List;Lfinancial/atomic/transact/Config$Experiments;ZZZLfinancial/atomic/transact/Config$Scope;Ljava/lang/String;Lfinancial/atomic/transact/Config$Product;Lfinancial/atomic/transact/Config$Customer;Lfinancial/atomic/transact/Config$Features;Ljava/lang/String;Lfinancial/atomic/transact/Config$DeferredPaymentMethodStrategy;)V", "(Ljava/lang/String;Ljava/util/List;Lfinancial/atomic/transact/Config$Environment;Ljava/lang/String;Lfinancial/atomic/transact/Config$Product;Lfinancial/atomic/transact/Config$Distribution;Lfinancial/atomic/transact/Config$Theme;Lfinancial/atomic/transact/Config$Deeplink;Lorg/json/JSONObject;Lfinancial/atomic/transact/Config$Language;Lfinancial/atomic/transact/Config$Search;Ljava/util/List;Lfinancial/atomic/transact/Config$Experiments;ZZZLfinancial/atomic/transact/Config$Scope;Ljava/lang/String;Lfinancial/atomic/transact/Config$Customer;Lfinancial/atomic/transact/Config$Features;Ljava/lang/String;Lfinancial/atomic/transact/Config$DeferredPaymentMethodStrategy;)V", "(Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;)V", "()Ljava/lang/String;", "component1", "component2", "()Lfinancial/atomic/transact/Config$Product;", "component3", "component4", "()Lfinancial/atomic/transact/Config$Environment;", "component5", "()Ljava/util/List;", "component6", "component7", "component8", "()Lfinancial/atomic/transact/Config$Distribution;", "component9", "()Lfinancial/atomic/transact/Config$Theme;", "component10", "()Lfinancial/atomic/transact/Config$Deeplink;", "component11", "()Lorg/json/JSONObject;", "component12", "()Lfinancial/atomic/transact/Config$Language;", "component13", "()Lfinancial/atomic/transact/Config$Search;", "component14", "component15", "()Lfinancial/atomic/transact/Config$Experiments;", "component16", "()Z", "component17", "component18", "component19", "()Lfinancial/atomic/transact/Config$Scope;", "component20", "component21", "component22", "()Lfinancial/atomic/transact/Config$Customer;", "component23", "()Lfinancial/atomic/transact/Config$Features;", "component24", "component25", "()Lfinancial/atomic/transact/Config$DeferredPaymentMethodStrategy;", "copy", "(Ljava/lang/String;Lfinancial/atomic/transact/Config$Product;Lfinancial/atomic/transact/Config$Product;Lfinancial/atomic/transact/Config$Environment;Ljava/util/List;Ljava/lang/String;Lfinancial/atomic/transact/Config$Product;Lfinancial/atomic/transact/Config$Distribution;Lfinancial/atomic/transact/Config$Theme;Lfinancial/atomic/transact/Config$Deeplink;Lorg/json/JSONObject;Lfinancial/atomic/transact/Config$Language;Lfinancial/atomic/transact/Config$Search;Ljava/util/List;Lfinancial/atomic/transact/Config$Experiments;ZZZLfinancial/atomic/transact/Config$Scope;Ljava/lang/String;Ljava/lang/String;Lfinancial/atomic/transact/Config$Customer;Lfinancial/atomic/transact/Config$Features;Ljava/lang/String;Lfinancial/atomic/transact/Config$DeferredPaymentMethodStrategy;)Lfinancial/atomic/transact/Config;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPublicToken", "Lfinancial/atomic/transact/Config$Product;", "getProduct", "getOperation", "Lfinancial/atomic/transact/Config$Environment;", "getEnvironment", "Ljava/util/List;", "getTasks", "getLinkedAccount", "getAdditionalProduct", "Lfinancial/atomic/transact/Config$Distribution;", "getDistribution", "Lfinancial/atomic/transact/Config$Theme;", "getTheme", "Lfinancial/atomic/transact/Config$Deeplink;", "getDeeplink", "Lorg/json/JSONObject;", "getMetadata", "Lfinancial/atomic/transact/Config$Language;", "getLanguage", "Lfinancial/atomic/transact/Config$Search;", "getSearch", "getHandoff", "Lfinancial/atomic/transact/Config$Experiments;", "getExperiments", "Z", "getNativeAuthentication", "getClearCookies", "getWebContentsDebuggingEnabled", "Lfinancial/atomic/transact/Config$Scope;", "getScope", "getSessionContext", "Lfinancial/atomic/transact/Config$Customer;", "getCustomer", "Lfinancial/atomic/transact/Config$Features;", "getFeatures", "getEnvironmentURL", "Lfinancial/atomic/transact/Config$DeferredPaymentMethodStrategy;", "getDeferredPaymentMethodStrategy", "_token", "Lfinancial/atomic/transact/Config$TokenData;", "_tokenData", "Lfinancial/atomic/transact/Config$TokenData;", "Product", "Scope", "Language", "UserAction", "Task", "TaskData", "Distribution", "Environment", "Deeplink", "NavigationOptions", "Theme", "Search", "Handoff", "Features", "Experiments", "Customer", "TaskStatusUpdate", "TransactCompany", "TransactAuthStatusUpdate", "DeferredPaymentMethodStrategy", "TokenData", "Platform", "TransactDataResponse"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Config {
    private java.lang.String _token;
    private final financial.atomic.transact.Config.TokenData _tokenData;
    private final financial.atomic.transact.Config.Product additionalProduct;
    private final boolean clearCookies;
    private final financial.atomic.transact.Config.Customer customer;
    private final financial.atomic.transact.Config.Deeplink deeplink;
    private final financial.atomic.transact.Config.DeferredPaymentMethodStrategy deferredPaymentMethodStrategy;
    private final financial.atomic.transact.Config.Distribution distribution;
    private final financial.atomic.transact.Config.Environment environment;
    private final java.lang.String environmentURL;
    private final financial.atomic.transact.Config.Experiments experiments;
    private final financial.atomic.transact.Config.Features features;
    private final java.util.List<financial.atomic.transact.Config.Handoff> handoff;
    private final financial.atomic.transact.Config.Language language;
    private final java.lang.String linkedAccount;
    private final org.json.JSONObject metadata;
    private final boolean nativeAuthentication;
    private final financial.atomic.transact.Config.Product operation;
    private final financial.atomic.transact.Config.Product product;
    private final java.lang.String publicToken;
    private final financial.atomic.transact.Config.Scope scope;
    private final financial.atomic.transact.Config.Search search;
    private final java.lang.String sessionContext;
    private final java.util.List<financial.atomic.transact.Config.Task> tasks;
    private final financial.atomic.transact.Config.Theme theme;
    private final java.lang.String token;
    private final boolean webContentsDebuggingEnabled;

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002! B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\f"}, d2 = {"Lfinancial/atomic/transact/Config$Customer;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lfinancial/atomic/transact/Config$Customer;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$transact_release", "(Lfinancial/atomic/transact/Config$Customer;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getName", "Companion", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Customer {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final financial.atomic.transact.Config.Customer.Companion INSTANCE = new financial.atomic.transact.Config.Customer.Companion(null);
        private final java.lang.String name;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfinancial/atomic/transact/Config$Customer$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$Customer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes17.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<financial.atomic.transact.Config.Customer> serializer() {
                return financial.atomic.transact.Config$Customer$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Customer() {
            this((java.lang.String) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$transact_release(financial.atomic.transact.Config.Customer self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.name != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.name);
            }
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public /* synthetic */ Customer(int i, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.name = null;
            } else {
                this.name = str;
            }
        }

        public Customer(java.lang.String str) {
            this.name = str;
        }

        public /* synthetic */ Customer(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Customer(name=");
            sb.append(this.name);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.name;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof financial.atomic.transact.Config.Customer) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, ((financial.atomic.transact.Config.Customer) other).name);
        }

        public final financial.atomic.transact.Config.Customer copy(java.lang.String name2) {
            return new financial.atomic.transact.Config.Customer(name2);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ financial.atomic.transact.Config.Customer copy$default(financial.atomic.transact.Config.Customer customer, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = customer.name;
            }
            return customer.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0004HIJGBg\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000f\u0010\u0010Bo\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u000f\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJp\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b,\u0010\u001dJ'\u00103\u001a\u0002022\u0006\u0010-\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0001¢\u0006\u0004\b3\u00104R \u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00105\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010\u0019R \u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00109\u0012\u0004\b;\u00108\u001a\u0004\b:\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b=\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\b>\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b?\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bA\u0010!R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bC\u0010#R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\bD\u0010\u001dR\u001c\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0013\u0010<\u0012\u0004\bE\u00108R\u001c\u0010\u0014\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0014\u0010<\u0012\u0004\bF\u00108"}, d2 = {"Lfinancial/atomic/transact/Config$Deeplink;", "", "Lfinancial/atomic/transact/Config$Deeplink$Step;", "step", "Lfinancial/atomic/transact/Config$Deeplink$App;", com.datadog.android.rum.internal.metric.SessionEndedMetric.PROCESS_TYPE_VALUE, "", "companyId", "connectorId", "companyName", "", "singleSwitch", "", "payments", "accountId", "<init>", "(Lfinancial/atomic/transact/Config$Deeplink$Step;Lfinancial/atomic/transact/Config$Deeplink$App;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;)V", "", "seen0", "_step", "_app", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lfinancial/atomic/transact/Config$Deeplink$Step;", "component2", "()Lfinancial/atomic/transact/Config$Deeplink$App;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "()Z", "component7", "()Ljava/util/List;", "component8", "copy", "(Lfinancial/atomic/transact/Config$Deeplink$Step;Lfinancial/atomic/transact/Config$Deeplink$App;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;)Lfinancial/atomic/transact/Config$Deeplink;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$transact_release", "(Lfinancial/atomic/transact/Config$Deeplink;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lfinancial/atomic/transact/Config$Deeplink$Step;", "getStep", "getStep$annotations", "()V", "Lfinancial/atomic/transact/Config$Deeplink$App;", "getApp", "getApp$annotations", "Ljava/lang/String;", "getCompanyId", "getConnectorId", "getCompanyName", "Z", "getSingleSwitch", "Ljava/util/List;", "getPayments", "getAccountId", "get_step$annotations", "get_app$annotations", "Companion", "Step", "App", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Deeplink {
        private java.lang.String _app;
        private java.lang.String _step;
        private final java.lang.String accountId;
        private final financial.atomic.transact.Config.Deeplink.App app;
        private final java.lang.String companyId;
        private final java.lang.String companyName;
        private final java.lang.String connectorId;
        private final java.util.List<java.lang.String> payments;
        private final boolean singleSwitch;
        private final financial.atomic.transact.Config.Deeplink.Step step;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final financial.atomic.transact.Config.Deeplink.Companion INSTANCE = new financial.atomic.transact.Config.Deeplink.Companion(null);
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: financial.atomic.transact.Config$Deeplink$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer _childSerializers$_anonymous_;
                _childSerializers$_anonymous_ = financial.atomic.transact.Config.Deeplink._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            }
        }), null, null, null};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfinancial/atomic/transact/Config$Deeplink$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$Deeplink;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes17.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<financial.atomic.transact.Config.Deeplink> serializer() {
                return financial.atomic.transact.Config$Deeplink$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Deeplink() {
            this((financial.atomic.transact.Config.Deeplink.Step) null, (financial.atomic.transact.Config.Deeplink.App) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.util.List) null, (java.lang.String) null, 255, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        @kotlinx.serialization.Transient
        public static /* synthetic */ void getApp$annotations() {
        }

        @kotlinx.serialization.Transient
        public static /* synthetic */ void getStep$annotations() {
        }

        @kotlinx.serialization.SerialName(com.datadog.android.rum.internal.metric.SessionEndedMetric.PROCESS_TYPE_VALUE)
        private static /* synthetic */ void get_app$annotations() {
        }

        @kotlinx.serialization.SerialName("step")
        private static /* synthetic */ void get_step$annotations() {
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$transact_release(financial.atomic.transact.Config.Deeplink self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.companyId != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.companyId);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.connectorId != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.connectorId);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.companyName != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.companyName);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || self.singleSwitch) {
                output.encodeBooleanElement(serialDesc, 3, self.singleSwitch);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 4) || self.payments != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.payments);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 5) || self.accountId != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.accountId);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 6) || !kotlin.jvm.internal.Intrinsics.areEqual(self._step, financial.atomic.transact.Config.Deeplink.Step.EMPTY.getValue())) {
                output.encodeStringElement(serialDesc, 6, self._step);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 7) || !kotlin.jvm.internal.Intrinsics.areEqual(self._app, financial.atomic.transact.Config.Deeplink.App.EMPTY.getValue())) {
                output.encodeStringElement(serialDesc, 7, self._app);
            }
        }

        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        public final financial.atomic.transact.Config.Deeplink.App getApp() {
            return this.app;
        }

        public final java.lang.String getCompanyId() {
            return this.companyId;
        }

        public final java.lang.String getCompanyName() {
            return this.companyName;
        }

        public final java.lang.String getConnectorId() {
            return this.connectorId;
        }

        public final java.util.List<java.lang.String> getPayments() {
            return this.payments;
        }

        public final boolean getSingleSwitch() {
            return this.singleSwitch;
        }

        public final financial.atomic.transact.Config.Deeplink.Step getStep() {
            return this.step;
        }

        public /* synthetic */ Deeplink(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.util.List list, java.lang.String str4, java.lang.String str5, java.lang.String str6, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            financial.atomic.transact.Config.Deeplink.Step step = financial.atomic.transact.Config.Deeplink.Step.EMPTY;
            this.step = step;
            financial.atomic.transact.Config.Deeplink.App app2 = financial.atomic.transact.Config.Deeplink.App.EMPTY;
            this.app = app2;
            if ((i & 1) == 0) {
                this.companyId = null;
            } else {
                this.companyId = str;
            }
            if ((i & 2) == 0) {
                this.connectorId = null;
            } else {
                this.connectorId = str2;
            }
            if ((i & 4) == 0) {
                this.companyName = null;
            } else {
                this.companyName = str3;
            }
            if ((i & 8) == 0) {
                this.singleSwitch = false;
            } else {
                this.singleSwitch = z;
            }
            if ((i & 16) == 0) {
                this.payments = null;
            } else {
                this.payments = list;
            }
            if ((i & 32) == 0) {
                this.accountId = null;
            } else {
                this.accountId = str4;
            }
            if ((i & 64) == 0) {
                this._step = step.getValue();
            } else {
                this._step = str5;
            }
            if ((i & 128) == 0) {
                this._app = app2.getValue();
            } else {
                this._app = str6;
            }
            this._step = step.getValue();
            this._app = app2.getValue();
        }

        public Deeplink(financial.atomic.transact.Config.Deeplink.Step step, financial.atomic.transact.Config.Deeplink.App app2, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.util.List<java.lang.String> list, java.lang.String str4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(app2, "");
            this.step = step;
            this.app = app2;
            this.companyId = str;
            this.connectorId = str2;
            this.companyName = str3;
            this.singleSwitch = z;
            this.payments = list;
            this.accountId = str4;
            this._step = financial.atomic.transact.Config.Deeplink.Step.EMPTY.getValue();
            this._app = financial.atomic.transact.Config.Deeplink.App.EMPTY.getValue();
            this._step = step.getValue();
            this._app = app2.getValue();
        }

        public /* synthetic */ Deeplink(financial.atomic.transact.Config.Deeplink.Step step, financial.atomic.transact.Config.Deeplink.App app2, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.util.List list, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? financial.atomic.transact.Config.Deeplink.Step.EMPTY : step, (i & 2) != 0 ? financial.atomic.transact.Config.Deeplink.App.EMPTY : app2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : list, (i & 128) == 0 ? str4 : null);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Deeplink(step=");
            sb.append(this.step);
            sb.append(", app=");
            sb.append(this.app);
            sb.append(", companyId=");
            sb.append(this.companyId);
            sb.append(", connectorId=");
            sb.append(this.connectorId);
            sb.append(", companyName=");
            sb.append(this.companyName);
            sb.append(", singleSwitch=");
            sb.append(this.singleSwitch);
            sb.append(", payments=");
            sb.append(this.payments);
            sb.append(", accountId=");
            sb.append(this.accountId);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.step.hashCode();
            int hashCode2 = this.app.hashCode();
            java.lang.String str = this.companyId;
            int hashCode3 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.connectorId;
            int hashCode4 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.companyName;
            int hashCode5 = str3 == null ? 0 : str3.hashCode();
            int hashCode6 = java.lang.Boolean.hashCode(this.singleSwitch);
            java.util.List<java.lang.String> list = this.payments;
            int hashCode7 = list == null ? 0 : list.hashCode();
            java.lang.String str4 = this.accountId;
            return ((((hashCode6 + ((((((((hashCode2 + (hashCode * 31)) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31)) * 31) + hashCode7) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof financial.atomic.transact.Config.Deeplink)) {
                return false;
            }
            financial.atomic.transact.Config.Deeplink deeplink = (financial.atomic.transact.Config.Deeplink) other;
            return this.step == deeplink.step && this.app == deeplink.app && kotlin.jvm.internal.Intrinsics.areEqual(this.companyId, deeplink.companyId) && kotlin.jvm.internal.Intrinsics.areEqual(this.connectorId, deeplink.connectorId) && kotlin.jvm.internal.Intrinsics.areEqual(this.companyName, deeplink.companyName) && this.singleSwitch == deeplink.singleSwitch && kotlin.jvm.internal.Intrinsics.areEqual(this.payments, deeplink.payments) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountId, deeplink.accountId);
        }

        public final financial.atomic.transact.Config.Deeplink copy(financial.atomic.transact.Config.Deeplink.Step step, financial.atomic.transact.Config.Deeplink.App app2, java.lang.String companyId, java.lang.String connectorId, java.lang.String companyName, boolean singleSwitch, java.util.List<java.lang.String> payments, java.lang.String accountId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(app2, "");
            return new financial.atomic.transact.Config.Deeplink(step, app2, companyId, connectorId, companyName, singleSwitch, payments, accountId);
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        public final java.util.List<java.lang.String> component7() {
            return this.payments;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getSingleSwitch() {
            return this.singleSwitch;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getCompanyName() {
            return this.companyName;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getConnectorId() {
            return this.connectorId;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getCompanyId() {
            return this.companyId;
        }

        /* renamed from: component2, reason: from getter */
        public final financial.atomic.transact.Config.Deeplink.App getApp() {
            return this.app;
        }

        /* renamed from: component1, reason: from getter */
        public final financial.atomic.transact.Config.Deeplink.Step getStep() {
            return this.step;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lfinancial/atomic/transact/Config$Deeplink$App;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.PAY_NOW, "EXPENSES", "ORDERS", "SUGGESTIONS", "EMPTY"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes17.dex */
        public static final class App {
            private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
            private static final /* synthetic */ financial.atomic.transact.Config.Deeplink.App[] $VALUES;
            private final java.lang.String value;
            public static final financial.atomic.transact.Config.Deeplink.App PAY_NOW = new financial.atomic.transact.Config.Deeplink.App(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.PAY_NOW, 0, "pay-now");
            public static final financial.atomic.transact.Config.Deeplink.App EXPENSES = new financial.atomic.transact.Config.Deeplink.App("EXPENSES", 1, "expenses");
            public static final financial.atomic.transact.Config.Deeplink.App ORDERS = new financial.atomic.transact.Config.Deeplink.App("ORDERS", 2, "orders");
            public static final financial.atomic.transact.Config.Deeplink.App SUGGESTIONS = new financial.atomic.transact.Config.Deeplink.App("SUGGESTIONS", 3, "suggestions");
            public static final financial.atomic.transact.Config.Deeplink.App EMPTY = new financial.atomic.transact.Config.Deeplink.App("EMPTY", 4, "");

            static {
                financial.atomic.transact.Config.Deeplink.App[] $values = $values();
                $VALUES = $values;
                $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
            }

            private App(java.lang.String str, int i, java.lang.String str2) {
                this.value = str2;
            }

            public static financial.atomic.transact.Config.Deeplink.App valueOf(java.lang.String str) {
                return (financial.atomic.transact.Config.Deeplink.App) java.lang.Enum.valueOf(financial.atomic.transact.Config.Deeplink.App.class, str);
            }

            public static financial.atomic.transact.Config.Deeplink.App[] values() {
                return (financial.atomic.transact.Config.Deeplink.App[]) $VALUES.clone();
            }

            public final java.lang.String getValue() {
                return this.value;
            }

            public static kotlin.enums.EnumEntries<financial.atomic.transact.Config.Deeplink.App> getEntries() {
                return $ENTRIES;
            }

            private static final /* synthetic */ financial.atomic.transact.Config.Deeplink.App[] $values() {
                return new financial.atomic.transact.Config.Deeplink.App[]{PAY_NOW, EXPENSES, ORDERS, SUGGESTIONS, EMPTY};
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lfinancial/atomic/transact/Config$Deeplink$Step;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "SEARCH_COMPANY", "SEARCH_PAYROLL", "LOGIN_COMPANY", "LOGIN_PAYROLL", "EMPTY"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes17.dex */
        public static final class Step {
            private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
            private static final /* synthetic */ financial.atomic.transact.Config.Deeplink.Step[] $VALUES;
            private final java.lang.String value;
            public static final financial.atomic.transact.Config.Deeplink.Step SEARCH_COMPANY = new financial.atomic.transact.Config.Deeplink.Step("SEARCH_COMPANY", 0, "search-company");
            public static final financial.atomic.transact.Config.Deeplink.Step SEARCH_PAYROLL = new financial.atomic.transact.Config.Deeplink.Step("SEARCH_PAYROLL", 1, "search-payroll");
            public static final financial.atomic.transact.Config.Deeplink.Step LOGIN_COMPANY = new financial.atomic.transact.Config.Deeplink.Step("LOGIN_COMPANY", 2, "login-company");
            public static final financial.atomic.transact.Config.Deeplink.Step LOGIN_PAYROLL = new financial.atomic.transact.Config.Deeplink.Step("LOGIN_PAYROLL", 3, "login-payroll");
            public static final financial.atomic.transact.Config.Deeplink.Step EMPTY = new financial.atomic.transact.Config.Deeplink.Step("EMPTY", 4, "");

            static {
                financial.atomic.transact.Config.Deeplink.Step[] $values = $values();
                $VALUES = $values;
                $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
            }

            private Step(java.lang.String str, int i, java.lang.String str2) {
                this.value = str2;
            }

            public static financial.atomic.transact.Config.Deeplink.Step valueOf(java.lang.String str) {
                return (financial.atomic.transact.Config.Deeplink.Step) java.lang.Enum.valueOf(financial.atomic.transact.Config.Deeplink.Step.class, str);
            }

            public static financial.atomic.transact.Config.Deeplink.Step[] values() {
                return (financial.atomic.transact.Config.Deeplink.Step[]) $VALUES.clone();
            }

            public final java.lang.String getValue() {
                return this.value;
            }

            public static kotlin.enums.EnumEntries<financial.atomic.transact.Config.Deeplink.Step> getEntries() {
                return $ENTRIES;
            }

            private static final /* synthetic */ financial.atomic.transact.Config.Deeplink.Step[] $values() {
                return new financial.atomic.transact.Config.Deeplink.Step[]{SEARCH_COMPANY, SEARCH_PAYROLL, LOGIN_COMPANY, LOGIN_PAYROLL, EMPTY};
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ kotlinx.serialization.KSerializer _childSerializers$_anonymous_() {
            return new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ4\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u000e"}, d2 = {"Lfinancial/atomic/transact/Config$Experiments;", "", "", "fractionalDeposits", "unemploymentCarousel", "manualFallback", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lfinancial/atomic/transact/Config$Experiments;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$transact_release", "(Lfinancial/atomic/transact/Config$Experiments;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/Boolean;", "getFractionalDeposits", "getUnemploymentCarousel", "getManualFallback", "Companion", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Experiments {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final financial.atomic.transact.Config.Experiments.Companion INSTANCE = new financial.atomic.transact.Config.Experiments.Companion(null);
        private final java.lang.Boolean fractionalDeposits;
        private final java.lang.Boolean manualFallback;
        private final java.lang.Boolean unemploymentCarousel;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfinancial/atomic/transact/Config$Experiments$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$Experiments;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes17.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<financial.atomic.transact.Config.Experiments> serializer() {
                return financial.atomic.transact.Config$Experiments$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Experiments() {
            this((java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$transact_release(financial.atomic.transact.Config.Experiments self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.fractionalDeposits != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.fractionalDeposits);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.unemploymentCarousel != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.unemploymentCarousel);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.manualFallback != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.manualFallback);
            }
        }

        public final java.lang.Boolean getFractionalDeposits() {
            return this.fractionalDeposits;
        }

        public final java.lang.Boolean getManualFallback() {
            return this.manualFallback;
        }

        public final java.lang.Boolean getUnemploymentCarousel() {
            return this.unemploymentCarousel;
        }

        public /* synthetic */ Experiments(int i, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.fractionalDeposits = null;
            } else {
                this.fractionalDeposits = bool;
            }
            if ((i & 2) == 0) {
                this.unemploymentCarousel = null;
            } else {
                this.unemploymentCarousel = bool2;
            }
            if ((i & 4) == 0) {
                this.manualFallback = null;
            } else {
                this.manualFallback = bool3;
            }
        }

        public Experiments(java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3) {
            this.fractionalDeposits = bool;
            this.unemploymentCarousel = bool2;
            this.manualFallback = bool3;
        }

        public /* synthetic */ Experiments(java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Experiments(fractionalDeposits=");
            sb.append(this.fractionalDeposits);
            sb.append(", unemploymentCarousel=");
            sb.append(this.unemploymentCarousel);
            sb.append(", manualFallback=");
            sb.append(this.manualFallback);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Boolean bool = this.fractionalDeposits;
            int hashCode = bool == null ? 0 : bool.hashCode();
            java.lang.Boolean bool2 = this.unemploymentCarousel;
            int hashCode2 = bool2 == null ? 0 : bool2.hashCode();
            java.lang.Boolean bool3 = this.manualFallback;
            return (((hashCode * 31) + hashCode2) * 31) + (bool3 != null ? bool3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof financial.atomic.transact.Config.Experiments)) {
                return false;
            }
            financial.atomic.transact.Config.Experiments experiments = (financial.atomic.transact.Config.Experiments) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.fractionalDeposits, experiments.fractionalDeposits) && kotlin.jvm.internal.Intrinsics.areEqual(this.unemploymentCarousel, experiments.unemploymentCarousel) && kotlin.jvm.internal.Intrinsics.areEqual(this.manualFallback, experiments.manualFallback);
        }

        public final financial.atomic.transact.Config.Experiments copy(java.lang.Boolean fractionalDeposits, java.lang.Boolean unemploymentCarousel, java.lang.Boolean manualFallback) {
            return new financial.atomic.transact.Config.Experiments(fractionalDeposits, unemploymentCarousel, manualFallback);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Boolean getManualFallback() {
            return this.manualFallback;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Boolean getUnemploymentCarousel() {
            return this.unemploymentCarousel;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Boolean getFractionalDeposits() {
            return this.fractionalDeposits;
        }

        public static /* synthetic */ financial.atomic.transact.Config.Experiments copy$default(financial.atomic.transact.Config.Experiments experiments, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bool = experiments.fractionalDeposits;
            }
            if ((i & 2) != 0) {
                bool2 = experiments.unemploymentCarousel;
            }
            if ((i & 4) != 0) {
                bool3 = experiments.manualFallback;
            }
            return experiments.copy(bool, bool2, bool3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\f"}, d2 = {"Lfinancial/atomic/transact/Config$Features;", "", "", "manualDepositFlow", "<init>", "(Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Boolean;)Lfinancial/atomic/transact/Config$Features;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$transact_release", "(Lfinancial/atomic/transact/Config$Features;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/Boolean;", "getManualDepositFlow", "Companion", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Features {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final financial.atomic.transact.Config.Features.Companion INSTANCE = new financial.atomic.transact.Config.Features.Companion(null);
        private final java.lang.Boolean manualDepositFlow;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfinancial/atomic/transact/Config$Features$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$Features;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes17.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<financial.atomic.transact.Config.Features> serializer() {
                return financial.atomic.transact.Config$Features$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Features() {
            this((java.lang.Boolean) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$transact_release(financial.atomic.transact.Config.Features self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.manualDepositFlow != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.manualDepositFlow);
            }
        }

        public final java.lang.Boolean getManualDepositFlow() {
            return this.manualDepositFlow;
        }

        public /* synthetic */ Features(int i, java.lang.Boolean bool, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.manualDepositFlow = null;
            } else {
                this.manualDepositFlow = bool;
            }
        }

        public Features(java.lang.Boolean bool) {
            this.manualDepositFlow = bool;
        }

        public /* synthetic */ Features(java.lang.Boolean bool, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Features(manualDepositFlow=");
            sb.append(this.manualDepositFlow);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Boolean bool = this.manualDepositFlow;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof financial.atomic.transact.Config.Features) && kotlin.jvm.internal.Intrinsics.areEqual(this.manualDepositFlow, ((financial.atomic.transact.Config.Features) other).manualDepositFlow);
        }

        public final financial.atomic.transact.Config.Features copy(java.lang.Boolean manualDepositFlow) {
            return new financial.atomic.transact.Config.Features(manualDepositFlow);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Boolean getManualDepositFlow() {
            return this.manualDepositFlow;
        }

        public static /* synthetic */ financial.atomic.transact.Config.Features copy$default(financial.atomic.transact.Config.Features features, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bool = features.manualDepositFlow;
            }
            return features.copy(bool);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ4\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u000e"}, d2 = {"Lfinancial/atomic/transact/Config$NavigationOptions;", "", "", "showBackButton", "showBackButtonText", "showCloseButton", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lfinancial/atomic/transact/Config$NavigationOptions;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$transact_release", "(Lfinancial/atomic/transact/Config$NavigationOptions;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/Boolean;", "getShowBackButton", "getShowBackButtonText", "getShowCloseButton", "Companion", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class NavigationOptions {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final financial.atomic.transact.Config.NavigationOptions.Companion INSTANCE = new financial.atomic.transact.Config.NavigationOptions.Companion(null);
        private final java.lang.Boolean showBackButton;
        private final java.lang.Boolean showBackButtonText;
        private final java.lang.Boolean showCloseButton;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfinancial/atomic/transact/Config$NavigationOptions$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$NavigationOptions;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes17.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<financial.atomic.transact.Config.NavigationOptions> serializer() {
                return financial.atomic.transact.Config$NavigationOptions$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public NavigationOptions() {
            this((java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$transact_release(financial.atomic.transact.Config.NavigationOptions self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.showBackButton != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.showBackButton);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.showBackButtonText != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.showBackButtonText);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.showCloseButton != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.showCloseButton);
            }
        }

        public final java.lang.Boolean getShowBackButton() {
            return this.showBackButton;
        }

        public final java.lang.Boolean getShowBackButtonText() {
            return this.showBackButtonText;
        }

        public final java.lang.Boolean getShowCloseButton() {
            return this.showCloseButton;
        }

        public /* synthetic */ NavigationOptions(int i, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.showBackButton = null;
            } else {
                this.showBackButton = bool;
            }
            if ((i & 2) == 0) {
                this.showBackButtonText = null;
            } else {
                this.showBackButtonText = bool2;
            }
            if ((i & 4) == 0) {
                this.showCloseButton = null;
            } else {
                this.showCloseButton = bool3;
            }
        }

        public NavigationOptions(java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3) {
            this.showBackButton = bool;
            this.showBackButtonText = bool2;
            this.showCloseButton = bool3;
        }

        public /* synthetic */ NavigationOptions(java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigationOptions(showBackButton=");
            sb.append(this.showBackButton);
            sb.append(", showBackButtonText=");
            sb.append(this.showBackButtonText);
            sb.append(", showCloseButton=");
            sb.append(this.showCloseButton);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Boolean bool = this.showBackButton;
            int hashCode = bool == null ? 0 : bool.hashCode();
            java.lang.Boolean bool2 = this.showBackButtonText;
            int hashCode2 = bool2 == null ? 0 : bool2.hashCode();
            java.lang.Boolean bool3 = this.showCloseButton;
            return (((hashCode * 31) + hashCode2) * 31) + (bool3 != null ? bool3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof financial.atomic.transact.Config.NavigationOptions)) {
                return false;
            }
            financial.atomic.transact.Config.NavigationOptions navigationOptions = (financial.atomic.transact.Config.NavigationOptions) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.showBackButton, navigationOptions.showBackButton) && kotlin.jvm.internal.Intrinsics.areEqual(this.showBackButtonText, navigationOptions.showBackButtonText) && kotlin.jvm.internal.Intrinsics.areEqual(this.showCloseButton, navigationOptions.showCloseButton);
        }

        public final financial.atomic.transact.Config.NavigationOptions copy(java.lang.Boolean showBackButton, java.lang.Boolean showBackButtonText, java.lang.Boolean showCloseButton) {
            return new financial.atomic.transact.Config.NavigationOptions(showBackButton, showBackButtonText, showCloseButton);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Boolean getShowCloseButton() {
            return this.showCloseButton;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Boolean getShowBackButtonText() {
            return this.showBackButtonText;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Boolean getShowBackButton() {
            return this.showBackButton;
        }

        public static /* synthetic */ financial.atomic.transact.Config.NavigationOptions copy$default(financial.atomic.transact.Config.NavigationOptions navigationOptions, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bool = navigationOptions.showBackButton;
            }
            if ((i & 2) != 0) {
                bool2 = navigationOptions.showBackButtonText;
            }
            if ((i & 4) != 0) {
                bool3 = navigationOptions.showCloseButton;
            }
            return navigationOptions.copy(bool, bool2, bool3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ8\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000fJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b(\u0010\u000f"}, d2 = {"Lfinancial/atomic/transact/Config$Platform;", "", "", "name", "sdkVersion", "version", "systemVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lfinancial/atomic/transact/Config$Platform;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$transact_release", "(Lfinancial/atomic/transact/Config$Platform;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getName", "getSdkVersion", "getVersion", "getSystemVersion", "Companion", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Platform {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final financial.atomic.transact.Config.Platform.Companion INSTANCE = new financial.atomic.transact.Config.Platform.Companion(null);
        private final java.lang.String name;
        private final java.lang.String sdkVersion;
        private final java.lang.String systemVersion;
        private final java.lang.String version;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfinancial/atomic/transact/Config$Platform$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$Platform;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes17.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<financial.atomic.transact.Config.Platform> serializer() {
                return financial.atomic.transact.Config$Platform$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Platform(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (15 != (i & 15)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 15, financial.atomic.transact.Config$Platform$$serializer.INSTANCE.getDescriptor());
            }
            this.name = str;
            this.sdkVersion = str2;
            this.version = str3;
            this.systemVersion = str4;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$transact_release(financial.atomic.transact.Config.Platform self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            output.encodeStringElement(serialDesc, 0, self.name);
            output.encodeStringElement(serialDesc, 1, self.sdkVersion);
            output.encodeStringElement(serialDesc, 2, self.version);
            output.encodeStringElement(serialDesc, 3, self.systemVersion);
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getSdkVersion() {
            return this.sdkVersion;
        }

        public final java.lang.String getSystemVersion() {
            return this.systemVersion;
        }

        public final java.lang.String getVersion() {
            return this.version;
        }

        public Platform(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.name = str;
            this.sdkVersion = str2;
            this.version = str3;
            this.systemVersion = str4;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Platform(name=");
            sb.append(this.name);
            sb.append(", sdkVersion=");
            sb.append(this.sdkVersion);
            sb.append(", version=");
            sb.append(this.version);
            sb.append(", systemVersion=");
            sb.append(this.systemVersion);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.name.hashCode();
            int hashCode2 = this.sdkVersion.hashCode();
            return this.systemVersion.hashCode() + ((this.version.hashCode() + ((hashCode2 + (hashCode * 31)) * 31)) * 31);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof financial.atomic.transact.Config.Platform)) {
                return false;
            }
            financial.atomic.transact.Config.Platform platform = (financial.atomic.transact.Config.Platform) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, platform.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.sdkVersion, platform.sdkVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.version, platform.version) && kotlin.jvm.internal.Intrinsics.areEqual(this.systemVersion, platform.systemVersion);
        }

        public final financial.atomic.transact.Config.Platform copy(java.lang.String name2, java.lang.String sdkVersion, java.lang.String version, java.lang.String systemVersion) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkVersion, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(systemVersion, "");
            return new financial.atomic.transact.Config.Platform(name2, sdkVersion, version, systemVersion);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getSystemVersion() {
            return this.systemVersion;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getVersion() {
            return this.version;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSdkVersion() {
            return this.sdkVersion;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ financial.atomic.transact.Config.Platform copy$default(financial.atomic.transact.Config.Platform platform, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = platform.name;
            }
            if ((i & 2) != 0) {
                str2 = platform.sdkVersion;
            }
            if ((i & 4) != 0) {
                str3 = platform.version;
            }
            if ((i & 8) != 0) {
                str4 = platform.systemVersion;
            }
            return platform.copy(str, str2, str3, str4);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u0003342B3\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBE\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\b\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J<\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0016J'\u0010&\u001a\u00020%2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0001¢\u0006\u0004\b&\u0010'R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u0013R&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b-\u0010+\u001a\u0004\b,\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u0016R\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\r\u0010(\u0012\u0004\b0\u0010+R\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u000e\u0010(\u0012\u0004\b1\u0010+"}, d2 = {"Lfinancial/atomic/transact/Config$Search;", "", "", "Lfinancial/atomic/transact/Config$Search$Tag;", "tags", "excludedTags", "", "ruleId", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "", "_tags", "_excludedTags", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/util/List;", "component2", "component3", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lfinancial/atomic/transact/Config$Search;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$transact_release", "(Lfinancial/atomic/transact/Config$Search;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/util/List;", "getTags", "getTags$annotations", "()V", "getExcludedTags", "getExcludedTags$annotations", "Ljava/lang/String;", "getRuleId", "get_tags$annotations", "get_excludedTags$annotations", "Companion", "Tag", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Search {
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final financial.atomic.transact.Config.Search.Companion INSTANCE = new financial.atomic.transact.Config.Search.Companion(null);
        private java.util.List<java.lang.String> _excludedTags;
        private java.util.List<java.lang.String> _tags;
        private final java.util.List<financial.atomic.transact.Config.Search.Tag> excludedTags;
        private final java.lang.String ruleId;
        private final java.util.List<financial.atomic.transact.Config.Search.Tag> tags;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfinancial/atomic/transact/Config$Search$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$Search;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes17.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<financial.atomic.transact.Config.Search> serializer() {
                return financial.atomic.transact.Config$Search$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            kotlin.LazyThreadSafetyMode lazyThreadSafetyMode = kotlin.LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new kotlin.Lazy[]{null, kotlin.LazyKt.lazy(lazyThreadSafetyMode, new kotlin.jvm.functions.Function0() { // from class: financial.atomic.transact.Config$Search$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlinx.serialization.KSerializer _childSerializers$_anonymous_;
                    _childSerializers$_anonymous_ = financial.atomic.transact.Config.Search._childSerializers$_anonymous_();
                    return _childSerializers$_anonymous_;
                }
            }), kotlin.LazyKt.lazy(lazyThreadSafetyMode, new kotlin.jvm.functions.Function0() { // from class: financial.atomic.transact.Config$Search$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlinx.serialization.KSerializer _childSerializers$_anonymous_$0;
                    _childSerializers$_anonymous_$0 = financial.atomic.transact.Config.Search._childSerializers$_anonymous_$0();
                    return _childSerializers$_anonymous_$0;
                }
            })};
        }

        public Search() {
            this((java.util.List) null, (java.util.List) null, (java.lang.String) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        @kotlinx.serialization.Transient
        public static /* synthetic */ void getExcludedTags$annotations() {
        }

        @kotlinx.serialization.Transient
        public static /* synthetic */ void getTags$annotations() {
        }

        @kotlinx.serialization.SerialName("excludedTags")
        private static /* synthetic */ void get_excludedTags$annotations() {
        }

        @kotlinx.serialization.SerialName("tags")
        private static /* synthetic */ void get_tags$annotations() {
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$transact_release(financial.atomic.transact.Config.Search self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.ruleId != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.ruleId);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || !kotlin.jvm.internal.Intrinsics.areEqual(self._tags, new java.util.ArrayList())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self._tags);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || !kotlin.jvm.internal.Intrinsics.areEqual(self._excludedTags, new java.util.ArrayList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self._excludedTags);
            }
        }

        public final java.util.List<financial.atomic.transact.Config.Search.Tag> getExcludedTags() {
            return this.excludedTags;
        }

        public final java.lang.String getRuleId() {
            return this.ruleId;
        }

        public final java.util.List<financial.atomic.transact.Config.Search.Tag> getTags() {
            return this.tags;
        }

        public /* synthetic */ Search(int i, java.lang.String str, java.util.List list, java.util.List list2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            java.util.List<financial.atomic.transact.Config.Search.Tag> emptyList = kotlin.collections.CollectionsKt.emptyList();
            this.tags = emptyList;
            this.excludedTags = kotlin.collections.CollectionsKt.emptyList();
            this.ruleId = (i & 1) == 0 ? null : str;
            if ((i & 2) == 0) {
                this._tags = new java.util.ArrayList();
            } else {
                this._tags = list;
            }
            if ((i & 4) == 0) {
                this._excludedTags = new java.util.ArrayList();
            } else {
                this._excludedTags = list2;
            }
            java.util.Iterator<financial.atomic.transact.Config.Search.Tag> it = emptyList.iterator();
            while (it.hasNext()) {
                this._tags.add(it.next().getValue());
            }
            java.util.Iterator<financial.atomic.transact.Config.Search.Tag> it2 = this.excludedTags.iterator();
            while (it2.hasNext()) {
                this._excludedTags.add(it2.next().getValue());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Search(java.util.List<? extends financial.atomic.transact.Config.Search.Tag> list, java.util.List<? extends financial.atomic.transact.Config.Search.Tag> list2, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.tags = list;
            this.excludedTags = list2;
            this.ruleId = str;
            this._tags = new java.util.ArrayList();
            this._excludedTags = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                this._tags.add(((financial.atomic.transact.Config.Search.Tag) it.next()).getValue());
            }
            java.util.Iterator<financial.atomic.transact.Config.Search.Tag> it2 = this.excludedTags.iterator();
            while (it2.hasNext()) {
                this._excludedTags.add(it2.next().getValue());
            }
        }

        public /* synthetic */ Search(java.util.List list, java.util.List list2, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i & 4) != 0 ? null : str);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Search(tags=");
            sb.append(this.tags);
            sb.append(", excludedTags=");
            sb.append(this.excludedTags);
            sb.append(", ruleId=");
            sb.append(this.ruleId);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.tags.hashCode();
            int hashCode2 = this.excludedTags.hashCode();
            java.lang.String str = this.ruleId;
            return ((hashCode2 + (hashCode * 31)) * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof financial.atomic.transact.Config.Search)) {
                return false;
            }
            financial.atomic.transact.Config.Search search = (financial.atomic.transact.Config.Search) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.tags, search.tags) && kotlin.jvm.internal.Intrinsics.areEqual(this.excludedTags, search.excludedTags) && kotlin.jvm.internal.Intrinsics.areEqual(this.ruleId, search.ruleId);
        }

        public final financial.atomic.transact.Config.Search copy(java.util.List<? extends financial.atomic.transact.Config.Search.Tag> tags, java.util.List<? extends financial.atomic.transact.Config.Search.Tag> excludedTags, java.lang.String ruleId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tags, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(excludedTags, "");
            return new financial.atomic.transact.Config.Search(tags, excludedTags, ruleId);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getRuleId() {
            return this.ruleId;
        }

        public final java.util.List<financial.atomic.transact.Config.Search.Tag> component2() {
            return this.excludedTags;
        }

        public final java.util.List<financial.atomic.transact.Config.Search.Tag> component1() {
            return this.tags;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ financial.atomic.transact.Config.Search copy$default(financial.atomic.transact.Config.Search search, java.util.List list, java.util.List list2, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = search.tags;
            }
            if ((i & 2) != 0) {
                list2 = search.excludedTags;
            }
            if ((i & 4) != 0) {
                str = search.ruleId;
            }
            return search.copy(list, list2, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ kotlinx.serialization.KSerializer _childSerializers$_anonymous_$0() {
            return new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lfinancial/atomic/transact/Config$Search$Tag;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "PAYROLL_PROVIDER", "UNEMPLOYMENT", "GIG_ECONOMY"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes17.dex */
        public static final class Tag {
            private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
            private static final /* synthetic */ financial.atomic.transact.Config.Search.Tag[] $VALUES;
            private final java.lang.String value;
            public static final financial.atomic.transact.Config.Search.Tag PAYROLL_PROVIDER = new financial.atomic.transact.Config.Search.Tag("PAYROLL_PROVIDER", 0, "payroll-provider");
            public static final financial.atomic.transact.Config.Search.Tag UNEMPLOYMENT = new financial.atomic.transact.Config.Search.Tag("UNEMPLOYMENT", 1, "unemployment");
            public static final financial.atomic.transact.Config.Search.Tag GIG_ECONOMY = new financial.atomic.transact.Config.Search.Tag("GIG_ECONOMY", 2, "gig-economy");

            static {
                financial.atomic.transact.Config.Search.Tag[] $values = $values();
                $VALUES = $values;
                $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
            }

            private Tag(java.lang.String str, int i, java.lang.String str2) {
                this.value = str2;
            }

            public static financial.atomic.transact.Config.Search.Tag valueOf(java.lang.String str) {
                return (financial.atomic.transact.Config.Search.Tag) java.lang.Enum.valueOf(financial.atomic.transact.Config.Search.Tag.class, str);
            }

            public static financial.atomic.transact.Config.Search.Tag[] values() {
                return (financial.atomic.transact.Config.Search.Tag[]) $VALUES.clone();
            }

            public final java.lang.String getValue() {
                return this.value;
            }

            public static kotlin.enums.EnumEntries<financial.atomic.transact.Config.Search.Tag> getEntries() {
                return $ENTRIES;
            }

            private static final /* synthetic */ financial.atomic.transact.Config.Search.Tag[] $values() {
                return new financial.atomic.transact.Config.Search.Tag[]{PAYROLL_PROVIDER, UNEMPLOYMENT, GIG_ECONOMY};
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ kotlinx.serialization.KSerializer _childSerializers$_anonymous_() {
            return new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eBc\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJd\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b&\u0010'J'\u0010.\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b.\u0010/R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b4\u0010\u0015R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010\u001cR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b9\u0010\u001a"}, d2 = {"Lfinancial/atomic/transact/Config$Task;", "", "Lfinancial/atomic/transact/Config$Product;", "product", "Lfinancial/atomic/transact/Config$Distribution;", "distribution", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "", "", "forms", "Lfinancial/atomic/transact/Config$UserAction;", "action", "apps", "<init>", "(Lfinancial/atomic/transact/Config$Product;Lfinancial/atomic/transact/Config$Distribution;Lfinancial/atomic/transact/Config$Product;Ljava/util/List;Lfinancial/atomic/transact/Config$UserAction;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILfinancial/atomic/transact/Config$Product;Lfinancial/atomic/transact/Config$Distribution;Lfinancial/atomic/transact/Config$Product;Ljava/util/List;Lfinancial/atomic/transact/Config$UserAction;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lfinancial/atomic/transact/Config$Product;", "component2", "()Lfinancial/atomic/transact/Config$Distribution;", "component3", "component4", "()Ljava/util/List;", "component5", "()Lfinancial/atomic/transact/Config$UserAction;", "component6", "copy", "(Lfinancial/atomic/transact/Config$Product;Lfinancial/atomic/transact/Config$Distribution;Lfinancial/atomic/transact/Config$Product;Ljava/util/List;Lfinancial/atomic/transact/Config$UserAction;Ljava/util/List;)Lfinancial/atomic/transact/Config$Task;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$transact_release", "(Lfinancial/atomic/transact/Config$Task;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lfinancial/atomic/transact/Config$Product;", "getProduct", "Lfinancial/atomic/transact/Config$Distribution;", "getDistribution", "getOperation", "Ljava/util/List;", "getForms", "Lfinancial/atomic/transact/Config$UserAction;", "getAction", "getApps", "Companion", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Task {
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final financial.atomic.transact.Config.Task.Companion INSTANCE = new financial.atomic.transact.Config.Task.Companion(null);
        private final financial.atomic.transact.Config.UserAction action;
        private final java.util.List<java.lang.String> apps;
        private final financial.atomic.transact.Config.Distribution distribution;
        private final java.util.List<java.lang.String> forms;
        private final financial.atomic.transact.Config.Product operation;
        private final financial.atomic.transact.Config.Product product;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfinancial/atomic/transact/Config$Task$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$Task;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes17.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<financial.atomic.transact.Config.Task> serializer() {
                return financial.atomic.transact.Config$Task$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            kotlin.LazyThreadSafetyMode lazyThreadSafetyMode = kotlin.LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new kotlin.Lazy[]{kotlin.LazyKt.lazy(lazyThreadSafetyMode, new kotlin.jvm.functions.Function0() { // from class: financial.atomic.transact.Config$Task$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlinx.serialization.KSerializer _childSerializers$_anonymous_;
                    _childSerializers$_anonymous_ = financial.atomic.transact.Config.Task._childSerializers$_anonymous_();
                    return _childSerializers$_anonymous_;
                }
            }), null, kotlin.LazyKt.lazy(lazyThreadSafetyMode, new kotlin.jvm.functions.Function0() { // from class: financial.atomic.transact.Config$Task$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlinx.serialization.KSerializer _childSerializers$_anonymous_$0;
                    _childSerializers$_anonymous_$0 = financial.atomic.transact.Config.Task._childSerializers$_anonymous_$0();
                    return _childSerializers$_anonymous_$0;
                }
            }), kotlin.LazyKt.lazy(lazyThreadSafetyMode, new kotlin.jvm.functions.Function0() { // from class: financial.atomic.transact.Config$Task$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlinx.serialization.KSerializer _childSerializers$_anonymous_$1;
                    _childSerializers$_anonymous_$1 = financial.atomic.transact.Config.Task._childSerializers$_anonymous_$1();
                    return _childSerializers$_anonymous_$1;
                }
            }), null, kotlin.LazyKt.lazy(lazyThreadSafetyMode, new kotlin.jvm.functions.Function0() { // from class: financial.atomic.transact.Config$Task$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlinx.serialization.KSerializer _childSerializers$_anonymous_$2;
                    _childSerializers$_anonymous_$2 = financial.atomic.transact.Config.Task._childSerializers$_anonymous_$2();
                    return _childSerializers$_anonymous_$2;
                }
            })};
        }

        public Task() {
            this((financial.atomic.transact.Config.Product) null, (financial.atomic.transact.Config.Distribution) null, (financial.atomic.transact.Config.Product) null, (java.util.List) null, (financial.atomic.transact.Config.UserAction) null, (java.util.List) null, 63, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$transact_release(financial.atomic.transact.Config.Task self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.product != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.product);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.distribution != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, financial.atomic.transact.Config$Distribution$$serializer.INSTANCE, self.distribution);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.operation != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.operation);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || self.forms != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.forms);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 4) || self.action != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, financial.atomic.transact.Config$UserAction$$serializer.INSTANCE, self.action);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 5) || self.apps != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.apps);
            }
        }

        public final financial.atomic.transact.Config.UserAction getAction() {
            return this.action;
        }

        public final java.util.List<java.lang.String> getApps() {
            return this.apps;
        }

        public final financial.atomic.transact.Config.Distribution getDistribution() {
            return this.distribution;
        }

        public final java.util.List<java.lang.String> getForms() {
            return this.forms;
        }

        public final financial.atomic.transact.Config.Product getOperation() {
            return this.operation;
        }

        public final financial.atomic.transact.Config.Product getProduct() {
            return this.product;
        }

        public /* synthetic */ Task(int i, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Product product2, java.util.List list, financial.atomic.transact.Config.UserAction userAction, java.util.List list2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.product = null;
            } else {
                this.product = product;
            }
            if ((i & 2) == 0) {
                this.distribution = null;
            } else {
                this.distribution = distribution;
            }
            if ((i & 4) == 0) {
                this.operation = null;
            } else {
                this.operation = product2;
            }
            if ((i & 8) == 0) {
                this.forms = null;
            } else {
                this.forms = list;
            }
            if ((i & 16) == 0) {
                this.action = null;
            } else {
                this.action = userAction;
            }
            if ((i & 32) == 0) {
                this.apps = null;
            } else {
                this.apps = list2;
            }
        }

        public Task(financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Product product2, java.util.List<java.lang.String> list, financial.atomic.transact.Config.UserAction userAction, java.util.List<java.lang.String> list2) {
            this.product = product;
            this.distribution = distribution;
            this.operation = product2;
            this.forms = list;
            this.action = userAction;
            this.apps = list2;
        }

        public /* synthetic */ Task(financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Product product2, java.util.List list, financial.atomic.transact.Config.UserAction userAction, java.util.List list2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : product, (i & 2) != 0 ? null : distribution, (i & 4) != 0 ? null : product2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : userAction, (i & 32) != 0 ? null : list2);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Task(product=");
            sb.append(this.product);
            sb.append(", distribution=");
            sb.append(this.distribution);
            sb.append(", operation=");
            sb.append(this.operation);
            sb.append(", forms=");
            sb.append(this.forms);
            sb.append(", action=");
            sb.append(this.action);
            sb.append(", apps=");
            sb.append(this.apps);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            financial.atomic.transact.Config.Product product = this.product;
            int hashCode = product == null ? 0 : product.hashCode();
            financial.atomic.transact.Config.Distribution distribution = this.distribution;
            int hashCode2 = distribution == null ? 0 : distribution.hashCode();
            financial.atomic.transact.Config.Product product2 = this.operation;
            int hashCode3 = product2 == null ? 0 : product2.hashCode();
            java.util.List<java.lang.String> list = this.forms;
            int hashCode4 = list == null ? 0 : list.hashCode();
            financial.atomic.transact.Config.UserAction userAction = this.action;
            int hashCode5 = userAction == null ? 0 : userAction.hashCode();
            java.util.List<java.lang.String> list2 = this.apps;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (list2 != null ? list2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof financial.atomic.transact.Config.Task)) {
                return false;
            }
            financial.atomic.transact.Config.Task task = (financial.atomic.transact.Config.Task) other;
            return this.product == task.product && kotlin.jvm.internal.Intrinsics.areEqual(this.distribution, task.distribution) && this.operation == task.operation && kotlin.jvm.internal.Intrinsics.areEqual(this.forms, task.forms) && kotlin.jvm.internal.Intrinsics.areEqual(this.action, task.action) && kotlin.jvm.internal.Intrinsics.areEqual(this.apps, task.apps);
        }

        public final financial.atomic.transact.Config.Task copy(financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Product operation, java.util.List<java.lang.String> forms, financial.atomic.transact.Config.UserAction action, java.util.List<java.lang.String> apps) {
            return new financial.atomic.transact.Config.Task(product, distribution, operation, forms, action, apps);
        }

        public final java.util.List<java.lang.String> component6() {
            return this.apps;
        }

        /* renamed from: component5, reason: from getter */
        public final financial.atomic.transact.Config.UserAction getAction() {
            return this.action;
        }

        public final java.util.List<java.lang.String> component4() {
            return this.forms;
        }

        /* renamed from: component3, reason: from getter */
        public final financial.atomic.transact.Config.Product getOperation() {
            return this.operation;
        }

        /* renamed from: component2, reason: from getter */
        public final financial.atomic.transact.Config.Distribution getDistribution() {
            return this.distribution;
        }

        /* renamed from: component1, reason: from getter */
        public final financial.atomic.transact.Config.Product getProduct() {
            return this.product;
        }

        public static /* synthetic */ financial.atomic.transact.Config.Task copy$default(financial.atomic.transact.Config.Task task, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Product product2, java.util.List list, financial.atomic.transact.Config.UserAction userAction, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                product = task.product;
            }
            if ((i & 2) != 0) {
                distribution = task.distribution;
            }
            financial.atomic.transact.Config.Distribution distribution2 = distribution;
            if ((i & 4) != 0) {
                product2 = task.operation;
            }
            financial.atomic.transact.Config.Product product3 = product2;
            if ((i & 8) != 0) {
                list = task.forms;
            }
            java.util.List list3 = list;
            if ((i & 16) != 0) {
                userAction = task.action;
            }
            financial.atomic.transact.Config.UserAction userAction2 = userAction;
            if ((i & 32) != 0) {
                list2 = task.apps;
            }
            return task.copy(product, distribution2, product3, list3, userAction2, list2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ kotlinx.serialization.KSerializer _childSerializers$_anonymous_$2() {
            return new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ kotlinx.serialization.KSerializer _childSerializers$_anonymous_$1() {
            return new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ kotlinx.serialization.KSerializer _childSerializers$_anonymous_$0() {
            return financial.atomic.transact.Config.Product.INSTANCE.serializer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ kotlinx.serialization.KSerializer _childSerializers$_anonymous_() {
            return financial.atomic.transact.Config.Product.INSTANCE.serializer();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0083\b\u0018\u0000 82\u00020\u0001:\u000298B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rBc\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019Jd\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0014J'\u0010,\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b,\u0010-R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b2\u0010\u0014R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010\u001bR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b7\u0010\u0019"}, d2 = {"Lfinancial/atomic/transact/Config$TaskData;", "", "", "product", "Lfinancial/atomic/transact/Config$Distribution;", "distribution", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "", "forms", "Lfinancial/atomic/transact/Config$UserAction;", "action", "apps", "<init>", "(Ljava/lang/String;Lfinancial/atomic/transact/Config$Distribution;Ljava/lang/String;Ljava/util/List;Lfinancial/atomic/transact/Config$UserAction;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lfinancial/atomic/transact/Config$Distribution;Ljava/lang/String;Ljava/util/List;Lfinancial/atomic/transact/Config$UserAction;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lfinancial/atomic/transact/Config$Distribution;", "component3", "component4", "()Ljava/util/List;", "component5", "()Lfinancial/atomic/transact/Config$UserAction;", "component6", "copy", "(Ljava/lang/String;Lfinancial/atomic/transact/Config$Distribution;Ljava/lang/String;Ljava/util/List;Lfinancial/atomic/transact/Config$UserAction;Ljava/util/List;)Lfinancial/atomic/transact/Config$TaskData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$transact_release", "(Lfinancial/atomic/transact/Config$TaskData;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getProduct", "Lfinancial/atomic/transact/Config$Distribution;", "getDistribution", "getOperation", "Ljava/util/List;", "getForms", "Lfinancial/atomic/transact/Config$UserAction;", "getAction", "getApps", "Companion", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class TaskData {
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final financial.atomic.transact.Config.TaskData.Companion INSTANCE = new financial.atomic.transact.Config.TaskData.Companion(null);
        private final financial.atomic.transact.Config.UserAction action;
        private final java.util.List<java.lang.String> apps;
        private final financial.atomic.transact.Config.Distribution distribution;
        private final java.util.List<java.lang.String> forms;
        private final java.lang.String operation;
        private final java.lang.String product;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfinancial/atomic/transact/Config$TaskData$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$TaskData;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes17.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<financial.atomic.transact.Config.TaskData> serializer() {
                return financial.atomic.transact.Config$TaskData$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            kotlin.LazyThreadSafetyMode lazyThreadSafetyMode = kotlin.LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new kotlin.Lazy[]{null, null, null, kotlin.LazyKt.lazy(lazyThreadSafetyMode, new kotlin.jvm.functions.Function0() { // from class: financial.atomic.transact.Config$TaskData$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlinx.serialization.KSerializer _childSerializers$_anonymous_;
                    _childSerializers$_anonymous_ = financial.atomic.transact.Config.TaskData._childSerializers$_anonymous_();
                    return _childSerializers$_anonymous_;
                }
            }), null, kotlin.LazyKt.lazy(lazyThreadSafetyMode, new kotlin.jvm.functions.Function0() { // from class: financial.atomic.transact.Config$TaskData$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlinx.serialization.KSerializer _childSerializers$_anonymous_$0;
                    _childSerializers$_anonymous_$0 = financial.atomic.transact.Config.TaskData._childSerializers$_anonymous_$0();
                    return _childSerializers$_anonymous_$0;
                }
            })};
        }

        public TaskData() {
            this((java.lang.String) null, (financial.atomic.transact.Config.Distribution) null, (java.lang.String) null, (java.util.List) null, (financial.atomic.transact.Config.UserAction) null, (java.util.List) null, 63, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$transact_release(financial.atomic.transact.Config.TaskData self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.product != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.product);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.distribution != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, financial.atomic.transact.Config$Distribution$$serializer.INSTANCE, self.distribution);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.operation != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.operation);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || self.forms != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.forms);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 4) || self.action != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, financial.atomic.transact.Config$UserAction$$serializer.INSTANCE, self.action);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 5) || self.apps != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.apps);
            }
        }

        public final financial.atomic.transact.Config.UserAction getAction() {
            return this.action;
        }

        public final java.util.List<java.lang.String> getApps() {
            return this.apps;
        }

        public final financial.atomic.transact.Config.Distribution getDistribution() {
            return this.distribution;
        }

        public final java.util.List<java.lang.String> getForms() {
            return this.forms;
        }

        public final java.lang.String getOperation() {
            return this.operation;
        }

        public final java.lang.String getProduct() {
            return this.product;
        }

        public /* synthetic */ TaskData(int i, java.lang.String str, financial.atomic.transact.Config.Distribution distribution, java.lang.String str2, java.util.List list, financial.atomic.transact.Config.UserAction userAction, java.util.List list2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.product = null;
            } else {
                this.product = str;
            }
            if ((i & 2) == 0) {
                this.distribution = null;
            } else {
                this.distribution = distribution;
            }
            if ((i & 4) == 0) {
                this.operation = null;
            } else {
                this.operation = str2;
            }
            if ((i & 8) == 0) {
                this.forms = null;
            } else {
                this.forms = list;
            }
            if ((i & 16) == 0) {
                this.action = null;
            } else {
                this.action = userAction;
            }
            if ((i & 32) == 0) {
                this.apps = null;
            } else {
                this.apps = list2;
            }
        }

        public TaskData(java.lang.String str, financial.atomic.transact.Config.Distribution distribution, java.lang.String str2, java.util.List<java.lang.String> list, financial.atomic.transact.Config.UserAction userAction, java.util.List<java.lang.String> list2) {
            this.product = str;
            this.distribution = distribution;
            this.operation = str2;
            this.forms = list;
            this.action = userAction;
            this.apps = list2;
        }

        public /* synthetic */ TaskData(java.lang.String str, financial.atomic.transact.Config.Distribution distribution, java.lang.String str2, java.util.List list, financial.atomic.transact.Config.UserAction userAction, java.util.List list2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : distribution, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : userAction, (i & 32) != 0 ? null : list2);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TaskData(product=");
            sb.append(this.product);
            sb.append(", distribution=");
            sb.append(this.distribution);
            sb.append(", operation=");
            sb.append(this.operation);
            sb.append(", forms=");
            sb.append(this.forms);
            sb.append(", action=");
            sb.append(this.action);
            sb.append(", apps=");
            sb.append(this.apps);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.product;
            int hashCode = str == null ? 0 : str.hashCode();
            financial.atomic.transact.Config.Distribution distribution = this.distribution;
            int hashCode2 = distribution == null ? 0 : distribution.hashCode();
            java.lang.String str2 = this.operation;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            java.util.List<java.lang.String> list = this.forms;
            int hashCode4 = list == null ? 0 : list.hashCode();
            financial.atomic.transact.Config.UserAction userAction = this.action;
            int hashCode5 = userAction == null ? 0 : userAction.hashCode();
            java.util.List<java.lang.String> list2 = this.apps;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (list2 != null ? list2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof financial.atomic.transact.Config.TaskData)) {
                return false;
            }
            financial.atomic.transact.Config.TaskData taskData = (financial.atomic.transact.Config.TaskData) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.product, taskData.product) && kotlin.jvm.internal.Intrinsics.areEqual(this.distribution, taskData.distribution) && kotlin.jvm.internal.Intrinsics.areEqual(this.operation, taskData.operation) && kotlin.jvm.internal.Intrinsics.areEqual(this.forms, taskData.forms) && kotlin.jvm.internal.Intrinsics.areEqual(this.action, taskData.action) && kotlin.jvm.internal.Intrinsics.areEqual(this.apps, taskData.apps);
        }

        public final financial.atomic.transact.Config.TaskData copy(java.lang.String product, financial.atomic.transact.Config.Distribution distribution, java.lang.String operation, java.util.List<java.lang.String> forms, financial.atomic.transact.Config.UserAction action, java.util.List<java.lang.String> apps) {
            return new financial.atomic.transact.Config.TaskData(product, distribution, operation, forms, action, apps);
        }

        public final java.util.List<java.lang.String> component6() {
            return this.apps;
        }

        /* renamed from: component5, reason: from getter */
        public final financial.atomic.transact.Config.UserAction getAction() {
            return this.action;
        }

        public final java.util.List<java.lang.String> component4() {
            return this.forms;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getOperation() {
            return this.operation;
        }

        /* renamed from: component2, reason: from getter */
        public final financial.atomic.transact.Config.Distribution getDistribution() {
            return this.distribution;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getProduct() {
            return this.product;
        }

        public static /* synthetic */ financial.atomic.transact.Config.TaskData copy$default(financial.atomic.transact.Config.TaskData taskData, java.lang.String str, financial.atomic.transact.Config.Distribution distribution, java.lang.String str2, java.util.List list, financial.atomic.transact.Config.UserAction userAction, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskData.product;
            }
            if ((i & 2) != 0) {
                distribution = taskData.distribution;
            }
            financial.atomic.transact.Config.Distribution distribution2 = distribution;
            if ((i & 4) != 0) {
                str2 = taskData.operation;
            }
            java.lang.String str3 = str2;
            if ((i & 8) != 0) {
                list = taskData.forms;
            }
            java.util.List list3 = list;
            if ((i & 16) != 0) {
                userAction = taskData.action;
            }
            financial.atomic.transact.Config.UserAction userAction2 = userAction;
            if ((i & 32) != 0) {
                list2 = taskData.apps;
            }
            return taskData.copy(str, distribution2, str3, list3, userAction2, list2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ kotlinx.serialization.KSerializer _childSerializers$_anonymous_$0() {
            return new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ kotlinx.serialization.KSerializer _childSerializers$_anonymous_() {
            return new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J@\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0011J'\u0010%\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u0016"}, d2 = {"Lfinancial/atomic/transact/Config$Theme;", "", "", "brandColor", "overlayColor", "", "dark", "Lfinancial/atomic/transact/Config$NavigationOptions;", "navigationOptions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lfinancial/atomic/transact/Config$NavigationOptions;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lfinancial/atomic/transact/Config$NavigationOptions;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "component4", "()Lfinancial/atomic/transact/Config$NavigationOptions;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lfinancial/atomic/transact/Config$NavigationOptions;)Lfinancial/atomic/transact/Config$Theme;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$transact_release", "(Lfinancial/atomic/transact/Config$Theme;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getBrandColor", "getOverlayColor", "Ljava/lang/Boolean;", "getDark", "Lfinancial/atomic/transact/Config$NavigationOptions;", "getNavigationOptions", "Companion", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Theme {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final financial.atomic.transact.Config.Theme.Companion INSTANCE = new financial.atomic.transact.Config.Theme.Companion(null);
        private final java.lang.String brandColor;
        private final java.lang.Boolean dark;
        private final financial.atomic.transact.Config.NavigationOptions navigationOptions;
        private final java.lang.String overlayColor;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfinancial/atomic/transact/Config$Theme$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$Theme;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes17.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<financial.atomic.transact.Config.Theme> serializer() {
                return financial.atomic.transact.Config$Theme$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Theme() {
            this((java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (financial.atomic.transact.Config.NavigationOptions) null, 15, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$transact_release(financial.atomic.transact.Config.Theme self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.brandColor != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.brandColor);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.overlayColor != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.overlayColor);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.dark != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.dark);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || self.navigationOptions != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, financial.atomic.transact.Config$NavigationOptions$$serializer.INSTANCE, self.navigationOptions);
            }
        }

        public final java.lang.String getBrandColor() {
            return this.brandColor;
        }

        public final java.lang.Boolean getDark() {
            return this.dark;
        }

        public final financial.atomic.transact.Config.NavigationOptions getNavigationOptions() {
            return this.navigationOptions;
        }

        public final java.lang.String getOverlayColor() {
            return this.overlayColor;
        }

        public /* synthetic */ Theme(int i, java.lang.String str, java.lang.String str2, java.lang.Boolean bool, financial.atomic.transact.Config.NavigationOptions navigationOptions, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.brandColor = null;
            } else {
                this.brandColor = str;
            }
            if ((i & 2) == 0) {
                this.overlayColor = null;
            } else {
                this.overlayColor = str2;
            }
            if ((i & 4) == 0) {
                this.dark = null;
            } else {
                this.dark = bool;
            }
            if ((i & 8) == 0) {
                this.navigationOptions = null;
            } else {
                this.navigationOptions = navigationOptions;
            }
        }

        public Theme(java.lang.String str, java.lang.String str2, java.lang.Boolean bool, financial.atomic.transact.Config.NavigationOptions navigationOptions) {
            this.brandColor = str;
            this.overlayColor = str2;
            this.dark = bool;
            this.navigationOptions = navigationOptions;
        }

        public /* synthetic */ Theme(java.lang.String str, java.lang.String str2, java.lang.Boolean bool, financial.atomic.transact.Config.NavigationOptions navigationOptions, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : navigationOptions);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Theme(brandColor=");
            sb.append(this.brandColor);
            sb.append(", overlayColor=");
            sb.append(this.overlayColor);
            sb.append(", dark=");
            sb.append(this.dark);
            sb.append(", navigationOptions=");
            sb.append(this.navigationOptions);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.brandColor;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.overlayColor;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.Boolean bool = this.dark;
            int hashCode3 = bool == null ? 0 : bool.hashCode();
            financial.atomic.transact.Config.NavigationOptions navigationOptions = this.navigationOptions;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (navigationOptions != null ? navigationOptions.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof financial.atomic.transact.Config.Theme)) {
                return false;
            }
            financial.atomic.transact.Config.Theme theme = (financial.atomic.transact.Config.Theme) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.brandColor, theme.brandColor) && kotlin.jvm.internal.Intrinsics.areEqual(this.overlayColor, theme.overlayColor) && kotlin.jvm.internal.Intrinsics.areEqual(this.dark, theme.dark) && kotlin.jvm.internal.Intrinsics.areEqual(this.navigationOptions, theme.navigationOptions);
        }

        public final financial.atomic.transact.Config.Theme copy(java.lang.String brandColor, java.lang.String overlayColor, java.lang.Boolean dark, financial.atomic.transact.Config.NavigationOptions navigationOptions) {
            return new financial.atomic.transact.Config.Theme(brandColor, overlayColor, dark, navigationOptions);
        }

        /* renamed from: component4, reason: from getter */
        public final financial.atomic.transact.Config.NavigationOptions getNavigationOptions() {
            return this.navigationOptions;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Boolean getDark() {
            return this.dark;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getOverlayColor() {
            return this.overlayColor;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getBrandColor() {
            return this.brandColor;
        }

        public static /* synthetic */ financial.atomic.transact.Config.Theme copy$default(financial.atomic.transact.Config.Theme theme, java.lang.String str, java.lang.String str2, java.lang.Boolean bool, financial.atomic.transact.Config.NavigationOptions navigationOptions, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = theme.brandColor;
            }
            if ((i & 2) != 0) {
                str2 = theme.overlayColor;
            }
            if ((i & 4) != 0) {
                bool = theme.dark;
            }
            if ((i & 8) != 0) {
                navigationOptions = theme.navigationOptions;
            }
            return theme.copy(str, str2, bool, navigationOptions);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0003)*(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0010"}, d2 = {"Lfinancial/atomic/transact/Config$TransactAuthStatusUpdate;", "", "Lfinancial/atomic/transact/Config$TransactCompany;", "company", "Lfinancial/atomic/transact/Config$TransactAuthStatusUpdate$AuthStatus;", "status", "<init>", "(Lfinancial/atomic/transact/Config$TransactCompany;Lfinancial/atomic/transact/Config$TransactAuthStatusUpdate$AuthStatus;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILfinancial/atomic/transact/Config$TransactCompany;Lfinancial/atomic/transact/Config$TransactAuthStatusUpdate$AuthStatus;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lfinancial/atomic/transact/Config$TransactCompany;", "component2", "()Lfinancial/atomic/transact/Config$TransactAuthStatusUpdate$AuthStatus;", "copy", "(Lfinancial/atomic/transact/Config$TransactCompany;Lfinancial/atomic/transact/Config$TransactAuthStatusUpdate$AuthStatus;)Lfinancial/atomic/transact/Config$TransactAuthStatusUpdate;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$transact_release", "(Lfinancial/atomic/transact/Config$TransactAuthStatusUpdate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lfinancial/atomic/transact/Config$TransactCompany;", "getCompany", "Lfinancial/atomic/transact/Config$TransactAuthStatusUpdate$AuthStatus;", "getStatus", "Companion", "AuthStatus", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class TransactAuthStatusUpdate {
        private final financial.atomic.transact.Config.TransactCompany company;
        private final financial.atomic.transact.Config.TransactAuthStatusUpdate.AuthStatus status;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final financial.atomic.transact.Config.TransactAuthStatusUpdate.Companion INSTANCE = new financial.atomic.transact.Config.TransactAuthStatusUpdate.Companion(null);
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: financial.atomic.transact.Config$TransactAuthStatusUpdate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer _childSerializers$_anonymous_;
                _childSerializers$_anonymous_ = financial.atomic.transact.Config.TransactAuthStatusUpdate._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            }
        })};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfinancial/atomic/transact/Config$TransactAuthStatusUpdate$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$TransactAuthStatusUpdate;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes17.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<financial.atomic.transact.Config.TransactAuthStatusUpdate> serializer() {
                return financial.atomic.transact.Config$TransactAuthStatusUpdate$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ TransactAuthStatusUpdate(int i, financial.atomic.transact.Config.TransactCompany transactCompany, financial.atomic.transact.Config.TransactAuthStatusUpdate.AuthStatus authStatus, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, financial.atomic.transact.Config$TransactAuthStatusUpdate$$serializer.INSTANCE.getDescriptor());
            }
            this.company = transactCompany;
            this.status = authStatus;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$transact_release(financial.atomic.transact.Config.TransactAuthStatusUpdate self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            output.encodeSerializableElement(serialDesc, 0, financial.atomic.transact.Config$TransactCompany$$serializer.INSTANCE, self.company);
            output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.status);
        }

        public final financial.atomic.transact.Config.TransactCompany getCompany() {
            return this.company;
        }

        public final financial.atomic.transact.Config.TransactAuthStatusUpdate.AuthStatus getStatus() {
            return this.status;
        }

        public TransactAuthStatusUpdate(financial.atomic.transact.Config.TransactCompany transactCompany, financial.atomic.transact.Config.TransactAuthStatusUpdate.AuthStatus authStatus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactCompany, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authStatus, "");
            this.company = transactCompany;
            this.status = authStatus;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactAuthStatusUpdate(company=");
            sb.append(this.company);
            sb.append(", status=");
            sb.append(this.status);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return this.status.hashCode() + (this.company.hashCode() * 31);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof financial.atomic.transact.Config.TransactAuthStatusUpdate)) {
                return false;
            }
            financial.atomic.transact.Config.TransactAuthStatusUpdate transactAuthStatusUpdate = (financial.atomic.transact.Config.TransactAuthStatusUpdate) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.company, transactAuthStatusUpdate.company) && this.status == transactAuthStatusUpdate.status;
        }

        public final financial.atomic.transact.Config.TransactAuthStatusUpdate copy(financial.atomic.transact.Config.TransactCompany company, financial.atomic.transact.Config.TransactAuthStatusUpdate.AuthStatus status) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(company, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new financial.atomic.transact.Config.TransactAuthStatusUpdate(company, status);
        }

        /* renamed from: component2, reason: from getter */
        public final financial.atomic.transact.Config.TransactAuthStatusUpdate.AuthStatus getStatus() {
            return this.status;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005"}, d2 = {"Lfinancial/atomic/transact/Config$TransactAuthStatusUpdate$AuthStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "AUTHENTICATED"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final class AuthStatus {
            private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
            private static final /* synthetic */ financial.atomic.transact.Config.TransactAuthStatusUpdate.AuthStatus[] $VALUES;
            private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

            @kotlinx.serialization.SerialName("authenticated")
            public static final financial.atomic.transact.Config.TransactAuthStatusUpdate.AuthStatus AUTHENTICATED = new financial.atomic.transact.Config.TransactAuthStatusUpdate.AuthStatus("AUTHENTICATED", 0);

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final financial.atomic.transact.Config.TransactAuthStatusUpdate.AuthStatus.Companion INSTANCE;

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfinancial/atomic/transact/Config$TransactAuthStatusUpdate$AuthStatus$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$TransactAuthStatusUpdate$AuthStatus;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* loaded from: classes17.dex */
            public static final class Companion {
                private Companion() {
                }

                private final /* synthetic */ kotlinx.serialization.KSerializer get$cachedSerializer() {
                    return (kotlinx.serialization.KSerializer) financial.atomic.transact.Config.TransactAuthStatusUpdate.AuthStatus.$cachedSerializer$delegate.getValue();
                }

                public final kotlinx.serialization.KSerializer<financial.atomic.transact.Config.TransactAuthStatusUpdate.AuthStatus> serializer() {
                    return get$cachedSerializer();
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            static {
                financial.atomic.transact.Config.TransactAuthStatusUpdate.AuthStatus[] $values = $values();
                $VALUES = $values;
                $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
                INSTANCE = new financial.atomic.transact.Config.TransactAuthStatusUpdate.AuthStatus.Companion(null);
                $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: financial.atomic.transact.Config$TransactAuthStatusUpdate$AuthStatus$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlinx.serialization.KSerializer _init_$_anonymous_;
                        _init_$_anonymous_ = financial.atomic.transact.Config.TransactAuthStatusUpdate.AuthStatus._init_$_anonymous_();
                        return _init_$_anonymous_;
                    }
                });
            }

            private AuthStatus(java.lang.String str, int i) {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ kotlinx.serialization.KSerializer _init_$_anonymous_() {
                return kotlinx.serialization.internal.EnumsKt.createAnnotatedEnumSerializer("financial.atomic.transact.Config.TransactAuthStatusUpdate.AuthStatus", values(), new java.lang.String[]{"authenticated"}, new java.lang.annotation.Annotation[][]{null}, null);
            }

            public static financial.atomic.transact.Config.TransactAuthStatusUpdate.AuthStatus valueOf(java.lang.String str) {
                return (financial.atomic.transact.Config.TransactAuthStatusUpdate.AuthStatus) java.lang.Enum.valueOf(financial.atomic.transact.Config.TransactAuthStatusUpdate.AuthStatus.class, str);
            }

            public static financial.atomic.transact.Config.TransactAuthStatusUpdate.AuthStatus[] values() {
                return (financial.atomic.transact.Config.TransactAuthStatusUpdate.AuthStatus[]) $VALUES.clone();
            }

            public static kotlin.enums.EnumEntries<financial.atomic.transact.Config.TransactAuthStatusUpdate.AuthStatus> getEntries() {
                return $ENTRIES;
            }

            private static final /* synthetic */ financial.atomic.transact.Config.TransactAuthStatusUpdate.AuthStatus[] $values() {
                return new financial.atomic.transact.Config.TransactAuthStatusUpdate.AuthStatus[]{AUTHENTICATED};
            }
        }

        /* renamed from: component1, reason: from getter */
        public final financial.atomic.transact.Config.TransactCompany getCompany() {
            return this.company;
        }

        public static /* synthetic */ financial.atomic.transact.Config.TransactAuthStatusUpdate copy$default(financial.atomic.transact.Config.TransactAuthStatusUpdate transactAuthStatusUpdate, financial.atomic.transact.Config.TransactCompany transactCompany, financial.atomic.transact.Config.TransactAuthStatusUpdate.AuthStatus authStatus, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                transactCompany = transactAuthStatusUpdate.company;
            }
            if ((i & 2) != 0) {
                authStatus = transactAuthStatusUpdate.status;
            }
            return transactAuthStatusUpdate.copy(transactCompany, authStatus);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ kotlinx.serialization.KSerializer _childSerializers$_anonymous_() {
            return financial.atomic.transact.Config.TransactAuthStatusUpdate.AuthStatus.INSTANCE.serializer();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0004)*+(B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0010"}, d2 = {"Lfinancial/atomic/transact/Config$TransactDataResponse;", "", "Lfinancial/atomic/transact/Config$TransactDataResponse$CardData;", "card", "Lfinancial/atomic/transact/Config$TransactDataResponse$Identity;", "identity", "<init>", "(Lfinancial/atomic/transact/Config$TransactDataResponse$CardData;Lfinancial/atomic/transact/Config$TransactDataResponse$Identity;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILfinancial/atomic/transact/Config$TransactDataResponse$CardData;Lfinancial/atomic/transact/Config$TransactDataResponse$Identity;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lfinancial/atomic/transact/Config$TransactDataResponse$CardData;", "component2", "()Lfinancial/atomic/transact/Config$TransactDataResponse$Identity;", "copy", "(Lfinancial/atomic/transact/Config$TransactDataResponse$CardData;Lfinancial/atomic/transact/Config$TransactDataResponse$Identity;)Lfinancial/atomic/transact/Config$TransactDataResponse;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$transact_release", "(Lfinancial/atomic/transact/Config$TransactDataResponse;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lfinancial/atomic/transact/Config$TransactDataResponse$CardData;", "getCard", "Lfinancial/atomic/transact/Config$TransactDataResponse$Identity;", "getIdentity", "Companion", "Identity", "CardData", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class TransactDataResponse {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final financial.atomic.transact.Config.TransactDataResponse.Companion INSTANCE = new financial.atomic.transact.Config.TransactDataResponse.Companion(null);
        private final financial.atomic.transact.Config.TransactDataResponse.CardData card;
        private final financial.atomic.transact.Config.TransactDataResponse.Identity identity;

        @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u001f\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000f0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\r\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ2\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u000e2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ'\u0010-\u001a\u00020,2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0001¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\u001c"}, d2 = {"Lfinancial/atomic/transact/Config$TransactDataResponse$CardData;", "", "", "number", "expiry", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Lkotlin/Pair;", "", "", "validate", "()Lkotlin/Pair;", "cardNumber", "isValidCardNumber", "(Ljava/lang/String;)Z", "isValidExpiry", "isValidCVV", "isValid", "()Z", "getValidationErrors", "()Ljava/util/List;", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lfinancial/atomic/transact/Config$TransactDataResponse$CardData;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$transact_release", "(Lfinancial/atomic/transact/Config$TransactDataResponse$CardData;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getNumber", "getExpiry", "getCvv", "Companion", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class CardData {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final financial.atomic.transact.Config.TransactDataResponse.CardData.Companion INSTANCE = new financial.atomic.transact.Config.TransactDataResponse.CardData.Companion(null);
            private final java.lang.String cvv;
            private final java.lang.String expiry;
            private final java.lang.String number;

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfinancial/atomic/transact/Config$TransactDataResponse$CardData$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$TransactDataResponse$CardData;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* loaded from: classes17.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<financial.atomic.transact.Config.TransactDataResponse.CardData> serializer() {
                    return financial.atomic.transact.Config$TransactDataResponse$CardData$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ CardData(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if (7 != (i & 7)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, financial.atomic.transact.Config$TransactDataResponse$CardData$$serializer.INSTANCE.getDescriptor());
                }
                this.number = str;
                this.expiry = str2;
                this.cvv = str3;
            }

            private final boolean isValidCVV(java.lang.String cvv) {
                int length = cvv.length();
                if (3 <= length && length < 5) {
                    for (int i = 0; i < cvv.length(); i++) {
                        if (java.lang.Character.isDigit(cvv.charAt(i))) {
                        }
                    }
                    return true;
                }
                return false;
            }

            private final boolean isValidCardNumber(java.lang.String cardNumber) {
                java.lang.String replace = new kotlin.text.Regex("\\D").replace(cardNumber, "");
                int length = replace.length();
                if (13 <= length && length < 20) {
                    for (int i = 0; i < replace.length(); i++) {
                        if (java.lang.Character.isDigit(replace.charAt(i))) {
                        }
                    }
                    return true;
                }
                return false;
            }

            private final boolean isValidExpiry(java.lang.String expiry) {
                return new kotlin.text.Regex("^\\d{2}/\\d{2}$").matches(expiry);
            }

            @kotlin.jvm.JvmStatic
            public static final /* synthetic */ void write$Self$transact_release(financial.atomic.transact.Config.TransactDataResponse.CardData self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                output.encodeStringElement(serialDesc, 0, self.number);
                kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
                output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.expiry);
                output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.cvv);
            }

            public final java.lang.String getCvv() {
                return this.cvv;
            }

            public final java.lang.String getExpiry() {
                return this.expiry;
            }

            public final java.lang.String getNumber() {
                return this.number;
            }

            public final java.util.List<java.lang.String> getValidationErrors() {
                return validate().getSecond();
            }

            public final boolean isValid() {
                return validate().getFirst().booleanValue();
            }

            public final kotlin.Pair<java.lang.Boolean, java.util.List<java.lang.String>> validate() {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (kotlin.text.StringsKt.isBlank(this.number)) {
                    arrayList.add("Card number cannot be empty");
                } else if (!isValidCardNumber(this.number)) {
                    arrayList.add("Invalid card number format");
                }
                java.lang.String str = this.expiry;
                if (str != null) {
                    if (kotlin.text.StringsKt.isBlank(str)) {
                        arrayList.add("Expiry date cannot be empty");
                    } else if (!isValidExpiry(this.expiry)) {
                        arrayList.add("Invalid expiry date format (should be MM/YY)");
                    }
                }
                java.lang.String str2 = this.cvv;
                if (str2 != null) {
                    if (kotlin.text.StringsKt.isBlank(str2)) {
                        arrayList.add("CVV cannot be empty");
                    } else if (!isValidCVV(this.cvv)) {
                        arrayList.add("Invalid CVV format");
                    }
                }
                return new kotlin.Pair<>(java.lang.Boolean.valueOf(arrayList.isEmpty()), arrayList);
            }

            public CardData(java.lang.String str, java.lang.String str2, java.lang.String str3) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.number = str;
                this.expiry = str2;
                this.cvv = str3;
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("CardData(number=");
                sb.append(this.number);
                sb.append(", expiry=");
                sb.append(this.expiry);
                sb.append(", cvv=");
                sb.append(this.cvv);
                sb.append(')');
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.number.hashCode();
                java.lang.String str = this.expiry;
                int hashCode2 = str == null ? 0 : str.hashCode();
                java.lang.String str2 = this.cvv;
                return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof financial.atomic.transact.Config.TransactDataResponse.CardData)) {
                    return false;
                }
                financial.atomic.transact.Config.TransactDataResponse.CardData cardData = (financial.atomic.transact.Config.TransactDataResponse.CardData) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.number, cardData.number) && kotlin.jvm.internal.Intrinsics.areEqual(this.expiry, cardData.expiry) && kotlin.jvm.internal.Intrinsics.areEqual(this.cvv, cardData.cvv);
            }

            public final financial.atomic.transact.Config.TransactDataResponse.CardData copy(java.lang.String number, java.lang.String expiry, java.lang.String cvv) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number, "");
                return new financial.atomic.transact.Config.TransactDataResponse.CardData(number, expiry, cvv);
            }

            /* renamed from: component3, reason: from getter */
            public final java.lang.String getCvv() {
                return this.cvv;
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getExpiry() {
                return this.expiry;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getNumber() {
                return this.number;
            }

            public static /* synthetic */ financial.atomic.transact.Config.TransactDataResponse.CardData copy$default(financial.atomic.transact.Config.TransactDataResponse.CardData cardData, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = cardData.number;
                }
                if ((i & 2) != 0) {
                    str2 = cardData.expiry;
                }
                if ((i & 4) != 0) {
                    str3 = cardData.cvv;
                }
                return cardData.copy(str, str2, str3);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfinancial/atomic/transact/Config$TransactDataResponse$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$TransactDataResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes17.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<financial.atomic.transact.Config.TransactDataResponse> serializer() {
                return financial.atomic.transact.Config$TransactDataResponse$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rBu\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J\u001f\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00150\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001dJ|\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00142\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u001dJ'\u00104\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001¢\u0006\u0004\b4\u00105R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u001dR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b9\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b:\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b;\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b<\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b=\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b>\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b?\u0010\u001d"}, d2 = {"Lfinancial/atomic/transact/Config$TransactDataResponse$Identity;", "", "", "firstName", "lastName", androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE, "address", "address2", com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ModuleCity, "state", "phone", "email", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Lkotlin/Pair;", "", "", "validate", "()Lkotlin/Pair;", "isValidPostalCode", "(Ljava/lang/String;)Z", "isValid", "()Z", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lfinancial/atomic/transact/Config$TransactDataResponse$Identity;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$transact_release", "(Lfinancial/atomic/transact/Config$TransactDataResponse$Identity;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getFirstName", "getLastName", "getPostalCode", "getAddress", "getAddress2", "getCity", "getState", "getPhone", "getEmail", "Companion", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class Identity {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final financial.atomic.transact.Config.TransactDataResponse.Identity.Companion INSTANCE = new financial.atomic.transact.Config.TransactDataResponse.Identity.Companion(null);
            private final java.lang.String address;
            private final java.lang.String address2;
            private final java.lang.String city;
            private final java.lang.String email;
            private final java.lang.String firstName;
            private final java.lang.String lastName;
            private final java.lang.String phone;
            private final java.lang.String postalCode;
            private final java.lang.String state;

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfinancial/atomic/transact/Config$TransactDataResponse$Identity$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$TransactDataResponse$Identity;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* loaded from: classes17.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<financial.atomic.transact.Config.TransactDataResponse.Identity> serializer() {
                    return financial.atomic.transact.Config$TransactDataResponse$Identity$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public Identity() {
                this((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 511, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            }

            private final boolean isValidPostalCode(java.lang.String postalCode) {
                int length = postalCode.length();
                return 5 <= length && length < 11;
            }

            @kotlin.jvm.JvmStatic
            public static final /* synthetic */ void write$Self$transact_release(financial.atomic.transact.Config.TransactDataResponse.Identity self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                if (output.shouldEncodeElementDefault(serialDesc, 0) || self.firstName != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.firstName);
                }
                if (output.shouldEncodeElementDefault(serialDesc, 1) || self.lastName != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.lastName);
                }
                if (output.shouldEncodeElementDefault(serialDesc, 2) || self.postalCode != null) {
                    output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.postalCode);
                }
                if (output.shouldEncodeElementDefault(serialDesc, 3) || self.address != null) {
                    output.encodeNullableSerializableElement(serialDesc, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.address);
                }
                if (output.shouldEncodeElementDefault(serialDesc, 4) || self.address2 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.address2);
                }
                if (output.shouldEncodeElementDefault(serialDesc, 5) || self.city != null) {
                    output.encodeNullableSerializableElement(serialDesc, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.city);
                }
                if (output.shouldEncodeElementDefault(serialDesc, 6) || self.state != null) {
                    output.encodeNullableSerializableElement(serialDesc, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.state);
                }
                if (output.shouldEncodeElementDefault(serialDesc, 7) || self.phone != null) {
                    output.encodeNullableSerializableElement(serialDesc, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.phone);
                }
                if (output.shouldEncodeElementDefault(serialDesc, 8) || self.email != null) {
                    output.encodeNullableSerializableElement(serialDesc, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.email);
                }
            }

            public final java.lang.String getAddress() {
                return this.address;
            }

            public final java.lang.String getAddress2() {
                return this.address2;
            }

            public final java.lang.String getCity() {
                return this.city;
            }

            public final java.lang.String getEmail() {
                return this.email;
            }

            public final java.lang.String getFirstName() {
                return this.firstName;
            }

            public final java.lang.String getLastName() {
                return this.lastName;
            }

            public final java.lang.String getPhone() {
                return this.phone;
            }

            public final java.lang.String getPostalCode() {
                return this.postalCode;
            }

            public final java.lang.String getState() {
                return this.state;
            }

            public final boolean isValid() {
                return validate().getFirst().booleanValue();
            }

            public final kotlin.Pair<java.lang.Boolean, java.util.List<java.lang.String>> validate() {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.String str = this.firstName;
                if (str != null && !kotlin.text.StringsKt.isBlank(str) && this.firstName.length() > 50) {
                    arrayList.add("First name must be less than 50 characters");
                }
                java.lang.String str2 = this.lastName;
                if (str2 != null && !kotlin.text.StringsKt.isBlank(str2) && this.lastName.length() > 50) {
                    arrayList.add("Last name must be less than 50 characters");
                }
                java.lang.String str3 = this.address;
                if (str3 != null && !kotlin.text.StringsKt.isBlank(str3) && this.address.length() > 100) {
                    arrayList.add("Address must be less than 100 characters");
                }
                java.lang.String str4 = this.address2;
                if (str4 != null && !kotlin.text.StringsKt.isBlank(str4) && this.address2.length() > 100) {
                    arrayList.add("Address line 2 must be less than 100 characters");
                }
                java.lang.String str5 = this.city;
                if (str5 != null && !kotlin.text.StringsKt.isBlank(str5) && this.city.length() > 100) {
                    arrayList.add("City must be less than 100 characters");
                }
                java.lang.String str6 = this.state;
                if (str6 != null && !kotlin.text.StringsKt.isBlank(str6) && this.state.length() != 2) {
                    arrayList.add("Invalid state code");
                }
                java.lang.String str7 = this.postalCode;
                if (str7 != null && !kotlin.text.StringsKt.isBlank(str7) && !isValidPostalCode(this.postalCode)) {
                    arrayList.add("Invalid postal code format");
                }
                java.lang.String str8 = this.phone;
                if (str8 != null && !kotlin.text.StringsKt.isBlank(str8) && this.phone.length() > 15) {
                    arrayList.add("Invalid phone number format");
                }
                java.lang.String str9 = this.email;
                if (str9 != null && !kotlin.text.StringsKt.isBlank(str9) && this.email.length() > 50) {
                    arrayList.add("Email must be less than 50 characters");
                }
                return new kotlin.Pair<>(java.lang.Boolean.valueOf(arrayList.isEmpty()), arrayList);
            }

            public /* synthetic */ Identity(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.firstName = null;
                } else {
                    this.firstName = str;
                }
                if ((i & 2) == 0) {
                    this.lastName = null;
                } else {
                    this.lastName = str2;
                }
                if ((i & 4) == 0) {
                    this.postalCode = null;
                } else {
                    this.postalCode = str3;
                }
                if ((i & 8) == 0) {
                    this.address = null;
                } else {
                    this.address = str4;
                }
                if ((i & 16) == 0) {
                    this.address2 = null;
                } else {
                    this.address2 = str5;
                }
                if ((i & 32) == 0) {
                    this.city = null;
                } else {
                    this.city = str6;
                }
                if ((i & 64) == 0) {
                    this.state = null;
                } else {
                    this.state = str7;
                }
                if ((i & 128) == 0) {
                    this.phone = null;
                } else {
                    this.phone = str8;
                }
                if ((i & 256) == 0) {
                    this.email = null;
                } else {
                    this.email = str9;
                }
            }

            public Identity(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9) {
                this.firstName = str;
                this.lastName = str2;
                this.postalCode = str3;
                this.address = str4;
                this.address2 = str5;
                this.city = str6;
                this.state = str7;
                this.phone = str8;
                this.email = str9;
            }

            public /* synthetic */ Identity(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) == 0 ? str9 : null);
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Identity(firstName=");
                sb.append(this.firstName);
                sb.append(", lastName=");
                sb.append(this.lastName);
                sb.append(", postalCode=");
                sb.append(this.postalCode);
                sb.append(", address=");
                sb.append(this.address);
                sb.append(", address2=");
                sb.append(this.address2);
                sb.append(", city=");
                sb.append(this.city);
                sb.append(", state=");
                sb.append(this.state);
                sb.append(", phone=");
                sb.append(this.phone);
                sb.append(", email=");
                sb.append(this.email);
                sb.append(')');
                return sb.toString();
            }

            public final int hashCode() {
                java.lang.String str = this.firstName;
                int hashCode = str == null ? 0 : str.hashCode();
                java.lang.String str2 = this.lastName;
                int hashCode2 = str2 == null ? 0 : str2.hashCode();
                java.lang.String str3 = this.postalCode;
                int hashCode3 = str3 == null ? 0 : str3.hashCode();
                java.lang.String str4 = this.address;
                int hashCode4 = str4 == null ? 0 : str4.hashCode();
                java.lang.String str5 = this.address2;
                int hashCode5 = str5 == null ? 0 : str5.hashCode();
                java.lang.String str6 = this.city;
                int hashCode6 = str6 == null ? 0 : str6.hashCode();
                java.lang.String str7 = this.state;
                int hashCode7 = str7 == null ? 0 : str7.hashCode();
                java.lang.String str8 = this.phone;
                int hashCode8 = str8 == null ? 0 : str8.hashCode();
                java.lang.String str9 = this.email;
                return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (str9 != null ? str9.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof financial.atomic.transact.Config.TransactDataResponse.Identity)) {
                    return false;
                }
                financial.atomic.transact.Config.TransactDataResponse.Identity identity = (financial.atomic.transact.Config.TransactDataResponse.Identity) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.firstName, identity.firstName) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastName, identity.lastName) && kotlin.jvm.internal.Intrinsics.areEqual(this.postalCode, identity.postalCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, identity.address) && kotlin.jvm.internal.Intrinsics.areEqual(this.address2, identity.address2) && kotlin.jvm.internal.Intrinsics.areEqual(this.city, identity.city) && kotlin.jvm.internal.Intrinsics.areEqual(this.state, identity.state) && kotlin.jvm.internal.Intrinsics.areEqual(this.phone, identity.phone) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, identity.email);
            }

            public final financial.atomic.transact.Config.TransactDataResponse.Identity copy(java.lang.String firstName, java.lang.String lastName, java.lang.String postalCode, java.lang.String address, java.lang.String address2, java.lang.String city, java.lang.String state, java.lang.String phone, java.lang.String email) {
                return new financial.atomic.transact.Config.TransactDataResponse.Identity(firstName, lastName, postalCode, address, address2, city, state, phone, email);
            }

            /* renamed from: component9, reason: from getter */
            public final java.lang.String getEmail() {
                return this.email;
            }

            /* renamed from: component8, reason: from getter */
            public final java.lang.String getPhone() {
                return this.phone;
            }

            /* renamed from: component7, reason: from getter */
            public final java.lang.String getState() {
                return this.state;
            }

            /* renamed from: component6, reason: from getter */
            public final java.lang.String getCity() {
                return this.city;
            }

            /* renamed from: component5, reason: from getter */
            public final java.lang.String getAddress2() {
                return this.address2;
            }

            /* renamed from: component4, reason: from getter */
            public final java.lang.String getAddress() {
                return this.address;
            }

            /* renamed from: component3, reason: from getter */
            public final java.lang.String getPostalCode() {
                return this.postalCode;
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getLastName() {
                return this.lastName;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getFirstName() {
                return this.firstName;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TransactDataResponse() {
            this((financial.atomic.transact.Config.TransactDataResponse.CardData) null, (financial.atomic.transact.Config.TransactDataResponse.Identity) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$transact_release(financial.atomic.transact.Config.TransactDataResponse self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.card != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, financial.atomic.transact.Config$TransactDataResponse$CardData$$serializer.INSTANCE, self.card);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.identity != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, financial.atomic.transact.Config$TransactDataResponse$Identity$$serializer.INSTANCE, self.identity);
            }
        }

        public final financial.atomic.transact.Config.TransactDataResponse.CardData getCard() {
            return this.card;
        }

        public final financial.atomic.transact.Config.TransactDataResponse.Identity getIdentity() {
            return this.identity;
        }

        public /* synthetic */ TransactDataResponse(int i, financial.atomic.transact.Config.TransactDataResponse.CardData cardData, financial.atomic.transact.Config.TransactDataResponse.Identity identity, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.card = null;
            } else {
                this.card = cardData;
            }
            if ((i & 2) == 0) {
                this.identity = null;
            } else {
                this.identity = identity;
            }
        }

        public TransactDataResponse(financial.atomic.transact.Config.TransactDataResponse.CardData cardData, financial.atomic.transact.Config.TransactDataResponse.Identity identity) {
            this.card = cardData;
            this.identity = identity;
        }

        public /* synthetic */ TransactDataResponse(financial.atomic.transact.Config.TransactDataResponse.CardData cardData, financial.atomic.transact.Config.TransactDataResponse.Identity identity, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : cardData, (i & 2) != 0 ? null : identity);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactDataResponse(card=");
            sb.append(this.card);
            sb.append(", identity=");
            sb.append(this.identity);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            financial.atomic.transact.Config.TransactDataResponse.CardData cardData = this.card;
            int hashCode = cardData == null ? 0 : cardData.hashCode();
            financial.atomic.transact.Config.TransactDataResponse.Identity identity = this.identity;
            return (hashCode * 31) + (identity != null ? identity.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof financial.atomic.transact.Config.TransactDataResponse)) {
                return false;
            }
            financial.atomic.transact.Config.TransactDataResponse transactDataResponse = (financial.atomic.transact.Config.TransactDataResponse) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.card, transactDataResponse.card) && kotlin.jvm.internal.Intrinsics.areEqual(this.identity, transactDataResponse.identity);
        }

        public final financial.atomic.transact.Config.TransactDataResponse copy(financial.atomic.transact.Config.TransactDataResponse.CardData card, financial.atomic.transact.Config.TransactDataResponse.Identity identity) {
            return new financial.atomic.transact.Config.TransactDataResponse(card, identity);
        }

        /* renamed from: component2, reason: from getter */
        public final financial.atomic.transact.Config.TransactDataResponse.Identity getIdentity() {
            return this.identity;
        }

        /* renamed from: component1, reason: from getter */
        public final financial.atomic.transact.Config.TransactDataResponse.CardData getCard() {
            return this.card;
        }

        public static /* synthetic */ financial.atomic.transact.Config.TransactDataResponse copy$default(financial.atomic.transact.Config.TransactDataResponse transactDataResponse, financial.atomic.transact.Config.TransactDataResponse.CardData cardData, financial.atomic.transact.Config.TransactDataResponse.Identity identity, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cardData = transactDataResponse.card;
            }
            if ((i & 2) != 0) {
                identity = transactDataResponse.identity;
            }
            return transactDataResponse.copy(cardData, identity);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002! B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\f"}, d2 = {"Lfinancial/atomic/transact/Config$UserAction;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lfinancial/atomic/transact/Config$UserAction;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$transact_release", "(Lfinancial/atomic/transact/Config$UserAction;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getId", "Companion", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class UserAction {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final financial.atomic.transact.Config.UserAction.Companion INSTANCE = new financial.atomic.transact.Config.UserAction.Companion(null);
        private final java.lang.String id;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfinancial/atomic/transact/Config$UserAction$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$UserAction;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes17.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<financial.atomic.transact.Config.UserAction> serializer() {
                return financial.atomic.transact.Config$UserAction$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ UserAction(int i, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, financial.atomic.transact.Config$UserAction$$serializer.INSTANCE.getDescriptor());
            }
            this.id = str;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public UserAction(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UserAction(id=");
            sb.append(this.id);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof financial.atomic.transact.Config.UserAction) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((financial.atomic.transact.Config.UserAction) other).id);
        }

        public final financial.atomic.transact.Config.UserAction copy(java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new financial.atomic.transact.Config.UserAction(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ financial.atomic.transact.Config.UserAction copy$default(financial.atomic.transact.Config.UserAction userAction, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = userAction.id;
            }
            return userAction.copy(str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, financial.atomic.transact.Config.Product product) {
        this(str, product, (financial.atomic.transact.Config.Environment) null, (java.lang.String) null, (financial.atomic.transact.Config.Product) null, (financial.atomic.transact.Config.Distribution) null, (financial.atomic.transact.Config.Theme) null, (financial.atomic.transact.Config.Deeplink) null, (org.json.JSONObject) null, (financial.atomic.transact.Config.Language) null, (financial.atomic.transact.Config.Search) null, (java.util.List) null, (financial.atomic.transact.Config.Experiments) null, false, false, false, (financial.atomic.transact.Config.Scope) null, (java.lang.String) null, (financial.atomic.transact.Config.Product) null, (financial.atomic.transact.Config.Customer) null, (financial.atomic.transact.Config.Features) null, (java.lang.String) null, (financial.atomic.transact.Config.DeferredPaymentMethodStrategy) null, 8388604, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
    }

    public final financial.atomic.transact.Config.Product getAdditionalProduct() {
        return this.additionalProduct;
    }

    public final boolean getClearCookies() {
        return this.clearCookies;
    }

    public final financial.atomic.transact.Config.Customer getCustomer() {
        return this.customer;
    }

    public final financial.atomic.transact.Config.Deeplink getDeeplink() {
        return this.deeplink;
    }

    public final financial.atomic.transact.Config.DeferredPaymentMethodStrategy getDeferredPaymentMethodStrategy() {
        return this.deferredPaymentMethodStrategy;
    }

    public final financial.atomic.transact.Config.Distribution getDistribution() {
        return this.distribution;
    }

    public final financial.atomic.transact.Config.Environment getEnvironment() {
        return this.environment;
    }

    public final java.lang.String getEnvironmentURL() {
        return this.environmentURL;
    }

    public final financial.atomic.transact.Config.Experiments getExperiments() {
        return this.experiments;
    }

    public final financial.atomic.transact.Config.Features getFeatures() {
        return this.features;
    }

    public final java.util.List<financial.atomic.transact.Config.Handoff> getHandoff() {
        return this.handoff;
    }

    public final financial.atomic.transact.Config.Language getLanguage() {
        return this.language;
    }

    public final java.lang.String getLinkedAccount() {
        return this.linkedAccount;
    }

    public final org.json.JSONObject getMetadata() {
        return this.metadata;
    }

    public final boolean getNativeAuthentication() {
        return this.nativeAuthentication;
    }

    public final financial.atomic.transact.Config.Product getOperation() {
        return this.operation;
    }

    public final financial.atomic.transact.Config.Product getProduct() {
        return this.product;
    }

    public final java.lang.String getPublicToken() {
        return this.publicToken;
    }

    public final financial.atomic.transact.Config.Scope getScope() {
        return this.scope;
    }

    public final financial.atomic.transact.Config.Search getSearch() {
        return this.search;
    }

    public final java.lang.String getSessionContext() {
        return this.sessionContext;
    }

    public final java.util.List<financial.atomic.transact.Config.Task> getTasks() {
        return this.tasks;
    }

    public final financial.atomic.transact.Config.Theme getTheme() {
        return this.theme;
    }

    public final boolean getWebContentsDebuggingEnabled() {
        return this.webContentsDebuggingEnabled;
    }

    public final java.lang.String token() {
        java.lang.String str = this._token;
        if (str != null) {
            return str;
        }
        kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
        financial.atomic.transact.Config.TokenData tokenData = this._tokenData;
        companion.getSerializersModule();
        return financial.atomic.transact.util.B64Kt.b64Encode$default(companion.encodeToString(financial.atomic.transact.Config.TokenData.INSTANCE.serializer(), tokenData), 0, 1, (java.lang.Object) null);
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0003,-+B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000fJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b(\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0012"}, d2 = {"Lfinancial/atomic/transact/Config$TransactCompany;", "", "", "id", "name", "Lfinancial/atomic/transact/Config$TransactCompany$Branding;", "branding", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lfinancial/atomic/transact/Config$TransactCompany$Branding;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lfinancial/atomic/transact/Config$TransactCompany$Branding;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lfinancial/atomic/transact/Config$TransactCompany$Branding;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lfinancial/atomic/transact/Config$TransactCompany$Branding;)Lfinancial/atomic/transact/Config$TransactCompany;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$transact_release", "(Lfinancial/atomic/transact/Config$TransactCompany;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getName", "Lfinancial/atomic/transact/Config$TransactCompany$Branding;", "getBranding", "Companion", "Branding", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class TransactCompany {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final financial.atomic.transact.Config.TransactCompany.Companion INSTANCE = new financial.atomic.transact.Config.TransactCompany.Companion(null);
        private final financial.atomic.transact.Config.TransactCompany.Branding branding;
        private final java.lang.String id;
        private final java.lang.String name;

        @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0003'(&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eJ'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0010"}, d2 = {"Lfinancial/atomic/transact/Config$TransactCompany$Branding;", "", "", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Lfinancial/atomic/transact/Config$TransactCompany$Branding$Logo;", "logo", "<init>", "(Ljava/lang/String;Lfinancial/atomic/transact/Config$TransactCompany$Branding$Logo;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lfinancial/atomic/transact/Config$TransactCompany$Branding$Logo;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lfinancial/atomic/transact/Config$TransactCompany$Branding$Logo;", "copy", "(Ljava/lang/String;Lfinancial/atomic/transact/Config$TransactCompany$Branding$Logo;)Lfinancial/atomic/transact/Config$TransactCompany$Branding;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$transact_release", "(Lfinancial/atomic/transact/Config$TransactCompany$Branding;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getColor", "Lfinancial/atomic/transact/Config$TransactCompany$Branding$Logo;", "getLogo", "Companion", com.paypal.oslo.feature.cryptocurrency.ui.receive.components.ReceiveQRCodeCardTestTag.LOGO, "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class Branding {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final financial.atomic.transact.Config.TransactCompany.Branding.Companion INSTANCE = new financial.atomic.transact.Config.TransactCompany.Branding.Companion(null);
            private final java.lang.String color;
            private final financial.atomic.transact.Config.TransactCompany.Branding.Logo logo;

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfinancial/atomic/transact/Config$TransactCompany$Branding$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$TransactCompany$Branding;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* loaded from: classes17.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<financial.atomic.transact.Config.TransactCompany.Branding> serializer() {
                    return financial.atomic.transact.Config$TransactCompany$Branding$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Branding(int i, java.lang.String str, financial.atomic.transact.Config.TransactCompany.Branding.Logo logo, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, financial.atomic.transact.Config$TransactCompany$Branding$$serializer.INSTANCE.getDescriptor());
                }
                this.color = str;
                this.logo = logo;
            }

            @kotlin.jvm.JvmStatic
            public static final /* synthetic */ void write$Self$transact_release(financial.atomic.transact.Config.TransactCompany.Branding self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                output.encodeStringElement(serialDesc, 0, self.color);
                output.encodeSerializableElement(serialDesc, 1, financial.atomic.transact.Config$TransactCompany$Branding$Logo$$serializer.INSTANCE, self.logo);
            }

            public final java.lang.String getColor() {
                return this.color;
            }

            public final financial.atomic.transact.Config.TransactCompany.Branding.Logo getLogo() {
                return this.logo;
            }

            @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ&\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\r"}, d2 = {"Lfinancial/atomic/transact/Config$TransactCompany$Branding$Logo;", "", "", "url", "backgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lfinancial/atomic/transact/Config$TransactCompany$Branding$Logo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$transact_release", "(Lfinancial/atomic/transact/Config$TransactCompany$Branding$Logo;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getUrl", "getBackgroundColor", "Companion", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
            @kotlinx.serialization.Serializable
            public static final /* data */ class Logo {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final financial.atomic.transact.Config.TransactCompany.Branding.Logo.Companion INSTANCE = new financial.atomic.transact.Config.TransactCompany.Branding.Logo.Companion(null);
                private final java.lang.String backgroundColor;
                private final java.lang.String url;

                @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfinancial/atomic/transact/Config$TransactCompany$Branding$Logo$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$TransactCompany$Branding$Logo;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
                /* loaded from: classes17.dex */
                public static final class Companion {
                    private Companion() {
                    }

                    public final kotlinx.serialization.KSerializer<financial.atomic.transact.Config.TransactCompany.Branding.Logo> serializer() {
                        return financial.atomic.transact.Config$TransactCompany$Branding$Logo$$serializer.INSTANCE;
                    }

                    public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }
                }

                public /* synthetic */ Logo(int i, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                    if (1 != (i & 1)) {
                        kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, financial.atomic.transact.Config$TransactCompany$Branding$Logo$$serializer.INSTANCE.getDescriptor());
                    }
                    this.url = str;
                    if ((i & 2) == 0) {
                        this.backgroundColor = null;
                    } else {
                        this.backgroundColor = str2;
                    }
                }

                @kotlin.jvm.JvmStatic
                public static final /* synthetic */ void write$Self$transact_release(financial.atomic.transact.Config.TransactCompany.Branding.Logo self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                    output.encodeStringElement(serialDesc, 0, self.url);
                    if (output.shouldEncodeElementDefault(serialDesc, 1) || self.backgroundColor != null) {
                        output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.backgroundColor);
                    }
                }

                public final java.lang.String getBackgroundColor() {
                    return this.backgroundColor;
                }

                public final java.lang.String getUrl() {
                    return this.url;
                }

                public Logo(java.lang.String str, java.lang.String str2) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                    this.url = str;
                    this.backgroundColor = str2;
                }

                public /* synthetic */ Logo(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, (i & 2) != 0 ? null : str2);
                }

                public final java.lang.String toString() {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Logo(url=");
                    sb.append(this.url);
                    sb.append(", backgroundColor=");
                    sb.append(this.backgroundColor);
                    sb.append(')');
                    return sb.toString();
                }

                public final int hashCode() {
                    int hashCode = this.url.hashCode();
                    java.lang.String str = this.backgroundColor;
                    return (hashCode * 31) + (str == null ? 0 : str.hashCode());
                }

                public final boolean equals(java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof financial.atomic.transact.Config.TransactCompany.Branding.Logo)) {
                        return false;
                    }
                    financial.atomic.transact.Config.TransactCompany.Branding.Logo logo = (financial.atomic.transact.Config.TransactCompany.Branding.Logo) other;
                    return kotlin.jvm.internal.Intrinsics.areEqual(this.url, logo.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.backgroundColor, logo.backgroundColor);
                }

                public final financial.atomic.transact.Config.TransactCompany.Branding.Logo copy(java.lang.String url, java.lang.String backgroundColor) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
                    return new financial.atomic.transact.Config.TransactCompany.Branding.Logo(url, backgroundColor);
                }

                /* renamed from: component2, reason: from getter */
                public final java.lang.String getBackgroundColor() {
                    return this.backgroundColor;
                }

                /* renamed from: component1, reason: from getter */
                public final java.lang.String getUrl() {
                    return this.url;
                }

                public static /* synthetic */ financial.atomic.transact.Config.TransactCompany.Branding.Logo copy$default(financial.atomic.transact.Config.TransactCompany.Branding.Logo logo, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        str = logo.url;
                    }
                    if ((i & 2) != 0) {
                        str2 = logo.backgroundColor;
                    }
                    return logo.copy(str, str2);
                }
            }

            public Branding(java.lang.String str, financial.atomic.transact.Config.TransactCompany.Branding.Logo logo) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logo, "");
                this.color = str;
                this.logo = logo;
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Branding(color=");
                sb.append(this.color);
                sb.append(", logo=");
                sb.append(this.logo);
                sb.append(')');
                return sb.toString();
            }

            public final int hashCode() {
                return this.logo.hashCode() + (this.color.hashCode() * 31);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof financial.atomic.transact.Config.TransactCompany.Branding)) {
                    return false;
                }
                financial.atomic.transact.Config.TransactCompany.Branding branding = (financial.atomic.transact.Config.TransactCompany.Branding) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.color, branding.color) && kotlin.jvm.internal.Intrinsics.areEqual(this.logo, branding.logo);
            }

            public final financial.atomic.transact.Config.TransactCompany.Branding copy(java.lang.String color, financial.atomic.transact.Config.TransactCompany.Branding.Logo logo) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logo, "");
                return new financial.atomic.transact.Config.TransactCompany.Branding(color, logo);
            }

            /* renamed from: component2, reason: from getter */
            public final financial.atomic.transact.Config.TransactCompany.Branding.Logo getLogo() {
                return this.logo;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getColor() {
                return this.color;
            }

            public static /* synthetic */ financial.atomic.transact.Config.TransactCompany.Branding copy$default(financial.atomic.transact.Config.TransactCompany.Branding branding, java.lang.String str, financial.atomic.transact.Config.TransactCompany.Branding.Logo logo, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = branding.color;
                }
                if ((i & 2) != 0) {
                    logo = branding.logo;
                }
                return branding.copy(str, logo);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfinancial/atomic/transact/Config$TransactCompany$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$TransactCompany;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes17.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<financial.atomic.transact.Config.TransactCompany> serializer() {
                return financial.atomic.transact.Config$TransactCompany$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ TransactCompany(int i, java.lang.String str, java.lang.String str2, financial.atomic.transact.Config.TransactCompany.Branding branding, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, financial.atomic.transact.Config$TransactCompany$$serializer.INSTANCE.getDescriptor());
            }
            this.id = str;
            this.name = str2;
            if ((i & 4) == 0) {
                this.branding = null;
            } else {
                this.branding = branding;
            }
        }

        @kotlinx.serialization.SerialName("_id")
        public static /* synthetic */ void getId$annotations() {
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$transact_release(financial.atomic.transact.Config.TransactCompany self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            output.encodeStringElement(serialDesc, 0, self.id);
            output.encodeStringElement(serialDesc, 1, self.name);
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.branding != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, financial.atomic.transact.Config$TransactCompany$Branding$$serializer.INSTANCE, self.branding);
            }
        }

        public final financial.atomic.transact.Config.TransactCompany.Branding getBranding() {
            return this.branding;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public TransactCompany(java.lang.String str, java.lang.String str2, financial.atomic.transact.Config.TransactCompany.Branding branding) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.id = str;
            this.name = str2;
            this.branding = branding;
        }

        public /* synthetic */ TransactCompany(java.lang.String str, java.lang.String str2, financial.atomic.transact.Config.TransactCompany.Branding branding, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : branding);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactCompany(id=");
            sb.append(this.id);
            sb.append(", name=");
            sb.append(this.name);
            sb.append(", branding=");
            sb.append(this.branding);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.name.hashCode();
            financial.atomic.transact.Config.TransactCompany.Branding branding = this.branding;
            return ((hashCode2 + (hashCode * 31)) * 31) + (branding == null ? 0 : branding.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof financial.atomic.transact.Config.TransactCompany)) {
                return false;
            }
            financial.atomic.transact.Config.TransactCompany transactCompany = (financial.atomic.transact.Config.TransactCompany) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, transactCompany.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, transactCompany.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.branding, transactCompany.branding);
        }

        public final financial.atomic.transact.Config.TransactCompany copy(java.lang.String id, java.lang.String name2, financial.atomic.transact.Config.TransactCompany.Branding branding) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new financial.atomic.transact.Config.TransactCompany(id, name2, branding);
        }

        /* renamed from: component3, reason: from getter */
        public final financial.atomic.transact.Config.TransactCompany.Branding getBranding() {
            return this.branding;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ financial.atomic.transact.Config.TransactCompany copy$default(financial.atomic.transact.Config.TransactCompany transactCompany, java.lang.String str, java.lang.String str2, financial.atomic.transact.Config.TransactCompany.Branding branding, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = transactCompany.id;
            }
            if ((i & 2) != 0) {
                str2 = transactCompany.name;
            }
            if ((i & 4) != 0) {
                branding = transactCompany.branding;
            }
            return transactCompany.copy(str, str2, branding);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Environment environment) {
        this(str, product, environment, (java.lang.String) null, (financial.atomic.transact.Config.Product) null, (financial.atomic.transact.Config.Distribution) null, (financial.atomic.transact.Config.Theme) null, (financial.atomic.transact.Config.Deeplink) null, (org.json.JSONObject) null, (financial.atomic.transact.Config.Language) null, (financial.atomic.transact.Config.Search) null, (java.util.List) null, (financial.atomic.transact.Config.Experiments) null, false, false, false, (financial.atomic.transact.Config.Scope) null, (java.lang.String) null, (financial.atomic.transact.Config.Product) null, (financial.atomic.transact.Config.Customer) null, (financial.atomic.transact.Config.Features) null, (java.lang.String) null, (financial.atomic.transact.Config.DeferredPaymentMethodStrategy) null, 8388600, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Environment environment, java.lang.String str2) {
        this(str, product, environment, str2, (financial.atomic.transact.Config.Product) null, (financial.atomic.transact.Config.Distribution) null, (financial.atomic.transact.Config.Theme) null, (financial.atomic.transact.Config.Deeplink) null, (org.json.JSONObject) null, (financial.atomic.transact.Config.Language) null, (financial.atomic.transact.Config.Search) null, (java.util.List) null, (financial.atomic.transact.Config.Experiments) null, false, false, false, (financial.atomic.transact.Config.Scope) null, (java.lang.String) null, (financial.atomic.transact.Config.Product) null, (financial.atomic.transact.Config.Customer) null, (financial.atomic.transact.Config.Features) null, (java.lang.String) null, (financial.atomic.transact.Config.DeferredPaymentMethodStrategy) null, 8388592, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
    }

    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 32\u00020\u0001:\u00044563B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J>\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J'\u0010)\u001a\u00020(2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0001¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010\u0018"}, d2 = {"Lfinancial/atomic/transact/Config$Distribution;", "", "Lfinancial/atomic/transact/Config$Distribution$Type;", "type", "", "amount", "Lfinancial/atomic/transact/Config$Distribution$Action;", "action", "", "canUpdate", "<init>", "(Lfinancial/atomic/transact/Config$Distribution$Type;Ljava/lang/Double;Lfinancial/atomic/transact/Config$Distribution$Action;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILfinancial/atomic/transact/Config$Distribution$Type;Ljava/lang/Double;Lfinancial/atomic/transact/Config$Distribution$Action;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lfinancial/atomic/transact/Config$Distribution$Type;", "component2", "()Ljava/lang/Double;", "component3", "()Lfinancial/atomic/transact/Config$Distribution$Action;", "component4", "()Ljava/lang/Boolean;", "copy", "(Lfinancial/atomic/transact/Config$Distribution$Type;Ljava/lang/Double;Lfinancial/atomic/transact/Config$Distribution$Action;Ljava/lang/Boolean;)Lfinancial/atomic/transact/Config$Distribution;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$transact_release", "(Lfinancial/atomic/transact/Config$Distribution;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lfinancial/atomic/transact/Config$Distribution$Type;", "getType", "Ljava/lang/Double;", "getAmount", "Lfinancial/atomic/transact/Config$Distribution$Action;", "getAction", "Ljava/lang/Boolean;", "getCanUpdate", "Companion", com.miteksystems.misnap.core.MibiData.KEY_MICROPHONE_TYPE, "Action", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Distribution {
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final financial.atomic.transact.Config.Distribution.Companion INSTANCE = new financial.atomic.transact.Config.Distribution.Companion(null);
        private final financial.atomic.transact.Config.Distribution.Action action;
        private final java.lang.Double amount;
        private final java.lang.Boolean canUpdate;
        private final financial.atomic.transact.Config.Distribution.Type type;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfinancial/atomic/transact/Config$Distribution$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$Distribution;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes17.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<financial.atomic.transact.Config.Distribution> serializer() {
                return financial.atomic.transact.Config$Distribution$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            kotlin.LazyThreadSafetyMode lazyThreadSafetyMode = kotlin.LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new kotlin.Lazy[]{kotlin.LazyKt.lazy(lazyThreadSafetyMode, new kotlin.jvm.functions.Function0() { // from class: financial.atomic.transact.Config$Distribution$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlinx.serialization.KSerializer _childSerializers$_anonymous_;
                    _childSerializers$_anonymous_ = financial.atomic.transact.Config.Distribution._childSerializers$_anonymous_();
                    return _childSerializers$_anonymous_;
                }
            }), null, kotlin.LazyKt.lazy(lazyThreadSafetyMode, new kotlin.jvm.functions.Function0() { // from class: financial.atomic.transact.Config$Distribution$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlinx.serialization.KSerializer _childSerializers$_anonymous_$0;
                    _childSerializers$_anonymous_$0 = financial.atomic.transact.Config.Distribution._childSerializers$_anonymous_$0();
                    return _childSerializers$_anonymous_$0;
                }
            }), null};
        }

        public /* synthetic */ Distribution(int i, financial.atomic.transact.Config.Distribution.Type type, java.lang.Double d, financial.atomic.transact.Config.Distribution.Action action, java.lang.Boolean bool, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, financial.atomic.transact.Config$Distribution$$serializer.INSTANCE.getDescriptor());
            }
            this.type = type;
            if ((i & 2) == 0) {
                this.amount = null;
            } else {
                this.amount = d;
            }
            if ((i & 4) == 0) {
                this.action = null;
            } else {
                this.action = action;
            }
            if ((i & 8) == 0) {
                this.canUpdate = null;
            } else {
                this.canUpdate = bool;
            }
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$transact_release(financial.atomic.transact.Config.Distribution self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.type);
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.amount != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.DoubleSerializer.INSTANCE, self.amount);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.action != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.action);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || self.canUpdate != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.canUpdate);
            }
        }

        public final financial.atomic.transact.Config.Distribution.Action getAction() {
            return this.action;
        }

        public final java.lang.Double getAmount() {
            return this.amount;
        }

        public final java.lang.Boolean getCanUpdate() {
            return this.canUpdate;
        }

        public final financial.atomic.transact.Config.Distribution.Type getType() {
            return this.type;
        }

        public Distribution(financial.atomic.transact.Config.Distribution.Type type, java.lang.Double d, financial.atomic.transact.Config.Distribution.Action action, java.lang.Boolean bool) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            this.type = type;
            this.amount = d;
            this.action = action;
            this.canUpdate = bool;
        }

        public /* synthetic */ Distribution(financial.atomic.transact.Config.Distribution.Type type, java.lang.Double d, financial.atomic.transact.Config.Distribution.Action action, java.lang.Boolean bool, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(type, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : action, (i & 8) != 0 ? null : bool);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Distribution(type=");
            sb.append(this.type);
            sb.append(", amount=");
            sb.append(this.amount);
            sb.append(", action=");
            sb.append(this.action);
            sb.append(", canUpdate=");
            sb.append(this.canUpdate);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode();
            java.lang.Double d = this.amount;
            int hashCode2 = d == null ? 0 : d.hashCode();
            financial.atomic.transact.Config.Distribution.Action action = this.action;
            int hashCode3 = action == null ? 0 : action.hashCode();
            java.lang.Boolean bool = this.canUpdate;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (bool != null ? bool.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof financial.atomic.transact.Config.Distribution)) {
                return false;
            }
            financial.atomic.transact.Config.Distribution distribution = (financial.atomic.transact.Config.Distribution) other;
            return this.type == distribution.type && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.amount, (java.lang.Object) distribution.amount) && this.action == distribution.action && kotlin.jvm.internal.Intrinsics.areEqual(this.canUpdate, distribution.canUpdate);
        }

        public final financial.atomic.transact.Config.Distribution copy(financial.atomic.transact.Config.Distribution.Type type, java.lang.Double amount, financial.atomic.transact.Config.Distribution.Action action, java.lang.Boolean canUpdate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new financial.atomic.transact.Config.Distribution(type, amount, action, canUpdate);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Boolean getCanUpdate() {
            return this.canUpdate;
        }

        /* renamed from: component3, reason: from getter */
        public final financial.atomic.transact.Config.Distribution.Action getAction() {
            return this.action;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Double getAmount() {
            return this.amount;
        }

        /* renamed from: component1, reason: from getter */
        public final financial.atomic.transact.Config.Distribution.Type getType() {
            return this.type;
        }

        public static /* synthetic */ financial.atomic.transact.Config.Distribution copy$default(financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Distribution.Type type, java.lang.Double d, financial.atomic.transact.Config.Distribution.Action action, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                type = distribution.type;
            }
            if ((i & 2) != 0) {
                d = distribution.amount;
            }
            if ((i & 4) != 0) {
                action = distribution.action;
            }
            if ((i & 8) != 0) {
                bool = distribution.canUpdate;
            }
            return distribution.copy(type, d, action, bool);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ kotlinx.serialization.KSerializer _childSerializers$_anonymous_$0() {
            return kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("financial.atomic.transact.Config.Distribution.Action", financial.atomic.transact.Config.Distribution.Action.values());
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lfinancial/atomic/transact/Config$Distribution$Action;", "", "<init>", "(Ljava/lang/String;I)V", "create", "update", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action {
            private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
            private static final /* synthetic */ financial.atomic.transact.Config.Distribution.Action[] $VALUES;
            public static final financial.atomic.transact.Config.Distribution.Action create = new financial.atomic.transact.Config.Distribution.Action("create", 0);
            public static final financial.atomic.transact.Config.Distribution.Action update = new financial.atomic.transact.Config.Distribution.Action("update", 1);
            public static final financial.atomic.transact.Config.Distribution.Action delete = new financial.atomic.transact.Config.Distribution.Action(com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, 2);

            static {
                financial.atomic.transact.Config.Distribution.Action[] $values = $values();
                $VALUES = $values;
                $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
            }

            private Action(java.lang.String str, int i) {
            }

            public static financial.atomic.transact.Config.Distribution.Action valueOf(java.lang.String str) {
                return (financial.atomic.transact.Config.Distribution.Action) java.lang.Enum.valueOf(financial.atomic.transact.Config.Distribution.Action.class, str);
            }

            public static financial.atomic.transact.Config.Distribution.Action[] values() {
                return (financial.atomic.transact.Config.Distribution.Action[]) $VALUES.clone();
            }

            public static kotlin.enums.EnumEntries<financial.atomic.transact.Config.Distribution.Action> getEntries() {
                return $ENTRIES;
            }

            private static final /* synthetic */ financial.atomic.transact.Config.Distribution.Action[] $values() {
                return new financial.atomic.transact.Config.Distribution.Action[]{create, update, delete};
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lfinancial/atomic/transact/Config$Distribution$Type;", "", "<init>", "(Ljava/lang/String;I)V", "total", "fixed", "percent"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Type {
            private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
            private static final /* synthetic */ financial.atomic.transact.Config.Distribution.Type[] $VALUES;
            public static final financial.atomic.transact.Config.Distribution.Type total = new financial.atomic.transact.Config.Distribution.Type("total", 0);
            public static final financial.atomic.transact.Config.Distribution.Type fixed = new financial.atomic.transact.Config.Distribution.Type("fixed", 1);
            public static final financial.atomic.transact.Config.Distribution.Type percent = new financial.atomic.transact.Config.Distribution.Type("percent", 2);

            static {
                financial.atomic.transact.Config.Distribution.Type[] $values = $values();
                $VALUES = $values;
                $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
            }

            private Type(java.lang.String str, int i) {
            }

            public static financial.atomic.transact.Config.Distribution.Type valueOf(java.lang.String str) {
                return (financial.atomic.transact.Config.Distribution.Type) java.lang.Enum.valueOf(financial.atomic.transact.Config.Distribution.Type.class, str);
            }

            public static financial.atomic.transact.Config.Distribution.Type[] values() {
                return (financial.atomic.transact.Config.Distribution.Type[]) $VALUES.clone();
            }

            public static kotlin.enums.EnumEntries<financial.atomic.transact.Config.Distribution.Type> getEntries() {
                return $ENTRIES;
            }

            private static final /* synthetic */ financial.atomic.transact.Config.Distribution.Type[] $values() {
                return new financial.atomic.transact.Config.Distribution.Type[]{total, fixed, percent};
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ kotlinx.serialization.KSerializer _childSerializers$_anonymous_() {
            return kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("financial.atomic.transact.Config.Distribution.Type", financial.atomic.transact.Config.Distribution.Type.values());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product2) {
        this(str, product, environment, str2, product2, (financial.atomic.transact.Config.Distribution) null, (financial.atomic.transact.Config.Theme) null, (financial.atomic.transact.Config.Deeplink) null, (org.json.JSONObject) null, (financial.atomic.transact.Config.Language) null, (financial.atomic.transact.Config.Search) null, (java.util.List) null, (financial.atomic.transact.Config.Experiments) null, false, false, false, (financial.atomic.transact.Config.Scope) null, (java.lang.String) null, (financial.atomic.transact.Config.Product) null, (financial.atomic.transact.Config.Customer) null, (financial.atomic.transact.Config.Features) null, (java.lang.String) null, (financial.atomic.transact.Config.DeferredPaymentMethodStrategy) null, 8388576, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
    }

    @kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0006HIJKLGBW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012Bk\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0012\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b%\u0010&Jh\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010\u0019J'\u00106\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b;\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b=\u0010\u001dR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\b?\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b@\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bB\u0010\"R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010C\u001a\u0004\bD\u0010$R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010E\u001a\u0004\bF\u0010&"}, d2 = {"Lfinancial/atomic/transact/Config$TaskStatusUpdate;", "", "", "taskId", "Lfinancial/atomic/transact/Config$Product;", "product", "Lfinancial/atomic/transact/Config$TransactCompany;", "company", "Lfinancial/atomic/transact/Config$TaskStatusUpdate$TaskStatus;", "status", "failReason", "Lfinancial/atomic/transact/Config$TaskStatusUpdate$SwitchData;", "switchData", "Lfinancial/atomic/transact/Config$TaskStatusUpdate$DepositData;", "depositData", "Lfinancial/atomic/transact/Config$TaskStatusUpdate$ManagedBy;", "managedBy", "<init>", "(Ljava/lang/String;Lfinancial/atomic/transact/Config$Product;Lfinancial/atomic/transact/Config$TransactCompany;Lfinancial/atomic/transact/Config$TaskStatusUpdate$TaskStatus;Ljava/lang/String;Lfinancial/atomic/transact/Config$TaskStatusUpdate$SwitchData;Lfinancial/atomic/transact/Config$TaskStatusUpdate$DepositData;Lfinancial/atomic/transact/Config$TaskStatusUpdate$ManagedBy;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lfinancial/atomic/transact/Config$Product;Lfinancial/atomic/transact/Config$TransactCompany;Lfinancial/atomic/transact/Config$TaskStatusUpdate$TaskStatus;Ljava/lang/String;Lfinancial/atomic/transact/Config$TaskStatusUpdate$SwitchData;Lfinancial/atomic/transact/Config$TaskStatusUpdate$DepositData;Lfinancial/atomic/transact/Config$TaskStatusUpdate$ManagedBy;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lfinancial/atomic/transact/Config$Product;", "component3", "()Lfinancial/atomic/transact/Config$TransactCompany;", "component4", "()Lfinancial/atomic/transact/Config$TaskStatusUpdate$TaskStatus;", "component5", "component6", "()Lfinancial/atomic/transact/Config$TaskStatusUpdate$SwitchData;", "component7", "()Lfinancial/atomic/transact/Config$TaskStatusUpdate$DepositData;", "component8", "()Lfinancial/atomic/transact/Config$TaskStatusUpdate$ManagedBy;", "copy", "(Ljava/lang/String;Lfinancial/atomic/transact/Config$Product;Lfinancial/atomic/transact/Config$TransactCompany;Lfinancial/atomic/transact/Config$TaskStatusUpdate$TaskStatus;Ljava/lang/String;Lfinancial/atomic/transact/Config$TaskStatusUpdate$SwitchData;Lfinancial/atomic/transact/Config$TaskStatusUpdate$DepositData;Lfinancial/atomic/transact/Config$TaskStatusUpdate$ManagedBy;)Lfinancial/atomic/transact/Config$TaskStatusUpdate;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$transact_release", "(Lfinancial/atomic/transact/Config$TaskStatusUpdate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getTaskId", "Lfinancial/atomic/transact/Config$Product;", "getProduct", "Lfinancial/atomic/transact/Config$TransactCompany;", "getCompany", "Lfinancial/atomic/transact/Config$TaskStatusUpdate$TaskStatus;", "getStatus", "getFailReason", "Lfinancial/atomic/transact/Config$TaskStatusUpdate$SwitchData;", "getSwitchData", "Lfinancial/atomic/transact/Config$TaskStatusUpdate$DepositData;", "getDepositData", "Lfinancial/atomic/transact/Config$TaskStatusUpdate$ManagedBy;", "getManagedBy", "Companion", "ManagedBy", "TaskStatus", "SwitchData", "DepositData", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class TaskStatusUpdate {
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final financial.atomic.transact.Config.TaskStatusUpdate.Companion INSTANCE = new financial.atomic.transact.Config.TaskStatusUpdate.Companion(null);
        private final financial.atomic.transact.Config.TransactCompany company;
        private final financial.atomic.transact.Config.TaskStatusUpdate.DepositData depositData;
        private final java.lang.String failReason;
        private final financial.atomic.transact.Config.TaskStatusUpdate.ManagedBy managedBy;
        private final financial.atomic.transact.Config.Product product;
        private final financial.atomic.transact.Config.TaskStatusUpdate.TaskStatus status;
        private final financial.atomic.transact.Config.TaskStatusUpdate.SwitchData switchData;
        private final java.lang.String taskId;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfinancial/atomic/transact/Config$TaskStatusUpdate$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$TaskStatusUpdate;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes17.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<financial.atomic.transact.Config.TaskStatusUpdate> serializer() {
                return financial.atomic.transact.Config$TaskStatusUpdate$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012JX\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0012J'\u0010(\u001a\u00020'2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0001¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b/\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b0\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b1\u0010\u0012"}, d2 = {"Lfinancial/atomic/transact/Config$TaskStatusUpdate$DepositData;", "", "", "accountType", "", "distributionAmount", "distributionType", "lastFour", "routingNumber", "title", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Double;", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lfinancial/atomic/transact/Config$TaskStatusUpdate$DepositData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$transact_release", "(Lfinancial/atomic/transact/Config$TaskStatusUpdate$DepositData;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getAccountType", "Ljava/lang/Double;", "getDistributionAmount", "getDistributionType", "getLastFour", "getRoutingNumber", "getTitle", "Companion", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class DepositData {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final financial.atomic.transact.Config.TaskStatusUpdate.DepositData.Companion INSTANCE = new financial.atomic.transact.Config.TaskStatusUpdate.DepositData.Companion(null);
            private final java.lang.String accountType;
            private final java.lang.Double distributionAmount;
            private final java.lang.String distributionType;
            private final java.lang.String lastFour;
            private final java.lang.String routingNumber;
            private final java.lang.String title;

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfinancial/atomic/transact/Config$TaskStatusUpdate$DepositData$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$TaskStatusUpdate$DepositData;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* loaded from: classes17.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<financial.atomic.transact.Config.TaskStatusUpdate.DepositData> serializer() {
                    return financial.atomic.transact.Config$TaskStatusUpdate$DepositData$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public DepositData() {
                this((java.lang.String) null, (java.lang.Double) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 63, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            }

            @kotlin.jvm.JvmStatic
            public static final /* synthetic */ void write$Self$transact_release(financial.atomic.transact.Config.TaskStatusUpdate.DepositData self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                if (output.shouldEncodeElementDefault(serialDesc, 0) || self.accountType != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.accountType);
                }
                if (output.shouldEncodeElementDefault(serialDesc, 1) || self.distributionAmount != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.DoubleSerializer.INSTANCE, self.distributionAmount);
                }
                if (output.shouldEncodeElementDefault(serialDesc, 2) || self.distributionType != null) {
                    output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.distributionType);
                }
                if (output.shouldEncodeElementDefault(serialDesc, 3) || self.lastFour != null) {
                    output.encodeNullableSerializableElement(serialDesc, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.lastFour);
                }
                if (output.shouldEncodeElementDefault(serialDesc, 4) || self.routingNumber != null) {
                    output.encodeNullableSerializableElement(serialDesc, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.routingNumber);
                }
                if (output.shouldEncodeElementDefault(serialDesc, 5) || self.title != null) {
                    output.encodeNullableSerializableElement(serialDesc, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.title);
                }
            }

            public final java.lang.String getAccountType() {
                return this.accountType;
            }

            public final java.lang.Double getDistributionAmount() {
                return this.distributionAmount;
            }

            public final java.lang.String getDistributionType() {
                return this.distributionType;
            }

            public final java.lang.String getLastFour() {
                return this.lastFour;
            }

            public final java.lang.String getRoutingNumber() {
                return this.routingNumber;
            }

            public final java.lang.String getTitle() {
                return this.title;
            }

            public /* synthetic */ DepositData(int i, java.lang.String str, java.lang.Double d, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.accountType = null;
                } else {
                    this.accountType = str;
                }
                if ((i & 2) == 0) {
                    this.distributionAmount = null;
                } else {
                    this.distributionAmount = d;
                }
                if ((i & 4) == 0) {
                    this.distributionType = null;
                } else {
                    this.distributionType = str2;
                }
                if ((i & 8) == 0) {
                    this.lastFour = null;
                } else {
                    this.lastFour = str3;
                }
                if ((i & 16) == 0) {
                    this.routingNumber = null;
                } else {
                    this.routingNumber = str4;
                }
                if ((i & 32) == 0) {
                    this.title = null;
                } else {
                    this.title = str5;
                }
            }

            public DepositData(java.lang.String str, java.lang.Double d, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
                this.accountType = str;
                this.distributionAmount = d;
                this.distributionType = str2;
                this.lastFour = str3;
                this.routingNumber = str4;
                this.title = str5;
            }

            public /* synthetic */ DepositData(java.lang.String str, java.lang.Double d, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("DepositData(accountType=");
                sb.append(this.accountType);
                sb.append(", distributionAmount=");
                sb.append(this.distributionAmount);
                sb.append(", distributionType=");
                sb.append(this.distributionType);
                sb.append(", lastFour=");
                sb.append(this.lastFour);
                sb.append(", routingNumber=");
                sb.append(this.routingNumber);
                sb.append(", title=");
                sb.append(this.title);
                sb.append(')');
                return sb.toString();
            }

            public final int hashCode() {
                java.lang.String str = this.accountType;
                int hashCode = str == null ? 0 : str.hashCode();
                java.lang.Double d = this.distributionAmount;
                int hashCode2 = d == null ? 0 : d.hashCode();
                java.lang.String str2 = this.distributionType;
                int hashCode3 = str2 == null ? 0 : str2.hashCode();
                java.lang.String str3 = this.lastFour;
                int hashCode4 = str3 == null ? 0 : str3.hashCode();
                java.lang.String str4 = this.routingNumber;
                int hashCode5 = str4 == null ? 0 : str4.hashCode();
                java.lang.String str5 = this.title;
                return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str5 != null ? str5.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof financial.atomic.transact.Config.TaskStatusUpdate.DepositData)) {
                    return false;
                }
                financial.atomic.transact.Config.TaskStatusUpdate.DepositData depositData = (financial.atomic.transact.Config.TaskStatusUpdate.DepositData) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.accountType, depositData.accountType) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.distributionAmount, (java.lang.Object) depositData.distributionAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.distributionType, depositData.distributionType) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastFour, depositData.lastFour) && kotlin.jvm.internal.Intrinsics.areEqual(this.routingNumber, depositData.routingNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, depositData.title);
            }

            public final financial.atomic.transact.Config.TaskStatusUpdate.DepositData copy(java.lang.String accountType, java.lang.Double distributionAmount, java.lang.String distributionType, java.lang.String lastFour, java.lang.String routingNumber, java.lang.String title) {
                return new financial.atomic.transact.Config.TaskStatusUpdate.DepositData(accountType, distributionAmount, distributionType, lastFour, routingNumber, title);
            }

            /* renamed from: component6, reason: from getter */
            public final java.lang.String getTitle() {
                return this.title;
            }

            /* renamed from: component5, reason: from getter */
            public final java.lang.String getRoutingNumber() {
                return this.routingNumber;
            }

            /* renamed from: component4, reason: from getter */
            public final java.lang.String getLastFour() {
                return this.lastFour;
            }

            /* renamed from: component3, reason: from getter */
            public final java.lang.String getDistributionType() {
                return this.distributionType;
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.Double getDistributionAmount() {
                return this.distributionAmount;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getAccountType() {
                return this.accountType;
            }

            public static /* synthetic */ financial.atomic.transact.Config.TaskStatusUpdate.DepositData copy$default(financial.atomic.transact.Config.TaskStatusUpdate.DepositData depositData, java.lang.String str, java.lang.Double d, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = depositData.accountType;
                }
                if ((i & 2) != 0) {
                    d = depositData.distributionAmount;
                }
                java.lang.Double d2 = d;
                if ((i & 4) != 0) {
                    str2 = depositData.distributionType;
                }
                java.lang.String str6 = str2;
                if ((i & 8) != 0) {
                    str3 = depositData.lastFour;
                }
                java.lang.String str7 = str3;
                if ((i & 16) != 0) {
                    str4 = depositData.routingNumber;
                }
                java.lang.String str8 = str4;
                if ((i & 32) != 0) {
                    str5 = depositData.title;
                }
                return depositData.copy(str, d2, str6, str7, str8, str5);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\f"}, d2 = {"Lfinancial/atomic/transact/Config$TaskStatusUpdate$ManagedBy;", "", "Lfinancial/atomic/transact/Config$TransactCompany;", "company", "<init>", "(Lfinancial/atomic/transact/Config$TransactCompany;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILfinancial/atomic/transact/Config$TransactCompany;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lfinancial/atomic/transact/Config$TransactCompany;", "copy", "(Lfinancial/atomic/transact/Config$TransactCompany;)Lfinancial/atomic/transact/Config$TaskStatusUpdate$ManagedBy;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$transact_release", "(Lfinancial/atomic/transact/Config$TaskStatusUpdate$ManagedBy;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lfinancial/atomic/transact/Config$TransactCompany;", "getCompany", "Companion", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class ManagedBy {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final financial.atomic.transact.Config.TaskStatusUpdate.ManagedBy.Companion INSTANCE = new financial.atomic.transact.Config.TaskStatusUpdate.ManagedBy.Companion(null);
            private final financial.atomic.transact.Config.TransactCompany company;

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfinancial/atomic/transact/Config$TaskStatusUpdate$ManagedBy$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$TaskStatusUpdate$ManagedBy;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* loaded from: classes17.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<financial.atomic.transact.Config.TaskStatusUpdate.ManagedBy> serializer() {
                    return financial.atomic.transact.Config$TaskStatusUpdate$ManagedBy$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ ManagedBy(int i, financial.atomic.transact.Config.TransactCompany transactCompany, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, financial.atomic.transact.Config$TaskStatusUpdate$ManagedBy$$serializer.INSTANCE.getDescriptor());
                }
                this.company = transactCompany;
            }

            public final financial.atomic.transact.Config.TransactCompany getCompany() {
                return this.company;
            }

            public ManagedBy(financial.atomic.transact.Config.TransactCompany transactCompany) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactCompany, "");
                this.company = transactCompany;
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ManagedBy(company=");
                sb.append(this.company);
                sb.append(')');
                return sb.toString();
            }

            public final int hashCode() {
                return this.company.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof financial.atomic.transact.Config.TaskStatusUpdate.ManagedBy) && kotlin.jvm.internal.Intrinsics.areEqual(this.company, ((financial.atomic.transact.Config.TaskStatusUpdate.ManagedBy) other).company);
            }

            public final financial.atomic.transact.Config.TaskStatusUpdate.ManagedBy copy(financial.atomic.transact.Config.TransactCompany company) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(company, "");
                return new financial.atomic.transact.Config.TaskStatusUpdate.ManagedBy(company);
            }

            /* renamed from: component1, reason: from getter */
            public final financial.atomic.transact.Config.TransactCompany getCompany() {
                return this.company;
            }

            public static /* synthetic */ financial.atomic.transact.Config.TaskStatusUpdate.ManagedBy copy$default(financial.atomic.transact.Config.TaskStatusUpdate.ManagedBy managedBy, financial.atomic.transact.Config.TransactCompany transactCompany, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    transactCompany = managedBy.company;
                }
                return managedBy.copy(transactCompany);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0003#$\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\f"}, d2 = {"Lfinancial/atomic/transact/Config$TaskStatusUpdate$SwitchData;", "", "Lfinancial/atomic/transact/Config$TaskStatusUpdate$SwitchData$PaymentMethod;", "paymentMethod", "<init>", "(Lfinancial/atomic/transact/Config$TaskStatusUpdate$SwitchData$PaymentMethod;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILfinancial/atomic/transact/Config$TaskStatusUpdate$SwitchData$PaymentMethod;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lfinancial/atomic/transact/Config$TaskStatusUpdate$SwitchData$PaymentMethod;", "copy", "(Lfinancial/atomic/transact/Config$TaskStatusUpdate$SwitchData$PaymentMethod;)Lfinancial/atomic/transact/Config$TaskStatusUpdate$SwitchData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$transact_release", "(Lfinancial/atomic/transact/Config$TaskStatusUpdate$SwitchData;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lfinancial/atomic/transact/Config$TaskStatusUpdate$SwitchData$PaymentMethod;", "getPaymentMethod", "Companion", "PaymentMethod", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class SwitchData {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.Companion INSTANCE = new financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.Companion(null);
            private final financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod paymentMethod;

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfinancial/atomic/transact/Config$TaskStatusUpdate$SwitchData$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$TaskStatusUpdate$SwitchData;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* loaded from: classes17.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<financial.atomic.transact.Config.TaskStatusUpdate.SwitchData> serializer() {
                    return financial.atomic.transact.Config$TaskStatusUpdate$SwitchData$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ SwitchData(int i, financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod paymentMethod, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, financial.atomic.transact.Config$TaskStatusUpdate$SwitchData$$serializer.INSTANCE.getDescriptor());
                }
                this.paymentMethod = paymentMethod;
            }

            public final financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod getPaymentMethod() {
                return this.paymentMethod;
            }

            public SwitchData(financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod paymentMethod) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentMethod, "");
                this.paymentMethod = paymentMethod;
            }

            @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0003>?=Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eBu\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0015J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0015Jv\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0015J'\u0010.\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b.\u0010/R \u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00100\u0012\u0004\b2\u00103\u001a\u0004\b1\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b4\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b6\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b7\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b8\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b9\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b:\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b;\u0010\u0015R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b<\u0010\u0015"}, d2 = {"Lfinancial/atomic/transact/Config$TaskStatusUpdate$SwitchData$PaymentMethod;", "", "", "id", "title", "Lfinancial/atomic/transact/Config$TaskStatusUpdate$SwitchData$PaymentMethod$PaymentType;", "type", "expiry", "brand", "lastFour", "routingNumber", "accountType", "lastFourAccountNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lfinancial/atomic/transact/Config$TaskStatusUpdate$SwitchData$PaymentMethod$PaymentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lfinancial/atomic/transact/Config$TaskStatusUpdate$SwitchData$PaymentMethod$PaymentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lfinancial/atomic/transact/Config$TaskStatusUpdate$SwitchData$PaymentMethod$PaymentType;", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lfinancial/atomic/transact/Config$TaskStatusUpdate$SwitchData$PaymentMethod$PaymentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lfinancial/atomic/transact/Config$TaskStatusUpdate$SwitchData$PaymentMethod;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$transact_release", "(Lfinancial/atomic/transact/Config$TaskStatusUpdate$SwitchData$PaymentMethod;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getTitle", "Lfinancial/atomic/transact/Config$TaskStatusUpdate$SwitchData$PaymentMethod$PaymentType;", "getType", "getExpiry", "getBrand", "getLastFour", "getRoutingNumber", "getAccountType", "getLastFourAccountNumber", "Companion", "PaymentType", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
            @kotlinx.serialization.Serializable
            public static final /* data */ class PaymentMethod {
                private final java.lang.String accountType;
                private final java.lang.String brand;
                private final java.lang.String expiry;
                private final java.lang.String id;
                private final java.lang.String lastFour;
                private final java.lang.String lastFourAccountNumber;
                private final java.lang.String routingNumber;
                private final java.lang.String title;
                private final financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.PaymentType type;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.Companion INSTANCE = new financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.Companion(null);
                private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: financial.atomic.transact.Config$TaskStatusUpdate$SwitchData$PaymentMethod$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlinx.serialization.KSerializer _childSerializers$_anonymous_;
                        _childSerializers$_anonymous_ = financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod._childSerializers$_anonymous_();
                        return _childSerializers$_anonymous_;
                    }
                }), null, null, null, null, null, null};

                @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfinancial/atomic/transact/Config$TaskStatusUpdate$SwitchData$PaymentMethod$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$TaskStatusUpdate$SwitchData$PaymentMethod;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
                /* loaded from: classes17.dex */
                public static final class Companion {
                    private Companion() {
                    }

                    public final kotlinx.serialization.KSerializer<financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod> serializer() {
                        return financial.atomic.transact.Config$TaskStatusUpdate$SwitchData$PaymentMethod$$serializer.INSTANCE;
                    }

                    public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }
                }

                public /* synthetic */ PaymentMethod(int i, java.lang.String str, java.lang.String str2, financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.PaymentType paymentType, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                    if (7 != (i & 7)) {
                        kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, financial.atomic.transact.Config$TaskStatusUpdate$SwitchData$PaymentMethod$$serializer.INSTANCE.getDescriptor());
                    }
                    this.id = str;
                    this.title = str2;
                    this.type = paymentType;
                    if ((i & 8) == 0) {
                        this.expiry = null;
                    } else {
                        this.expiry = str3;
                    }
                    if ((i & 16) == 0) {
                        this.brand = null;
                    } else {
                        this.brand = str4;
                    }
                    if ((i & 32) == 0) {
                        this.lastFour = null;
                    } else {
                        this.lastFour = str5;
                    }
                    if ((i & 64) == 0) {
                        this.routingNumber = null;
                    } else {
                        this.routingNumber = str6;
                    }
                    if ((i & 128) == 0) {
                        this.accountType = null;
                    } else {
                        this.accountType = str7;
                    }
                    if ((i & 256) == 0) {
                        this.lastFourAccountNumber = null;
                    } else {
                        this.lastFourAccountNumber = str8;
                    }
                }

                @kotlinx.serialization.SerialName("_id")
                public static /* synthetic */ void getId$annotations() {
                }

                @kotlin.jvm.JvmStatic
                public static final /* synthetic */ void write$Self$transact_release(financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                    kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
                    output.encodeStringElement(serialDesc, 0, self.id);
                    output.encodeStringElement(serialDesc, 1, self.title);
                    output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.type);
                    if (output.shouldEncodeElementDefault(serialDesc, 3) || self.expiry != null) {
                        output.encodeNullableSerializableElement(serialDesc, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.expiry);
                    }
                    if (output.shouldEncodeElementDefault(serialDesc, 4) || self.brand != null) {
                        output.encodeNullableSerializableElement(serialDesc, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.brand);
                    }
                    if (output.shouldEncodeElementDefault(serialDesc, 5) || self.lastFour != null) {
                        output.encodeNullableSerializableElement(serialDesc, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.lastFour);
                    }
                    if (output.shouldEncodeElementDefault(serialDesc, 6) || self.routingNumber != null) {
                        output.encodeNullableSerializableElement(serialDesc, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.routingNumber);
                    }
                    if (output.shouldEncodeElementDefault(serialDesc, 7) || self.accountType != null) {
                        output.encodeNullableSerializableElement(serialDesc, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.accountType);
                    }
                    if (output.shouldEncodeElementDefault(serialDesc, 8) || self.lastFourAccountNumber != null) {
                        output.encodeNullableSerializableElement(serialDesc, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.lastFourAccountNumber);
                    }
                }

                public final java.lang.String getAccountType() {
                    return this.accountType;
                }

                public final java.lang.String getBrand() {
                    return this.brand;
                }

                public final java.lang.String getExpiry() {
                    return this.expiry;
                }

                public final java.lang.String getId() {
                    return this.id;
                }

                public final java.lang.String getLastFour() {
                    return this.lastFour;
                }

                public final java.lang.String getLastFourAccountNumber() {
                    return this.lastFourAccountNumber;
                }

                public final java.lang.String getRoutingNumber() {
                    return this.routingNumber;
                }

                public final java.lang.String getTitle() {
                    return this.title;
                }

                public final financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.PaymentType getType() {
                    return this.type;
                }

                public PaymentMethod(java.lang.String str, java.lang.String str2, financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.PaymentType paymentType, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentType, "");
                    this.id = str;
                    this.title = str2;
                    this.type = paymentType;
                    this.expiry = str3;
                    this.brand = str4;
                    this.lastFour = str5;
                    this.routingNumber = str6;
                    this.accountType = str7;
                    this.lastFourAccountNumber = str8;
                }

                public /* synthetic */ PaymentMethod(java.lang.String str, java.lang.String str2, financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.PaymentType paymentType, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, str2, paymentType, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8);
                }

                public final java.lang.String toString() {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentMethod(id=");
                    sb.append(this.id);
                    sb.append(", title=");
                    sb.append(this.title);
                    sb.append(", type=");
                    sb.append(this.type);
                    sb.append(", expiry=");
                    sb.append(this.expiry);
                    sb.append(", brand=");
                    sb.append(this.brand);
                    sb.append(", lastFour=");
                    sb.append(this.lastFour);
                    sb.append(", routingNumber=");
                    sb.append(this.routingNumber);
                    sb.append(", accountType=");
                    sb.append(this.accountType);
                    sb.append(", lastFourAccountNumber=");
                    sb.append(this.lastFourAccountNumber);
                    sb.append(')');
                    return sb.toString();
                }

                public final int hashCode() {
                    int hashCode = this.id.hashCode();
                    int hashCode2 = this.title.hashCode();
                    int hashCode3 = this.type.hashCode();
                    java.lang.String str = this.expiry;
                    int hashCode4 = str == null ? 0 : str.hashCode();
                    java.lang.String str2 = this.brand;
                    int hashCode5 = str2 == null ? 0 : str2.hashCode();
                    java.lang.String str3 = this.lastFour;
                    int hashCode6 = str3 == null ? 0 : str3.hashCode();
                    java.lang.String str4 = this.routingNumber;
                    int hashCode7 = str4 == null ? 0 : str4.hashCode();
                    java.lang.String str5 = this.accountType;
                    int hashCode8 = str5 == null ? 0 : str5.hashCode();
                    java.lang.String str6 = this.lastFourAccountNumber;
                    return ((((((((((((hashCode3 + ((hashCode2 + (hashCode * 31)) * 31)) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (str6 != null ? str6.hashCode() : 0);
                }

                public final boolean equals(java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod)) {
                        return false;
                    }
                    financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod paymentMethod = (financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod) other;
                    return kotlin.jvm.internal.Intrinsics.areEqual(this.id, paymentMethod.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, paymentMethod.title) && this.type == paymentMethod.type && kotlin.jvm.internal.Intrinsics.areEqual(this.expiry, paymentMethod.expiry) && kotlin.jvm.internal.Intrinsics.areEqual(this.brand, paymentMethod.brand) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastFour, paymentMethod.lastFour) && kotlin.jvm.internal.Intrinsics.areEqual(this.routingNumber, paymentMethod.routingNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountType, paymentMethod.accountType) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastFourAccountNumber, paymentMethod.lastFourAccountNumber);
                }

                public final financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod copy(java.lang.String id, java.lang.String title, financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.PaymentType type, java.lang.String expiry, java.lang.String brand, java.lang.String lastFour, java.lang.String routingNumber, java.lang.String accountType, java.lang.String lastFourAccountNumber) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
                    return new financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod(id, title, type, expiry, brand, lastFour, routingNumber, accountType, lastFourAccountNumber);
                }

                /* renamed from: component9, reason: from getter */
                public final java.lang.String getLastFourAccountNumber() {
                    return this.lastFourAccountNumber;
                }

                /* renamed from: component8, reason: from getter */
                public final java.lang.String getAccountType() {
                    return this.accountType;
                }

                /* renamed from: component7, reason: from getter */
                public final java.lang.String getRoutingNumber() {
                    return this.routingNumber;
                }

                /* renamed from: component6, reason: from getter */
                public final java.lang.String getLastFour() {
                    return this.lastFour;
                }

                /* renamed from: component5, reason: from getter */
                public final java.lang.String getBrand() {
                    return this.brand;
                }

                /* renamed from: component4, reason: from getter */
                public final java.lang.String getExpiry() {
                    return this.expiry;
                }

                /* renamed from: component3, reason: from getter */
                public final financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.PaymentType getType() {
                    return this.type;
                }

                /* renamed from: component2, reason: from getter */
                public final java.lang.String getTitle() {
                    return this.title;
                }

                /* renamed from: component1, reason: from getter */
                public final java.lang.String getId() {
                    return this.id;
                }

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lfinancial/atomic/transact/Config$TaskStatusUpdate$SwitchData$PaymentMethod$PaymentType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "CARD", "BANK"}, k = 1, mv = {2, 1, 0}, xi = 48)
                @kotlinx.serialization.Serializable
                public static final class PaymentType {
                    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
                    private static final /* synthetic */ financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.PaymentType[] $VALUES;
                    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.PaymentType.Companion INSTANCE;

                    @kotlinx.serialization.SerialName("card")
                    public static final financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.PaymentType CARD = new financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.PaymentType("CARD", 0);

                    @kotlinx.serialization.SerialName("bank")
                    public static final financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.PaymentType BANK = new financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.PaymentType("BANK", 1);

                    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfinancial/atomic/transact/Config$TaskStatusUpdate$SwitchData$PaymentMethod$PaymentType$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$TaskStatusUpdate$SwitchData$PaymentMethod$PaymentType;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
                    /* loaded from: classes17.dex */
                    public static final class Companion {
                        private Companion() {
                        }

                        private final /* synthetic */ kotlinx.serialization.KSerializer get$cachedSerializer() {
                            return (kotlinx.serialization.KSerializer) financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.PaymentType.$cachedSerializer$delegate.getValue();
                        }

                        public final kotlinx.serialization.KSerializer<financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.PaymentType> serializer() {
                            return get$cachedSerializer();
                        }

                        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }
                    }

                    static {
                        financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.PaymentType[] $values = $values();
                        $VALUES = $values;
                        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
                        INSTANCE = new financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.PaymentType.Companion(null);
                        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: financial.atomic.transact.Config$TaskStatusUpdate$SwitchData$PaymentMethod$PaymentType$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                kotlinx.serialization.KSerializer _init_$_anonymous_;
                                _init_$_anonymous_ = financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.PaymentType._init_$_anonymous_();
                                return _init_$_anonymous_;
                            }
                        });
                    }

                    private PaymentType(java.lang.String str, int i) {
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final /* synthetic */ kotlinx.serialization.KSerializer _init_$_anonymous_() {
                        return kotlinx.serialization.internal.EnumsKt.createAnnotatedEnumSerializer("financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.PaymentType", values(), new java.lang.String[]{"card", "bank"}, new java.lang.annotation.Annotation[][]{null, null}, null);
                    }

                    public static financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.PaymentType valueOf(java.lang.String str) {
                        return (financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.PaymentType) java.lang.Enum.valueOf(financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.PaymentType.class, str);
                    }

                    public static financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.PaymentType[] values() {
                        return (financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.PaymentType[]) $VALUES.clone();
                    }

                    public static kotlin.enums.EnumEntries<financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.PaymentType> getEntries() {
                        return $ENTRIES;
                    }

                    private static final /* synthetic */ financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.PaymentType[] $values() {
                        return new financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.PaymentType[]{CARD, BANK};
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final /* synthetic */ kotlinx.serialization.KSerializer _childSerializers$_anonymous_() {
                    return financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.PaymentType.INSTANCE.serializer();
                }
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SwitchData(paymentMethod=");
                sb.append(this.paymentMethod);
                sb.append(')');
                return sb.toString();
            }

            public final int hashCode() {
                return this.paymentMethod.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof financial.atomic.transact.Config.TaskStatusUpdate.SwitchData) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentMethod, ((financial.atomic.transact.Config.TaskStatusUpdate.SwitchData) other).paymentMethod);
            }

            public final financial.atomic.transact.Config.TaskStatusUpdate.SwitchData copy(financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod paymentMethod) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentMethod, "");
                return new financial.atomic.transact.Config.TaskStatusUpdate.SwitchData(paymentMethod);
            }

            /* renamed from: component1, reason: from getter */
            public final financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod getPaymentMethod() {
                return this.paymentMethod;
            }

            public static /* synthetic */ financial.atomic.transact.Config.TaskStatusUpdate.SwitchData copy$default(financial.atomic.transact.Config.TaskStatusUpdate.SwitchData switchData, financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod paymentMethod, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    paymentMethod = switchData.paymentMethod;
                }
                return switchData.copy(paymentMethod);
            }
        }

        static {
            kotlin.LazyThreadSafetyMode lazyThreadSafetyMode = kotlin.LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new kotlin.Lazy[]{null, kotlin.LazyKt.lazy(lazyThreadSafetyMode, new kotlin.jvm.functions.Function0() { // from class: financial.atomic.transact.Config$TaskStatusUpdate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlinx.serialization.KSerializer _childSerializers$_anonymous_;
                    _childSerializers$_anonymous_ = financial.atomic.transact.Config.TaskStatusUpdate._childSerializers$_anonymous_();
                    return _childSerializers$_anonymous_;
                }
            }), null, kotlin.LazyKt.lazy(lazyThreadSafetyMode, new kotlin.jvm.functions.Function0() { // from class: financial.atomic.transact.Config$TaskStatusUpdate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlinx.serialization.KSerializer _childSerializers$_anonymous_$0;
                    _childSerializers$_anonymous_$0 = financial.atomic.transact.Config.TaskStatusUpdate._childSerializers$_anonymous_$0();
                    return _childSerializers$_anonymous_$0;
                }
            }), null, null, null, null};
        }

        public /* synthetic */ TaskStatusUpdate(int i, java.lang.String str, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.TransactCompany transactCompany, financial.atomic.transact.Config.TaskStatusUpdate.TaskStatus taskStatus, java.lang.String str2, financial.atomic.transact.Config.TaskStatusUpdate.SwitchData switchData, financial.atomic.transact.Config.TaskStatusUpdate.DepositData depositData, financial.atomic.transact.Config.TaskStatusUpdate.ManagedBy managedBy, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (15 != (i & 15)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 15, financial.atomic.transact.Config$TaskStatusUpdate$$serializer.INSTANCE.getDescriptor());
            }
            this.taskId = str;
            this.product = product;
            this.company = transactCompany;
            this.status = taskStatus;
            if ((i & 16) == 0) {
                this.failReason = null;
            } else {
                this.failReason = str2;
            }
            if ((i & 32) == 0) {
                this.switchData = null;
            } else {
                this.switchData = switchData;
            }
            if ((i & 64) == 0) {
                this.depositData = null;
            } else {
                this.depositData = depositData;
            }
            if ((i & 128) == 0) {
                this.managedBy = null;
            } else {
                this.managedBy = managedBy;
            }
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$transact_release(financial.atomic.transact.Config.TaskStatusUpdate self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.taskId);
            output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.product);
            output.encodeSerializableElement(serialDesc, 2, financial.atomic.transact.Config$TransactCompany$$serializer.INSTANCE, self.company);
            output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.status);
            if (output.shouldEncodeElementDefault(serialDesc, 4) || self.failReason != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.failReason);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 5) || self.switchData != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, financial.atomic.transact.Config$TaskStatusUpdate$SwitchData$$serializer.INSTANCE, self.switchData);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 6) || self.depositData != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, financial.atomic.transact.Config$TaskStatusUpdate$DepositData$$serializer.INSTANCE, self.depositData);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 7) || self.managedBy != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, financial.atomic.transact.Config$TaskStatusUpdate$ManagedBy$$serializer.INSTANCE, self.managedBy);
            }
        }

        public final financial.atomic.transact.Config.TransactCompany getCompany() {
            return this.company;
        }

        public final financial.atomic.transact.Config.TaskStatusUpdate.DepositData getDepositData() {
            return this.depositData;
        }

        public final java.lang.String getFailReason() {
            return this.failReason;
        }

        public final financial.atomic.transact.Config.TaskStatusUpdate.ManagedBy getManagedBy() {
            return this.managedBy;
        }

        public final financial.atomic.transact.Config.Product getProduct() {
            return this.product;
        }

        public final financial.atomic.transact.Config.TaskStatusUpdate.TaskStatus getStatus() {
            return this.status;
        }

        public final financial.atomic.transact.Config.TaskStatusUpdate.SwitchData getSwitchData() {
            return this.switchData;
        }

        public final java.lang.String getTaskId() {
            return this.taskId;
        }

        public TaskStatusUpdate(java.lang.String str, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.TransactCompany transactCompany, financial.atomic.transact.Config.TaskStatusUpdate.TaskStatus taskStatus, java.lang.String str2, financial.atomic.transact.Config.TaskStatusUpdate.SwitchData switchData, financial.atomic.transact.Config.TaskStatusUpdate.DepositData depositData, financial.atomic.transact.Config.TaskStatusUpdate.ManagedBy managedBy) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactCompany, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskStatus, "");
            this.taskId = str;
            this.product = product;
            this.company = transactCompany;
            this.status = taskStatus;
            this.failReason = str2;
            this.switchData = switchData;
            this.depositData = depositData;
            this.managedBy = managedBy;
        }

        public /* synthetic */ TaskStatusUpdate(java.lang.String str, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.TransactCompany transactCompany, financial.atomic.transact.Config.TaskStatusUpdate.TaskStatus taskStatus, java.lang.String str2, financial.atomic.transact.Config.TaskStatusUpdate.SwitchData switchData, financial.atomic.transact.Config.TaskStatusUpdate.DepositData depositData, financial.atomic.transact.Config.TaskStatusUpdate.ManagedBy managedBy, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, product, transactCompany, taskStatus, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : switchData, (i & 64) != 0 ? null : depositData, (i & 128) != 0 ? null : managedBy);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TaskStatusUpdate(taskId=");
            sb.append(this.taskId);
            sb.append(", product=");
            sb.append(this.product);
            sb.append(", company=");
            sb.append(this.company);
            sb.append(", status=");
            sb.append(this.status);
            sb.append(", failReason=");
            sb.append(this.failReason);
            sb.append(", switchData=");
            sb.append(this.switchData);
            sb.append(", depositData=");
            sb.append(this.depositData);
            sb.append(", managedBy=");
            sb.append(this.managedBy);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.taskId.hashCode();
            int hashCode2 = this.product.hashCode();
            int hashCode3 = this.company.hashCode();
            int hashCode4 = this.status.hashCode();
            java.lang.String str = this.failReason;
            int hashCode5 = str == null ? 0 : str.hashCode();
            financial.atomic.transact.Config.TaskStatusUpdate.SwitchData switchData = this.switchData;
            int hashCode6 = switchData == null ? 0 : switchData.hashCode();
            financial.atomic.transact.Config.TaskStatusUpdate.DepositData depositData = this.depositData;
            int hashCode7 = depositData == null ? 0 : depositData.hashCode();
            financial.atomic.transact.Config.TaskStatusUpdate.ManagedBy managedBy = this.managedBy;
            return ((((((((hashCode4 + ((hashCode3 + ((hashCode2 + (hashCode * 31)) * 31)) * 31)) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (managedBy != null ? managedBy.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof financial.atomic.transact.Config.TaskStatusUpdate)) {
                return false;
            }
            financial.atomic.transact.Config.TaskStatusUpdate taskStatusUpdate = (financial.atomic.transact.Config.TaskStatusUpdate) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.taskId, taskStatusUpdate.taskId) && this.product == taskStatusUpdate.product && kotlin.jvm.internal.Intrinsics.areEqual(this.company, taskStatusUpdate.company) && this.status == taskStatusUpdate.status && kotlin.jvm.internal.Intrinsics.areEqual(this.failReason, taskStatusUpdate.failReason) && kotlin.jvm.internal.Intrinsics.areEqual(this.switchData, taskStatusUpdate.switchData) && kotlin.jvm.internal.Intrinsics.areEqual(this.depositData, taskStatusUpdate.depositData) && kotlin.jvm.internal.Intrinsics.areEqual(this.managedBy, taskStatusUpdate.managedBy);
        }

        public final financial.atomic.transact.Config.TaskStatusUpdate copy(java.lang.String taskId, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.TransactCompany company, financial.atomic.transact.Config.TaskStatusUpdate.TaskStatus status, java.lang.String failReason, financial.atomic.transact.Config.TaskStatusUpdate.SwitchData switchData, financial.atomic.transact.Config.TaskStatusUpdate.DepositData depositData, financial.atomic.transact.Config.TaskStatusUpdate.ManagedBy managedBy) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(company, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new financial.atomic.transact.Config.TaskStatusUpdate(taskId, product, company, status, failReason, switchData, depositData, managedBy);
        }

        /* renamed from: component8, reason: from getter */
        public final financial.atomic.transact.Config.TaskStatusUpdate.ManagedBy getManagedBy() {
            return this.managedBy;
        }

        /* renamed from: component7, reason: from getter */
        public final financial.atomic.transact.Config.TaskStatusUpdate.DepositData getDepositData() {
            return this.depositData;
        }

        /* renamed from: component6, reason: from getter */
        public final financial.atomic.transact.Config.TaskStatusUpdate.SwitchData getSwitchData() {
            return this.switchData;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getFailReason() {
            return this.failReason;
        }

        /* renamed from: component4, reason: from getter */
        public final financial.atomic.transact.Config.TaskStatusUpdate.TaskStatus getStatus() {
            return this.status;
        }

        /* renamed from: component3, reason: from getter */
        public final financial.atomic.transact.Config.TransactCompany getCompany() {
            return this.company;
        }

        /* renamed from: component2, reason: from getter */
        public final financial.atomic.transact.Config.Product getProduct() {
            return this.product;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTaskId() {
            return this.taskId;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lfinancial/atomic/transact/Config$TaskStatusUpdate$TaskStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "COMPLETED", com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, "PROCESSING", com.paypal.oslo.downloads.impl.DownloadStateValue.QUEUED}, k = 1, mv = {2, 1, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final class TaskStatus {
            private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
            private static final /* synthetic */ financial.atomic.transact.Config.TaskStatusUpdate.TaskStatus[] $VALUES;
            private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final financial.atomic.transact.Config.TaskStatusUpdate.TaskStatus.Companion INSTANCE;

            @kotlinx.serialization.SerialName(com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.FlowOutcome.COMPLETED)
            public static final financial.atomic.transact.Config.TaskStatusUpdate.TaskStatus COMPLETED = new financial.atomic.transact.Config.TaskStatusUpdate.TaskStatus("COMPLETED", 0);

            @kotlinx.serialization.SerialName("failed")
            public static final financial.atomic.transact.Config.TaskStatusUpdate.TaskStatus FAILED = new financial.atomic.transact.Config.TaskStatusUpdate.TaskStatus(com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, 1);

            @kotlinx.serialization.SerialName("processing")
            public static final financial.atomic.transact.Config.TaskStatusUpdate.TaskStatus PROCESSING = new financial.atomic.transact.Config.TaskStatusUpdate.TaskStatus("PROCESSING", 2);

            @kotlinx.serialization.SerialName("queued")
            public static final financial.atomic.transact.Config.TaskStatusUpdate.TaskStatus QUEUED = new financial.atomic.transact.Config.TaskStatusUpdate.TaskStatus(com.paypal.oslo.downloads.impl.DownloadStateValue.QUEUED, 3);

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfinancial/atomic/transact/Config$TaskStatusUpdate$TaskStatus$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$TaskStatusUpdate$TaskStatus;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* loaded from: classes17.dex */
            public static final class Companion {
                private Companion() {
                }

                private final /* synthetic */ kotlinx.serialization.KSerializer get$cachedSerializer() {
                    return (kotlinx.serialization.KSerializer) financial.atomic.transact.Config.TaskStatusUpdate.TaskStatus.$cachedSerializer$delegate.getValue();
                }

                public final kotlinx.serialization.KSerializer<financial.atomic.transact.Config.TaskStatusUpdate.TaskStatus> serializer() {
                    return get$cachedSerializer();
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            static {
                financial.atomic.transact.Config.TaskStatusUpdate.TaskStatus[] $values = $values();
                $VALUES = $values;
                $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
                INSTANCE = new financial.atomic.transact.Config.TaskStatusUpdate.TaskStatus.Companion(null);
                $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: financial.atomic.transact.Config$TaskStatusUpdate$TaskStatus$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlinx.serialization.KSerializer _init_$_anonymous_;
                        _init_$_anonymous_ = financial.atomic.transact.Config.TaskStatusUpdate.TaskStatus._init_$_anonymous_();
                        return _init_$_anonymous_;
                    }
                });
            }

            private TaskStatus(java.lang.String str, int i) {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ kotlinx.serialization.KSerializer _init_$_anonymous_() {
                return kotlinx.serialization.internal.EnumsKt.createAnnotatedEnumSerializer("financial.atomic.transact.Config.TaskStatusUpdate.TaskStatus", values(), new java.lang.String[]{com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.FlowOutcome.COMPLETED, "failed", "processing", "queued"}, new java.lang.annotation.Annotation[][]{null, null, null, null}, null);
            }

            public static financial.atomic.transact.Config.TaskStatusUpdate.TaskStatus valueOf(java.lang.String str) {
                return (financial.atomic.transact.Config.TaskStatusUpdate.TaskStatus) java.lang.Enum.valueOf(financial.atomic.transact.Config.TaskStatusUpdate.TaskStatus.class, str);
            }

            public static financial.atomic.transact.Config.TaskStatusUpdate.TaskStatus[] values() {
                return (financial.atomic.transact.Config.TaskStatusUpdate.TaskStatus[]) $VALUES.clone();
            }

            public static kotlin.enums.EnumEntries<financial.atomic.transact.Config.TaskStatusUpdate.TaskStatus> getEntries() {
                return $ENTRIES;
            }

            private static final /* synthetic */ financial.atomic.transact.Config.TaskStatusUpdate.TaskStatus[] $values() {
                return new financial.atomic.transact.Config.TaskStatusUpdate.TaskStatus[]{COMPLETED, FAILED, PROCESSING, QUEUED};
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ kotlinx.serialization.KSerializer _childSerializers$_anonymous_$0() {
            return financial.atomic.transact.Config.TaskStatusUpdate.TaskStatus.INSTANCE.serializer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ kotlinx.serialization.KSerializer _childSerializers$_anonymous_() {
            return financial.atomic.transact.Config.Product.INSTANCE.serializer();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product2, financial.atomic.transact.Config.Distribution distribution) {
        this(str, product, environment, str2, product2, distribution, (financial.atomic.transact.Config.Theme) null, (financial.atomic.transact.Config.Deeplink) null, (org.json.JSONObject) null, (financial.atomic.transact.Config.Language) null, (financial.atomic.transact.Config.Search) null, (java.util.List) null, (financial.atomic.transact.Config.Experiments) null, false, false, false, (financial.atomic.transact.Config.Scope) null, (java.lang.String) null, (financial.atomic.transact.Config.Product) null, (financial.atomic.transact.Config.Customer) null, (financial.atomic.transact.Config.Features) null, (java.lang.String) null, (financial.atomic.transact.Config.DeferredPaymentMethodStrategy) null, 8388544, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product2, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme) {
        this(str, product, environment, str2, product2, distribution, theme, (financial.atomic.transact.Config.Deeplink) null, (org.json.JSONObject) null, (financial.atomic.transact.Config.Language) null, (financial.atomic.transact.Config.Search) null, (java.util.List) null, (financial.atomic.transact.Config.Experiments) null, false, false, false, (financial.atomic.transact.Config.Scope) null, (java.lang.String) null, (financial.atomic.transact.Config.Product) null, (financial.atomic.transact.Config.Customer) null, (financial.atomic.transact.Config.Features) null, (java.lang.String) null, (financial.atomic.transact.Config.DeferredPaymentMethodStrategy) null, 8388480, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product2, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Deeplink deeplink) {
        this(str, product, environment, str2, product2, distribution, theme, deeplink, (org.json.JSONObject) null, (financial.atomic.transact.Config.Language) null, (financial.atomic.transact.Config.Search) null, (java.util.List) null, (financial.atomic.transact.Config.Experiments) null, false, false, false, (financial.atomic.transact.Config.Scope) null, (java.lang.String) null, (financial.atomic.transact.Config.Product) null, (financial.atomic.transact.Config.Customer) null, (financial.atomic.transact.Config.Features) null, (java.lang.String) null, (financial.atomic.transact.Config.DeferredPaymentMethodStrategy) null, 8388352, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product2, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Deeplink deeplink, org.json.JSONObject jSONObject) {
        this(str, product, environment, str2, product2, distribution, theme, deeplink, jSONObject, (financial.atomic.transact.Config.Language) null, (financial.atomic.transact.Config.Search) null, (java.util.List) null, (financial.atomic.transact.Config.Experiments) null, false, false, false, (financial.atomic.transact.Config.Scope) null, (java.lang.String) null, (financial.atomic.transact.Config.Product) null, (financial.atomic.transact.Config.Customer) null, (financial.atomic.transact.Config.Features) null, (java.lang.String) null, (financial.atomic.transact.Config.DeferredPaymentMethodStrategy) null, 8388096, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product2, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Deeplink deeplink, org.json.JSONObject jSONObject, financial.atomic.transact.Config.Language language) {
        this(str, product, environment, str2, product2, distribution, theme, deeplink, jSONObject, language, (financial.atomic.transact.Config.Search) null, (java.util.List) null, (financial.atomic.transact.Config.Experiments) null, false, false, false, (financial.atomic.transact.Config.Scope) null, (java.lang.String) null, (financial.atomic.transact.Config.Product) null, (financial.atomic.transact.Config.Customer) null, (financial.atomic.transact.Config.Features) null, (java.lang.String) null, (financial.atomic.transact.Config.DeferredPaymentMethodStrategy) null, 8387584, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product2, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Deeplink deeplink, org.json.JSONObject jSONObject, financial.atomic.transact.Config.Language language, financial.atomic.transact.Config.Search search) {
        this(str, product, environment, str2, product2, distribution, theme, deeplink, jSONObject, language, search, (java.util.List) null, (financial.atomic.transact.Config.Experiments) null, false, false, false, (financial.atomic.transact.Config.Scope) null, (java.lang.String) null, (financial.atomic.transact.Config.Product) null, (financial.atomic.transact.Config.Customer) null, (financial.atomic.transact.Config.Features) null, (java.lang.String) null, (financial.atomic.transact.Config.DeferredPaymentMethodStrategy) null, 8386560, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product2, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Deeplink deeplink, org.json.JSONObject jSONObject, financial.atomic.transact.Config.Language language, financial.atomic.transact.Config.Search search, java.util.List<? extends financial.atomic.transact.Config.Handoff> list) {
        this(str, product, environment, str2, product2, distribution, theme, deeplink, jSONObject, language, search, (java.util.List) list, (financial.atomic.transact.Config.Experiments) null, false, false, false, (financial.atomic.transact.Config.Scope) null, (java.lang.String) null, (financial.atomic.transact.Config.Product) null, (financial.atomic.transact.Config.Customer) null, (financial.atomic.transact.Config.Features) null, (java.lang.String) null, (financial.atomic.transact.Config.DeferredPaymentMethodStrategy) null, 8384512, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product2, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Deeplink deeplink, org.json.JSONObject jSONObject, financial.atomic.transact.Config.Language language, financial.atomic.transact.Config.Search search, java.util.List<? extends financial.atomic.transact.Config.Handoff> list, financial.atomic.transact.Config.Experiments experiments) {
        this(str, product, environment, str2, product2, distribution, theme, deeplink, jSONObject, language, search, (java.util.List) list, experiments, false, false, false, (financial.atomic.transact.Config.Scope) null, (java.lang.String) null, (financial.atomic.transact.Config.Product) null, (financial.atomic.transact.Config.Customer) null, (financial.atomic.transact.Config.Features) null, (java.lang.String) null, (financial.atomic.transact.Config.DeferredPaymentMethodStrategy) null, 8380416, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product2, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Deeplink deeplink, org.json.JSONObject jSONObject, financial.atomic.transact.Config.Language language, financial.atomic.transact.Config.Search search, java.util.List<? extends financial.atomic.transact.Config.Handoff> list, financial.atomic.transact.Config.Experiments experiments, boolean z) {
        this(str, product, environment, str2, product2, distribution, theme, deeplink, jSONObject, language, search, (java.util.List) list, experiments, z, false, false, (financial.atomic.transact.Config.Scope) null, (java.lang.String) null, (financial.atomic.transact.Config.Product) null, (financial.atomic.transact.Config.Customer) null, (financial.atomic.transact.Config.Features) null, (java.lang.String) null, (financial.atomic.transact.Config.DeferredPaymentMethodStrategy) null, 8372224, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product2, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Deeplink deeplink, org.json.JSONObject jSONObject, financial.atomic.transact.Config.Language language, financial.atomic.transact.Config.Search search, java.util.List<? extends financial.atomic.transact.Config.Handoff> list, financial.atomic.transact.Config.Experiments experiments, boolean z, boolean z2) {
        this(str, product, environment, str2, product2, distribution, theme, deeplink, jSONObject, language, search, (java.util.List) list, experiments, z, z2, false, (financial.atomic.transact.Config.Scope) null, (java.lang.String) null, (financial.atomic.transact.Config.Product) null, (financial.atomic.transact.Config.Customer) null, (financial.atomic.transact.Config.Features) null, (java.lang.String) null, (financial.atomic.transact.Config.DeferredPaymentMethodStrategy) null, 8355840, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product2, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Deeplink deeplink, org.json.JSONObject jSONObject, financial.atomic.transact.Config.Language language, financial.atomic.transact.Config.Search search, java.util.List<? extends financial.atomic.transact.Config.Handoff> list, financial.atomic.transact.Config.Experiments experiments, boolean z, boolean z2, boolean z3) {
        this(str, product, environment, str2, product2, distribution, theme, deeplink, jSONObject, language, search, list, experiments, z, z2, z3, (financial.atomic.transact.Config.Scope) null, (java.lang.String) null, (financial.atomic.transact.Config.Product) null, (financial.atomic.transact.Config.Customer) null, (financial.atomic.transact.Config.Features) null, (java.lang.String) null, (financial.atomic.transact.Config.DeferredPaymentMethodStrategy) null, 8323072, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product2, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Deeplink deeplink, org.json.JSONObject jSONObject, financial.atomic.transact.Config.Language language, financial.atomic.transact.Config.Search search, java.util.List<? extends financial.atomic.transact.Config.Handoff> list, financial.atomic.transact.Config.Experiments experiments, boolean z, boolean z2, boolean z3, financial.atomic.transact.Config.Scope scope) {
        this(str, product, environment, str2, product2, distribution, theme, deeplink, jSONObject, language, search, list, experiments, z, z2, z3, scope, (java.lang.String) null, (financial.atomic.transact.Config.Product) null, (financial.atomic.transact.Config.Customer) null, (financial.atomic.transact.Config.Features) null, (java.lang.String) null, (financial.atomic.transact.Config.DeferredPaymentMethodStrategy) null, 8257536, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product2, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Deeplink deeplink, org.json.JSONObject jSONObject, financial.atomic.transact.Config.Language language, financial.atomic.transact.Config.Search search, java.util.List<? extends financial.atomic.transact.Config.Handoff> list, financial.atomic.transact.Config.Experiments experiments, boolean z, boolean z2, boolean z3, financial.atomic.transact.Config.Scope scope, java.lang.String str3) {
        this(str, product, environment, str2, product2, distribution, theme, deeplink, jSONObject, language, search, list, experiments, z, z2, z3, scope, str3, (financial.atomic.transact.Config.Product) null, (financial.atomic.transact.Config.Customer) null, (financial.atomic.transact.Config.Features) null, (java.lang.String) null, (financial.atomic.transact.Config.DeferredPaymentMethodStrategy) null, 8126464, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product2, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Deeplink deeplink, org.json.JSONObject jSONObject, financial.atomic.transact.Config.Language language, financial.atomic.transact.Config.Search search, java.util.List<? extends financial.atomic.transact.Config.Handoff> list, financial.atomic.transact.Config.Experiments experiments, boolean z, boolean z2, boolean z3, financial.atomic.transact.Config.Scope scope, java.lang.String str3, financial.atomic.transact.Config.Product product3) {
        this(str, product, environment, str2, product2, distribution, theme, deeplink, jSONObject, language, search, list, experiments, z, z2, z3, scope, str3, product3, (financial.atomic.transact.Config.Customer) null, (financial.atomic.transact.Config.Features) null, (java.lang.String) null, (financial.atomic.transact.Config.DeferredPaymentMethodStrategy) null, 7864320, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product2, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Deeplink deeplink, org.json.JSONObject jSONObject, financial.atomic.transact.Config.Language language, financial.atomic.transact.Config.Search search, java.util.List<? extends financial.atomic.transact.Config.Handoff> list, financial.atomic.transact.Config.Experiments experiments, boolean z, boolean z2, boolean z3, financial.atomic.transact.Config.Scope scope, java.lang.String str3, financial.atomic.transact.Config.Product product3, financial.atomic.transact.Config.Customer customer) {
        this(str, product, environment, str2, product2, distribution, theme, deeplink, jSONObject, language, search, list, experiments, z, z2, z3, scope, str3, product3, customer, (financial.atomic.transact.Config.Features) null, (java.lang.String) null, (financial.atomic.transact.Config.DeferredPaymentMethodStrategy) null, 7340032, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product2, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Deeplink deeplink, org.json.JSONObject jSONObject, financial.atomic.transact.Config.Language language, financial.atomic.transact.Config.Search search, java.util.List<? extends financial.atomic.transact.Config.Handoff> list, financial.atomic.transact.Config.Experiments experiments, boolean z, boolean z2, boolean z3, financial.atomic.transact.Config.Scope scope, java.lang.String str3, financial.atomic.transact.Config.Product product3, financial.atomic.transact.Config.Customer customer, financial.atomic.transact.Config.Features features) {
        this(str, product, environment, str2, product2, distribution, theme, deeplink, jSONObject, language, search, list, experiments, z, z2, z3, scope, str3, product3, customer, features, (java.lang.String) null, (financial.atomic.transact.Config.DeferredPaymentMethodStrategy) null, 6291456, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product2, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Deeplink deeplink, org.json.JSONObject jSONObject, financial.atomic.transact.Config.Language language, financial.atomic.transact.Config.Search search, java.util.List<? extends financial.atomic.transact.Config.Handoff> list, financial.atomic.transact.Config.Experiments experiments, boolean z, boolean z2, boolean z3, financial.atomic.transact.Config.Scope scope, java.lang.String str3, financial.atomic.transact.Config.Product product3, financial.atomic.transact.Config.Customer customer, financial.atomic.transact.Config.Features features, java.lang.String str4) {
        this(str, product, environment, str2, product2, distribution, theme, deeplink, jSONObject, language, search, list, experiments, z, z2, z3, scope, str3, product3, customer, features, str4, (financial.atomic.transact.Config.DeferredPaymentMethodStrategy) null, 4194304, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, java.lang.String str2) {
        this(str, str2, false, false, false, (java.lang.String) null, 60, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, java.lang.String str2, boolean z) {
        this(str, str2, z, false, false, (java.lang.String) null, 56, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, java.lang.String str2, boolean z, boolean z2) {
        this(str, str2, z, z2, false, (java.lang.String) null, 48, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3) {
        this(str, str2, z, z2, z3, (java.lang.String) null, 32, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, java.util.List<financial.atomic.transact.Config.Task> list) {
        this(str, list, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, 4194300, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, java.util.List<financial.atomic.transact.Config.Task> list, financial.atomic.transact.Config.Environment environment) {
        this(str, list, environment, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, 4194296, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, java.util.List<financial.atomic.transact.Config.Task> list, financial.atomic.transact.Config.Environment environment, java.lang.String str2) {
        this(str, list, environment, str2, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, 4194288, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, java.util.List<financial.atomic.transact.Config.Task> list, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product) {
        this(str, list, environment, str2, product, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, 4194272, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, java.util.List<financial.atomic.transact.Config.Task> list, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Distribution distribution) {
        this(str, list, environment, str2, product, distribution, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, 4194240, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, java.util.List<financial.atomic.transact.Config.Task> list, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme) {
        this(str, list, environment, str2, product, distribution, theme, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, 4194176, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, java.util.List<financial.atomic.transact.Config.Task> list, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Deeplink deeplink) {
        this(str, list, environment, str2, product, distribution, theme, deeplink, null, null, null, null, null, false, false, false, null, null, null, null, null, null, 4194048, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, java.util.List<financial.atomic.transact.Config.Task> list, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Deeplink deeplink, org.json.JSONObject jSONObject) {
        this(str, list, environment, str2, product, distribution, theme, deeplink, jSONObject, null, null, null, null, false, false, false, null, null, null, null, null, null, 4193792, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, java.util.List<financial.atomic.transact.Config.Task> list, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Deeplink deeplink, org.json.JSONObject jSONObject, financial.atomic.transact.Config.Language language) {
        this(str, list, environment, str2, product, distribution, theme, deeplink, jSONObject, language, null, null, null, false, false, false, null, null, null, null, null, null, 4193280, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, java.util.List<financial.atomic.transact.Config.Task> list, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Deeplink deeplink, org.json.JSONObject jSONObject, financial.atomic.transact.Config.Language language, financial.atomic.transact.Config.Search search) {
        this(str, list, environment, str2, product, distribution, theme, deeplink, jSONObject, language, search, null, null, false, false, false, null, null, null, null, null, null, 4192256, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, java.util.List<financial.atomic.transact.Config.Task> list, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Deeplink deeplink, org.json.JSONObject jSONObject, financial.atomic.transact.Config.Language language, financial.atomic.transact.Config.Search search, java.util.List<? extends financial.atomic.transact.Config.Handoff> list2) {
        this(str, list, environment, str2, product, distribution, theme, deeplink, jSONObject, language, search, list2, null, false, false, false, null, null, null, null, null, null, 4190208, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, java.util.List<financial.atomic.transact.Config.Task> list, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Deeplink deeplink, org.json.JSONObject jSONObject, financial.atomic.transact.Config.Language language, financial.atomic.transact.Config.Search search, java.util.List<? extends financial.atomic.transact.Config.Handoff> list2, financial.atomic.transact.Config.Experiments experiments) {
        this(str, list, environment, str2, product, distribution, theme, deeplink, jSONObject, language, search, list2, experiments, false, false, false, null, null, null, null, null, null, 4186112, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, java.util.List<financial.atomic.transact.Config.Task> list, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Deeplink deeplink, org.json.JSONObject jSONObject, financial.atomic.transact.Config.Language language, financial.atomic.transact.Config.Search search, java.util.List<? extends financial.atomic.transact.Config.Handoff> list2, financial.atomic.transact.Config.Experiments experiments, boolean z) {
        this(str, list, environment, str2, product, distribution, theme, deeplink, jSONObject, language, search, list2, experiments, z, false, false, null, null, null, null, null, null, 4177920, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, java.util.List<financial.atomic.transact.Config.Task> list, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Deeplink deeplink, org.json.JSONObject jSONObject, financial.atomic.transact.Config.Language language, financial.atomic.transact.Config.Search search, java.util.List<? extends financial.atomic.transact.Config.Handoff> list2, financial.atomic.transact.Config.Experiments experiments, boolean z, boolean z2) {
        this(str, list, environment, str2, product, distribution, theme, deeplink, jSONObject, language, search, list2, experiments, z, z2, false, null, null, null, null, null, null, 4161536, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, java.util.List<financial.atomic.transact.Config.Task> list, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Deeplink deeplink, org.json.JSONObject jSONObject, financial.atomic.transact.Config.Language language, financial.atomic.transact.Config.Search search, java.util.List<? extends financial.atomic.transact.Config.Handoff> list2, financial.atomic.transact.Config.Experiments experiments, boolean z, boolean z2, boolean z3) {
        this(str, list, environment, str2, product, distribution, theme, deeplink, jSONObject, language, search, list2, experiments, z, z2, z3, null, null, null, null, null, null, 4128768, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, java.util.List<financial.atomic.transact.Config.Task> list, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Deeplink deeplink, org.json.JSONObject jSONObject, financial.atomic.transact.Config.Language language, financial.atomic.transact.Config.Search search, java.util.List<? extends financial.atomic.transact.Config.Handoff> list2, financial.atomic.transact.Config.Experiments experiments, boolean z, boolean z2, boolean z3, financial.atomic.transact.Config.Scope scope) {
        this(str, list, environment, str2, product, distribution, theme, deeplink, jSONObject, language, search, list2, experiments, z, z2, z3, scope, null, null, null, null, null, 4063232, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, java.util.List<financial.atomic.transact.Config.Task> list, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Deeplink deeplink, org.json.JSONObject jSONObject, financial.atomic.transact.Config.Language language, financial.atomic.transact.Config.Search search, java.util.List<? extends financial.atomic.transact.Config.Handoff> list2, financial.atomic.transact.Config.Experiments experiments, boolean z, boolean z2, boolean z3, financial.atomic.transact.Config.Scope scope, java.lang.String str3) {
        this(str, list, environment, str2, product, distribution, theme, deeplink, jSONObject, language, search, list2, experiments, z, z2, z3, scope, str3, null, null, null, null, 3932160, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, java.util.List<financial.atomic.transact.Config.Task> list, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Deeplink deeplink, org.json.JSONObject jSONObject, financial.atomic.transact.Config.Language language, financial.atomic.transact.Config.Search search, java.util.List<? extends financial.atomic.transact.Config.Handoff> list2, financial.atomic.transact.Config.Experiments experiments, boolean z, boolean z2, boolean z3, financial.atomic.transact.Config.Scope scope, java.lang.String str3, financial.atomic.transact.Config.Customer customer) {
        this(str, list, environment, str2, product, distribution, theme, deeplink, jSONObject, language, search, list2, experiments, z, z2, z3, scope, str3, customer, null, null, null, 3670016, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, java.util.List<financial.atomic.transact.Config.Task> list, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Deeplink deeplink, org.json.JSONObject jSONObject, financial.atomic.transact.Config.Language language, financial.atomic.transact.Config.Search search, java.util.List<? extends financial.atomic.transact.Config.Handoff> list2, financial.atomic.transact.Config.Experiments experiments, boolean z, boolean z2, boolean z3, financial.atomic.transact.Config.Scope scope, java.lang.String str3, financial.atomic.transact.Config.Customer customer, financial.atomic.transact.Config.Features features) {
        this(str, list, environment, str2, product, distribution, theme, deeplink, jSONObject, language, search, list2, experiments, z, z2, z3, scope, str3, customer, features, null, null, 3145728, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, java.util.List<financial.atomic.transact.Config.Task> list, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Deeplink deeplink, org.json.JSONObject jSONObject, financial.atomic.transact.Config.Language language, financial.atomic.transact.Config.Search search, java.util.List<? extends financial.atomic.transact.Config.Handoff> list2, financial.atomic.transact.Config.Experiments experiments, boolean z, boolean z2, boolean z3, financial.atomic.transact.Config.Scope scope, java.lang.String str3, financial.atomic.transact.Config.Customer customer, financial.atomic.transact.Config.Features features, java.lang.String str4) {
        this(str, list, environment, str2, product, distribution, theme, deeplink, jSONObject, language, search, list2, experiments, z, z2, z3, scope, str3, customer, features, str4, null, 2097152, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Config(java.lang.String str, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Product product2, financial.atomic.transact.Config.Environment environment, java.util.List<financial.atomic.transact.Config.Task> list, java.lang.String str2, financial.atomic.transact.Config.Product product3, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Deeplink deeplink, org.json.JSONObject jSONObject, financial.atomic.transact.Config.Language language, financial.atomic.transact.Config.Search search, java.util.List<? extends financial.atomic.transact.Config.Handoff> list2, financial.atomic.transact.Config.Experiments experiments, boolean z, boolean z2, boolean z3, financial.atomic.transact.Config.Scope scope, java.lang.String str3, java.lang.String str4, financial.atomic.transact.Config.Customer customer, financial.atomic.transact.Config.Features features, java.lang.String str5, financial.atomic.transact.Config.DeferredPaymentMethodStrategy deferredPaymentMethodStrategy) {
        java.util.ArrayList arrayList;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String name2;
        java.lang.String name3;
        this.publicToken = str;
        this.product = product;
        this.operation = product2;
        this.environment = environment;
        this.tasks = list;
        this.linkedAccount = str2;
        this.additionalProduct = product3;
        this.distribution = distribution;
        this.theme = theme;
        this.deeplink = deeplink;
        this.metadata = jSONObject;
        this.language = language;
        this.search = search;
        this.handoff = list2;
        this.experiments = experiments;
        this.nativeAuthentication = z;
        this.clearCookies = z2;
        this.webContentsDebuggingEnabled = z3;
        this.scope = scope;
        this.sessionContext = str3;
        this.token = str4;
        this.customer = customer;
        this.features = features;
        this.environmentURL = str5;
        this.deferredPaymentMethodStrategy = deferredPaymentMethodStrategy;
        this._token = str4;
        if (list != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (financial.atomic.transact.Config.Task task : list) {
                financial.atomic.transact.Config.Product product4 = task.getProduct();
                if (product4 == null || (name3 = product4.name()) == null) {
                    str6 = null;
                } else {
                    str6 = name3.toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str6, "");
                }
                financial.atomic.transact.Config.Distribution distribution2 = task.getDistribution();
                financial.atomic.transact.Config.Product operation = task.getOperation();
                if (operation == null || (name2 = operation.name()) == null) {
                    str7 = null;
                } else {
                    str7 = name2.toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str7, "");
                }
                arrayList2.add(new financial.atomic.transact.Config.TaskData(str6, distribution2, str7, task.getForms(), task.getAction(), task.getApps()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        financial.atomic.transact.Config.Product product5 = this.additionalProduct;
        java.lang.String str8 = this.linkedAccount;
        financial.atomic.transact.Config.Distribution distribution3 = this.distribution;
        financial.atomic.transact.Config.Deeplink deeplink2 = this.deeplink;
        financial.atomic.transact.Config.Theme theme2 = this.theme;
        financial.atomic.transact.Config.Language language2 = this.language;
        java.lang.String str9 = this.sessionContext;
        org.json.JSONObject jSONObject2 = this.metadata;
        financial.atomic.transact.Config.Search search2 = this.search;
        java.util.List<financial.atomic.transact.Config.Handoff> list3 = this.handoff;
        financial.atomic.transact.Config.Experiments experiments2 = this.experiments;
        financial.atomic.transact.Config.Customer customer2 = this.customer;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        int i = android.os.Build.VERSION.SDK_INT;
        this._tokenData = new financial.atomic.transact.Config.TokenData(str, product, product2, scope, arrayList, product5, str8, distribution3, deeplink2, theme2, language2, str9, jSONObject2, search2, list3, experiments2, customer2, bool, new financial.atomic.transact.Config.Platform(com.datadog.android.core.internal.CoreFeature.DEFAULT_SOURCE_NAME, "3.17.1-21", java.lang.String.valueOf(i), java.lang.String.valueOf(i)), this.features, this.deferredPaymentMethodStrategy);
    }

    @kotlin.Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b3\b\u0083\b\u0018\u0000 \u0099\u00012\u00020\u0001:\u0004\u009a\u0001\u0099\u0001B\u0083\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\t\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\u0006\u0010$\u001a\u00020#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*Bù\u0001\b\u0010\u0012\u0006\u0010,\u001a\u00020+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010/\u0012\b\u00101\u001a\u0004\u0018\u00010\u0002\u0012\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b)\u00104J\u0010\u00105\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b9\u00108J\u0010\u0010:\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0018\u0010<\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b>\u00108J\u0012\u0010?\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b?\u00106J\u0012\u0010@\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bH\u00106J\u0012\u0010I\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bK\u0010LJ\u0018\u0010M\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bM\u0010=J\u0012\u0010N\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0012\u0010P\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0012\u0010R\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0010\u0010T\u001a\u00020#HÆ\u0003¢\u0006\u0004\bT\u0010UJ\u0012\u0010V\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0004\bV\u0010WJ\u0012\u0010X\u001a\u0004\u0018\u00010'HÆ\u0003¢\u0006\u0004\bX\u0010YJ\u0090\u0002\u0010Z\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\t2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\b\b\u0002\u0010$\u001a\u00020#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'HÆ\u0001¢\u0006\u0004\bZ\u0010[J\u001a\u0010]\u001a\u00020!2\b\u0010\\\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b]\u0010^J\u0010\u0010_\u001a\u00020+HÖ\u0001¢\u0006\u0004\b_\u0010`J\u0010\u0010a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\ba\u00106J'\u0010h\u001a\u00020g2\u0006\u0010b\u001a\u00020\u00002\u0006\u0010d\u001a\u00020c2\u0006\u0010f\u001a\u00020eH\u0001¢\u0006\u0004\bh\u0010iR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010j\u001a\u0004\bk\u00106R \u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010l\u0012\u0004\bn\u0010o\u001a\u0004\bm\u00108R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010l\u0012\u0004\bq\u0010o\u001a\u0004\bp\u00108R \u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010r\u0012\u0004\bt\u0010o\u001a\u0004\bs\u0010;R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010u\u001a\u0004\bv\u0010=R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010l\u001a\u0004\bw\u00108R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010j\u001a\u0004\bx\u00106R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010y\u001a\u0004\bz\u0010AR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010{\u001a\u0004\b|\u0010CR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010}\u001a\u0004\b~\u0010ER\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0007X\u0087\u0004¢\u0006\r\n\u0004\b\u0015\u0010\u007f\u001a\u0005\b\u0080\u0001\u0010GR\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\r\n\u0004\b\u0016\u0010j\u001a\u0005\b\u0081\u0001\u00106R%\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0007X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0018\u0010\u0082\u0001\u0012\u0005\b\u0084\u0001\u0010o\u001a\u0005\b\u0083\u0001\u0010JR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001a\u0010\u0085\u0001\u001a\u0005\b\u0086\u0001\u0010LR*\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001c\u0010u\u0012\u0005\b\u0088\u0001\u0010o\u001a\u0005\b\u0087\u0001\u0010=R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001e\u0010\u0089\u0001\u001a\u0005\b\u008a\u0001\u0010OR\u001e\u0010 \u001a\u0004\u0018\u00010\u001f8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b \u0010\u008b\u0001\u001a\u0005\b\u008c\u0001\u0010QR\u001e\u0010\"\u001a\u0004\u0018\u00010!8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\"\u0010\u008d\u0001\u001a\u0005\b\u008e\u0001\u0010SR\u001c\u0010$\u001a\u00020#8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b$\u0010\u008f\u0001\u001a\u0005\b\u0090\u0001\u0010UR\u001e\u0010&\u001a\u0004\u0018\u00010%8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b&\u0010\u0091\u0001\u001a\u0005\b\u0092\u0001\u0010WR\u001e\u0010(\u001a\u0004\u0018\u00010'8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b(\u0010\u0093\u0001\u001a\u0005\b\u0094\u0001\u0010YR\u001d\u0010-\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\r\n\u0004\b-\u0010j\u0012\u0005\b\u0095\u0001\u0010oR\u001d\u0010.\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\r\n\u0004\b.\u0010j\u0012\u0005\b\u0096\u0001\u0010oR%\u00100\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010/8\u0002@\u0002X\u0083\u000e¢\u0006\r\n\u0004\b0\u0010u\u0012\u0005\b\u0097\u0001\u0010oR\u001d\u00101\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\r\n\u0004\b1\u0010j\u0012\u0005\b\u0098\u0001\u0010o"}, d2 = {"Lfinancial/atomic/transact/Config$TokenData;", "", "", "publicToken", "Lfinancial/atomic/transact/Config$Product;", "product", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "Lfinancial/atomic/transact/Config$Scope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "", "Lfinancial/atomic/transact/Config$TaskData;", "tasks", "additionalProduct", "linkedAccount", "Lfinancial/atomic/transact/Config$Distribution;", "distribution", "Lfinancial/atomic/transact/Config$Deeplink;", "deeplink", "Lfinancial/atomic/transact/Config$Theme;", com.ingo.sdk.android.ux.activity.IngoSdkActivity.THEME, "Lfinancial/atomic/transact/Config$Language;", com.datadog.trace.api.DDTags.LANGUAGE_TAG_KEY, "sessionContext", "Lorg/json/JSONObject;", "metadata", "Lfinancial/atomic/transact/Config$Search;", com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.Analytics.FEATURE_SEARCH, "Lfinancial/atomic/transact/Config$Handoff;", "handoff", "Lfinancial/atomic/transact/Config$Experiments;", "experiments", "Lfinancial/atomic/transact/Config$Customer;", "customer", "", "inSdk", "Lfinancial/atomic/transact/Config$Platform;", com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, "Lfinancial/atomic/transact/Config$Features;", "features", "Lfinancial/atomic/transact/Config$DeferredPaymentMethodStrategy;", "deferredPaymentMethodStrategy", "<init>", "(Ljava/lang/String;Lfinancial/atomic/transact/Config$Product;Lfinancial/atomic/transact/Config$Product;Lfinancial/atomic/transact/Config$Scope;Ljava/util/List;Lfinancial/atomic/transact/Config$Product;Ljava/lang/String;Lfinancial/atomic/transact/Config$Distribution;Lfinancial/atomic/transact/Config$Deeplink;Lfinancial/atomic/transact/Config$Theme;Lfinancial/atomic/transact/Config$Language;Ljava/lang/String;Lorg/json/JSONObject;Lfinancial/atomic/transact/Config$Search;Ljava/util/List;Lfinancial/atomic/transact/Config$Experiments;Lfinancial/atomic/transact/Config$Customer;Ljava/lang/Boolean;Lfinancial/atomic/transact/Config$Platform;Lfinancial/atomic/transact/Config$Features;Lfinancial/atomic/transact/Config$DeferredPaymentMethodStrategy;)V", "", "seen0", "_product", "_operation", "", "_handoff", "_scope", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lfinancial/atomic/transact/Config$Product;Ljava/lang/String;Lfinancial/atomic/transact/Config$Distribution;Lfinancial/atomic/transact/Config$Deeplink;Lfinancial/atomic/transact/Config$Theme;Lfinancial/atomic/transact/Config$Language;Ljava/lang/String;Lorg/json/JSONObject;Lfinancial/atomic/transact/Config$Search;Lfinancial/atomic/transact/Config$Experiments;Lfinancial/atomic/transact/Config$Customer;Ljava/lang/Boolean;Lfinancial/atomic/transact/Config$Platform;Lfinancial/atomic/transact/Config$Features;Lfinancial/atomic/transact/Config$DeferredPaymentMethodStrategy;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lfinancial/atomic/transact/Config$Product;", "component3", "component4", "()Lfinancial/atomic/transact/Config$Scope;", "component5", "()Ljava/util/List;", "component6", "component7", "component8", "()Lfinancial/atomic/transact/Config$Distribution;", "component9", "()Lfinancial/atomic/transact/Config$Deeplink;", "component10", "()Lfinancial/atomic/transact/Config$Theme;", "component11", "()Lfinancial/atomic/transact/Config$Language;", "component12", "component13", "()Lorg/json/JSONObject;", "component14", "()Lfinancial/atomic/transact/Config$Search;", "component15", "component16", "()Lfinancial/atomic/transact/Config$Experiments;", "component17", "()Lfinancial/atomic/transact/Config$Customer;", "component18", "()Ljava/lang/Boolean;", "component19", "()Lfinancial/atomic/transact/Config$Platform;", "component20", "()Lfinancial/atomic/transact/Config$Features;", "component21", "()Lfinancial/atomic/transact/Config$DeferredPaymentMethodStrategy;", "copy", "(Ljava/lang/String;Lfinancial/atomic/transact/Config$Product;Lfinancial/atomic/transact/Config$Product;Lfinancial/atomic/transact/Config$Scope;Ljava/util/List;Lfinancial/atomic/transact/Config$Product;Ljava/lang/String;Lfinancial/atomic/transact/Config$Distribution;Lfinancial/atomic/transact/Config$Deeplink;Lfinancial/atomic/transact/Config$Theme;Lfinancial/atomic/transact/Config$Language;Ljava/lang/String;Lorg/json/JSONObject;Lfinancial/atomic/transact/Config$Search;Ljava/util/List;Lfinancial/atomic/transact/Config$Experiments;Lfinancial/atomic/transact/Config$Customer;Ljava/lang/Boolean;Lfinancial/atomic/transact/Config$Platform;Lfinancial/atomic/transact/Config$Features;Lfinancial/atomic/transact/Config$DeferredPaymentMethodStrategy;)Lfinancial/atomic/transact/Config$TokenData;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$transact_release", "(Lfinancial/atomic/transact/Config$TokenData;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getPublicToken", "Lfinancial/atomic/transact/Config$Product;", "getProduct", "getProduct$annotations", "()V", "getOperation", "getOperation$annotations", "Lfinancial/atomic/transact/Config$Scope;", "getScope", "getScope$annotations", "Ljava/util/List;", "getTasks", "getAdditionalProduct", "getLinkedAccount", "Lfinancial/atomic/transact/Config$Distribution;", "getDistribution", "Lfinancial/atomic/transact/Config$Deeplink;", "getDeeplink", "Lfinancial/atomic/transact/Config$Theme;", "getTheme", "Lfinancial/atomic/transact/Config$Language;", "getLanguage", "getSessionContext", "Lorg/json/JSONObject;", "getMetadata", "getMetadata$annotations", "Lfinancial/atomic/transact/Config$Search;", "getSearch", "getHandoff", "getHandoff$annotations", "Lfinancial/atomic/transact/Config$Experiments;", "getExperiments", "Lfinancial/atomic/transact/Config$Customer;", "getCustomer", "Ljava/lang/Boolean;", "getInSdk", "Lfinancial/atomic/transact/Config$Platform;", "getPlatform", "Lfinancial/atomic/transact/Config$Features;", "getFeatures", "Lfinancial/atomic/transact/Config$DeferredPaymentMethodStrategy;", "getDeferredPaymentMethodStrategy", "get_product$annotations", "get_operation$annotations", "get_handoff$annotations", "get_scope$annotations", "Companion", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class TokenData {
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final financial.atomic.transact.Config.TokenData.Companion INSTANCE = new financial.atomic.transact.Config.TokenData.Companion(null);
        private java.util.List<java.lang.String> _handoff;
        private java.lang.String _operation;
        private java.lang.String _product;
        private java.lang.String _scope;
        private final financial.atomic.transact.Config.Product additionalProduct;
        private final financial.atomic.transact.Config.Customer customer;
        private final financial.atomic.transact.Config.Deeplink deeplink;
        private final financial.atomic.transact.Config.DeferredPaymentMethodStrategy deferredPaymentMethodStrategy;
        private final financial.atomic.transact.Config.Distribution distribution;
        private final financial.atomic.transact.Config.Experiments experiments;
        private final financial.atomic.transact.Config.Features features;
        private final java.util.List<financial.atomic.transact.Config.Handoff> handoff;
        private final java.lang.Boolean inSdk;
        private final financial.atomic.transact.Config.Language language;
        private final java.lang.String linkedAccount;
        private final org.json.JSONObject metadata;
        private final financial.atomic.transact.Config.Product operation;
        private final financial.atomic.transact.Config.Platform platform;
        private final financial.atomic.transact.Config.Product product;
        private final java.lang.String publicToken;
        private final financial.atomic.transact.Config.Scope scope;
        private final financial.atomic.transact.Config.Search search;
        private final java.lang.String sessionContext;
        private final java.util.List<financial.atomic.transact.Config.TaskData> tasks;
        private final financial.atomic.transact.Config.Theme theme;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfinancial/atomic/transact/Config$TokenData$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$TokenData;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes17.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<financial.atomic.transact.Config.TokenData> serializer() {
                return financial.atomic.transact.Config$TokenData$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            kotlin.LazyThreadSafetyMode lazyThreadSafetyMode = kotlin.LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new kotlin.Lazy[]{null, kotlin.LazyKt.lazy(lazyThreadSafetyMode, new kotlin.jvm.functions.Function0() { // from class: financial.atomic.transact.Config$TokenData$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlinx.serialization.KSerializer _childSerializers$_anonymous_;
                    _childSerializers$_anonymous_ = financial.atomic.transact.Config.TokenData._childSerializers$_anonymous_();
                    return _childSerializers$_anonymous_;
                }
            }), kotlin.LazyKt.lazy(lazyThreadSafetyMode, new kotlin.jvm.functions.Function0() { // from class: financial.atomic.transact.Config$TokenData$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlinx.serialization.KSerializer _childSerializers$_anonymous_$0;
                    _childSerializers$_anonymous_$0 = financial.atomic.transact.Config.TokenData._childSerializers$_anonymous_$0();
                    return _childSerializers$_anonymous_$0;
                }
            }), null, null, null, null, kotlin.LazyKt.lazy(lazyThreadSafetyMode, new kotlin.jvm.functions.Function0() { // from class: financial.atomic.transact.Config$TokenData$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlinx.serialization.KSerializer _childSerializers$_anonymous_$1;
                    _childSerializers$_anonymous_$1 = financial.atomic.transact.Config.TokenData._childSerializers$_anonymous_$1();
                    return _childSerializers$_anonymous_$1;
                }
            }), null, null, null, null, null, null, null, null, kotlin.LazyKt.lazy(lazyThreadSafetyMode, new kotlin.jvm.functions.Function0() { // from class: financial.atomic.transact.Config$TokenData$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlinx.serialization.KSerializer _childSerializers$_anonymous_$2;
                    _childSerializers$_anonymous_$2 = financial.atomic.transact.Config.TokenData._childSerializers$_anonymous_$2();
                    return _childSerializers$_anonymous_$2;
                }
            }), null, null, kotlin.LazyKt.lazy(lazyThreadSafetyMode, new kotlin.jvm.functions.Function0() { // from class: financial.atomic.transact.Config$TokenData$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlinx.serialization.KSerializer _childSerializers$_anonymous_$3;
                    _childSerializers$_anonymous_$3 = financial.atomic.transact.Config.TokenData._childSerializers$_anonymous_$3();
                    return _childSerializers$_anonymous_$3;
                }
            }), null};
        }

        /* JADX WARN: Code restructure failed: missing block: B:66:0x012d, code lost:
        
            if (r1 == null) goto L87;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ TokenData(int i, java.lang.String str, java.util.List list, financial.atomic.transact.Config.Product product, java.lang.String str2, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Deeplink deeplink, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Language language, java.lang.String str3, org.json.JSONObject jSONObject, financial.atomic.transact.Config.Search search, financial.atomic.transact.Config.Experiments experiments, financial.atomic.transact.Config.Customer customer, java.lang.Boolean bool, financial.atomic.transact.Config.Platform platform, financial.atomic.transact.Config.Features features, financial.atomic.transact.Config.DeferredPaymentMethodStrategy deferredPaymentMethodStrategy, java.lang.String str4, java.lang.String str5, java.util.List list2, java.lang.String str6, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            java.lang.String str7;
            java.lang.String str8;
            java.lang.String str9;
            java.lang.String name2;
            if (16385 != (i & 16385)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 16385, financial.atomic.transact.Config$TokenData$$serializer.INSTANCE.getDescriptor());
            }
            this.publicToken = str;
            financial.atomic.transact.Config.Product product2 = financial.atomic.transact.Config.Product.NONE;
            this.product = product2;
            this.operation = product2;
            financial.atomic.transact.Config.Scope scope = financial.atomic.transact.Config.Scope.NONE;
            this.scope = scope;
            if ((i & 2) == 0) {
                this.tasks = null;
            } else {
                this.tasks = list;
            }
            if ((i & 4) == 0) {
                this.additionalProduct = null;
            } else {
                this.additionalProduct = product;
            }
            if ((i & 8) == 0) {
                this.linkedAccount = null;
            } else {
                this.linkedAccount = str2;
            }
            if ((i & 16) == 0) {
                this.distribution = null;
            } else {
                this.distribution = distribution;
            }
            if ((i & 32) == 0) {
                this.deeplink = null;
            } else {
                this.deeplink = deeplink;
            }
            if ((i & 64) == 0) {
                this.theme = null;
            } else {
                this.theme = theme;
            }
            if ((i & 128) == 0) {
                this.language = null;
            } else {
                this.language = language;
            }
            if ((i & 256) == 0) {
                this.sessionContext = null;
            } else {
                this.sessionContext = str3;
            }
            if ((i & 512) == 0) {
                this.metadata = null;
            } else {
                this.metadata = jSONObject;
            }
            if ((i & 1024) == 0) {
                this.search = null;
            } else {
                this.search = search;
            }
            this.handoff = null;
            if ((i & 2048) == 0) {
                this.experiments = null;
            } else {
                this.experiments = experiments;
            }
            if ((i & 4096) == 0) {
                this.customer = null;
            } else {
                this.customer = customer;
            }
            if ((i & 8192) == 0) {
                this.inSdk = null;
            } else {
                this.inSdk = bool;
            }
            this.platform = platform;
            if ((32768 & i) == 0) {
                this.features = null;
            } else {
                this.features = features;
            }
            if ((65536 & i) == 0) {
                this.deferredPaymentMethodStrategy = null;
            } else {
                this.deferredPaymentMethodStrategy = deferredPaymentMethodStrategy;
            }
            if ((131072 & i) == 0) {
                str7 = "NONE".toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str7, "");
            } else {
                str7 = str4;
            }
            this._product = str7;
            if ((262144 & i) == 0) {
                str8 = "NONE".toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str8, "");
            } else {
                str8 = str5;
            }
            this._operation = str8;
            if ((524288 & i) == 0) {
                this._handoff = null;
            } else {
                this._handoff = list2;
            }
            this._scope = (i & 1048576) == 0 ? scope.getValue() : str6;
            java.lang.String name3 = product2.name();
            java.util.Locale locale = java.util.Locale.ROOT;
            java.lang.String lowerCase = name3.toLowerCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            this._product = lowerCase;
            if (product2 != null && (name2 = product2.name()) != null) {
                str9 = name2.toLowerCase(locale);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str9, "");
            }
            str9 = this._product;
            this._operation = str9;
            this._scope = scope.getValue();
        }

        @kotlinx.serialization.Transient
        public static /* synthetic */ void getHandoff$annotations() {
        }

        @kotlinx.serialization.Serializable(with = financial.atomic.a.a.class)
        public static /* synthetic */ void getMetadata$annotations() {
        }

        @kotlinx.serialization.Transient
        public static /* synthetic */ void getOperation$annotations() {
        }

        @kotlinx.serialization.Transient
        public static /* synthetic */ void getProduct$annotations() {
        }

        @kotlinx.serialization.Transient
        public static /* synthetic */ void getScope$annotations() {
        }

        @kotlinx.serialization.SerialName("handoff")
        private static /* synthetic */ void get_handoff$annotations() {
        }

        @kotlinx.serialization.SerialName(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION)
        private static /* synthetic */ void get_operation$annotations() {
        }

        @kotlinx.serialization.SerialName("product")
        private static /* synthetic */ void get_product$annotations() {
        }

        @kotlinx.serialization.SerialName(com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY)
        private static /* synthetic */ void get_scope$annotations() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:64:0x015a, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r2, r5) == false) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0178, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r2, r4) == false) goto L86;
         */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ void write$Self$transact_release(financial.atomic.transact.Config.TokenData self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.publicToken);
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.tasks != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.tasks);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.additionalProduct != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.additionalProduct);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || self.linkedAccount != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.linkedAccount);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 4) || self.distribution != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, financial.atomic.transact.Config$Distribution$$serializer.INSTANCE, self.distribution);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 5) || self.deeplink != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, financial.atomic.transact.Config$Deeplink$$serializer.INSTANCE, self.deeplink);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 6) || self.theme != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, financial.atomic.transact.Config$Theme$$serializer.INSTANCE, self.theme);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 7) || self.language != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, lazyArr[7].getValue(), self.language);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 8) || self.sessionContext != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.sessionContext);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 9) || self.metadata != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, financial.atomic.a.a.INSTANCE, self.metadata);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 10) || self.search != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, financial.atomic.transact.Config$Search$$serializer.INSTANCE, self.search);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 11) || self.experiments != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, financial.atomic.transact.Config$Experiments$$serializer.INSTANCE, self.experiments);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 12) || self.customer != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, financial.atomic.transact.Config$Customer$$serializer.INSTANCE, self.customer);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 13) || self.inSdk != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.inSdk);
            }
            output.encodeSerializableElement(serialDesc, 14, financial.atomic.transact.Config$Platform$$serializer.INSTANCE, self.platform);
            if (output.shouldEncodeElementDefault(serialDesc, 15) || self.features != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, financial.atomic.transact.Config$Features$$serializer.INSTANCE, self.features);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 16) || self.deferredPaymentMethodStrategy != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, lazyArr[16].getValue(), self.deferredPaymentMethodStrategy);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 17)) {
                java.lang.String str = self._product;
                java.lang.String lowerCase = "NONE".toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            }
            output.encodeStringElement(serialDesc, 17, self._product);
            if (!output.shouldEncodeElementDefault(serialDesc, 18)) {
                java.lang.String str2 = self._operation;
                java.lang.String lowerCase2 = "NONE".toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            }
            output.encodeStringElement(serialDesc, 18, self._operation);
            if (output.shouldEncodeElementDefault(serialDesc, 19) || self._handoff != null) {
                output.encodeNullableSerializableElement(serialDesc, 19, lazyArr[19].getValue(), self._handoff);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 20) || !kotlin.jvm.internal.Intrinsics.areEqual(self._scope, financial.atomic.transact.Config.Scope.NONE.getValue())) {
                output.encodeStringElement(serialDesc, 20, self._scope);
            }
        }

        public final financial.atomic.transact.Config.Product getAdditionalProduct() {
            return this.additionalProduct;
        }

        public final financial.atomic.transact.Config.Customer getCustomer() {
            return this.customer;
        }

        public final financial.atomic.transact.Config.Deeplink getDeeplink() {
            return this.deeplink;
        }

        public final financial.atomic.transact.Config.DeferredPaymentMethodStrategy getDeferredPaymentMethodStrategy() {
            return this.deferredPaymentMethodStrategy;
        }

        public final financial.atomic.transact.Config.Distribution getDistribution() {
            return this.distribution;
        }

        public final financial.atomic.transact.Config.Experiments getExperiments() {
            return this.experiments;
        }

        public final financial.atomic.transact.Config.Features getFeatures() {
            return this.features;
        }

        public final java.util.List<financial.atomic.transact.Config.Handoff> getHandoff() {
            return this.handoff;
        }

        public final java.lang.Boolean getInSdk() {
            return this.inSdk;
        }

        public final financial.atomic.transact.Config.Language getLanguage() {
            return this.language;
        }

        public final java.lang.String getLinkedAccount() {
            return this.linkedAccount;
        }

        public final org.json.JSONObject getMetadata() {
            return this.metadata;
        }

        public final financial.atomic.transact.Config.Product getOperation() {
            return this.operation;
        }

        public final financial.atomic.transact.Config.Platform getPlatform() {
            return this.platform;
        }

        public final financial.atomic.transact.Config.Product getProduct() {
            return this.product;
        }

        public final java.lang.String getPublicToken() {
            return this.publicToken;
        }

        public final financial.atomic.transact.Config.Scope getScope() {
            return this.scope;
        }

        public final financial.atomic.transact.Config.Search getSearch() {
            return this.search;
        }

        public final java.lang.String getSessionContext() {
            return this.sessionContext;
        }

        public final java.util.List<financial.atomic.transact.Config.TaskData> getTasks() {
            return this.tasks;
        }

        public final financial.atomic.transact.Config.Theme getTheme() {
            return this.theme;
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x009a, code lost:
        
            if (r1 == null) goto L8;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public TokenData(java.lang.String str, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Product product2, financial.atomic.transact.Config.Scope scope, java.util.List<financial.atomic.transact.Config.TaskData> list, financial.atomic.transact.Config.Product product3, java.lang.String str2, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Deeplink deeplink, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Language language, java.lang.String str3, org.json.JSONObject jSONObject, financial.atomic.transact.Config.Search search, java.util.List<? extends financial.atomic.transact.Config.Handoff> list2, financial.atomic.transact.Config.Experiments experiments, financial.atomic.transact.Config.Customer customer, java.lang.Boolean bool, financial.atomic.transact.Config.Platform platform, financial.atomic.transact.Config.Features features, financial.atomic.transact.Config.DeferredPaymentMethodStrategy deferredPaymentMethodStrategy) {
            java.lang.String str4;
            java.lang.String name2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platform, "");
            this.publicToken = str;
            this.product = product;
            this.operation = product2;
            this.scope = scope;
            this.tasks = list;
            this.additionalProduct = product3;
            this.linkedAccount = str2;
            this.distribution = distribution;
            this.deeplink = deeplink;
            this.theme = theme;
            this.language = language;
            this.sessionContext = str3;
            this.metadata = jSONObject;
            this.search = search;
            this.handoff = list2;
            this.experiments = experiments;
            this.customer = customer;
            this.inSdk = bool;
            this.platform = platform;
            this.features = features;
            this.deferredPaymentMethodStrategy = deferredPaymentMethodStrategy;
            java.util.Locale locale = java.util.Locale.ROOT;
            java.lang.String lowerCase = "NONE".toLowerCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            this._product = lowerCase;
            java.lang.String lowerCase2 = "NONE".toLowerCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            this._operation = lowerCase2;
            this._scope = financial.atomic.transact.Config.Scope.NONE.getValue();
            java.lang.String lowerCase3 = product.name().toLowerCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
            this._product = lowerCase3;
            if (product2 != null && (name2 = product2.name()) != null) {
                str4 = name2.toLowerCase(locale);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "");
            }
            str4 = this._product;
            this._operation = str4;
            this._scope = scope.getValue();
            if (list2 != 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((financial.atomic.transact.Config.Handoff) it.next()).getValue());
                }
                this._handoff = arrayList;
            }
        }

        public /* synthetic */ TokenData(java.lang.String str, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Product product2, financial.atomic.transact.Config.Scope scope, java.util.List list, financial.atomic.transact.Config.Product product3, java.lang.String str2, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Deeplink deeplink, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Language language, java.lang.String str3, org.json.JSONObject jSONObject, financial.atomic.transact.Config.Search search, java.util.List list2, financial.atomic.transact.Config.Experiments experiments, financial.atomic.transact.Config.Customer customer, java.lang.Boolean bool, financial.atomic.transact.Config.Platform platform, financial.atomic.transact.Config.Features features, financial.atomic.transact.Config.DeferredPaymentMethodStrategy deferredPaymentMethodStrategy, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? financial.atomic.transact.Config.Product.NONE : product, (i & 4) != 0 ? financial.atomic.transact.Config.Product.NONE : product2, (i & 8) != 0 ? financial.atomic.transact.Config.Scope.NONE : scope, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : product3, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : distribution, (i & 256) != 0 ? null : deeplink, (i & 512) != 0 ? null : theme, (i & 1024) != 0 ? null : language, (i & 2048) != 0 ? null : str3, (i & 4096) != 0 ? null : jSONObject, (i & 8192) != 0 ? null : search, (i & 16384) != 0 ? null : list2, (32768 & i) != 0 ? null : experiments, (65536 & i) != 0 ? null : customer, (131072 & i) != 0 ? null : bool, platform, (524288 & i) != 0 ? null : features, (i & 1048576) != 0 ? null : deferredPaymentMethodStrategy);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TokenData(publicToken=");
            sb.append(this.publicToken);
            sb.append(", product=");
            sb.append(this.product);
            sb.append(", operation=");
            sb.append(this.operation);
            sb.append(", scope=");
            sb.append(this.scope);
            sb.append(", tasks=");
            sb.append(this.tasks);
            sb.append(", additionalProduct=");
            sb.append(this.additionalProduct);
            sb.append(", linkedAccount=");
            sb.append(this.linkedAccount);
            sb.append(", distribution=");
            sb.append(this.distribution);
            sb.append(", deeplink=");
            sb.append(this.deeplink);
            sb.append(", theme=");
            sb.append(this.theme);
            sb.append(", language=");
            sb.append(this.language);
            sb.append(", sessionContext=");
            sb.append(this.sessionContext);
            sb.append(", metadata=");
            sb.append(this.metadata);
            sb.append(", search=");
            sb.append(this.search);
            sb.append(", handoff=");
            sb.append(this.handoff);
            sb.append(", experiments=");
            sb.append(this.experiments);
            sb.append(", customer=");
            sb.append(this.customer);
            sb.append(", inSdk=");
            sb.append(this.inSdk);
            sb.append(", platform=");
            sb.append(this.platform);
            sb.append(", features=");
            sb.append(this.features);
            sb.append(", deferredPaymentMethodStrategy=");
            sb.append(this.deferredPaymentMethodStrategy);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.publicToken.hashCode();
            int hashCode2 = this.product.hashCode();
            financial.atomic.transact.Config.Product product = this.operation;
            int hashCode3 = product == null ? 0 : product.hashCode();
            int hashCode4 = this.scope.hashCode();
            java.util.List<financial.atomic.transact.Config.TaskData> list = this.tasks;
            int hashCode5 = list == null ? 0 : list.hashCode();
            financial.atomic.transact.Config.Product product2 = this.additionalProduct;
            int hashCode6 = product2 == null ? 0 : product2.hashCode();
            java.lang.String str = this.linkedAccount;
            int hashCode7 = str == null ? 0 : str.hashCode();
            financial.atomic.transact.Config.Distribution distribution = this.distribution;
            int hashCode8 = distribution == null ? 0 : distribution.hashCode();
            financial.atomic.transact.Config.Deeplink deeplink = this.deeplink;
            int hashCode9 = deeplink == null ? 0 : deeplink.hashCode();
            financial.atomic.transact.Config.Theme theme = this.theme;
            int hashCode10 = theme == null ? 0 : theme.hashCode();
            financial.atomic.transact.Config.Language language = this.language;
            int hashCode11 = language == null ? 0 : language.hashCode();
            java.lang.String str2 = this.sessionContext;
            int hashCode12 = str2 == null ? 0 : str2.hashCode();
            org.json.JSONObject jSONObject = this.metadata;
            int hashCode13 = jSONObject == null ? 0 : jSONObject.hashCode();
            financial.atomic.transact.Config.Search search = this.search;
            int hashCode14 = search == null ? 0 : search.hashCode();
            java.util.List<financial.atomic.transact.Config.Handoff> list2 = this.handoff;
            int hashCode15 = list2 == null ? 0 : list2.hashCode();
            financial.atomic.transact.Config.Experiments experiments = this.experiments;
            int hashCode16 = experiments == null ? 0 : experiments.hashCode();
            financial.atomic.transact.Config.Customer customer = this.customer;
            int hashCode17 = customer == null ? 0 : customer.hashCode();
            java.lang.Boolean bool = this.inSdk;
            int hashCode18 = bool == null ? 0 : bool.hashCode();
            int hashCode19 = this.platform.hashCode();
            financial.atomic.transact.Config.Features features = this.features;
            int hashCode20 = features == null ? 0 : features.hashCode();
            financial.atomic.transact.Config.DeferredPaymentMethodStrategy deferredPaymentMethodStrategy = this.deferredPaymentMethodStrategy;
            return ((((hashCode19 + ((((((((((((((((((((((((((((((hashCode4 + ((((hashCode2 + (hashCode * 31)) * 31) + hashCode3) * 31)) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31)) * 31) + hashCode20) * 31) + (deferredPaymentMethodStrategy != null ? deferredPaymentMethodStrategy.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof financial.atomic.transact.Config.TokenData)) {
                return false;
            }
            financial.atomic.transact.Config.TokenData tokenData = (financial.atomic.transact.Config.TokenData) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.publicToken, tokenData.publicToken) && this.product == tokenData.product && this.operation == tokenData.operation && this.scope == tokenData.scope && kotlin.jvm.internal.Intrinsics.areEqual(this.tasks, tokenData.tasks) && this.additionalProduct == tokenData.additionalProduct && kotlin.jvm.internal.Intrinsics.areEqual(this.linkedAccount, tokenData.linkedAccount) && kotlin.jvm.internal.Intrinsics.areEqual(this.distribution, tokenData.distribution) && kotlin.jvm.internal.Intrinsics.areEqual(this.deeplink, tokenData.deeplink) && kotlin.jvm.internal.Intrinsics.areEqual(this.theme, tokenData.theme) && this.language == tokenData.language && kotlin.jvm.internal.Intrinsics.areEqual(this.sessionContext, tokenData.sessionContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.metadata, tokenData.metadata) && kotlin.jvm.internal.Intrinsics.areEqual(this.search, tokenData.search) && kotlin.jvm.internal.Intrinsics.areEqual(this.handoff, tokenData.handoff) && kotlin.jvm.internal.Intrinsics.areEqual(this.experiments, tokenData.experiments) && kotlin.jvm.internal.Intrinsics.areEqual(this.customer, tokenData.customer) && kotlin.jvm.internal.Intrinsics.areEqual(this.inSdk, tokenData.inSdk) && kotlin.jvm.internal.Intrinsics.areEqual(this.platform, tokenData.platform) && kotlin.jvm.internal.Intrinsics.areEqual(this.features, tokenData.features) && this.deferredPaymentMethodStrategy == tokenData.deferredPaymentMethodStrategy;
        }

        public final financial.atomic.transact.Config.TokenData copy(java.lang.String publicToken, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Product operation, financial.atomic.transact.Config.Scope scope, java.util.List<financial.atomic.transact.Config.TaskData> tasks, financial.atomic.transact.Config.Product additionalProduct, java.lang.String linkedAccount, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Deeplink deeplink, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Language language, java.lang.String sessionContext, org.json.JSONObject metadata, financial.atomic.transact.Config.Search search, java.util.List<? extends financial.atomic.transact.Config.Handoff> handoff, financial.atomic.transact.Config.Experiments experiments, financial.atomic.transact.Config.Customer customer, java.lang.Boolean inSdk, financial.atomic.transact.Config.Platform platform, financial.atomic.transact.Config.Features features, financial.atomic.transact.Config.DeferredPaymentMethodStrategy deferredPaymentMethodStrategy) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicToken, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platform, "");
            return new financial.atomic.transact.Config.TokenData(publicToken, product, operation, scope, tasks, additionalProduct, linkedAccount, distribution, deeplink, theme, language, sessionContext, metadata, search, handoff, experiments, customer, inSdk, platform, features, deferredPaymentMethodStrategy);
        }

        /* renamed from: component9, reason: from getter */
        public final financial.atomic.transact.Config.Deeplink getDeeplink() {
            return this.deeplink;
        }

        /* renamed from: component8, reason: from getter */
        public final financial.atomic.transact.Config.Distribution getDistribution() {
            return this.distribution;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getLinkedAccount() {
            return this.linkedAccount;
        }

        /* renamed from: component6, reason: from getter */
        public final financial.atomic.transact.Config.Product getAdditionalProduct() {
            return this.additionalProduct;
        }

        public final java.util.List<financial.atomic.transact.Config.TaskData> component5() {
            return this.tasks;
        }

        /* renamed from: component4, reason: from getter */
        public final financial.atomic.transact.Config.Scope getScope() {
            return this.scope;
        }

        /* renamed from: component3, reason: from getter */
        public final financial.atomic.transact.Config.Product getOperation() {
            return this.operation;
        }

        /* renamed from: component21, reason: from getter */
        public final financial.atomic.transact.Config.DeferredPaymentMethodStrategy getDeferredPaymentMethodStrategy() {
            return this.deferredPaymentMethodStrategy;
        }

        /* renamed from: component20, reason: from getter */
        public final financial.atomic.transact.Config.Features getFeatures() {
            return this.features;
        }

        /* renamed from: component2, reason: from getter */
        public final financial.atomic.transact.Config.Product getProduct() {
            return this.product;
        }

        /* renamed from: component19, reason: from getter */
        public final financial.atomic.transact.Config.Platform getPlatform() {
            return this.platform;
        }

        /* renamed from: component18, reason: from getter */
        public final java.lang.Boolean getInSdk() {
            return this.inSdk;
        }

        /* renamed from: component17, reason: from getter */
        public final financial.atomic.transact.Config.Customer getCustomer() {
            return this.customer;
        }

        /* renamed from: component16, reason: from getter */
        public final financial.atomic.transact.Config.Experiments getExperiments() {
            return this.experiments;
        }

        public final java.util.List<financial.atomic.transact.Config.Handoff> component15() {
            return this.handoff;
        }

        /* renamed from: component14, reason: from getter */
        public final financial.atomic.transact.Config.Search getSearch() {
            return this.search;
        }

        /* renamed from: component13, reason: from getter */
        public final org.json.JSONObject getMetadata() {
            return this.metadata;
        }

        /* renamed from: component12, reason: from getter */
        public final java.lang.String getSessionContext() {
            return this.sessionContext;
        }

        /* renamed from: component11, reason: from getter */
        public final financial.atomic.transact.Config.Language getLanguage() {
            return this.language;
        }

        /* renamed from: component10, reason: from getter */
        public final financial.atomic.transact.Config.Theme getTheme() {
            return this.theme;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPublicToken() {
            return this.publicToken;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ kotlinx.serialization.KSerializer _childSerializers$_anonymous_$3() {
            return new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ kotlinx.serialization.KSerializer _childSerializers$_anonymous_$2() {
            return financial.atomic.transact.Config.DeferredPaymentMethodStrategy.INSTANCE.serializer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ kotlinx.serialization.KSerializer _childSerializers$_anonymous_$1() {
            return kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("financial.atomic.transact.Config.Language", financial.atomic.transact.Config.Language.values());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ kotlinx.serialization.KSerializer _childSerializers$_anonymous_$0() {
            return financial.atomic.transact.Config.Product.INSTANCE.serializer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ kotlinx.serialization.KSerializer _childSerializers$_anonymous_() {
            return new kotlinx.serialization.internal.ArrayListSerializer(financial.atomic.transact.Config$TaskData$$serializer.INSTANCE);
        }
    }

    public /* synthetic */ Config(java.lang.String str, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Product product2, financial.atomic.transact.Config.Environment environment, java.util.List list, java.lang.String str2, financial.atomic.transact.Config.Product product3, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Deeplink deeplink, org.json.JSONObject jSONObject, financial.atomic.transact.Config.Language language, financial.atomic.transact.Config.Search search, java.util.List list2, financial.atomic.transact.Config.Experiments experiments, boolean z, boolean z2, boolean z3, financial.atomic.transact.Config.Scope scope, java.lang.String str3, java.lang.String str4, financial.atomic.transact.Config.Customer customer, financial.atomic.transact.Config.Features features, java.lang.String str5, financial.atomic.transact.Config.DeferredPaymentMethodStrategy deferredPaymentMethodStrategy, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, product, (i & 4) != 0 ? null : product2, (i & 8) != 0 ? financial.atomic.transact.Config.Environment.PRODUCTION : environment, (java.util.List<financial.atomic.transact.Config.Task>) ((i & 16) != 0 ? null : list), (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : product3, (i & 128) != 0 ? null : distribution, (i & 256) != 0 ? null : theme, (i & 512) != 0 ? null : deeplink, (i & 1024) != 0 ? null : jSONObject, (i & 2048) != 0 ? null : language, (i & 4096) != 0 ? null : search, (java.util.List<? extends financial.atomic.transact.Config.Handoff>) ((i & 8192) != 0 ? null : list2), (i & 16384) != 0 ? null : experiments, (32768 & i) != 0 ? true : z, (65536 & i) != 0 ? false : z2, (131072 & i) != 0 ? false : z3, (262144 & i) != 0 ? financial.atomic.transact.Config.Scope.NONE : scope, (524288 & i) != 0 ? null : str3, (1048576 & i) != 0 ? null : str4, (2097152 & i) != 0 ? null : customer, (4194304 & i) != 0 ? null : features, (8388608 & i) != 0 ? null : str5, (i & 16777216) != 0 ? null : deferredPaymentMethodStrategy);
    }

    public /* synthetic */ Config(java.lang.String str, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product2, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Deeplink deeplink, org.json.JSONObject jSONObject, financial.atomic.transact.Config.Language language, financial.atomic.transact.Config.Search search, java.util.List list, financial.atomic.transact.Config.Experiments experiments, boolean z, boolean z2, boolean z3, financial.atomic.transact.Config.Scope scope, java.lang.String str3, financial.atomic.transact.Config.Product product3, financial.atomic.transact.Config.Customer customer, financial.atomic.transact.Config.Features features, java.lang.String str4, financial.atomic.transact.Config.DeferredPaymentMethodStrategy deferredPaymentMethodStrategy, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, product, (i & 4) != 0 ? financial.atomic.transact.Config.Environment.PRODUCTION : environment, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : product2, (i & 32) != 0 ? null : distribution, (i & 64) != 0 ? null : theme, (i & 128) != 0 ? null : deeplink, (i & 256) != 0 ? null : jSONObject, (i & 512) != 0 ? null : language, (i & 1024) != 0 ? null : search, (i & 2048) != 0 ? null : list, (i & 4096) != 0 ? null : experiments, (i & 8192) != 0 ? true : z, (i & 16384) != 0 ? false : z2, (32768 & i) != 0 ? false : z3, (65536 & i) != 0 ? financial.atomic.transact.Config.Scope.NONE : scope, (131072 & i) != 0 ? null : str3, (262144 & i) != 0 ? null : product3, (524288 & i) != 0 ? null : customer, (1048576 & i) != 0 ? null : features, (2097152 & i) != 0 ? null : str4, (i & 4194304) != 0 ? null : deferredPaymentMethodStrategy);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product2, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Deeplink deeplink, org.json.JSONObject jSONObject, financial.atomic.transact.Config.Language language, financial.atomic.transact.Config.Search search, java.util.List<? extends financial.atomic.transact.Config.Handoff> list, financial.atomic.transact.Config.Experiments experiments, boolean z, boolean z2, boolean z3, financial.atomic.transact.Config.Scope scope, java.lang.String str3, financial.atomic.transact.Config.Product product3, financial.atomic.transact.Config.Customer customer, financial.atomic.transact.Config.Features features, java.lang.String str4, financial.atomic.transact.Config.DeferredPaymentMethodStrategy deferredPaymentMethodStrategy) {
        this(str, product, product3 == null ? product : product3, environment, null, str2, product2, distribution, theme, deeplink, jSONObject, language, search, list, experiments, z, z2, z3, scope, str3, null, customer, features, str4, deferredPaymentMethodStrategy, 16, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
    }

    public /* synthetic */ Config(java.lang.String str, java.util.List list, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Deeplink deeplink, org.json.JSONObject jSONObject, financial.atomic.transact.Config.Language language, financial.atomic.transact.Config.Search search, java.util.List list2, financial.atomic.transact.Config.Experiments experiments, boolean z, boolean z2, boolean z3, financial.atomic.transact.Config.Scope scope, java.lang.String str3, financial.atomic.transact.Config.Customer customer, financial.atomic.transact.Config.Features features, java.lang.String str4, financial.atomic.transact.Config.DeferredPaymentMethodStrategy deferredPaymentMethodStrategy, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (java.util.List<financial.atomic.transact.Config.Task>) list, (i & 4) != 0 ? financial.atomic.transact.Config.Environment.PRODUCTION : environment, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : product, (i & 32) != 0 ? null : distribution, (i & 64) != 0 ? null : theme, (i & 128) != 0 ? null : deeplink, (i & 256) != 0 ? null : jSONObject, (i & 512) != 0 ? null : language, (i & 1024) != 0 ? null : search, (java.util.List<? extends financial.atomic.transact.Config.Handoff>) ((i & 2048) != 0 ? null : list2), (i & 4096) != 0 ? null : experiments, (i & 8192) != 0 ? true : z, (i & 16384) != 0 ? false : z2, (32768 & i) != 0 ? false : z3, (65536 & i) != 0 ? financial.atomic.transact.Config.Scope.NONE : scope, (131072 & i) != 0 ? null : str3, (262144 & i) != 0 ? null : customer, (524288 & i) != 0 ? null : features, (1048576 & i) != 0 ? null : str4, (i & 2097152) != 0 ? null : deferredPaymentMethodStrategy);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, java.util.List<financial.atomic.transact.Config.Task> list, financial.atomic.transact.Config.Environment environment, java.lang.String str2, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Deeplink deeplink, org.json.JSONObject jSONObject, financial.atomic.transact.Config.Language language, financial.atomic.transact.Config.Search search, java.util.List<? extends financial.atomic.transact.Config.Handoff> list2, financial.atomic.transact.Config.Experiments experiments, boolean z, boolean z2, boolean z3, financial.atomic.transact.Config.Scope scope, java.lang.String str3, financial.atomic.transact.Config.Customer customer, financial.atomic.transact.Config.Features features, java.lang.String str4, financial.atomic.transact.Config.DeferredPaymentMethodStrategy deferredPaymentMethodStrategy) {
        this(str, financial.atomic.transact.Config.Product.NONE, null, environment, list, str2, product, distribution, theme, deeplink, jSONObject, language, search, list2, experiments, z, z2, z3, scope, str3, null, customer, features, str4, deferredPaymentMethodStrategy, 1048580, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
    }

    public /* synthetic */ Config(java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? true : z3, (i & 32) != 0 ? null : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Config(java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3, java.lang.String str3) {
        this("", financial.atomic.transact.Config.Product.NONE, null, financial.atomic.transact.Config.Environment.valueOf(str2), null, null, null, null, null, null, null, null, null, null, null, z3, z, z2, null, null, str, null, null, str3, null, 23887860, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Config(publicToken=");
        sb.append(this.publicToken);
        sb.append(", product=");
        sb.append(this.product);
        sb.append(", operation=");
        sb.append(this.operation);
        sb.append(", environment=");
        sb.append(this.environment);
        sb.append(", tasks=");
        sb.append(this.tasks);
        sb.append(", linkedAccount=");
        sb.append(this.linkedAccount);
        sb.append(", additionalProduct=");
        sb.append(this.additionalProduct);
        sb.append(", distribution=");
        sb.append(this.distribution);
        sb.append(", theme=");
        sb.append(this.theme);
        sb.append(", deeplink=");
        sb.append(this.deeplink);
        sb.append(", metadata=");
        sb.append(this.metadata);
        sb.append(", language=");
        sb.append(this.language);
        sb.append(", search=");
        sb.append(this.search);
        sb.append(", handoff=");
        sb.append(this.handoff);
        sb.append(", experiments=");
        sb.append(this.experiments);
        sb.append(", nativeAuthentication=");
        sb.append(this.nativeAuthentication);
        sb.append(", clearCookies=");
        sb.append(this.clearCookies);
        sb.append(", webContentsDebuggingEnabled=");
        sb.append(this.webContentsDebuggingEnabled);
        sb.append(", scope=");
        sb.append(this.scope);
        sb.append(", sessionContext=");
        sb.append(this.sessionContext);
        sb.append(", token=");
        sb.append(this.token);
        sb.append(", customer=");
        sb.append(this.customer);
        sb.append(", features=");
        sb.append(this.features);
        sb.append(", environmentURL=");
        sb.append(this.environmentURL);
        sb.append(", deferredPaymentMethodStrategy=");
        sb.append(this.deferredPaymentMethodStrategy);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.publicToken.hashCode();
        int hashCode2 = this.product.hashCode();
        financial.atomic.transact.Config.Product product = this.operation;
        int hashCode3 = product == null ? 0 : product.hashCode();
        int hashCode4 = this.environment.hashCode();
        java.util.List<financial.atomic.transact.Config.Task> list = this.tasks;
        int hashCode5 = list == null ? 0 : list.hashCode();
        java.lang.String str = this.linkedAccount;
        int hashCode6 = str == null ? 0 : str.hashCode();
        financial.atomic.transact.Config.Product product2 = this.additionalProduct;
        int hashCode7 = product2 == null ? 0 : product2.hashCode();
        financial.atomic.transact.Config.Distribution distribution = this.distribution;
        int hashCode8 = distribution == null ? 0 : distribution.hashCode();
        financial.atomic.transact.Config.Theme theme = this.theme;
        int hashCode9 = theme == null ? 0 : theme.hashCode();
        financial.atomic.transact.Config.Deeplink deeplink = this.deeplink;
        int hashCode10 = deeplink == null ? 0 : deeplink.hashCode();
        org.json.JSONObject jSONObject = this.metadata;
        int hashCode11 = jSONObject == null ? 0 : jSONObject.hashCode();
        financial.atomic.transact.Config.Language language = this.language;
        int hashCode12 = language == null ? 0 : language.hashCode();
        financial.atomic.transact.Config.Search search = this.search;
        int hashCode13 = search == null ? 0 : search.hashCode();
        java.util.List<financial.atomic.transact.Config.Handoff> list2 = this.handoff;
        int hashCode14 = list2 == null ? 0 : list2.hashCode();
        financial.atomic.transact.Config.Experiments experiments = this.experiments;
        int hashCode15 = experiments == null ? 0 : experiments.hashCode();
        int hashCode16 = java.lang.Boolean.hashCode(this.nativeAuthentication);
        int hashCode17 = java.lang.Boolean.hashCode(this.clearCookies);
        int hashCode18 = java.lang.Boolean.hashCode(this.webContentsDebuggingEnabled);
        int hashCode19 = this.scope.hashCode();
        java.lang.String str2 = this.sessionContext;
        int hashCode20 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.token;
        int hashCode21 = str3 == null ? 0 : str3.hashCode();
        financial.atomic.transact.Config.Customer customer = this.customer;
        int hashCode22 = customer == null ? 0 : customer.hashCode();
        financial.atomic.transact.Config.Features features = this.features;
        int hashCode23 = features == null ? 0 : features.hashCode();
        java.lang.String str4 = this.environmentURL;
        int hashCode24 = str4 == null ? 0 : str4.hashCode();
        financial.atomic.transact.Config.DeferredPaymentMethodStrategy deferredPaymentMethodStrategy = this.deferredPaymentMethodStrategy;
        return ((((((((((((hashCode19 + ((hashCode18 + ((hashCode17 + ((hashCode16 + ((((((((((((((((((((((((hashCode4 + ((((hashCode2 + (hashCode * 31)) * 31) + hashCode3) * 31)) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31)) * 31)) * 31)) * 31)) * 31) + hashCode20) * 31) + hashCode21) * 31) + hashCode22) * 31) + hashCode23) * 31) + hashCode24) * 31) + (deferredPaymentMethodStrategy != null ? deferredPaymentMethodStrategy.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof financial.atomic.transact.Config)) {
            return false;
        }
        financial.atomic.transact.Config config = (financial.atomic.transact.Config) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.publicToken, config.publicToken) && this.product == config.product && this.operation == config.operation && this.environment == config.environment && kotlin.jvm.internal.Intrinsics.areEqual(this.tasks, config.tasks) && kotlin.jvm.internal.Intrinsics.areEqual(this.linkedAccount, config.linkedAccount) && this.additionalProduct == config.additionalProduct && kotlin.jvm.internal.Intrinsics.areEqual(this.distribution, config.distribution) && kotlin.jvm.internal.Intrinsics.areEqual(this.theme, config.theme) && kotlin.jvm.internal.Intrinsics.areEqual(this.deeplink, config.deeplink) && kotlin.jvm.internal.Intrinsics.areEqual(this.metadata, config.metadata) && this.language == config.language && kotlin.jvm.internal.Intrinsics.areEqual(this.search, config.search) && kotlin.jvm.internal.Intrinsics.areEqual(this.handoff, config.handoff) && kotlin.jvm.internal.Intrinsics.areEqual(this.experiments, config.experiments) && this.nativeAuthentication == config.nativeAuthentication && this.clearCookies == config.clearCookies && this.webContentsDebuggingEnabled == config.webContentsDebuggingEnabled && this.scope == config.scope && kotlin.jvm.internal.Intrinsics.areEqual(this.sessionContext, config.sessionContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.token, config.token) && kotlin.jvm.internal.Intrinsics.areEqual(this.customer, config.customer) && kotlin.jvm.internal.Intrinsics.areEqual(this.features, config.features) && kotlin.jvm.internal.Intrinsics.areEqual(this.environmentURL, config.environmentURL) && this.deferredPaymentMethodStrategy == config.deferredPaymentMethodStrategy;
    }

    public final financial.atomic.transact.Config copy(java.lang.String publicToken, financial.atomic.transact.Config.Product product, financial.atomic.transact.Config.Product operation, financial.atomic.transact.Config.Environment environment, java.util.List<financial.atomic.transact.Config.Task> tasks, java.lang.String linkedAccount, financial.atomic.transact.Config.Product additionalProduct, financial.atomic.transact.Config.Distribution distribution, financial.atomic.transact.Config.Theme theme, financial.atomic.transact.Config.Deeplink deeplink, org.json.JSONObject metadata, financial.atomic.transact.Config.Language language, financial.atomic.transact.Config.Search search, java.util.List<? extends financial.atomic.transact.Config.Handoff> handoff, financial.atomic.transact.Config.Experiments experiments, boolean nativeAuthentication, boolean clearCookies, boolean webContentsDebuggingEnabled, financial.atomic.transact.Config.Scope scope, java.lang.String sessionContext, java.lang.String token, financial.atomic.transact.Config.Customer customer, financial.atomic.transact.Config.Features features, java.lang.String environmentURL, financial.atomic.transact.Config.DeferredPaymentMethodStrategy deferredPaymentMethodStrategy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicToken, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
        return new financial.atomic.transact.Config(publicToken, product, operation, environment, tasks, linkedAccount, additionalProduct, distribution, theme, deeplink, metadata, language, search, handoff, experiments, nativeAuthentication, clearCookies, webContentsDebuggingEnabled, scope, sessionContext, token, customer, features, environmentURL, deferredPaymentMethodStrategy);
    }

    /* renamed from: component9, reason: from getter */
    public final financial.atomic.transact.Config.Theme getTheme() {
        return this.theme;
    }

    /* renamed from: component8, reason: from getter */
    public final financial.atomic.transact.Config.Distribution getDistribution() {
        return this.distribution;
    }

    /* renamed from: component7, reason: from getter */
    public final financial.atomic.transact.Config.Product getAdditionalProduct() {
        return this.additionalProduct;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getLinkedAccount() {
        return this.linkedAccount;
    }

    public final java.util.List<financial.atomic.transact.Config.Task> component5() {
        return this.tasks;
    }

    /* renamed from: component4, reason: from getter */
    public final financial.atomic.transact.Config.Environment getEnvironment() {
        return this.environment;
    }

    /* renamed from: component3, reason: from getter */
    public final financial.atomic.transact.Config.Product getOperation() {
        return this.operation;
    }

    /* renamed from: component25, reason: from getter */
    public final financial.atomic.transact.Config.DeferredPaymentMethodStrategy getDeferredPaymentMethodStrategy() {
        return this.deferredPaymentMethodStrategy;
    }

    /* renamed from: component24, reason: from getter */
    public final java.lang.String getEnvironmentURL() {
        return this.environmentURL;
    }

    /* renamed from: component23, reason: from getter */
    public final financial.atomic.transact.Config.Features getFeatures() {
        return this.features;
    }

    /* renamed from: component22, reason: from getter */
    public final financial.atomic.transact.Config.Customer getCustomer() {
        return this.customer;
    }

    /* renamed from: component20, reason: from getter */
    public final java.lang.String getSessionContext() {
        return this.sessionContext;
    }

    /* renamed from: component2, reason: from getter */
    public final financial.atomic.transact.Config.Product getProduct() {
        return this.product;
    }

    /* renamed from: component19, reason: from getter */
    public final financial.atomic.transact.Config.Scope getScope() {
        return this.scope;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getWebContentsDebuggingEnabled() {
        return this.webContentsDebuggingEnabled;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getClearCookies() {
        return this.clearCookies;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getNativeAuthentication() {
        return this.nativeAuthentication;
    }

    /* renamed from: component15, reason: from getter */
    public final financial.atomic.transact.Config.Experiments getExperiments() {
        return this.experiments;
    }

    public final java.util.List<financial.atomic.transact.Config.Handoff> component14() {
        return this.handoff;
    }

    /* renamed from: component13, reason: from getter */
    public final financial.atomic.transact.Config.Search getSearch() {
        return this.search;
    }

    /* renamed from: component12, reason: from getter */
    public final financial.atomic.transact.Config.Language getLanguage() {
        return this.language;
    }

    /* renamed from: component11, reason: from getter */
    public final org.json.JSONObject getMetadata() {
        return this.metadata;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lfinancial/atomic/transact/Config$DeferredPaymentMethodStrategy;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "SDK", com.izettle.android.auth.repository.BaseUriRepositoryImpl.API_SERVICE_KEY}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final class DeferredPaymentMethodStrategy {
        private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
        private static final /* synthetic */ financial.atomic.transact.Config.DeferredPaymentMethodStrategy[] $VALUES;
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final financial.atomic.transact.Config.DeferredPaymentMethodStrategy.Companion INSTANCE;

        @kotlinx.serialization.SerialName("sdk")
        public static final financial.atomic.transact.Config.DeferredPaymentMethodStrategy SDK = new financial.atomic.transact.Config.DeferredPaymentMethodStrategy("SDK", 0);

        @kotlinx.serialization.SerialName(com.visa.cbp.getTicketMetaData$6672$values.values.ReplenishRequest)
        public static final financial.atomic.transact.Config.DeferredPaymentMethodStrategy API = new financial.atomic.transact.Config.DeferredPaymentMethodStrategy(com.izettle.android.auth.repository.BaseUriRepositoryImpl.API_SERVICE_KEY, 1);

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfinancial/atomic/transact/Config$DeferredPaymentMethodStrategy$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$DeferredPaymentMethodStrategy;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes17.dex */
        public static final class Companion {
            private Companion() {
            }

            private final /* synthetic */ kotlinx.serialization.KSerializer get$cachedSerializer() {
                return (kotlinx.serialization.KSerializer) financial.atomic.transact.Config.DeferredPaymentMethodStrategy.$cachedSerializer$delegate.getValue();
            }

            public final kotlinx.serialization.KSerializer<financial.atomic.transact.Config.DeferredPaymentMethodStrategy> serializer() {
                return get$cachedSerializer();
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            financial.atomic.transact.Config.DeferredPaymentMethodStrategy[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
            INSTANCE = new financial.atomic.transact.Config.DeferredPaymentMethodStrategy.Companion(null);
            $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: financial.atomic.transact.Config$DeferredPaymentMethodStrategy$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlinx.serialization.KSerializer _init_$_anonymous_;
                    _init_$_anonymous_ = financial.atomic.transact.Config.DeferredPaymentMethodStrategy._init_$_anonymous_();
                    return _init_$_anonymous_;
                }
            });
        }

        private DeferredPaymentMethodStrategy(java.lang.String str, int i) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ kotlinx.serialization.KSerializer _init_$_anonymous_() {
            return kotlinx.serialization.internal.EnumsKt.createAnnotatedEnumSerializer("financial.atomic.transact.Config.DeferredPaymentMethodStrategy", values(), new java.lang.String[]{"sdk", com.visa.cbp.getTicketMetaData$6672$values.values.ReplenishRequest}, new java.lang.annotation.Annotation[][]{null, null}, null);
        }

        public static financial.atomic.transact.Config.DeferredPaymentMethodStrategy valueOf(java.lang.String str) {
            return (financial.atomic.transact.Config.DeferredPaymentMethodStrategy) java.lang.Enum.valueOf(financial.atomic.transact.Config.DeferredPaymentMethodStrategy.class, str);
        }

        public static financial.atomic.transact.Config.DeferredPaymentMethodStrategy[] values() {
            return (financial.atomic.transact.Config.DeferredPaymentMethodStrategy[]) $VALUES.clone();
        }

        public static kotlin.enums.EnumEntries<financial.atomic.transact.Config.DeferredPaymentMethodStrategy> getEntries() {
            return $ENTRIES;
        }

        private static final /* synthetic */ financial.atomic.transact.Config.DeferredPaymentMethodStrategy[] $values() {
            return new financial.atomic.transact.Config.DeferredPaymentMethodStrategy[]{SDK, API};
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lfinancial/atomic/transact/Config$Product;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "NONE", com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, "DEPOSIT", "ENROLL", "PRESENT", "TAX", "SWITCH", "VERIFY", "IDENTIFY", "WITHHOLD", "ACTION", "MANAGE"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final class Product {
        private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
        private static final /* synthetic */ financial.atomic.transact.Config.Product[] $VALUES;
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final financial.atomic.transact.Config.Product.Companion INSTANCE;

        @kotlinx.serialization.SerialName("none")
        public static final financial.atomic.transact.Config.Product NONE = new financial.atomic.transact.Config.Product("NONE", 0);

        @kotlinx.serialization.SerialName("balance")
        public static final financial.atomic.transact.Config.Product BALANCE = new financial.atomic.transact.Config.Product(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, 1);

        @kotlinx.serialization.SerialName("deposit")
        public static final financial.atomic.transact.Config.Product DEPOSIT = new financial.atomic.transact.Config.Product("DEPOSIT", 2);

        @kotlinx.serialization.SerialName("enroll")
        public static final financial.atomic.transact.Config.Product ENROLL = new financial.atomic.transact.Config.Product("ENROLL", 3);

        @kotlinx.serialization.SerialName("present")
        public static final financial.atomic.transact.Config.Product PRESENT = new financial.atomic.transact.Config.Product("PRESENT", 4);

        @kotlinx.serialization.SerialName("tax")
        public static final financial.atomic.transact.Config.Product TAX = new financial.atomic.transact.Config.Product("TAX", 5);

        @kotlinx.serialization.SerialName("switch")
        public static final financial.atomic.transact.Config.Product SWITCH = new financial.atomic.transact.Config.Product("SWITCH", 6);

        @kotlinx.serialization.SerialName("verify")
        public static final financial.atomic.transact.Config.Product VERIFY = new financial.atomic.transact.Config.Product("VERIFY", 7);

        @kotlinx.serialization.SerialName("identify")
        public static final financial.atomic.transact.Config.Product IDENTIFY = new financial.atomic.transact.Config.Product("IDENTIFY", 8);

        @kotlinx.serialization.SerialName("withhold")
        public static final financial.atomic.transact.Config.Product WITHHOLD = new financial.atomic.transact.Config.Product("WITHHOLD", 9);

        @kotlinx.serialization.SerialName("action")
        public static final financial.atomic.transact.Config.Product ACTION = new financial.atomic.transact.Config.Product("ACTION", 10);

        @kotlinx.serialization.SerialName("manage")
        public static final financial.atomic.transact.Config.Product MANAGE = new financial.atomic.transact.Config.Product("MANAGE", 11);

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfinancial/atomic/transact/Config$Product$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$Product;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes17.dex */
        public static final class Companion {
            private Companion() {
            }

            private final /* synthetic */ kotlinx.serialization.KSerializer get$cachedSerializer() {
                return (kotlinx.serialization.KSerializer) financial.atomic.transact.Config.Product.$cachedSerializer$delegate.getValue();
            }

            public final kotlinx.serialization.KSerializer<financial.atomic.transact.Config.Product> serializer() {
                return get$cachedSerializer();
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            financial.atomic.transact.Config.Product[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
            INSTANCE = new financial.atomic.transact.Config.Product.Companion(null);
            $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: financial.atomic.transact.Config$Product$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlinx.serialization.KSerializer _init_$_anonymous_;
                    _init_$_anonymous_ = financial.atomic.transact.Config.Product._init_$_anonymous_();
                    return _init_$_anonymous_;
                }
            });
        }

        private Product(java.lang.String str, int i) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ kotlinx.serialization.KSerializer _init_$_anonymous_() {
            return kotlinx.serialization.internal.EnumsKt.createAnnotatedEnumSerializer("financial.atomic.transact.Config.Product", values(), new java.lang.String[]{"none", "balance", "deposit", "enroll", "present", "tax", "switch", "verify", "identify", "withhold", "action", "manage"}, new java.lang.annotation.Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null}, null);
        }

        public static financial.atomic.transact.Config.Product valueOf(java.lang.String str) {
            return (financial.atomic.transact.Config.Product) java.lang.Enum.valueOf(financial.atomic.transact.Config.Product.class, str);
        }

        public static financial.atomic.transact.Config.Product[] values() {
            return (financial.atomic.transact.Config.Product[]) $VALUES.clone();
        }

        public static kotlin.enums.EnumEntries<financial.atomic.transact.Config.Product> getEntries() {
            return $ENTRIES;
        }

        private static final /* synthetic */ financial.atomic.transact.Config.Product[] $values() {
            return new financial.atomic.transact.Config.Product[]{NONE, BALANCE, DEPOSIT, ENROLL, PRESENT, TAX, SWITCH, VERIFY, IDENTIFY, WITHHOLD, ACTION, MANAGE};
        }
    }

    /* renamed from: component10, reason: from getter */
    public final financial.atomic.transact.Config.Deeplink getDeeplink() {
        return this.deeplink;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lfinancial/atomic/transact/Config$Environment;", "", "", "url", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "PRODUCTION", "SANDBOX", "LOCAL", "CUSTOM"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class Environment {
        private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
        private static final /* synthetic */ financial.atomic.transact.Config.Environment[] $VALUES;
        private final java.lang.String url;
        public static final financial.atomic.transact.Config.Environment PRODUCTION = new financial.atomic.transact.Config.Environment("PRODUCTION", 0, "https://transact.atomicfi.com");
        public static final financial.atomic.transact.Config.Environment SANDBOX = new financial.atomic.transact.Config.Environment("SANDBOX", 1, "https://transact-sandbox.atomicfi.com");
        public static final financial.atomic.transact.Config.Environment LOCAL = new financial.atomic.transact.Config.Environment("LOCAL", 2, "https://transact-brax10.ngrok.app");
        public static final financial.atomic.transact.Config.Environment CUSTOM = new financial.atomic.transact.Config.Environment("CUSTOM", 3, "CUSTOM");

        static {
            financial.atomic.transact.Config.Environment[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
        }

        private Environment(java.lang.String str, int i, java.lang.String str2) {
            this.url = str2;
        }

        public static financial.atomic.transact.Config.Environment valueOf(java.lang.String str) {
            return (financial.atomic.transact.Config.Environment) java.lang.Enum.valueOf(financial.atomic.transact.Config.Environment.class, str);
        }

        public static financial.atomic.transact.Config.Environment[] values() {
            return (financial.atomic.transact.Config.Environment[]) $VALUES.clone();
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public static kotlin.enums.EnumEntries<financial.atomic.transact.Config.Environment> getEntries() {
            return $ENTRIES;
        }

        private static final /* synthetic */ financial.atomic.transact.Config.Environment[] $values() {
            return new financial.atomic.transact.Config.Environment[]{PRODUCTION, SANDBOX, LOCAL, CUSTOM};
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lfinancial/atomic/transact/Config$Handoff;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "EXIT_PROMPT", "AUTHENTICATION_SUCCESS", "HIGH_LATENCY", "SELECTED_COMPANY"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class Handoff {
        private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
        private static final /* synthetic */ financial.atomic.transact.Config.Handoff[] $VALUES;
        private final java.lang.String value;
        public static final financial.atomic.transact.Config.Handoff EXIT_PROMPT = new financial.atomic.transact.Config.Handoff("EXIT_PROMPT", 0, "exit-prompt");
        public static final financial.atomic.transact.Config.Handoff AUTHENTICATION_SUCCESS = new financial.atomic.transact.Config.Handoff("AUTHENTICATION_SUCCESS", 1, "authentication-success");
        public static final financial.atomic.transact.Config.Handoff HIGH_LATENCY = new financial.atomic.transact.Config.Handoff("HIGH_LATENCY", 2, "high-latency");
        public static final financial.atomic.transact.Config.Handoff SELECTED_COMPANY = new financial.atomic.transact.Config.Handoff("SELECTED_COMPANY", 3, "selected-company");

        static {
            financial.atomic.transact.Config.Handoff[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
        }

        private Handoff(java.lang.String str, int i, java.lang.String str2) {
            this.value = str2;
        }

        public static financial.atomic.transact.Config.Handoff valueOf(java.lang.String str) {
            return (financial.atomic.transact.Config.Handoff) java.lang.Enum.valueOf(financial.atomic.transact.Config.Handoff.class, str);
        }

        public static financial.atomic.transact.Config.Handoff[] values() {
            return (financial.atomic.transact.Config.Handoff[]) $VALUES.clone();
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public static kotlin.enums.EnumEntries<financial.atomic.transact.Config.Handoff> getEntries() {
            return $ENTRIES;
        }

        private static final /* synthetic */ financial.atomic.transact.Config.Handoff[] $values() {
            return new financial.atomic.transact.Config.Handoff[]{EXIT_PROMPT, AUTHENTICATION_SUCCESS, HIGH_LATENCY, SELECTED_COMPANY};
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lfinancial/atomic/transact/Config$Language;", "", "<init>", "(Ljava/lang/String;I)V", "en", "es"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Language {
        private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
        private static final /* synthetic */ financial.atomic.transact.Config.Language[] $VALUES;
        public static final financial.atomic.transact.Config.Language en = new financial.atomic.transact.Config.Language("en", 0);
        public static final financial.atomic.transact.Config.Language es = new financial.atomic.transact.Config.Language("es", 1);

        static {
            financial.atomic.transact.Config.Language[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
        }

        private Language(java.lang.String str, int i) {
        }

        public static financial.atomic.transact.Config.Language valueOf(java.lang.String str) {
            return (financial.atomic.transact.Config.Language) java.lang.Enum.valueOf(financial.atomic.transact.Config.Language.class, str);
        }

        public static financial.atomic.transact.Config.Language[] values() {
            return (financial.atomic.transact.Config.Language[]) $VALUES.clone();
        }

        public static kotlin.enums.EnumEntries<financial.atomic.transact.Config.Language> getEntries() {
            return $ENTRIES;
        }

        private static final /* synthetic */ financial.atomic.transact.Config.Language[] $values() {
            return new financial.atomic.transact.Config.Language[]{en, es};
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lfinancial/atomic/transact/Config$Scope;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "NONE", "USER_LINK", "EMPLOYER_LINK", "PAY_LINK"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class Scope {
        private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
        private static final /* synthetic */ financial.atomic.transact.Config.Scope[] $VALUES;
        private final java.lang.String value;
        public static final financial.atomic.transact.Config.Scope NONE = new financial.atomic.transact.Config.Scope("NONE", 0, "none");
        public static final financial.atomic.transact.Config.Scope USER_LINK = new financial.atomic.transact.Config.Scope("USER_LINK", 1, "user-link");
        public static final financial.atomic.transact.Config.Scope EMPLOYER_LINK = new financial.atomic.transact.Config.Scope("EMPLOYER_LINK", 2, "employer-link");
        public static final financial.atomic.transact.Config.Scope PAY_LINK = new financial.atomic.transact.Config.Scope("PAY_LINK", 3, "pay-link");

        static {
            financial.atomic.transact.Config.Scope[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
        }

        private Scope(java.lang.String str, int i, java.lang.String str2) {
            this.value = str2;
        }

        public static financial.atomic.transact.Config.Scope valueOf(java.lang.String str) {
            return (financial.atomic.transact.Config.Scope) java.lang.Enum.valueOf(financial.atomic.transact.Config.Scope.class, str);
        }

        public static financial.atomic.transact.Config.Scope[] values() {
            return (financial.atomic.transact.Config.Scope[]) $VALUES.clone();
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public static kotlin.enums.EnumEntries<financial.atomic.transact.Config.Scope> getEntries() {
            return $ENTRIES;
        }

        private static final /* synthetic */ financial.atomic.transact.Config.Scope[] $values() {
            return new financial.atomic.transact.Config.Scope[]{NONE, USER_LINK, EMPLOYER_LINK, PAY_LINK};
        }
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPublicToken() {
        return this.publicToken;
    }

    /* renamed from: component21, reason: from getter */
    private final java.lang.String getToken() {
        return this.token;
    }
}
