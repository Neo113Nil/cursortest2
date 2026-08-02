package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000\u008c\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0007\b\u0000\u0018\u0000 í\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\ní\u0001î\u0001ï\u0001ð\u0001ñ\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J'\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ5\u0010#\u001a\u00020\u00102\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u0018H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0010H\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b(\u0010)J\u0011\u0010#\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\b#\u0010*J\u0017\u0010,\u001a\u00020+2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b,\u0010-J/\u0010/\u001a\u00020+2\u0006\u0010\u001f\u001a\u00020.2\u0006\u0010 \u001a\u00020.2\u0006\u0010!\u001a\u00020.2\u0006\u0010\"\u001a\u00020.H\u0002¢\u0006\u0004\b/\u00100J'\u0010#\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020'2\u0006\u0010!\u001a\u000201H\u0002¢\u0006\u0004\b#\u00102J\u001f\u0010%\u001a\u00020\t2\u0006\u0010\u001f\u001a\u0002012\u0006\u0010 \u001a\u00020'H\u0002¢\u0006\u0004\b%\u00103J\u0015\u0010%\u001a\u0004\u0018\u000105*\u000204H\u0002¢\u0006\u0004\b%\u00106J\u001f\u0010#\u001a\u00020\t2\u0006\u0010\u001f\u001a\u0002012\u0006\u0010 \u001a\u00020'H\u0002¢\u0006\u0004\b#\u00103J\u0017\u0010%\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b%\u00107J\u0017\u0010#\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b#\u00107J=\u0010#\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00162\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00162\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u000209\u0018\u000108H\u0002¢\u0006\u0004\b#\u0010:J\u0017\u0010%\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020;H\u0002¢\u0006\u0004\b%\u0010<J\u001f\u0010/\u001a\u00020;2\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u0016H\u0002¢\u0006\u0004\b/\u0010=J?\u0010/\u001a\u00020;2\u0006\u0010\u001f\u001a\u00020\u00162\b\u0010 \u001a\u0004\u0018\u00010\u00162\b\u0010!\u001a\u0004\u0018\u00010\u00162\b\u0010\"\u001a\u0004\u0018\u00010\u00162\b\u0010?\u001a\u0004\u0018\u00010>H\u0002¢\u0006\u0004\b/\u0010@J\u0017\u0010,\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b,\u00107J)\u0010(\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010AH\u0002¢\u0006\u0004\b(\u0010BJ1\u0010#\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020'2\u0006\u0010!\u001a\u0002092\b\u0010\"\u001a\u0004\u0018\u00010AH\u0002¢\u0006\u0004\b#\u0010CJ'\u0010#\u001a\u00020E2\u0006\u0010\u001f\u001a\u0002012\u0006\u0010 \u001a\u00020+2\u0006\u0010!\u001a\u00020DH\u0002¢\u0006\u0004\b#\u0010FJ\u001b\u0010(\u001a\u00020E*\u00020+2\u0006\u0010\u001f\u001a\u00020+H\u0002¢\u0006\u0004\b(\u0010GJ#\u0010#\u001a\u0004\u0018\u00010H2\b\u0010\u001f\u001a\u0004\u0018\u0001012\u0006\u0010 \u001a\u00020EH\u0002¢\u0006\u0004\b#\u0010IJ#\u0010#\u001a\u00020L*\u00020D2\u0006\u0010\u001f\u001a\u00020J2\u0006\u0010 \u001a\u00020KH\u0002¢\u0006\u0004\b#\u0010MJ%\u0010(\u001a\u0004\u0018\u00010+*\u00020L2\u0006\u0010\u001f\u001a\u00020.2\u0006\u0010 \u001a\u00020.H\u0002¢\u0006\u0004\b(\u0010NJ\u0015\u0010#\u001a\u0004\u0018\u00010O*\u00020LH\u0002¢\u0006\u0004\b#\u0010PJ%\u0010,\u001a\u0004\u0018\u00010Q*\u00020L2\u0006\u0010\u001f\u001a\u00020.2\u0006\u0010 \u001a\u00020.H\u0002¢\u0006\u0004\b,\u0010RJ'\u0010(\u001a\u00020+*\u00020E2\b\b\u0002\u0010\u001f\u001a\u00020.2\b\b\u0002\u0010 \u001a\u00020.H\u0002¢\u0006\u0004\b(\u0010SJ\u0017\u0010V\u001a\u00020\u00102\u0006\u0010U\u001a\u00020TH\u0000¢\u0006\u0004\bV\u0010WJ\u001f\u0010Z\u001a\u00020\u00162\u0006\u0010X\u001a\u00020.2\u0006\u0010Y\u001a\u00020.H\u0000¢\u0006\u0004\bZ\u0010[J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\n\u0010\\J\u0017\u0010_\u001a\u00020^2\u0006\u0010]\u001a\u00020\fH\u0016¢\u0006\u0004\b_\u0010`J-\u0010/\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010a*\u00020>2\b\u0010\u001f\u001a\u0004\u0018\u00018\u00002\u0006\u0010 \u001a\u00020\u0016H\u0002¢\u0006\u0004\b/\u0010bJ\u000f\u0010c\u001a\u00020\tH\u0000¢\u0006\u0004\bc\u0010\u000bJ\u0010\u0010d\u001a\u00020\tH\u0080@¢\u0006\u0004\bd\u0010eJ\u0017\u0010h\u001a\u00020\t2\u0006\u0010g\u001a\u00020fH\u0000¢\u0006\u0004\bh\u0010iJ\u0017\u0010,\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020fH\u0002¢\u0006\u0004\b,\u0010iJ\u0017\u0010/\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020fH\u0002¢\u0006\u0004\b/\u0010iJ\u001f\u0010%\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020f2\u0006\u0010 \u001a\u00020jH\u0002¢\u0006\u0004\b%\u0010kJ\u000f\u0010,\u001a\u00020\tH\u0002¢\u0006\u0004\b,\u0010\u000bJ\u000f\u0010l\u001a\u00020\tH\u0002¢\u0006\u0004\bl\u0010\u000bJ\u001d\u0010(\u001a\u00020\t2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002¢\u0006\u0004\b(\u0010mJ%\u0010/\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00162\f\u0010 \u001a\b\u0012\u0004\u0012\u00020n08H\u0002¢\u0006\u0004\b/\u0010oJ\u0017\u0010#\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020nH\u0002¢\u0006\u0004\b#\u0010pJ)\u0010(\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u000109H\u0002¢\u0006\u0004\b(\u0010qJ\u001f\u0010#\u001a\u00020\t2\u0006\u0010\u001f\u001a\u0002012\u0006\u0010 \u001a\u00020rH\u0002¢\u0006\u0004\b#\u0010sJ\u0017\u0010/\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b/\u0010tJ/\u0010,\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u0002012\u0006\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010H\u0002¢\u0006\u0004\b,\u0010uJ\u0017\u0010v\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\bv\u0010\\J/\u0010(\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u0002012\u0006\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u0010H\u0002¢\u0006\u0004\b(\u0010wJ\u0017\u0010/\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u000201H\u0002¢\u0006\u0004\b/\u0010xJ\u0017\u0010(\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u000201H\u0002¢\u0006\u0004\b(\u0010xJ\u0017\u0010#\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u000201H\u0002¢\u0006\u0004\b#\u0010yJ#\u0010,\u001a\u0004\u0018\u00010z2\b\u0010\u001f\u001a\u0004\u0018\u0001012\u0006\u0010 \u001a\u00020\u0016H\u0002¢\u0006\u0004\b,\u0010{J\u001b\u0010,\u001a\u0004\u0018\u0001092\b\u0010\u001f\u001a\u0004\u0018\u000101H\u0002¢\u0006\u0004\b,\u0010|J\u0015\u0010,\u001a\u0004\u0018\u000104*\u00020}H\u0002¢\u0006\u0004\b,\u0010~R\u0019\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\u000e\n\u0004\b\u0006\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R/\u0010\u0082\u0001\u001a\u00020\u00168\u0001@\u0001X\u0080\u000e¢\u0006\u001e\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u0012\u0005\b\u0087\u0001\u0010\u000b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0005\b\u0086\u0001\u0010\\R=\u0010\u0089\u0001\u001a\u000f\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u00100\u0088\u00018\u0001@\u0001X\u0080\u000e¢\u0006\u001f\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u0012\u0005\b\u008f\u0001\u0010\u000b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0016\u0010/\u001a\u00030\u0090\u00018\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b#\u0010\u0091\u0001R0\u0010\u0093\u0001\u001a\u00020\u00102\u0007\u0010\u0092\u0001\u001a\u00020\u00108\u0001@AX\u0081\u000e¢\u0006\u0016\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0005\b\u0095\u0001\u0010&\"\u0005\b\u0096\u0001\u0010\u0013R*\u0010\u0098\u0001\u001a\u00030\u0097\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R \u0010(\u001a\u000b\u0012\u0005\u0012\u00030\u009e\u0001\u0018\u0001088\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b(\u0010\u009f\u0001R\u001c\u0010,\u001a\t\u0012\u0005\u0012\u00030\u009e\u0001088CX\u0082\u0004¢\u0006\u0007\u001a\u0005\b/\u0010 \u0001R\u0016\u0010¢\u0001\u001a\u00020\u00108AX\u0080\u0004¢\u0006\u0007\u001a\u0005\b¡\u0001\u0010&R\u0014\u0010%\u001a\u00020\u00108CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bv\u0010&R+\u0010£\u0001\u001a\u0004\u0018\u00010\u00108\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R\u0017\u0010#\u001a\u00030©\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u001d\u0010\n\u001a\u00070¬\u0001R\u00020\u00008\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R\u0017\u0010v\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b/\u0010\u0083\u0001R\u0019\u0010°\u0001\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010\u0083\u0001R\u001a\u0010l\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u001b\u0010´\u0001\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b³\u0001\u0010²\u0001R\u0019\u0010±\u0001\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010\u0094\u0001R\u001f\u0010º\u0001\u001a\n\u0012\u0005\u0012\u00030·\u00010¶\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u001f\u0010¯\u0001\u001a\n\u0012\u0005\u0012\u00030·\u00010¶\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¹\u0001R&\u0010ª\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020>0¼\u00010¼\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\bl\u0010½\u0001R'\u0010³\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020>0¾\u00010¼\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010½\u0001R\u0018\u0010\u00ad\u0001\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b%\u0010\u0083\u0001R\u001b\u0010¿\u0001\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u001e\u0010Å\u0001\u001a\t\u0012\u0004\u0012\u00020f0Â\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001R\u001d\u0010È\u0001\u001a\t\u0012\u0004\u0012\u00020\t0Æ\u00018\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b\n\u0010Ç\u0001R\u0018\u0010¸\u0001\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\bv\u0010\u0094\u0001R\u001c\u0010Ë\u0001\u001a\u0005\u0018\u00010É\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010Ê\u0001R&\u0010À\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8C@\u0002X\u0083\u000e¢\u0006\u000f\n\u0006\b´\u0001\u0010Ì\u0001\u001a\u0005\b(\u0010Í\u0001R\u0019\u0010Ï\u0001\u001a\u00020j8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010Î\u0001R*\u0010Ñ\u0001\u001a\u00030Ð\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bÑ\u0001\u0010Ò\u0001\u001a\u0006\bÓ\u0001\u0010Ô\u0001\"\u0006\bÕ\u0001\u0010Ö\u0001R*\u0010×\u0001\u001a\u00030Ð\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b×\u0001\u0010Ò\u0001\u001a\u0006\bØ\u0001\u0010Ô\u0001\"\u0006\bÙ\u0001\u0010Ö\u0001R\u001f\u0010Ú\u0001\u001a\u0002098\u0001X\u0081D¢\u0006\u0010\n\u0006\bÚ\u0001\u0010Û\u0001\u001a\u0006\bÜ\u0001\u0010Ý\u0001R\u001f\u0010Þ\u0001\u001a\u0002098\u0001X\u0081D¢\u0006\u0010\n\u0006\bÞ\u0001\u0010Û\u0001\u001a\u0006\bß\u0001\u0010Ý\u0001R\u0018\u0010ã\u0001\u001a\u00030à\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\bá\u0001\u0010â\u0001R \u0010»\u0001\u001a\t\u0012\u0004\u0012\u00020r0¶\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÏ\u0001\u0010¹\u0001R\u0019\u0010µ\u0001\u001a\u00020r8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bË\u0001\u0010ä\u0001R\u0019\u0010å\u0001\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b°\u0001\u0010\u0094\u0001R\u0018\u0010Ã\u0001\u001a\u00030Ð\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\bº\u0001\u0010Ò\u0001R\u001a\u0010ç\u0001\u001a\u00020+*\u00020'8CX\u0082\u0004¢\u0006\u0007\u001a\u0005\b,\u0010æ\u0001R\u0018\u0010á\u0001\u001a\u00030è\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\bå\u0001\u0010é\u0001R\u001e\u0010ë\u0001\u001a\t\u0012\u0004\u0012\u00020n0ê\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\bç\u0001\u0010\u009f\u0001R$\u0010ì\u0001\u001a\u000f\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020\t0\u0088\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\bã\u0001\u0010\u008a\u0001"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "Landroidx/core/view/AccessibilityDelegateCompat;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "Landroidx/compose/ui/platform/AndroidComposeView;", "view", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "", "getOutputFormats", "()V", "Landroid/view/View;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "", "enabled", "onAccessibilityStateChanged", "(Z)V", "onTouchExplorationStateChanged", "vertical", "", "direction", "Landroidx/compose/ui/geometry/Offset;", com.daon.sdk.face.license.License.FEATURE_POSITION, "canScroll-0AR0LA0$ui", "(ZIJ)Z", "canScroll", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/semantics/SemanticsNodeWithAdjustedBounds;", "p0", "p1", "p2", "p3", "getHighSpeedVideoFpsRangesFor", "(Landroidx/collection/IntObjectMap;ZIJ)Z", "getHighResolutionOutputSizeshNQ4ISI", "()Z", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "getHighSpeedVideoFpsRanges", "(I)Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "()Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "Landroid/graphics/Rect;", "Camera2StreamConfigurationMap", "(Landroidx/compose/ui/semantics/SemanticsNodeWithAdjustedBounds;)Landroid/graphics/Rect;", "", "getHighSpeedVideoSizes", "(FFFF)Landroid/graphics/Rect;", "Landroidx/compose/ui/semantics/SemanticsNode;", "(ILandroidx/core/view/accessibility/AccessibilityNodeInfoCompat;Landroidx/compose/ui/semantics/SemanticsNode;)V", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;)V", "Landroidx/compose/ui/text/AnnotatedString;", "Landroid/text/SpannableString;", "(Landroidx/compose/ui/text/AnnotatedString;)Landroid/text/SpannableString;", "(I)Z", "", "", "(IILjava/lang/Integer;Ljava/util/List;)Z", "Landroid/view/accessibility/AccessibilityEvent;", "(Landroid/view/accessibility/AccessibilityEvent;)Z", "(II)Landroid/view/accessibility/AccessibilityEvent;", "", "p4", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;", "Landroid/os/Bundle;", "(IILandroid/os/Bundle;)Z", "(ILandroidx/core/view/accessibility/AccessibilityNodeInfoCompat;Ljava/lang/String;Landroid/os/Bundle;)V", "Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/ui/geometry/Rect;", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroid/graphics/Rect;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/geometry/Rect;", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)Landroidx/compose/ui/geometry/Rect;", "Landroid/graphics/RectF;", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/geometry/Rect;)Landroid/graphics/RectF;", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/graphics/Outline;", "(Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/graphics/Outline;", "(Landroidx/compose/ui/graphics/Outline;FF)Landroid/graphics/Rect;", "", "(Landroidx/compose/ui/graphics/Outline;)[F", "Landroid/graphics/Region;", "(Landroidx/compose/ui/graphics/Outline;FF)Landroid/graphics/Region;", "(Landroidx/compose/ui/geometry/Rect;FF)Landroid/graphics/Rect;", "Landroid/view/MotionEvent;", "event", "dispatchHoverEvent$ui", "(Landroid/view/MotionEvent;)Z", "x", "y", "hitTestSemanticsAt$ui", "(FF)I", "(I)V", com.datadog.android.log.LogAttributes.HOST, "Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "getAccessibilityNodeProvider", "(Landroid/view/View;)Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "T", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "onSemanticsChange$ui", "boundsUpdatesEventLoop$ui", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "onLayoutChange$ui", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/collection/MutableIntSet;", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/collection/MutableIntSet;)V", "getOutputMinFrameDuration", "(Landroidx/collection/IntObjectMap;)V", "Landroidx/compose/ui/platform/ScrollObservationScope;", "(ILjava/util/List;)Z", "(Landroidx/compose/ui/platform/ScrollObservationScope;)V", "(IILjava/lang/String;)V", "Landroidx/compose/ui/platform/SemanticsNodeCopy;", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/platform/SemanticsNodeCopy;)V", "(I)I", "(Landroidx/compose/ui/semantics/SemanticsNode;IZZ)Z", "getInputSizeshNQ4ISI", "(Landroidx/compose/ui/semantics/SemanticsNode;IIZ)Z", "(Landroidx/compose/ui/semantics/SemanticsNode;)I", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "(Landroidx/compose/ui/semantics/SemanticsNode;I)Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "(Landroidx/compose/ui/semantics/SemanticsNode;)Ljava/lang/String;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/platform/AndroidComposeView;", "getView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "hoveredVirtualViewId", com.visa.cbp.getEncExpo.warmup, "getHoveredVirtualViewId$ui", "()I", "setHoveredVirtualViewId$ui", "getHoveredVirtualViewId$ui$annotations", "Lkotlin/Function1;", "onSendAccessibilityEvent", "Lkotlin/jvm/functions/Function1;", "getOnSendAccessibilityEvent$ui", "()Lkotlin/jvm/functions/Function1;", "setOnSendAccessibilityEvent$ui", "(Lkotlin/jvm/functions/Function1;)V", "getOnSendAccessibilityEvent$ui$annotations", "Landroid/view/accessibility/AccessibilityManager;", "Landroid/view/accessibility/AccessibilityManager;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "accessibilityForceEnabledForTesting", "Z", "getAccessibilityForceEnabledForTesting$ui", "setAccessibilityForceEnabledForTesting$ui", "", "SendRecurringAccessibilityEventsIntervalMillis", "J", "getSendRecurringAccessibilityEventsIntervalMillis$ui", "()J", "setSendRecurringAccessibilityEventsIntervalMillis$ui", "(J)V", "Landroid/accessibilityservice/AccessibilityServiceInfo;", "Ljava/util/List;", "()Ljava/util/List;", "isEnabled$ui", "isEnabled", "requestFromAccessibilityToolForTesting", "Ljava/lang/Boolean;", "getRequestFromAccessibilityToolForTesting$ui", "()Ljava/lang/Boolean;", "setRequestFromAccessibilityToolForTesting$ui", "(Ljava/lang/Boolean;)V", "Landroid/os/Handler;", "getOutputStallDuration", "Landroid/os/Handler;", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$ComposeAccessibilityNodeProvider;", "unwrapAs", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$ComposeAccessibilityNodeProvider;", "getOutputStallDurationlomOqCM", "getInputFormats", "getOutputSizeshNQ4ISI", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "getOutputMinFrameDurationlomOqCM", "getHighSpeedVideoSizesFor", util.h.xy.cb.b.f1091, "Landroidx/collection/MutableIntObjectMap;", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "toString", "Landroidx/collection/MutableIntObjectMap;", "getOutputSizes", "coroutineCreation", "Landroidx/collection/SparseArrayCompat;", "Landroidx/collection/SparseArrayCompat;", "Landroidx/collection/MutableObjectIntMap;", "isOutputSupportedFor", "CoroutineDebuggingKt", "Ljava/lang/Integer;", "Landroidx/collection/ArraySet;", "_BOUNDARY", "Landroidx/collection/ArraySet;", "isOutputSupportedForhNQ4ISI", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/channels/Channel;", "getValidOutputFormatsForInputhNQ4ISI", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "ArtificialStackFrames", "Landroidx/collection/IntObjectMap;", "()Landroidx/collection/IntObjectMap;", "Landroidx/collection/MutableIntSet;", "accessartificialFrame", "Landroidx/collection/MutableIntIntMap;", "idToBeforeMap", "Landroidx/collection/MutableIntIntMap;", "getIdToBeforeMap$ui", "()Landroidx/collection/MutableIntIntMap;", "setIdToBeforeMap$ui", "(Landroidx/collection/MutableIntIntMap;)V", "idToAfterMap", "getIdToAfterMap$ui", "setIdToAfterMap$ui", "ExtraDataTestTraversalBeforeVal", "Ljava/lang/String;", "getExtraDataTestTraversalBeforeVal$ui", "()Ljava/lang/String;", "ExtraDataTestTraversalAfterVal", "getExtraDataTestTraversalAfterVal$ui", "Landroidx/compose/ui/text/platform/URLSpanCache;", "a", "Landroidx/compose/ui/text/platform/URLSpanCache;", "coroutineBoundary", "Landroidx/compose/ui/platform/SemanticsNodeCopy;", "getARTIFICIAL_FRAME_PACKAGE_NAME", "(Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;)Landroid/graphics/Rect;", "_CREATION", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "", "AMEXKernel", "c", "Companion", "PendingTextTraversedEvent", "ComposeAccessibilityNodeProvider", "Api24Impl", "Api29Impl"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat extends androidx.core.view.AccessibilityDelegateCompat implements android.view.View.OnAttachStateChangeListener, android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener, android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener {
    public static final int AccessibilityCursorPositionUndefined = -1;
    public static final int AccessibilitySliderStepsCount = 20;
    public static final java.lang.String ClassName = "android.view.View";
    public static final java.lang.String ExtraDataIdKey = "androidx.compose.ui.semantics.id";
    public static final java.lang.String ExtraDataShapeRectCornersKey = "androidx.compose.ui.semantics.shapeCorners";
    public static final java.lang.String ExtraDataShapeRectKey = "androidx.compose.ui.semantics.shapeRect";
    public static final java.lang.String ExtraDataShapeRegionKey = "androidx.compose.ui.semantics.shapeRegion";
    public static final int ExtraDataShapeTypeGeneric = 2;
    public static final java.lang.String ExtraDataShapeTypeKey = "androidx.compose.ui.semantics.shapeType";
    public static final int ExtraDataShapeTypeRectangle = 0;
    public static final int ExtraDataShapeTypeRounded = 1;
    public static final java.lang.String ExtraDataTestTagKey = "androidx.compose.ui.semantics.testTag";
    public static final int InvalidId = Integer.MIN_VALUE;
    public static final java.lang.String LogTag = "AccessibilityDelegate";
    public static final int ParcelSafeTextLength = 100000;
    public static final java.lang.String TextClassName = "android.widget.TextView";
    public static final java.lang.String TextFieldClassName = "android.widget.EditText";
    public static final long TextTraversedEventTimeoutMillis = 1000;

    /* renamed from: ArtificialStackFrames, reason: from kotlin metadata */
    private androidx.compose.ui.platform.SemanticsNodeCopy b;

    /* renamed from: CoroutineDebuggingKt, reason: from kotlin metadata */
    private java.lang.Integer isOutputSupportedFor;
    private final java.lang.String ExtraDataTestTraversalAfterVal;
    private final java.lang.String ExtraDataTestTraversalBeforeVal;
    private long SendRecurringAccessibilityEventsIntervalMillis;

    /* renamed from: _BOUNDARY, reason: from kotlin metadata */
    private final androidx.collection.ArraySet<androidx.compose.ui.node.LayoutNode> isOutputSupportedForhNQ4ISI;

    /* renamed from: _CREATION, reason: from kotlin metadata */
    private final java.util.List<androidx.compose.ui.platform.ScrollObservationScope> AMEXKernel;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.ui.text.platform.URLSpanCache coroutineBoundary;

    /* renamed from: accessartificialFrame, reason: from kotlin metadata */
    private androidx.collection.MutableIntObjectMap<androidx.compose.ui.platform.SemanticsNodeCopy> coroutineCreation;
    private boolean accessibilityForceEnabledForTesting;

    /* renamed from: b, reason: from kotlin metadata */
    private boolean getOutputSizeshNQ4ISI;

    /* renamed from: coroutineBoundary, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.platform.ScrollObservationScope, kotlin.Unit> c;

    /* renamed from: coroutineCreation, reason: from kotlin metadata */
    private final androidx.collection.MutableIntObjectMap<androidx.compose.ui.semantics.ScrollAxisRange> getOutputStallDurationlomOqCM;

    /* renamed from: getARTIFICIAL_FRAME_PACKAGE_NAME, reason: from kotlin metadata */
    private final java.lang.Runnable a;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private int unwrapAs;
    private java.util.List<? extends android.accessibilityservice.AccessibilityServiceInfo> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final android.view.accessibility.AccessibilityManager getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private androidx.collection.IntObjectMap<androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds> CoroutineDebuggingKt;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private boolean getARTIFICIAL_FRAME_PACKAGE_NAME;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean toString;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.Channel<kotlin.Unit> getValidOutputFormatsForInputhNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private androidx.collection.SparseArrayCompat<androidx.collection.SparseArrayCompat<java.lang.CharSequence>> getOutputStallDuration;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private androidx.core.view.accessibility.AccessibilityNodeInfoCompat getHighSpeedVideoSizesFor;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final androidx.collection.MutableIntIntMap _BOUNDARY;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.core.view.accessibility.AccessibilityNodeInfoCompat getOutputMinFrameDuration;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private final android.os.Handler getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private int getInputFormats;

    /* renamed from: getValidOutputFormatsForInputhNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.PendingTextTraversedEvent ArtificialStackFrames;
    private androidx.collection.MutableIntIntMap idToAfterMap;
    private androidx.collection.MutableIntIntMap idToBeforeMap;

    /* renamed from: isOutputSupportedFor, reason: from kotlin metadata */
    private androidx.collection.SparseArrayCompat<androidx.collection.MutableObjectIntMap<java.lang.CharSequence>> getOutputMinFrameDurationlomOqCM;

    /* renamed from: isOutputSupportedForhNQ4ISI, reason: from kotlin metadata */
    private androidx.collection.MutableIntSet accessartificialFrame;
    private java.lang.Boolean requestFromAccessibilityToolForTesting;

    /* renamed from: toString, reason: from kotlin metadata */
    private final androidx.collection.MutableIntObjectMap<androidx.compose.ui.semantics.ScrollAxisRange> getOutputSizes;

    /* renamed from: unwrapAs, reason: from kotlin metadata */
    private androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ComposeAccessibilityNodeProvider getOutputFormats;
    private final androidx.compose.ui.platform.AndroidComposeView view;
    public static final int $stable = 8;
    private static final androidx.collection.IntList Camera2StreamConfigurationMap = androidx.collection.IntListKt.intListOf(androidx.compose.ui.R.id.accessibility_custom_action_0, androidx.compose.ui.R.id.accessibility_custom_action_1, androidx.compose.ui.R.id.accessibility_custom_action_2, androidx.compose.ui.R.id.accessibility_custom_action_3, androidx.compose.ui.R.id.accessibility_custom_action_4, androidx.compose.ui.R.id.accessibility_custom_action_5, androidx.compose.ui.R.id.accessibility_custom_action_6, androidx.compose.ui.R.id.accessibility_custom_action_7, androidx.compose.ui.R.id.accessibility_custom_action_8, androidx.compose.ui.R.id.accessibility_custom_action_9, androidx.compose.ui.R.id.accessibility_custom_action_10, androidx.compose.ui.R.id.accessibility_custom_action_11, androidx.compose.ui.R.id.accessibility_custom_action_12, androidx.compose.ui.R.id.accessibility_custom_action_13, androidx.compose.ui.R.id.accessibility_custom_action_14, androidx.compose.ui.R.id.accessibility_custom_action_15, androidx.compose.ui.R.id.accessibility_custom_action_16, androidx.compose.ui.R.id.accessibility_custom_action_17, androidx.compose.ui.R.id.accessibility_custom_action_18, androidx.compose.ui.R.id.accessibility_custom_action_19, androidx.compose.ui.R.id.accessibility_custom_action_20, androidx.compose.ui.R.id.accessibility_custom_action_21, androidx.compose.ui.R.id.accessibility_custom_action_22, androidx.compose.ui.R.id.accessibility_custom_action_23, androidx.compose.ui.R.id.accessibility_custom_action_24, androidx.compose.ui.R.id.accessibility_custom_action_25, androidx.compose.ui.R.id.accessibility_custom_action_26, androidx.compose.ui.R.id.accessibility_custom_action_27, androidx.compose.ui.R.id.accessibility_custom_action_28, androidx.compose.ui.R.id.accessibility_custom_action_29, androidx.compose.ui.R.id.accessibility_custom_action_30, androidx.compose.ui.R.id.accessibility_custom_action_31);
    private int hoveredVirtualViewId = Integer.MIN_VALUE;
    private kotlin.jvm.functions.Function1<? super android.view.accessibility.AccessibilityEvent, java.lang.Boolean> onSendAccessibilityEvent = new kotlin.jvm.functions.Function1<android.view.accessibility.AccessibilityEvent, java.lang.Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean invoke(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            return java.lang.Boolean.valueOf(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.this.getView().getParent().requestSendAccessibilityEvent(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.this.getView(), accessibilityEvent));
        }

        {
            super(1);
        }
    };

    public static /* synthetic */ void getHoveredVirtualViewId$ui$annotations() {
    }

    public static /* synthetic */ void getOnSendAccessibilityEvent$ui$annotations() {
    }

    public AndroidComposeViewAccessibilityDelegateCompat(androidx.compose.ui.platform.AndroidComposeView androidComposeView) {
        this.view = androidComposeView;
        java.lang.Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        this.getHighSpeedVideoSizes = (android.view.accessibility.AccessibilityManager) systemService;
        this.SendRecurringAccessibilityEventsIntervalMillis = 100L;
        this.getHighSpeedVideoFpsRangesFor = new android.os.Handler(android.os.Looper.getMainLooper());
        this.getOutputFormats = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ComposeAccessibilityNodeProvider();
        this.getInputSizeshNQ4ISI = Integer.MIN_VALUE;
        this.getInputFormats = Integer.MIN_VALUE;
        this.getOutputSizes = new androidx.collection.MutableIntObjectMap<>(0, 1, null);
        this.getOutputStallDurationlomOqCM = new androidx.collection.MutableIntObjectMap<>(0, 1, null);
        this.getOutputStallDuration = new androidx.collection.SparseArrayCompat<>(0, 1, null);
        this.getOutputMinFrameDurationlomOqCM = new androidx.collection.SparseArrayCompat<>(0, 1, null);
        this.unwrapAs = -1;
        this.isOutputSupportedForhNQ4ISI = new androidx.collection.ArraySet<>(0, 1, null);
        this.getValidOutputFormatsForInputhNQ4ISI = kotlinx.coroutines.channels.ChannelKt.Channel$default(1, null, null, 6, null);
        this.toString = true;
        this.CoroutineDebuggingKt = androidx.collection.IntObjectMapKt.intObjectMapOf();
        this.accessartificialFrame = new androidx.collection.MutableIntSet(0, 1, null);
        this.idToBeforeMap = new androidx.collection.MutableIntIntMap(0, 1, null);
        this.idToAfterMap = new androidx.collection.MutableIntIntMap(0, 1, null);
        this.ExtraDataTestTraversalBeforeVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.ExtraDataTestTraversalAfterVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.coroutineBoundary = new androidx.compose.ui.text.platform.URLSpanCache();
        this.coroutineCreation = androidx.collection.IntObjectMapKt.mutableIntObjectMapOf();
        this.b = new androidx.compose.ui.platform.SemanticsNodeCopy(androidComposeView.getSemanticsOwner().getUnmergedRootSemanticsNode(), androidx.collection.IntObjectMapKt.intObjectMapOf());
        this._BOUNDARY = androidx.collection.IntIntMapKt.mutableIntIntMapOf();
        androidComposeView.addOnAttachStateChangeListener(this);
        this.a = new java.lang.Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.this);
            }
        };
        this.AMEXKernel = new java.util.ArrayList();
        this.c = new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.ScrollObservationScope, kotlin.Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.ScrollObservationScope scrollObservationScope) {
                getHighSpeedVideoFpsRangesFor(scrollObservationScope);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.platform.ScrollObservationScope scrollObservationScope) {
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.this.getHighSpeedVideoFpsRangesFor(scrollObservationScope);
            }

            {
                super(1);
            }
        };
    }

    public final androidx.compose.ui.platform.AndroidComposeView getView() {
        return this.view;
    }

    /* renamed from: getHoveredVirtualViewId$ui, reason: from getter */
    public final int getHoveredVirtualViewId() {
        return this.hoveredVirtualViewId;
    }

    public final void setHoveredVirtualViewId$ui(int i) {
        this.hoveredVirtualViewId = i;
    }

    public final kotlin.jvm.functions.Function1<android.view.accessibility.AccessibilityEvent, java.lang.Boolean> getOnSendAccessibilityEvent$ui() {
        return this.onSendAccessibilityEvent;
    }

    public final void setOnSendAccessibilityEvent$ui(kotlin.jvm.functions.Function1<? super android.view.accessibility.AccessibilityEvent, java.lang.Boolean> function1) {
        this.onSendAccessibilityEvent = function1;
    }

    /* renamed from: getAccessibilityForceEnabledForTesting$ui, reason: from getter */
    public final boolean getAccessibilityForceEnabledForTesting() {
        return this.accessibilityForceEnabledForTesting;
    }

    public final void setAccessibilityForceEnabledForTesting$ui(boolean z) {
        this.accessibilityForceEnabledForTesting = z;
        this.toString = true;
    }

    /* renamed from: getSendRecurringAccessibilityEventsIntervalMillis$ui, reason: from getter */
    public final long getSendRecurringAccessibilityEventsIntervalMillis() {
        return this.SendRecurringAccessibilityEventsIntervalMillis;
    }

    public final void setSendRecurringAccessibilityEventsIntervalMillis$ui(long j) {
        this.SendRecurringAccessibilityEventsIntervalMillis = j;
    }

    private final void getOutputFormats() {
        this.getHighSpeedVideoFpsRanges = null;
    }

    private final java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getHighSpeedVideoSizes() {
        java.util.List list = this.getHighSpeedVideoFpsRanges;
        if (list != null) {
            return list;
        }
        java.util.List<android.accessibilityservice.AccessibilityServiceInfo> enabledAccessibilityServiceList = this.getHighSpeedVideoSizes.getEnabledAccessibilityServiceList(-1);
        this.getHighSpeedVideoFpsRanges = enabledAccessibilityServiceList;
        return enabledAccessibilityServiceList;
    }

    public final boolean isEnabled$ui() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.getHighSpeedVideoSizes.isEnabled() && !getHighSpeedVideoSizes().isEmpty();
    }

    private final boolean getInputSizeshNQ4ISI() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.getHighSpeedVideoSizes.isEnabled() && this.getHighSpeedVideoSizes.isTouchExplorationEnabled();
    }

    /* renamed from: getRequestFromAccessibilityToolForTesting$ui, reason: from getter */
    public final java.lang.Boolean getRequestFromAccessibilityToolForTesting() {
        return this.requestFromAccessibilityToolForTesting;
    }

    public final void setRequestFromAccessibilityToolForTesting$ui(java.lang.Boolean bool) {
        this.requestFromAccessibilityToolForTesting = bool;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\r\u0010\u0014R\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014R\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "p0", "", "p1", "p2", "p3", "p4", "", "p5", "<init>", "(Landroidx/compose/ui/semantics/SemanticsNode;IIIIJ)V", "getHighSpeedVideoSizes", "Landroidx/compose/ui/semantics/SemanticsNode;", "getHighResolutionOutputSizeshNQ4ISI", "()Landroidx/compose/ui/semantics/SemanticsNode;", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "()I", "getHighSpeedVideoFpsRangesFor", "getOutputFormats", "J", "getInputFormats", "()J"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class PendingTextTraversedEvent {
        private final int Camera2StreamConfigurationMap;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final int getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final int getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final int getHighResolutionOutputSizeshNQ4ISI;
        private final androidx.compose.ui.semantics.SemanticsNode getHighSpeedVideoSizes;
        private final long getOutputFormats;

        public PendingTextTraversedEvent(androidx.compose.ui.semantics.SemanticsNode semanticsNode, int i, int i2, int i3, int i4, long j) {
            this.getHighSpeedVideoSizes = semanticsNode;
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighResolutionOutputSizeshNQ4ISI = i2;
            this.getHighSpeedVideoFpsRanges = i3;
            this.Camera2StreamConfigurationMap = i4;
            this.getOutputFormats = j;
        }

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from getter */
        public final androidx.compose.ui.semantics.SemanticsNode getGetHighSpeedVideoSizes() {
            return this.getHighSpeedVideoSizes;
        }

        /* renamed from: Camera2StreamConfigurationMap, reason: from getter */
        public final int getGetHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        /* renamed from: getHighSpeedVideoSizes, reason: from getter */
        public final int getGetHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from getter */
        public final int getGetHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoFpsRanges;
        }

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from getter */
        public final int getCamera2StreamConfigurationMap() {
            return this.Camera2StreamConfigurationMap;
        }

        /* renamed from: getInputFormats, reason: from getter */
        public final long getGetOutputFormats() {
            return this.getOutputFormats;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.collection.IntObjectMap<androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds> getHighSpeedVideoFpsRanges() {
        if (this.toString) {
            this.toString = false;
            this.CoroutineDebuggingKt = androidx.compose.ui.semantics.SemanticsOwnerKt.getAllUncoveredSemanticsNodesToIntObjectMap(this.view.getSemanticsOwner(), -1, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsNode, java.lang.Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$currentSemanticsNodes$1
                @Override // kotlin.jvm.functions.Function1
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.Boolean invoke(androidx.compose.ui.semantics.SemanticsNode semanticsNode) {
                    return java.lang.Boolean.valueOf(androidx.compose.ui.semantics.SemanticsNode_androidKt.isAccessibilityIgnoredLink(semanticsNode));
                }
            });
            if (isEnabled$ui()) {
                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.getHighSpeedVideoFpsRanges(this.CoroutineDebuggingKt, this.idToBeforeMap, this.idToAfterMap, this.view.getContext().getResources());
            }
        }
        return this.CoroutineDebuggingKt;
    }

    /* renamed from: getIdToBeforeMap$ui, reason: from getter */
    public final androidx.collection.MutableIntIntMap getIdToBeforeMap() {
        return this.idToBeforeMap;
    }

    public final void setIdToBeforeMap$ui(androidx.collection.MutableIntIntMap mutableIntIntMap) {
        this.idToBeforeMap = mutableIntIntMap;
    }

    /* renamed from: getIdToAfterMap$ui, reason: from getter */
    public final androidx.collection.MutableIntIntMap getIdToAfterMap() {
        return this.idToAfterMap;
    }

    public final void setIdToAfterMap$ui(androidx.collection.MutableIntIntMap mutableIntIntMap) {
        this.idToAfterMap = mutableIntIntMap;
    }

    /* renamed from: getExtraDataTestTraversalBeforeVal$ui, reason: from getter */
    public final java.lang.String getExtraDataTestTraversalBeforeVal() {
        return this.ExtraDataTestTraversalBeforeVal;
    }

    /* renamed from: getExtraDataTestTraversalAfterVal$ui, reason: from getter */
    public final java.lang.String getExtraDataTestTraversalAfterVal() {
        return this.ExtraDataTestTraversalAfterVal;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        if (this.getHighSpeedVideoSizes.isEnabled()) {
            getOutputFormats();
        }
        this.getHighSpeedVideoSizes.addAccessibilityStateChangeListener(this);
        this.getHighSpeedVideoSizes.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        this.getHighSpeedVideoFpsRangesFor.removeCallbacks(this.a);
        this.getHighSpeedVideoSizes.removeAccessibilityStateChangeListener(this);
        this.getHighSpeedVideoSizes.removeTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean enabled) {
        getOutputFormats();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean enabled) {
        getOutputFormats();
    }

    /* renamed from: canScroll-0AR0LA0$ui, reason: not valid java name */
    public final boolean m7718canScroll0AR0LA0$ui(boolean vertical, int direction, long position) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(android.os.Looper.getMainLooper().getThread(), java.lang.Thread.currentThread())) {
            return getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRanges(), vertical, direction, position);
        }
        return false;
    }

    private final boolean getHighSpeedVideoFpsRangesFor(androidx.collection.IntObjectMap<androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds> p0, boolean p1, int p2, long p3) {
        androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.ScrollAxisRange> horizontalScrollAxisRange;
        androidx.compose.ui.semantics.ScrollAxisRange scrollAxisRange;
        if (androidx.compose.ui.geometry.Offset.m5749equalsimpl0(p3, androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0()) || (((9223372034707292159L & p3) + androidx.compose.ui.geometry.InlineClassHelperKt.DualLoadedSignificand) & (-9223372034707292160L)) != 0) {
            return false;
        }
        if (p1) {
            horizontalScrollAxisRange = androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getVerticalScrollAxisRange();
        } else {
            if (p1) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            horizontalScrollAxisRange = androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange();
        }
        java.lang.Object[] objArr = p0.values;
        long[] jArr = p0.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i = 0;
        boolean z = false;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((j & 255) < 128) {
                        androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds) objArr[(i << 3) + i3];
                        if (androidx.compose.ui.unit.IntRectKt.toRect(semanticsNodeWithAdjustedBounds.getAdjustedBounds()).m5778containsk4lQ0M(p3) && (scrollAxisRange = (androidx.compose.ui.semantics.ScrollAxisRange) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNodeWithAdjustedBounds.getSemanticsNode().getUnmergedConfig(), horizontalScrollAxisRange)) != null) {
                            int i4 = scrollAxisRange.getReverseScrolling() ? -p2 : p2;
                            if (!(p2 == 0 && scrollAxisRange.getReverseScrolling()) && i4 >= 0) {
                                if (scrollAxisRange.getValue().invoke().floatValue() >= scrollAxisRange.getMaxValue().invoke().floatValue()) {
                                }
                                z = true;
                            } else {
                                if (scrollAxisRange.getValue().invoke().floatValue() <= 0.0f) {
                                }
                                z = true;
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return z;
                }
            }
            if (i == length) {
                return z;
            }
            i++;
        }
    }

    private final boolean getHighResolutionOutputSizeshNQ4ISI() {
        java.lang.Boolean bool = this.requestFromAccessibilityToolForTesting;
        if (kotlin.jvm.internal.Intrinsics.areEqual(bool, java.lang.Boolean.TRUE)) {
            return true;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(bool, java.lang.Boolean.FALSE)) {
            return false;
        }
        return androidx.core.view.accessibility.AccessibilityManagerCompat.isRequestFromAccessibilityTool(this.getHighSpeedVideoSizes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.core.view.accessibility.AccessibilityNodeInfoCompat getHighSpeedVideoFpsRanges(int p0) {
        androidx.view.LifecycleOwner lifecycleOwner;
        androidx.view.Lifecycle lifecycle;
        androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners viewTreeOwners = this.view.getViewTreeOwners();
        if (((viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) ? null : lifecycle.getCamera2StreamConfigurationMap()) == androidx.lifecycle.Lifecycle.State.DESTROYED) {
            return getHighSpeedVideoFpsRangesFor();
        }
        androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getHighSpeedVideoFpsRanges().get(p0);
        if (semanticsNodeWithAdjustedBounds == null) {
            return getHighSpeedVideoFpsRangesFor();
        }
        androidx.compose.ui.semantics.SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode();
        boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsSensitiveData()), java.lang.Boolean.TRUE);
        if (areEqual && !getHighResolutionOutputSizeshNQ4ISI()) {
            return null;
        }
        androidx.core.view.accessibility.AccessibilityNodeInfoCompat obtain = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.obtain();
        obtain.setAccessibilityDataSensitive(areEqual);
        if (p0 == -1) {
            android.view.ViewParent parentForAccessibility = this.view.getParentForAccessibility();
            obtain.setParent(parentForAccessibility instanceof android.view.View ? (android.view.View) parentForAccessibility : null);
        } else {
            androidx.compose.ui.semantics.SemanticsNode parent = semanticsNode.getParent();
            java.lang.Integer valueOf = parent != null ? java.lang.Integer.valueOf(parent.getId()) : null;
            if (valueOf == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("semanticsNode ");
                sb.append(p0);
                sb.append(" has null parent");
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck(sb.toString());
                throw new kotlin.KotlinNothingValueException();
            }
            int intValue = valueOf.intValue();
            obtain.setParent(this.view, intValue != this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId() ? intValue : -1);
        }
        obtain.setSource(this.view, p0);
        obtain.setBoundsInScreen(Camera2StreamConfigurationMap(semanticsNodeWithAdjustedBounds));
        getHighSpeedVideoFpsRangesFor(p0, obtain, semanticsNode);
        return obtain;
    }

    private final androidx.core.view.accessibility.AccessibilityNodeInfoCompat getHighSpeedVideoFpsRangesFor() {
        if (this.getHighSpeedVideoSizes.isEnabled()) {
            return null;
        }
        return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.obtain();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.graphics.Rect Camera2StreamConfigurationMap(androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds p0) {
        androidx.compose.ui.unit.IntRect adjustedBounds = p0.getAdjustedBounds();
        return getHighSpeedVideoSizes(adjustedBounds.getLeft(), adjustedBounds.getTop(), adjustedBounds.getRight(), adjustedBounds.getBottom());
    }

    private final android.graphics.Rect getHighSpeedVideoSizes(float p0, float p1, float p2, float p3) {
        long mo7308localToScreenMKHz9U = this.view.mo7308localToScreenMKHz9U(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(p1) & 4294967295L) | (java.lang.Float.floatToRawIntBits(p0) << 32)));
        long mo7308localToScreenMKHz9U2 = this.view.mo7308localToScreenMKHz9U(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(p3) & 4294967295L) | (java.lang.Float.floatToRawIntBits(p2) << 32)));
        int i = (int) (mo7308localToScreenMKHz9U >> 32);
        int i2 = (int) (mo7308localToScreenMKHz9U2 >> 32);
        int i3 = (int) (mo7308localToScreenMKHz9U & 4294967295L);
        int i4 = (int) (mo7308localToScreenMKHz9U2 & 4294967295L);
        return new android.graphics.Rect((int) java.lang.Math.floor(java.lang.Math.min(java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat(i2))), (int) java.lang.Math.floor(java.lang.Math.min(java.lang.Float.intBitsToFloat(i3), java.lang.Float.intBitsToFloat(i4))), (int) java.lang.Math.ceil(java.lang.Math.max(java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat(i2))), (int) java.lang.Math.ceil(java.lang.Math.max(java.lang.Float.intBitsToFloat(i3), java.lang.Float.intBitsToFloat(i4))));
    }

    private final void getHighSpeedVideoFpsRangesFor(int p0, androidx.core.view.accessibility.AccessibilityNodeInfoCompat p1, androidx.compose.ui.semantics.SemanticsNode p2) {
        java.lang.String highSpeedVideoFpsRangesFor;
        boolean Camera2StreamConfigurationMap2;
        boolean highResolutionOutputSizeshNQ4ISI;
        boolean highResolutionOutputSizeshNQ4ISI2;
        boolean highResolutionOutputSizeshNQ4ISI3;
        boolean Camera2StreamConfigurationMap3;
        android.view.View semanticsIdToView;
        boolean highResolutionOutputSizeshNQ4ISI4;
        boolean highResolutionOutputSizeshNQ4ISI5;
        boolean highSpeedVideoFpsRanges;
        androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat;
        boolean highSpeedVideoFpsRanges2;
        androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat2;
        boolean highResolutionOutputSizeshNQ4ISI6;
        java.lang.String accessibilityExtraKey;
        boolean highSpeedVideoSizes;
        boolean highResolutionOutputSizeshNQ4ISI7;
        boolean z;
        boolean highResolutionOutputSizeshNQ4ISI8;
        int orDefault;
        androidx.compose.ui.semantics.SemanticsNode semanticsNode;
        androidx.compose.ui.semantics.SemanticsConfiguration config;
        android.content.res.Resources resources = this.view.getContext().getResources();
        p1.setClassName(ClassName);
        if (p2.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getEditableText())) {
            p1.setClassName(TextFieldClassName);
        }
        if (p2.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getText())) {
            p1.setClassName(TextClassName);
        }
        androidx.compose.ui.semantics.Role role = (androidx.compose.ui.semantics.Role) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getRole());
        if (role != null) {
            role.getGetHighSpeedVideoSizes();
            if (p2.getIsFake() || p2.getReplacedChildren$ui().isEmpty()) {
                if (androidx.compose.ui.semantics.Role.m7794equalsimpl0(role.getGetHighSpeedVideoSizes(), androidx.compose.ui.semantics.Role.INSTANCE.m7805getTabo7Vup1c())) {
                    p1.setRoleDescription(resources.getString(androidx.compose.ui.R.string.tab));
                } else if (androidx.compose.ui.semantics.Role.m7794equalsimpl0(role.getGetHighSpeedVideoSizes(), androidx.compose.ui.semantics.Role.INSTANCE.m7804getSwitcho7Vup1c())) {
                    p1.setRoleDescription(resources.getString(androidx.compose.ui.R.string.switch_role));
                } else {
                    java.lang.String m7775toLegacyClassNameV4PA4sw = androidx.compose.ui.platform.SemanticsUtils_androidKt.m7775toLegacyClassNameV4PA4sw(role.getGetHighSpeedVideoSizes());
                    if (!androidx.compose.ui.semantics.Role.m7794equalsimpl0(role.getGetHighSpeedVideoSizes(), androidx.compose.ui.semantics.Role.INSTANCE.m7802getImageo7Vup1c()) || p2.isUnmergedLeafNode$ui() || p2.getUnmergedConfig().getIsMergingSemanticsOfDescendants()) {
                        p1.setClassName(m7775toLegacyClassNameV4PA4sw);
                    }
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        }
        p1.setPackageName(this.view.getContext().getPackageName());
        p1.setImportantForAccessibility(androidx.compose.ui.semantics.SemanticsOwnerKt.isImportantForAccessibility(p2));
        boolean highResolutionOutputSizeshNQ4ISI9 = getHighResolutionOutputSizeshNQ4ISI();
        java.util.List<androidx.compose.ui.semantics.SemanticsNode> replacedChildren$ui = p2.getReplacedChildren$ui();
        int size = replacedChildren$ui.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            androidx.compose.ui.semantics.SemanticsNode semanticsNode2 = replacedChildren$ui.get(i2);
            if (getHighSpeedVideoFpsRanges().containsKey(semanticsNode2.getId())) {
                androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder = this.view.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(semanticsNode2.getLayoutNode());
                if (semanticsNode2.getId() != -1) {
                    if (androidViewHolder != null) {
                        p1.addChild(androidViewHolder);
                    } else {
                        androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getHighSpeedVideoFpsRanges().get(semanticsNode2.getId());
                        boolean areEqual = (semanticsNodeWithAdjustedBounds == null || (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) == null || (config = semanticsNode.getConfig()) == null) ? false : kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(config, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsSensitiveData()), java.lang.Boolean.TRUE);
                        if (highResolutionOutputSizeshNQ4ISI9 || !areEqual) {
                            p1.addChild(this.view, semanticsNode2.getId());
                        }
                    }
                    this._BOUNDARY.put(semanticsNode2.getId(), i);
                    i++;
                }
            }
        }
        if (p0 == this.getInputSizeshNQ4ISI) {
            p1.setAccessibilityFocused(true);
            p1.addAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
        } else {
            p1.setAccessibilityFocused(false);
            p1.addAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_ACCESSIBILITY_FOCUS);
        }
        getHighSpeedVideoFpsRangesFor(p2, p1);
        getHighResolutionOutputSizeshNQ4ISI(p2, p1);
        highSpeedVideoFpsRangesFor = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.getHighSpeedVideoFpsRangesFor(p2, resources);
        p1.setStateDescription(highSpeedVideoFpsRangesFor);
        Camera2StreamConfigurationMap2 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.Camera2StreamConfigurationMap(p2);
        p1.setCheckable(Camera2StreamConfigurationMap2);
        androidx.compose.ui.state.ToggleableState toggleableState = (androidx.compose.ui.state.ToggleableState) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getToggleableState());
        if (toggleableState != null) {
            if (toggleableState == androidx.compose.ui.state.ToggleableState.On) {
                p1.setChecked(true);
            } else if (toggleableState == androidx.compose.ui.state.ToggleableState.Off) {
                p1.setChecked(false);
            }
            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
            kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
        }
        java.lang.Boolean bool = (java.lang.Boolean) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getSelected());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            int m7805getTabo7Vup1c = androidx.compose.ui.semantics.Role.INSTANCE.m7805getTabo7Vup1c();
            if (role != null && androidx.compose.ui.semantics.Role.m7794equalsimpl0(role.getGetHighSpeedVideoSizes(), m7805getTabo7Vup1c)) {
                p1.setSelected(booleanValue);
            } else {
                p1.setChecked(booleanValue);
            }
            kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
            kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
        }
        if (!p2.getUnmergedConfig().getIsMergingSemanticsOfDescendants() || p2.getReplacedChildren$ui().isEmpty()) {
            java.util.List list = (java.util.List) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getContentDescription());
            p1.setContentDescription(list != null ? (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull(list) : null);
        }
        java.lang.String str = (java.lang.String) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTestTag());
        if (str != null) {
            androidx.compose.ui.semantics.SemanticsNode semanticsNode3 = p2;
            while (true) {
                if (semanticsNode3 == null) {
                    break;
                }
                if (semanticsNode3.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId())) {
                    if (((java.lang.Boolean) semanticsNode3.getUnmergedConfig().get(androidx.compose.ui.semantics.SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId())).booleanValue()) {
                        p1.setViewIdResourceName(str);
                    }
                } else {
                    semanticsNode3 = semanticsNode3.getParent();
                }
            }
        }
        if (((kotlin.Unit) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getHeading())) != null) {
            p1.setHeading(true);
            kotlin.Unit unit7 = kotlin.Unit.INSTANCE;
            kotlin.Unit unit8 = kotlin.Unit.INSTANCE;
        }
        if (p0 != -1 && (orDefault = this._BOUNDARY.getOrDefault(p2.getId(), -1)) != -1) {
            p1.setDrawingOrder(orDefault);
            kotlin.Unit unit9 = kotlin.Unit.INSTANCE;
        }
        p1.setPassword(p2.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getPassword()));
        p1.setEditable(p2.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsEditable()));
        java.lang.Integer num = (java.lang.Integer) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getMaxTextLength());
        p1.setMaxTextLength(num != null ? num.intValue() : -1);
        highResolutionOutputSizeshNQ4ISI = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.getHighResolutionOutputSizeshNQ4ISI(p2);
        p1.setEnabled(highResolutionOutputSizeshNQ4ISI);
        p1.setFocusable(p2.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getFocused()));
        if (p1.isFocusable()) {
            p1.setFocused(((java.lang.Boolean) p2.getUnmergedConfig().get(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getFocused())).booleanValue());
            if (p1.isFocused()) {
                p1.addAction(2);
                this.getInputFormats = p0;
            } else {
                p1.addAction(1);
            }
        }
        p1.setVisibleToUser(!androidx.compose.ui.semantics.SemanticsOwnerKt.isHidden(p2));
        androidx.compose.ui.semantics.LiveRegionMode liveRegionMode = (androidx.compose.ui.semantics.LiveRegionMode) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getLiveRegion());
        if (liveRegionMode != null) {
            int camera2StreamConfigurationMap = liveRegionMode.getCamera2StreamConfigurationMap();
            p1.setLiveRegion((!androidx.compose.ui.semantics.LiveRegionMode.m7786equalsimpl0(camera2StreamConfigurationMap, androidx.compose.ui.semantics.LiveRegionMode.INSTANCE.m7791getPolite0phEisY()) && androidx.compose.ui.semantics.LiveRegionMode.m7786equalsimpl0(camera2StreamConfigurationMap, androidx.compose.ui.semantics.LiveRegionMode.INSTANCE.m7790getAssertive0phEisY())) ? 2 : 1);
            kotlin.Unit unit10 = kotlin.Unit.INSTANCE;
            kotlin.Unit unit11 = kotlin.Unit.INSTANCE;
        }
        p1.setClickable(false);
        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getOnClick());
        if (accessibilityAction != null) {
            boolean areEqual2 = kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getSelected()), java.lang.Boolean.TRUE);
            int m7805getTabo7Vup1c2 = androidx.compose.ui.semantics.Role.INSTANCE.m7805getTabo7Vup1c();
            if (role == null || !androidx.compose.ui.semantics.Role.m7794equalsimpl0(role.getGetHighSpeedVideoSizes(), m7805getTabo7Vup1c2)) {
                int m7803getRadioButtono7Vup1c = androidx.compose.ui.semantics.Role.INSTANCE.m7803getRadioButtono7Vup1c();
                if (role == null || !androidx.compose.ui.semantics.Role.m7794equalsimpl0(role.getGetHighSpeedVideoSizes(), m7803getRadioButtono7Vup1c)) {
                    z = false;
                    p1.setClickable(z || (z && !areEqual2));
                    highResolutionOutputSizeshNQ4ISI8 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.getHighResolutionOutputSizeshNQ4ISI(p2);
                    if (highResolutionOutputSizeshNQ4ISI8 && p1.isClickable()) {
                        p1.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, accessibilityAction.getLabel()));
                    }
                    kotlin.Unit unit12 = kotlin.Unit.INSTANCE;
                    kotlin.Unit unit13 = kotlin.Unit.INSTANCE;
                }
            }
            z = true;
            p1.setClickable(z || (z && !areEqual2));
            highResolutionOutputSizeshNQ4ISI8 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.getHighResolutionOutputSizeshNQ4ISI(p2);
            if (highResolutionOutputSizeshNQ4ISI8) {
                p1.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, accessibilityAction.getLabel()));
            }
            kotlin.Unit unit122 = kotlin.Unit.INSTANCE;
            kotlin.Unit unit132 = kotlin.Unit.INSTANCE;
        }
        p1.setLongClickable(false);
        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction2 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getOnLongClick());
        if (accessibilityAction2 != null) {
            p1.setLongClickable(true);
            highResolutionOutputSizeshNQ4ISI7 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.getHighResolutionOutputSizeshNQ4ISI(p2);
            if (highResolutionOutputSizeshNQ4ISI7) {
                p1.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(32, accessibilityAction2.getLabel()));
            }
            kotlin.Unit unit14 = kotlin.Unit.INSTANCE;
            kotlin.Unit unit15 = kotlin.Unit.INSTANCE;
        }
        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction3 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getCopyText());
        if (accessibilityAction3 != null) {
            p1.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(16384, accessibilityAction3.getLabel()));
            kotlin.Unit unit16 = kotlin.Unit.INSTANCE;
            kotlin.Unit unit17 = kotlin.Unit.INSTANCE;
        }
        highResolutionOutputSizeshNQ4ISI2 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.getHighResolutionOutputSizeshNQ4ISI(p2);
        if (highResolutionOutputSizeshNQ4ISI2) {
            androidx.compose.ui.semantics.AccessibilityAction accessibilityAction4 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetText());
            if (accessibilityAction4 != null) {
                p1.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(2097152, accessibilityAction4.getLabel()));
                kotlin.Unit unit18 = kotlin.Unit.INSTANCE;
                kotlin.Unit unit19 = kotlin.Unit.INSTANCE;
            }
            androidx.compose.ui.semantics.AccessibilityAction accessibilityAction5 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getOnImeAction());
            if (accessibilityAction5 != null) {
                p1.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionImeEnter, accessibilityAction5.getLabel()));
                kotlin.Unit unit20 = kotlin.Unit.INSTANCE;
                kotlin.Unit unit21 = kotlin.Unit.INSTANCE;
            }
            androidx.compose.ui.semantics.AccessibilityAction accessibilityAction6 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getCutText());
            if (accessibilityAction6 != null) {
                p1.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(65536, accessibilityAction6.getLabel()));
                kotlin.Unit unit22 = kotlin.Unit.INSTANCE;
                kotlin.Unit unit23 = kotlin.Unit.INSTANCE;
            }
            androidx.compose.ui.semantics.AccessibilityAction accessibilityAction7 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPasteText());
            if (accessibilityAction7 != null) {
                if (p1.isFocused() && this.view.getClipboardManager().hasText()) {
                    p1.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(32768, accessibilityAction7.getLabel()));
                }
                kotlin.Unit unit24 = kotlin.Unit.INSTANCE;
                kotlin.Unit unit25 = kotlin.Unit.INSTANCE;
            }
        }
        java.lang.String Camera2StreamConfigurationMap4 = Camera2StreamConfigurationMap(p2);
        if (Camera2StreamConfigurationMap4 != null && Camera2StreamConfigurationMap4.length() != 0) {
            p1.setTextSelection(getHighSpeedVideoSizes(p2), getHighSpeedVideoFpsRanges(p2));
            androidx.compose.ui.semantics.AccessibilityAction accessibilityAction8 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetSelection());
            p1.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(131072, accessibilityAction8 != null ? accessibilityAction8.getLabel() : null));
            p1.addAction(256);
            p1.addAction(512);
            p1.setMovementGranularities(11);
            java.util.List list2 = (java.util.List) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getContentDescription());
            if ((list2 == null || list2.isEmpty()) && p2.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getGetTextLayoutResult())) {
                highSpeedVideoSizes = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.getHighSpeedVideoSizes(p2);
                if (!highSpeedVideoSizes) {
                    p1.setMovementGranularities(p1.getMovementGranularities() | 20);
                }
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(ExtraDataIdKey);
        java.lang.CharSequence text = p1.getText();
        if (text != null && text.length() != 0 && p2.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getGetTextLayoutResult())) {
            arrayList.add(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_KEY);
        }
        if (p2.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTestTag())) {
            arrayList.add(ExtraDataTestTagKey);
        }
        if (p2.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getShape())) {
            arrayList.add(ExtraDataShapeTypeKey);
            arrayList.add(ExtraDataShapeRectKey);
            arrayList.add(ExtraDataShapeRectCornersKey);
            arrayList.add(ExtraDataShapeRegionKey);
        }
        androidx.collection.ScatterSet<androidx.compose.ui.semantics.SemanticsPropertyKey<?>> accessibilityExtraKeys$ui = p2.getUnmergedConfig().getAccessibilityExtraKeys$ui();
        if (accessibilityExtraKeys$ui != null) {
            java.lang.Object[] objArr = accessibilityExtraKeys$ui.elements;
            long[] jArr = accessibilityExtraKeys$ui.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((j & 255) < 128 && (accessibilityExtraKey = ((androidx.compose.ui.semantics.SemanticsPropertyKey) objArr[(i3 << 3) + i5]).getAccessibilityExtraKey()) != null) {
                                arrayList.add(accessibilityExtraKey);
                                kotlin.Unit unit26 = kotlin.Unit.INSTANCE;
                                kotlin.Unit unit27 = kotlin.Unit.INSTANCE;
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        }
                    }
                    if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            kotlin.Unit unit28 = kotlin.Unit.INSTANCE;
        }
        p1.setAvailableExtraData(arrayList);
        androidx.compose.ui.semantics.ProgressBarRangeInfo progressBarRangeInfo = (androidx.compose.ui.semantics.ProgressBarRangeInfo) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getProgressBarRangeInfo());
        if (progressBarRangeInfo != null) {
            if (p2.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetProgress())) {
                p1.setClassName("android.widget.SeekBar");
            } else {
                p1.setClassName("android.widget.ProgressBar");
            }
            if (progressBarRangeInfo != androidx.compose.ui.semantics.ProgressBarRangeInfo.INSTANCE.getIndeterminate()) {
                p1.setRangeInfo(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, progressBarRangeInfo.getRange().getStart().floatValue(), progressBarRangeInfo.getRange().getEndInclusive().floatValue(), progressBarRangeInfo.getCurrent()));
            }
            if (p2.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetProgress())) {
                highResolutionOutputSizeshNQ4ISI6 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.getHighResolutionOutputSizeshNQ4ISI(p2);
                if (highResolutionOutputSizeshNQ4ISI6) {
                    if (progressBarRangeInfo.getCurrent() < kotlin.ranges.RangesKt.coerceAtLeast(progressBarRangeInfo.getRange().getEndInclusive().floatValue(), progressBarRangeInfo.getRange().getStart().floatValue())) {
                        p1.addAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    }
                    if (progressBarRangeInfo.getCurrent() > kotlin.ranges.RangesKt.coerceAtMost(progressBarRangeInfo.getRange().getStart().floatValue(), progressBarRangeInfo.getRange().getEndInclusive().floatValue())) {
                        p1.addAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    }
                }
            }
        }
        androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.Api24Impl.getHighSpeedVideoFpsRangesFor(p1, p2);
        androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt.setCollectionInfo(p2, p1);
        androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt.setCollectionItemInfo(p2, p1);
        androidx.compose.ui.semantics.ScrollAxisRange scrollAxisRange = (androidx.compose.ui.semantics.ScrollAxisRange) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange());
        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction9 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getScrollBy());
        if (scrollAxisRange != null && accessibilityAction9 != null) {
            if (!androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt.hasCollectionInfo(p2)) {
                p1.setClassName("android.widget.HorizontalScrollView");
            }
            if (scrollAxisRange.getMaxValue().invoke().floatValue() > 0.0f) {
                p1.setScrollable(true);
            }
            highResolutionOutputSizeshNQ4ISI5 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.getHighResolutionOutputSizeshNQ4ISI(p2);
            if (highResolutionOutputSizeshNQ4ISI5) {
                if (getHighResolutionOutputSizeshNQ4ISI(scrollAxisRange)) {
                    p1.addAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    highSpeedVideoFpsRanges2 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.getHighSpeedVideoFpsRanges(p2);
                    if (!highSpeedVideoFpsRanges2) {
                        accessibilityActionCompat2 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT;
                    } else {
                        accessibilityActionCompat2 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT;
                    }
                    p1.addAction(accessibilityActionCompat2);
                }
                if (getHighSpeedVideoSizes(scrollAxisRange)) {
                    p1.addAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    highSpeedVideoFpsRanges = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.getHighSpeedVideoFpsRanges(p2);
                    if (!highSpeedVideoFpsRanges) {
                        accessibilityActionCompat = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT;
                    } else {
                        accessibilityActionCompat = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT;
                    }
                    p1.addAction(accessibilityActionCompat);
                }
            }
        }
        androidx.compose.ui.semantics.ScrollAxisRange scrollAxisRange2 = (androidx.compose.ui.semantics.ScrollAxisRange) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getVerticalScrollAxisRange());
        if (scrollAxisRange2 != null && accessibilityAction9 != null) {
            if (!androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt.hasCollectionInfo(p2)) {
                p1.setClassName("android.widget.ScrollView");
            }
            if (scrollAxisRange2.getMaxValue().invoke().floatValue() > 0.0f) {
                p1.setScrollable(true);
            }
            highResolutionOutputSizeshNQ4ISI4 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.getHighResolutionOutputSizeshNQ4ISI(p2);
            if (highResolutionOutputSizeshNQ4ISI4) {
                if (getHighResolutionOutputSizeshNQ4ISI(scrollAxisRange2)) {
                    p1.addAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    p1.addAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_DOWN);
                }
                if (getHighSpeedVideoSizes(scrollAxisRange2)) {
                    p1.addAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    p1.addAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_UP);
                }
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.Api29Impl.getHighSpeedVideoSizes(p1, p2);
        }
        p1.setPaneTitle((java.lang.CharSequence) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getPaneTitle()));
        highResolutionOutputSizeshNQ4ISI3 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.getHighResolutionOutputSizeshNQ4ISI(p2);
        if (highResolutionOutputSizeshNQ4ISI3) {
            androidx.compose.ui.semantics.AccessibilityAction accessibilityAction10 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getExpand());
            if (accessibilityAction10 != null) {
                p1.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(262144, accessibilityAction10.getLabel()));
                kotlin.Unit unit29 = kotlin.Unit.INSTANCE;
                kotlin.Unit unit30 = kotlin.Unit.INSTANCE;
            }
            androidx.compose.ui.semantics.AccessibilityAction accessibilityAction11 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getCollapse());
            if (accessibilityAction11 != null) {
                p1.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(524288, accessibilityAction11.getLabel()));
                kotlin.Unit unit31 = kotlin.Unit.INSTANCE;
                kotlin.Unit unit32 = kotlin.Unit.INSTANCE;
            }
            androidx.compose.ui.semantics.AccessibilityAction accessibilityAction12 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getDismiss());
            if (accessibilityAction12 != null) {
                p1.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(1048576, accessibilityAction12.getLabel()));
                kotlin.Unit unit33 = kotlin.Unit.INSTANCE;
                kotlin.Unit unit34 = kotlin.Unit.INSTANCE;
            }
            if (p2.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getCustomActions())) {
                java.util.List list3 = (java.util.List) p2.getUnmergedConfig().get(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getCustomActions());
                int size2 = list3.size();
                androidx.collection.IntList intList = Camera2StreamConfigurationMap;
                if (size2 >= intList._size) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Can't have more than ");
                    sb.append(intList._size);
                    sb.append(" custom actions for one widget");
                    throw new java.lang.IllegalStateException(sb.toString());
                }
                androidx.collection.SparseArrayCompat<java.lang.CharSequence> sparseArrayCompat = new androidx.collection.SparseArrayCompat<>(0, 1, null);
                androidx.collection.MutableObjectIntMap<java.lang.CharSequence> mutableObjectIntMapOf = androidx.collection.ObjectIntMapKt.mutableObjectIntMapOf();
                if (this.getOutputMinFrameDurationlomOqCM.containsKey(p0)) {
                    androidx.collection.MutableObjectIntMap<java.lang.CharSequence> mutableObjectIntMap = this.getOutputMinFrameDurationlomOqCM.get(p0);
                    androidx.collection.MutableIntList mutableIntList = new androidx.collection.MutableIntList(0, 1, null);
                    int[] iArr = intList.content;
                    int i6 = intList._size;
                    for (int i7 = 0; i7 < i6; i7++) {
                        mutableIntList.add(iArr[i7]);
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    int size3 = list3.size();
                    for (int i8 = 0; i8 < size3; i8++) {
                        androidx.compose.ui.semantics.CustomAccessibilityAction customAccessibilityAction = (androidx.compose.ui.semantics.CustomAccessibilityAction) list3.get(i8);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(mutableObjectIntMap);
                        if (mutableObjectIntMap.containsKey(customAccessibilityAction.getLabel())) {
                            int i9 = mutableObjectIntMap.get(customAccessibilityAction.getLabel());
                            sparseArrayCompat.put(i9, customAccessibilityAction.getLabel());
                            mutableObjectIntMapOf.set(customAccessibilityAction.getLabel(), i9);
                            mutableIntList.remove(i9);
                            p1.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(i9, customAccessibilityAction.getLabel()));
                            kotlin.Unit unit35 = kotlin.Unit.INSTANCE;
                        } else {
                            arrayList2.add(customAccessibilityAction);
                        }
                    }
                    int size4 = arrayList2.size();
                    for (int i10 = 0; i10 < size4; i10++) {
                        androidx.compose.ui.semantics.CustomAccessibilityAction customAccessibilityAction2 = (androidx.compose.ui.semantics.CustomAccessibilityAction) arrayList2.get(i10);
                        int i11 = mutableIntList.get(i10);
                        sparseArrayCompat.put(i11, customAccessibilityAction2.getLabel());
                        mutableObjectIntMapOf.set(customAccessibilityAction2.getLabel(), i11);
                        p1.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(i11, customAccessibilityAction2.getLabel()));
                    }
                } else {
                    int size5 = list3.size();
                    for (int i12 = 0; i12 < size5; i12++) {
                        androidx.compose.ui.semantics.CustomAccessibilityAction customAccessibilityAction3 = (androidx.compose.ui.semantics.CustomAccessibilityAction) list3.get(i12);
                        int i13 = Camera2StreamConfigurationMap.get(i12);
                        sparseArrayCompat.put(i13, customAccessibilityAction3.getLabel());
                        mutableObjectIntMapOf.set(customAccessibilityAction3.getLabel(), i13);
                        p1.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(i13, customAccessibilityAction3.getLabel()));
                    }
                }
                this.getOutputStallDuration.put(p0, sparseArrayCompat);
                this.getOutputMinFrameDurationlomOqCM.put(p0, mutableObjectIntMapOf);
            }
        }
        Camera2StreamConfigurationMap3 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.Camera2StreamConfigurationMap(p2, resources);
        p1.setScreenReaderFocusable(Camera2StreamConfigurationMap3);
        int orDefault2 = this.idToBeforeMap.getOrDefault(p0, -1);
        if (orDefault2 != -1) {
            android.view.View semanticsIdToView2 = androidx.compose.ui.platform.SemanticsUtils_androidKt.semanticsIdToView(this.view.getAndroidViewsHandler$ui(), orDefault2);
            if (semanticsIdToView2 != null) {
                p1.setTraversalBefore(semanticsIdToView2);
            } else {
                p1.setTraversalBefore(this.view, orDefault2);
            }
            getHighSpeedVideoFpsRangesFor(p0, p1, this.ExtraDataTestTraversalBeforeVal, (android.os.Bundle) null);
        }
        int orDefault3 = this.idToAfterMap.getOrDefault(p0, -1);
        if (orDefault3 != -1 && (semanticsIdToView = androidx.compose.ui.platform.SemanticsUtils_androidKt.semanticsIdToView(this.view.getAndroidViewsHandler$ui(), orDefault3)) != null) {
            p1.setTraversalAfter(semanticsIdToView);
            getHighSpeedVideoFpsRangesFor(p0, p1, this.ExtraDataTestTraversalAfterVal, (android.os.Bundle) null);
        }
        java.lang.String str2 = (java.lang.String) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsPropertiesAndroid.INSTANCE.getAccessibilityClassName());
        if (str2 != null) {
            p1.setClassName(str2);
            kotlin.Unit unit36 = kotlin.Unit.INSTANCE;
            kotlin.Unit unit37 = kotlin.Unit.INSTANCE;
        }
    }

    private static final boolean getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.semantics.ScrollAxisRange scrollAxisRange) {
        if (scrollAxisRange.getValue().invoke().floatValue() >= scrollAxisRange.getMaxValue().invoke().floatValue() || scrollAxisRange.getReverseScrolling()) {
            return scrollAxisRange.getValue().invoke().floatValue() > 0.0f && scrollAxisRange.getReverseScrolling();
        }
        return true;
    }

    private static final boolean getHighSpeedVideoSizes(androidx.compose.ui.semantics.ScrollAxisRange scrollAxisRange) {
        if (scrollAxisRange.getValue().invoke().floatValue() <= 0.0f || scrollAxisRange.getReverseScrolling()) {
            return scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue() && scrollAxisRange.getReverseScrolling();
        }
        return true;
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.semantics.SemanticsNode p0, androidx.core.view.accessibility.AccessibilityNodeInfoCompat p1) {
        if (p0.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getError())) {
            p1.setContentInvalid(true);
            p1.setError((java.lang.CharSequence) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(p0.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getError()));
        }
    }

    private final android.text.SpannableString getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.text.AnnotatedString annotatedString) {
        return (android.text.SpannableString) getHighSpeedVideoSizes((androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat) androidx.compose.ui.text.platform.AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(annotatedString, this.view.getDensity(), this.view.getFontFamilyResolver(), this.coroutineBoundary), ParcelSafeTextLength);
    }

    private final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.semantics.SemanticsNode p0, androidx.core.view.accessibility.AccessibilityNodeInfoCompat p1) {
        androidx.compose.ui.text.AnnotatedString highSpeedVideoFpsRangesFor;
        highSpeedVideoFpsRangesFor = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.getHighSpeedVideoFpsRangesFor(p0);
        p1.setText(highSpeedVideoFpsRangesFor != null ? getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor) : null);
    }

    private final boolean getHighResolutionOutputSizeshNQ4ISI(int p0) {
        return this.getInputSizeshNQ4ISI == p0;
    }

    private final boolean getHighSpeedVideoFpsRangesFor(int p0) {
        if (!getInputSizeshNQ4ISI() || getHighResolutionOutputSizeshNQ4ISI(p0)) {
            return false;
        }
        int i = this.getInputSizeshNQ4ISI;
        if (i != Integer.MIN_VALUE) {
            getHighSpeedVideoFpsRangesFor$default(this, i, 65536, null, null, 12, null);
        }
        this.getInputSizeshNQ4ISI = p0;
        this.view.invalidate();
        getHighSpeedVideoFpsRangesFor$default(this, p0, 32768, null, null, 12, null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean getHighSpeedVideoFpsRangesFor$default(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i, int i2, java.lang.Integer num, java.util.List list, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        if ((i3 & 8) != 0) {
            list = null;
        }
        return androidComposeViewAccessibilityDelegateCompat.getHighSpeedVideoFpsRangesFor(i, i2, num, (java.util.List<java.lang.String>) list);
    }

    private final boolean getHighSpeedVideoFpsRangesFor(int p0, int p1, java.lang.Integer p2, java.util.List<java.lang.String> p3) {
        if (p0 == Integer.MIN_VALUE || !isEnabled$ui()) {
            return false;
        }
        android.view.accessibility.AccessibilityEvent highSpeedVideoSizes = getHighSpeedVideoSizes(p0, p1);
        if (p2 != null) {
            highSpeedVideoSizes.setContentChangeTypes(p2.intValue());
        }
        if (p3 != null) {
            highSpeedVideoSizes.setContentDescription(androidx.compose.ui.util.ListUtilsKt.fastJoinToString$default(p3, ",", null, null, 0, null, null, 62, null));
        }
        return getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes);
    }

    private final boolean getHighResolutionOutputSizeshNQ4ISI(android.view.accessibility.AccessibilityEvent p0) {
        if (!isEnabled$ui()) {
            return false;
        }
        if (p0.getEventType() == 2048 || p0.getEventType() == 32768) {
            this.getOutputSizeshNQ4ISI = true;
        }
        try {
            return this.onSendAccessibilityEvent.invoke(p0).booleanValue();
        } finally {
            this.getOutputSizeshNQ4ISI = false;
        }
    }

    private final android.view.accessibility.AccessibilityEvent getHighSpeedVideoSizes(int p0, int p1) {
        androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds;
        android.view.accessibility.AccessibilityEvent obtain = android.view.accessibility.AccessibilityEvent.obtain(p1);
        obtain.setEnabled(true);
        obtain.setClassName(ClassName);
        obtain.setPackageName(this.view.getContext().getPackageName());
        obtain.setSource(this.view, p0);
        if (isEnabled$ui() && (semanticsNodeWithAdjustedBounds = getHighSpeedVideoFpsRanges().get(p0)) != null) {
            obtain.setPassword(semanticsNodeWithAdjustedBounds.getSemanticsNode().getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getPassword()));
            androidx.core.view.accessibility.AccessibilityEventCompat.setAccessibilityDataSensitive(obtain, kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNodeWithAdjustedBounds.getSemanticsNode().getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsSensitiveData()), java.lang.Boolean.TRUE));
        }
        return obtain;
    }

    private final android.view.accessibility.AccessibilityEvent getHighSpeedVideoSizes(int p0, java.lang.Integer p1, java.lang.Integer p2, java.lang.Integer p3, java.lang.CharSequence p4) {
        android.view.accessibility.AccessibilityEvent highSpeedVideoSizes = getHighSpeedVideoSizes(p0, 8192);
        if (p1 != null) {
            highSpeedVideoSizes.setFromIndex(p1.intValue());
        }
        if (p2 != null) {
            highSpeedVideoSizes.setToIndex(p2.intValue());
        }
        if (p3 != null) {
            highSpeedVideoSizes.setItemCount(p3.intValue());
        }
        if (p4 != null) {
            highSpeedVideoSizes.getText().add(p4);
        }
        return highSpeedVideoSizes;
    }

    private final boolean Camera2StreamConfigurationMap(int p0) {
        if (!getHighResolutionOutputSizeshNQ4ISI(p0)) {
            return false;
        }
        this.getInputSizeshNQ4ISI = Integer.MIN_VALUE;
        this.getOutputMinFrameDuration = null;
        this.view.invalidate();
        getHighSpeedVideoFpsRangesFor$default(this, p0, 65536, null, null, 12, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0106 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0165  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:138:0x0103 -> B:104:0x0104). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean getHighSpeedVideoFpsRanges(int p0, int p1, android.os.Bundle p2) {
        androidx.compose.ui.semantics.SemanticsNode semanticsNode;
        kotlin.jvm.functions.Function0 function0;
        boolean highResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.functions.Function0 function02;
        float f;
        int i;
        boolean z;
        float intBitsToFloat;
        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction;
        kotlin.jvm.functions.Function0 function03;
        float intBitsToFloat2;
        boolean highSpeedVideoFpsRanges;
        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction2;
        kotlin.jvm.functions.Function0 function04;
        kotlin.jvm.functions.Function0 function05;
        kotlin.jvm.functions.Function0 function06;
        kotlin.jvm.functions.Function0 function07;
        kotlin.jvm.functions.Function0 function08;
        kotlin.jvm.functions.Function0 function09;
        kotlin.jvm.functions.Function0 function010;
        kotlin.jvm.functions.Function0 function011;
        kotlin.jvm.functions.Function1 function1;
        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction3;
        boolean highSpeedVideoFpsRanges2;
        kotlin.jvm.functions.Function2 function2;
        androidx.compose.ui.semantics.SemanticsConfiguration unmergedConfig;
        androidx.compose.ui.semantics.SemanticsConfiguration unmergedConfig2;
        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction4;
        kotlin.jvm.functions.Function1 function12;
        kotlin.jvm.functions.Function0 function012;
        java.lang.CharSequence charSequence;
        java.util.List list;
        androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getHighSpeedVideoFpsRanges().get(p0);
        if (semanticsNodeWithAdjustedBounds == null || (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) == null) {
            return false;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsSensitiveData()), java.lang.Boolean.TRUE) && !getHighResolutionOutputSizeshNQ4ISI()) {
            return false;
        }
        if (p1 == 64) {
            return getHighSpeedVideoFpsRangesFor(p0);
        }
        if (p1 == 128) {
            return Camera2StreamConfigurationMap(p0);
        }
        if (p1 == 256 || p1 == 512) {
            if (p2 == null) {
                return false;
            }
            return Camera2StreamConfigurationMap(semanticsNode, p2.getInt(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT), p1 == 256, p2.getBoolean(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN));
        }
        if (p1 == 16384) {
            androidx.compose.ui.semantics.AccessibilityAction accessibilityAction5 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getCopyText());
            if (accessibilityAction5 == null || (function0 = (kotlin.jvm.functions.Function0) accessibilityAction5.getAction()) == null) {
                return false;
            }
            return ((java.lang.Boolean) function0.invoke()).booleanValue();
        }
        if (p1 != 131072) {
            highResolutionOutputSizeshNQ4ISI = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.getHighResolutionOutputSizeshNQ4ISI(semanticsNode);
            if (!highResolutionOutputSizeshNQ4ISI) {
                return false;
            }
            if (p1 == 1) {
                if (this.view.isInTouchMode()) {
                    this.view.requestFocusFromTouch();
                }
                androidx.compose.ui.semantics.AccessibilityAction accessibilityAction6 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getRequestFocus());
                if (accessibilityAction6 == null || (function02 = (kotlin.jvm.functions.Function0) accessibilityAction6.getAction()) == null) {
                    return false;
                }
                return ((java.lang.Boolean) function02.invoke()).booleanValue();
            }
            if (p1 != 2) {
                java.lang.Boolean bool = null;
                switch (p1) {
                    case 16:
                        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction7 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getOnClick());
                        if (accessibilityAction7 != null && (function05 = (kotlin.jvm.functions.Function0) accessibilityAction7.getAction()) != null) {
                            bool = (java.lang.Boolean) function05.invoke();
                        }
                        java.lang.Boolean bool2 = bool;
                        getHighSpeedVideoFpsRangesFor$default(this, p0, 1, null, null, 12, null);
                        if (bool2 != null) {
                            return bool2.booleanValue();
                        }
                        return false;
                    case 32:
                        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction8 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getOnLongClick());
                        if (accessibilityAction8 == null || (function06 = (kotlin.jvm.functions.Function0) accessibilityAction8.getAction()) == null) {
                            return false;
                        }
                        return ((java.lang.Boolean) function06.invoke()).booleanValue();
                    case 4096:
                    case 8192:
                        break;
                    case 32768:
                        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction9 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPasteText());
                        if (accessibilityAction9 == null || (function07 = (kotlin.jvm.functions.Function0) accessibilityAction9.getAction()) == null) {
                            return false;
                        }
                        return ((java.lang.Boolean) function07.invoke()).booleanValue();
                    case 65536:
                        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction10 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getCutText());
                        if (accessibilityAction10 == null || (function08 = (kotlin.jvm.functions.Function0) accessibilityAction10.getAction()) == null) {
                            return false;
                        }
                        return ((java.lang.Boolean) function08.invoke()).booleanValue();
                    case 262144:
                        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction11 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getExpand());
                        if (accessibilityAction11 == null || (function09 = (kotlin.jvm.functions.Function0) accessibilityAction11.getAction()) == null) {
                            return false;
                        }
                        return ((java.lang.Boolean) function09.invoke()).booleanValue();
                    case 524288:
                        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction12 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getCollapse());
                        if (accessibilityAction12 == null || (function010 = (kotlin.jvm.functions.Function0) accessibilityAction12.getAction()) == null) {
                            return false;
                        }
                        return ((java.lang.Boolean) function010.invoke()).booleanValue();
                    case 1048576:
                        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction13 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getDismiss());
                        if (accessibilityAction13 == null || (function011 = (kotlin.jvm.functions.Function0) accessibilityAction13.getAction()) == null) {
                            return false;
                        }
                        return ((java.lang.Boolean) function011.invoke()).booleanValue();
                    case 2097152:
                        java.lang.String string = p2 != null ? p2.getString(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE) : null;
                        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction14 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetText());
                        if (accessibilityAction14 == null || (function1 = (kotlin.jvm.functions.Function1) accessibilityAction14.getAction()) == null) {
                            return false;
                        }
                        if (string == null) {
                            string = "";
                        }
                        return ((java.lang.Boolean) function1.invoke(new androidx.compose.ui.text.AnnotatedString(string, null, 2, null))).booleanValue();
                    case android.R.id.accessibilityActionShowOnScreen:
                        androidx.compose.ui.semantics.SemanticsNode parent = semanticsNode.getParent();
                        if (parent != null && (unmergedConfig2 = parent.getUnmergedConfig()) != null) {
                            accessibilityAction3 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(unmergedConfig2, androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getScrollBy());
                            while (parent != null && accessibilityAction3 == null) {
                                parent = parent.getParent();
                                if (parent != null && (unmergedConfig = parent.getUnmergedConfig()) != null) {
                                    accessibilityAction3 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(unmergedConfig, androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getScrollBy());
                                }
                            }
                            if (parent != null) {
                                androidx.compose.ui.geometry.Rect boundsInRoot = semanticsNode.getBoundsInRoot();
                                return this.view.requestRectangleOnScreen(new android.graphics.Rect((int) java.lang.Math.floor(boundsInRoot.getLeft()), (int) java.lang.Math.floor(boundsInRoot.getTop()), kotlin.math.MathKt.roundToInt((float) java.lang.Math.ceil(boundsInRoot.getRight())), kotlin.math.MathKt.roundToInt((float) java.lang.Math.ceil(boundsInRoot.getBottom()))));
                            }
                            androidx.compose.ui.geometry.Rect boundsInParent = androidx.compose.ui.layout.LayoutCoordinatesKt.boundsInParent(parent.getLayoutInfo().getCoordinates());
                            androidx.compose.ui.layout.LayoutCoordinates parentLayoutCoordinates = parent.getLayoutInfo().getCoordinates().getParentLayoutCoordinates();
                            androidx.compose.ui.geometry.Rect m5789translatek4lQ0M = boundsInParent.m5789translatek4lQ0M(parentLayoutCoordinates != null ? androidx.compose.ui.layout.LayoutCoordinatesKt.positionInRoot(parentLayoutCoordinates) : androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0());
                            androidx.compose.ui.geometry.Rect m5792Recttz77jQw = androidx.compose.ui.geometry.RectKt.m5792Recttz77jQw(semanticsNode.m7807getPositionInRootF1C5BW0(), androidx.compose.ui.unit.IntSizeKt.m8784toSizeozmzZPI(semanticsNode.m7810getSizeYbymL2g()));
                            androidx.compose.ui.semantics.ScrollAxisRange scrollAxisRange = (androidx.compose.ui.semantics.ScrollAxisRange) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(parent.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange());
                            androidx.compose.ui.semantics.ScrollAxisRange scrollAxisRange2 = (androidx.compose.ui.semantics.ScrollAxisRange) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(parent.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getVerticalScrollAxisRange());
                            float highSpeedVideoFpsRanges3 = getHighSpeedVideoFpsRanges(m5792Recttz77jQw.getLeft() - m5789translatek4lQ0M.getLeft(), m5792Recttz77jQw.getRight() - m5789translatek4lQ0M.getRight());
                            if (scrollAxisRange != null && scrollAxisRange.getReverseScrolling()) {
                                highSpeedVideoFpsRanges3 = -highSpeedVideoFpsRanges3;
                            }
                            highSpeedVideoFpsRanges2 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.getHighSpeedVideoFpsRanges(semanticsNode);
                            if (highSpeedVideoFpsRanges2) {
                                highSpeedVideoFpsRanges3 = -highSpeedVideoFpsRanges3;
                            }
                            float highSpeedVideoFpsRanges4 = getHighSpeedVideoFpsRanges(m5792Recttz77jQw.getTop() - m5789translatek4lQ0M.getTop(), m5792Recttz77jQw.getBottom() - m5789translatek4lQ0M.getBottom());
                            if (scrollAxisRange2 != null && scrollAxisRange2.getReverseScrolling()) {
                                highSpeedVideoFpsRanges4 = -highSpeedVideoFpsRanges4;
                            }
                            return (accessibilityAction3 == null || (function2 = (kotlin.jvm.functions.Function2) accessibilityAction3.getAction()) == null || !((java.lang.Boolean) function2.invoke(java.lang.Float.valueOf(highSpeedVideoFpsRanges3), java.lang.Float.valueOf(highSpeedVideoFpsRanges4))).booleanValue()) ? false : true;
                        }
                        accessibilityAction3 = null;
                        while (parent != null) {
                            parent = parent.getParent();
                            if (parent != null) {
                                accessibilityAction3 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(unmergedConfig, androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getScrollBy());
                            }
                            accessibilityAction3 = null;
                            while (parent != null) {
                            }
                        }
                        if (parent != null) {
                        }
                        break;
                    case android.R.id.accessibilityActionSetProgress:
                        if (p2 == null || !p2.containsKey(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE) || (accessibilityAction4 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetProgress())) == null || (function12 = (kotlin.jvm.functions.Function1) accessibilityAction4.getAction()) == null) {
                            return false;
                        }
                        return ((java.lang.Boolean) function12.invoke(java.lang.Float.valueOf(p2.getFloat(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE)))).booleanValue();
                    case android.R.id.accessibilityActionImeEnter:
                        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction15 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getOnImeAction());
                        if (accessibilityAction15 == null || (function012 = (kotlin.jvm.functions.Function0) accessibilityAction15.getAction()) == null) {
                            return false;
                        }
                        return ((java.lang.Boolean) function012.invoke()).booleanValue();
                    default:
                        switch (p1) {
                            case android.R.id.accessibilityActionScrollUp:
                            case android.R.id.accessibilityActionScrollLeft:
                            case android.R.id.accessibilityActionScrollDown:
                            case android.R.id.accessibilityActionScrollRight:
                                break;
                            default:
                                switch (p1) {
                                    case android.R.id.accessibilityActionPageUp:
                                        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction16 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPageUp());
                                        if (accessibilityAction16 != null && (r0 = (kotlin.jvm.functions.Function0) accessibilityAction16.getAction()) != null) {
                                            break;
                                        }
                                        break;
                                    case android.R.id.accessibilityActionPageDown:
                                        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction17 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPageDown());
                                        if (accessibilityAction17 != null && (r0 = (kotlin.jvm.functions.Function0) accessibilityAction17.getAction()) != null) {
                                            break;
                                        }
                                        break;
                                    case android.R.id.accessibilityActionPageLeft:
                                        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction18 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPageLeft());
                                        if (accessibilityAction18 != null && (r0 = (kotlin.jvm.functions.Function0) accessibilityAction18.getAction()) != null) {
                                            break;
                                        }
                                        break;
                                    case android.R.id.accessibilityActionPageRight:
                                        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction19 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPageRight());
                                        if (accessibilityAction19 != null && (r0 = (kotlin.jvm.functions.Function0) accessibilityAction19.getAction()) != null) {
                                            break;
                                        }
                                        break;
                                    default:
                                        androidx.collection.SparseArrayCompat<java.lang.CharSequence> sparseArrayCompat = this.getOutputStallDuration.get(p0);
                                        if (sparseArrayCompat != null && (charSequence = sparseArrayCompat.get(p1)) != null && (list = (java.util.List) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getCustomActions())) != null) {
                                            int size = list.size();
                                            for (int i2 = 0; i2 < size; i2++) {
                                                androidx.compose.ui.semantics.CustomAccessibilityAction customAccessibilityAction = (androidx.compose.ui.semantics.CustomAccessibilityAction) list.get(i2);
                                                if (kotlin.jvm.internal.Intrinsics.areEqual(customAccessibilityAction.getLabel(), charSequence)) {
                                                    break;
                                                }
                                            }
                                            break;
                                        }
                                        break;
                                }
                        }
                        return false;
                }
                boolean z2 = p1 == 4096;
                boolean z3 = p1 == 8192;
                boolean z4 = p1 == 16908345;
                boolean z5 = p1 == 16908347;
                boolean z6 = p1 == 16908344;
                boolean z7 = p1 == 16908346;
                boolean z8 = z4 || z5 || z2 || z3;
                boolean z9 = z6 || z7 || z2 || z3;
                if (z2 || z3) {
                    androidx.compose.ui.semantics.ProgressBarRangeInfo progressBarRangeInfo = (androidx.compose.ui.semantics.ProgressBarRangeInfo) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getProgressBarRangeInfo());
                    androidx.compose.ui.semantics.AccessibilityAction accessibilityAction20 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetProgress());
                    if (progressBarRangeInfo != null && accessibilityAction20 != null) {
                        float coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(progressBarRangeInfo.getRange().getEndInclusive().floatValue(), progressBarRangeInfo.getRange().getStart().floatValue());
                        float coerceAtMost = kotlin.ranges.RangesKt.coerceAtMost(progressBarRangeInfo.getRange().getStart().floatValue(), progressBarRangeInfo.getRange().getEndInclusive().floatValue());
                        if (progressBarRangeInfo.getSteps() > 0) {
                            f = coerceAtLeast - coerceAtMost;
                            i = progressBarRangeInfo.getSteps() + 1;
                        } else {
                            f = coerceAtLeast - coerceAtMost;
                            i = 20;
                        }
                        float f2 = f / i;
                        if (z3) {
                            f2 = -f2;
                        }
                        kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) accessibilityAction20.getAction();
                        if (function13 != null) {
                            return ((java.lang.Boolean) function13.invoke(java.lang.Float.valueOf(progressBarRangeInfo.getCurrent() + f2))).booleanValue();
                        }
                        return false;
                    }
                }
                long m5785getSizeNHjbRc = androidx.compose.ui.layout.LayoutCoordinatesKt.boundsInParent(semanticsNode.getLayoutInfo().getCoordinates()).m5785getSizeNHjbRc();
                java.lang.Float scrollViewportLength = androidx.compose.ui.platform.SemanticsUtils_androidKt.getScrollViewportLength(semanticsNode.getUnmergedConfig());
                androidx.compose.ui.semantics.AccessibilityAction accessibilityAction21 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getScrollBy());
                if (accessibilityAction21 == null) {
                    return false;
                }
                androidx.compose.ui.semantics.ScrollAxisRange scrollAxisRange3 = (androidx.compose.ui.semantics.ScrollAxisRange) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange());
                if (scrollAxisRange3 == null || !z8) {
                    z = z6;
                } else {
                    if (scrollViewportLength != null) {
                        intBitsToFloat2 = scrollViewportLength.floatValue();
                        z = z6;
                    } else {
                        z = z6;
                        intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (m5785getSizeNHjbRc >> 32));
                    }
                    if (z4 || z3) {
                        intBitsToFloat2 = -intBitsToFloat2;
                    }
                    if (scrollAxisRange3.getReverseScrolling()) {
                        intBitsToFloat2 = -intBitsToFloat2;
                    }
                    highSpeedVideoFpsRanges = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.getHighSpeedVideoFpsRanges(semanticsNode);
                    if (highSpeedVideoFpsRanges && (z4 || z5)) {
                        intBitsToFloat2 = -intBitsToFloat2;
                    }
                    if (Camera2StreamConfigurationMap(scrollAxisRange3, intBitsToFloat2)) {
                        if (!semanticsNode.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPageLeft()) && !semanticsNode.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPageRight())) {
                            kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) accessibilityAction21.getAction();
                            if (function22 != null) {
                                return ((java.lang.Boolean) function22.invoke(java.lang.Float.valueOf(intBitsToFloat2), java.lang.Float.valueOf(0.0f))).booleanValue();
                            }
                            return false;
                        }
                        if (intBitsToFloat2 > 0.0f) {
                            accessibilityAction2 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPageRight());
                        } else {
                            accessibilityAction2 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPageLeft());
                        }
                        if (accessibilityAction2 == null || (function04 = (kotlin.jvm.functions.Function0) accessibilityAction2.getAction()) == null) {
                            return false;
                        }
                        return ((java.lang.Boolean) function04.invoke()).booleanValue();
                    }
                }
                androidx.compose.ui.semantics.ScrollAxisRange scrollAxisRange4 = (androidx.compose.ui.semantics.ScrollAxisRange) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getVerticalScrollAxisRange());
                if (scrollAxisRange4 == null || !z9) {
                    return false;
                }
                if (scrollViewportLength != null) {
                    intBitsToFloat = scrollViewportLength.floatValue();
                } else {
                    intBitsToFloat = java.lang.Float.intBitsToFloat((int) (4294967295L & m5785getSizeNHjbRc));
                }
                if (z || z3) {
                    intBitsToFloat = -intBitsToFloat;
                }
                if (scrollAxisRange4.getReverseScrolling()) {
                    intBitsToFloat = -intBitsToFloat;
                }
                if (!Camera2StreamConfigurationMap(scrollAxisRange4, intBitsToFloat)) {
                    return false;
                }
                if (!semanticsNode.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPageUp()) && !semanticsNode.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPageDown())) {
                    kotlin.jvm.functions.Function2 function23 = (kotlin.jvm.functions.Function2) accessibilityAction21.getAction();
                    if (function23 != null) {
                        return ((java.lang.Boolean) function23.invoke(java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(intBitsToFloat))).booleanValue();
                    }
                    return false;
                }
                if (intBitsToFloat > 0.0f) {
                    accessibilityAction = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPageDown());
                } else {
                    accessibilityAction = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPageUp());
                }
                if (accessibilityAction == null || (function03 = (kotlin.jvm.functions.Function0) accessibilityAction.getAction()) == null) {
                    return false;
                }
                return ((java.lang.Boolean) function03.invoke()).booleanValue();
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getFocused()), java.lang.Boolean.TRUE)) {
                return false;
            }
            this.view.getFocusOwner().mo5661clearFocusI7lrPNg(false, true, true, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5651getExitdhqQ8s());
            return true;
        }
        boolean highSpeedVideoFpsRanges5 = getHighSpeedVideoFpsRanges(semanticsNode, p2 != null ? p2.getInt(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_START_INT, -1) : -1, p2 != null ? p2.getInt(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_END_INT, -1) : -1, false);
        if (highSpeedVideoFpsRanges5) {
            getHighSpeedVideoFpsRangesFor$default(this, getHighSpeedVideoSizes(semanticsNode.getId()), 0, null, null, 12, null);
        }
        return highSpeedVideoFpsRanges5;
    }

    private static final boolean Camera2StreamConfigurationMap(androidx.compose.ui.semantics.ScrollAxisRange scrollAxisRange, float f) {
        if (f >= 0.0f || scrollAxisRange.getValue().invoke().floatValue() <= 0.0f) {
            return f > 0.0f && scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue();
        }
        return true;
    }

    private static final float getHighSpeedVideoFpsRanges(float f, float f2) {
        if (java.lang.Math.signum(f) == java.lang.Math.signum(f2)) {
            return java.lang.Math.abs(f) < java.lang.Math.abs(f2) ? f : f2;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRangesFor(int p0, androidx.core.view.accessibility.AccessibilityNodeInfoCompat p1, java.lang.String p2, android.os.Bundle p3) {
        androidx.compose.ui.semantics.SemanticsNode semanticsNode;
        float[] highSpeedVideoFpsRangesFor;
        androidx.compose.ui.text.TextLayoutResult textLayoutResult;
        androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getHighSpeedVideoFpsRanges().get(p0);
        if (semanticsNodeWithAdjustedBounds == null || (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) == null) {
            return;
        }
        java.lang.String Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(semanticsNode);
        if (kotlin.jvm.internal.Intrinsics.areEqual(p2, this.ExtraDataTestTraversalBeforeVal)) {
            int orDefault = this.idToBeforeMap.getOrDefault(p0, -1);
            if (orDefault != -1) {
                p1.getExtras().putInt(p2, orDefault);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(p2, this.ExtraDataTestTraversalAfterVal)) {
            int orDefault2 = this.idToAfterMap.getOrDefault(p0, -1);
            if (orDefault2 != -1) {
                p1.getExtras().putInt(p2, orDefault2);
                return;
            }
            return;
        }
        int i = 0;
        if (semanticsNode.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getGetTextLayoutResult()) && p3 != null && kotlin.jvm.internal.Intrinsics.areEqual(p2, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_KEY)) {
            int i2 = p3.getInt(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX, -1);
            int i3 = p3.getInt(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH, -1);
            if (i3 <= 0 || i2 < 0) {
                return;
            }
            if (i2 >= (Camera2StreamConfigurationMap2 != null ? Camera2StreamConfigurationMap2.length() : Integer.MAX_VALUE) || (textLayoutResult = androidx.compose.ui.platform.SemanticsUtils_androidKt.getTextLayoutResult(semanticsNode.getUnmergedConfig())) == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = i2 + i4;
                if (i5 >= textLayoutResult.getLayoutInput().getText().length()) {
                    arrayList.add(null);
                } else {
                    arrayList.add(getHighSpeedVideoFpsRangesFor(semanticsNode, textLayoutResult.getBoundingBox(i5)));
                }
            }
            p1.getExtras().putParcelableArray(p2, (android.os.Parcelable[]) arrayList.toArray(new android.graphics.RectF[0]));
            return;
        }
        if (semanticsNode.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTestTag()) && p3 != null && kotlin.jvm.internal.Intrinsics.areEqual(p2, ExtraDataTestTagKey)) {
            java.lang.String str = (java.lang.String) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTestTag());
            if (str != null) {
                p1.getExtras().putCharSequence(p2, str);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(p2, ExtraDataIdKey)) {
            p1.getExtras().putInt(p2, semanticsNode.getId());
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(p2, ExtraDataShapeTypeKey)) {
            androidx.compose.ui.graphics.Shape shape = (androidx.compose.ui.graphics.Shape) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getShape());
            if (shape != null) {
                androidx.compose.ui.geometry.Rect highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(semanticsNode, Camera2StreamConfigurationMap(p1), shape);
                androidx.compose.ui.graphics.Outline highSpeedVideoFpsRangesFor3 = getHighSpeedVideoFpsRangesFor(shape, highSpeedVideoFpsRangesFor2.m5785getSizeNHjbRc(), semanticsNode.getLayoutInfo().getLayoutDirection());
                if (highSpeedVideoFpsRangesFor3 instanceof androidx.compose.ui.graphics.Outline.Rectangle) {
                    p1.getExtras().putInt(ExtraDataShapeTypeKey, 0);
                    p1.getExtras().putParcelable(ExtraDataShapeRectKey, getHighSpeedVideoFpsRanges(highSpeedVideoFpsRangesFor3, highSpeedVideoFpsRangesFor2.getLeft(), highSpeedVideoFpsRangesFor2.getTop()));
                    return;
                } else if (highSpeedVideoFpsRangesFor3 instanceof androidx.compose.ui.graphics.Outline.Rounded) {
                    p1.getExtras().putInt(ExtraDataShapeTypeKey, 1);
                    p1.getExtras().putParcelable(ExtraDataShapeRectKey, getHighSpeedVideoFpsRanges(highSpeedVideoFpsRangesFor3, highSpeedVideoFpsRangesFor2.getLeft(), highSpeedVideoFpsRangesFor2.getTop()));
                    p1.getExtras().putFloatArray(ExtraDataShapeRectCornersKey, getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor3));
                    return;
                } else {
                    if (highSpeedVideoFpsRangesFor3 instanceof androidx.compose.ui.graphics.Outline.Generic) {
                        p1.getExtras().putInt(ExtraDataShapeTypeKey, 2);
                        p1.getExtras().putParcelable(ExtraDataShapeRegionKey, Camera2StreamConfigurationMap(highSpeedVideoFpsRangesFor3, highSpeedVideoFpsRangesFor2.getLeft(), highSpeedVideoFpsRangesFor2.getTop()));
                        return;
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(p2, ExtraDataShapeRectKey)) {
            androidx.compose.ui.graphics.Shape shape2 = (androidx.compose.ui.graphics.Shape) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getShape());
            if (shape2 != null) {
                androidx.compose.ui.geometry.Rect highSpeedVideoFpsRangesFor4 = getHighSpeedVideoFpsRangesFor(semanticsNode, Camera2StreamConfigurationMap(p1), shape2);
                android.graphics.Rect highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor(shape2, highSpeedVideoFpsRangesFor4.m5785getSizeNHjbRc(), semanticsNode.getLayoutInfo().getLayoutDirection()), highSpeedVideoFpsRangesFor4.getLeft(), highSpeedVideoFpsRangesFor4.getTop());
                if (highSpeedVideoFpsRanges != null) {
                    p1.getExtras().putParcelable(ExtraDataShapeRectKey, highSpeedVideoFpsRanges);
                    return;
                }
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(p2, ExtraDataShapeRectCornersKey)) {
            androidx.compose.ui.graphics.Shape shape3 = (androidx.compose.ui.graphics.Shape) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getShape());
            if (shape3 == null || (highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor(shape3, getHighSpeedVideoFpsRangesFor(semanticsNode, Camera2StreamConfigurationMap(p1), shape3).m5785getSizeNHjbRc(), semanticsNode.getLayoutInfo().getLayoutDirection()))) == null) {
                return;
            }
            p1.getExtras().putFloatArray(ExtraDataShapeRectCornersKey, highSpeedVideoFpsRangesFor);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(p2, ExtraDataShapeRegionKey)) {
            androidx.compose.ui.graphics.Shape shape4 = (androidx.compose.ui.graphics.Shape) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getShape());
            if (shape4 != null) {
                androidx.compose.ui.geometry.Rect highSpeedVideoFpsRangesFor5 = getHighSpeedVideoFpsRangesFor(semanticsNode, Camera2StreamConfigurationMap(p1), shape4);
                android.graphics.Region Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(getHighSpeedVideoFpsRangesFor(shape4, highSpeedVideoFpsRangesFor5.m5785getSizeNHjbRc(), semanticsNode.getLayoutInfo().getLayoutDirection()), highSpeedVideoFpsRangesFor5.getLeft(), highSpeedVideoFpsRangesFor5.getTop());
                if (Camera2StreamConfigurationMap3 != null) {
                    p1.getExtras().putParcelable(ExtraDataShapeRegionKey, Camera2StreamConfigurationMap3);
                    return;
                }
                return;
            }
            return;
        }
        androidx.collection.ScatterSet<androidx.compose.ui.semantics.SemanticsPropertyKey<?>> accessibilityExtraKeys$ui = semanticsNode.getUnmergedConfig().getAccessibilityExtraKeys$ui();
        if (accessibilityExtraKeys$ui == null) {
            return;
        }
        java.lang.Object[] objArr = accessibilityExtraKeys$ui.elements;
        long[] jArr = accessibilityExtraKeys$ui.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i6 = 0;
        while (true) {
            long j = jArr[i6];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i6 - length)) >>> 31);
                for (int i8 = i; i8 < i7; i8++) {
                    if ((255 & j) < 128) {
                        androidx.compose.ui.semantics.SemanticsPropertyKey semanticsPropertyKey = (androidx.compose.ui.semantics.SemanticsPropertyKey) objArr[(i6 << 3) + i8];
                        java.lang.String accessibilityExtraKey = semanticsPropertyKey.getAccessibilityExtraKey();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(accessibilityExtraKey, p2)) {
                            java.lang.Object orNull = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsPropertyKey);
                            if (orNull instanceof java.io.Serializable) {
                                p1.getExtras().putSerializable(accessibilityExtraKey, (java.io.Serializable) orNull);
                            } else {
                                if (!(orNull instanceof android.os.Parcelable)) {
                                    throw new java.lang.IllegalStateException("Accessibility extra values must be either Serializable or Parcelable.");
                                }
                                p1.getExtras().putParcelable(accessibilityExtraKey, (android.os.Parcelable) orNull);
                            }
                        } else {
                            continue;
                        }
                    }
                    j >>= 8;
                }
                if (i7 != 8) {
                    return;
                }
            }
            if (i6 == length) {
                return;
            }
            i6++;
            i = 0;
        }
    }

    private final android.graphics.Rect Camera2StreamConfigurationMap(androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        android.graphics.Rect rect = new android.graphics.Rect();
        accessibilityNodeInfoCompat.getBoundsInScreen(rect);
        return rect;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$getShapeBounds$shapeNodeMatcher$1] */
    private final androidx.compose.ui.geometry.Rect getHighSpeedVideoFpsRangesFor(androidx.compose.ui.semantics.SemanticsNode p0, android.graphics.Rect p1, final androidx.compose.ui.graphics.Shape p2) {
        androidx.compose.ui.Modifier.Node node;
        ?? r0 = new androidx.compose.ui.semantics.SemanticsPropertyReceiver() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$getShapeBounds$shapeNodeMatcher$1
            private boolean hasMatchedShape;

            public final boolean getHasMatchedShape() {
                return this.hasMatchedShape;
            }

            public final void setHasMatchedShape(boolean z) {
                this.hasMatchedShape = z;
            }

            @Override // androidx.compose.ui.semantics.SemanticsPropertyReceiver
            public final <T> void set(androidx.compose.ui.semantics.SemanticsPropertyKey<T> key, T value) {
                if (value == androidx.compose.ui.graphics.Shape.this) {
                    this.hasMatchedShape = true;
                }
            }
        };
        androidx.compose.ui.node.LayoutNode layoutNode = p0.getLayoutNode();
        androidx.compose.ui.node.NodeChain nodes = layoutNode.getNodes();
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(8);
        java.lang.Object obj = null;
        if ((nodes.getHighSpeedVideoFpsRangesFor() & m7621constructorimpl) != 0) {
            androidx.compose.ui.Modifier.Node head = nodes.getHead();
            loop0: while (true) {
                if (head == null) {
                    break;
                }
                if ((head.getKindSet() & m7621constructorimpl) != 0) {
                    androidx.compose.ui.Modifier.Node node2 = head;
                    androidx.compose.runtime.collection.MutableVector mutableVector = null;
                    while (node2 != null) {
                        if (node2 instanceof androidx.compose.ui.node.SemanticsModifierNode) {
                            ((androidx.compose.ui.node.SemanticsModifierNode) node2).applySemantics((androidx.compose.ui.semantics.SemanticsPropertyReceiver) r0);
                            if (r0.getHasMatchedShape()) {
                                obj = node2;
                                break loop0;
                            }
                        } else if ((node2.getKindSet() & m7621constructorimpl) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                            int i = 0;
                            for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        node2 = delegate;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                        }
                                        if (node2 != null) {
                                            if (mutableVector != null) {
                                                mutableVector.add(node2);
                                            }
                                            node2 = null;
                                        }
                                        if (mutableVector != null) {
                                            mutableVector.add(delegate);
                                        }
                                    }
                                }
                            }
                            if (i != 1) {
                            }
                        }
                        node2 = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
                    }
                }
                if ((head.getAggregateChildKindSet() & m7621constructorimpl) == 0) {
                    break;
                }
                head = head.getChild();
            }
        }
        androidx.compose.ui.node.SemanticsModifierNode semanticsModifierNode = (androidx.compose.ui.node.SemanticsModifierNode) obj;
        if (semanticsModifierNode == null || (node = semanticsModifierNode.getNode()) == null || !node.getIsAttached()) {
            return androidx.compose.ui.layout.LayoutCoordinatesKt.boundsInWindow(layoutNode.getOuterCoordinator$ui(), false);
        }
        androidx.compose.ui.geometry.Rect boundsInRoot = androidx.compose.ui.layout.LayoutCoordinatesKt.boundsInRoot(androidx.compose.ui.node.DelegatableNodeKt.requireLayoutCoordinates(semanticsModifierNode));
        return getHighSpeedVideoFpsRanges(getHighSpeedVideoSizes(boundsInRoot.getLeft(), boundsInRoot.getTop(), boundsInRoot.getRight(), boundsInRoot.getBottom()), p1);
    }

    private final androidx.compose.ui.geometry.Rect getHighSpeedVideoFpsRanges(android.graphics.Rect rect, android.graphics.Rect rect2) {
        float f = rect.left - rect2.left;
        float f2 = rect.top - rect2.top;
        return new androidx.compose.ui.geometry.Rect(f, f2, rect.width() + f, rect.height() + f2);
    }

    private final android.graphics.RectF getHighSpeedVideoFpsRangesFor(androidx.compose.ui.semantics.SemanticsNode p0, androidx.compose.ui.geometry.Rect p1) {
        if (p0 == null) {
            return null;
        }
        androidx.compose.ui.geometry.Rect m5789translatek4lQ0M = p1.m5789translatek4lQ0M(p0.m7807getPositionInRootF1C5BW0());
        androidx.compose.ui.geometry.Rect boundsInRoot = p0.getBoundsInRoot();
        if ((m5789translatek4lQ0M.overlaps(boundsInRoot) ? m5789translatek4lQ0M.intersect(boundsInRoot) : null) == null) {
            return null;
        }
        long mo7308localToScreenMKHz9U = this.view.mo7308localToScreenMKHz9U(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(r10.getTop()) & 4294967295L) | (java.lang.Float.floatToRawIntBits(r10.getLeft()) << 32)));
        long mo7308localToScreenMKHz9U2 = this.view.mo7308localToScreenMKHz9U(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(r10.getRight()) << 32) | (java.lang.Float.floatToRawIntBits(r10.getBottom()) & 4294967295L)));
        int i = (int) (mo7308localToScreenMKHz9U >> 32);
        int i2 = (int) (mo7308localToScreenMKHz9U2 >> 32);
        int i3 = (int) (mo7308localToScreenMKHz9U & 4294967295L);
        int i4 = (int) (mo7308localToScreenMKHz9U2 & 4294967295L);
        return new android.graphics.RectF(java.lang.Math.min(java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat(i2)), java.lang.Math.min(java.lang.Float.intBitsToFloat(i3), java.lang.Float.intBitsToFloat(i4)), java.lang.Math.max(java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat(i2)), java.lang.Math.max(java.lang.Float.intBitsToFloat(i3), java.lang.Float.intBitsToFloat(i4)));
    }

    private final androidx.compose.ui.graphics.Outline getHighSpeedVideoFpsRangesFor(androidx.compose.ui.graphics.Shape shape, long j, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        return shape.mo1334createOutlinePq9zytI(j, layoutDirection, this.view.getDensity());
    }

    private final android.graphics.Rect getHighSpeedVideoFpsRanges(androidx.compose.ui.graphics.Outline outline, float f, float f2) {
        if ((outline instanceof androidx.compose.ui.graphics.Outline.Rectangle) || (outline instanceof androidx.compose.ui.graphics.Outline.Rounded)) {
            return getHighSpeedVideoFpsRanges(outline.getRect(), f, f2);
        }
        return null;
    }

    private final float[] getHighSpeedVideoFpsRangesFor(androidx.compose.ui.graphics.Outline outline) {
        if (!(outline instanceof androidx.compose.ui.graphics.Outline.Rounded)) {
            return null;
        }
        androidx.compose.ui.graphics.Outline.Rounded rounded = (androidx.compose.ui.graphics.Outline.Rounded) outline;
        return new float[]{java.lang.Float.intBitsToFloat((int) (rounded.getRoundRect().m5802getTopLeftCornerRadiuskKHJgLs() >> 32)), java.lang.Float.intBitsToFloat((int) (rounded.getRoundRect().m5802getTopLeftCornerRadiuskKHJgLs() & 4294967295L)), java.lang.Float.intBitsToFloat((int) (rounded.getRoundRect().m5803getTopRightCornerRadiuskKHJgLs() >> 32)), java.lang.Float.intBitsToFloat((int) (rounded.getRoundRect().m5803getTopRightCornerRadiuskKHJgLs() & 4294967295L)), java.lang.Float.intBitsToFloat((int) (rounded.getRoundRect().m5801getBottomRightCornerRadiuskKHJgLs() >> 32)), java.lang.Float.intBitsToFloat((int) (rounded.getRoundRect().m5801getBottomRightCornerRadiuskKHJgLs() & 4294967295L)), java.lang.Float.intBitsToFloat((int) (rounded.getRoundRect().m5800getBottomLeftCornerRadiuskKHJgLs() >> 32)), java.lang.Float.intBitsToFloat((int) (4294967295L & rounded.getRoundRect().m5800getBottomLeftCornerRadiuskKHJgLs()))};
    }

    private final android.graphics.Region Camera2StreamConfigurationMap(androidx.compose.ui.graphics.Outline outline, float f, float f2) {
        if (!(outline instanceof androidx.compose.ui.graphics.Outline.Generic)) {
            return null;
        }
        androidx.compose.ui.graphics.Outline.Generic generic = (androidx.compose.ui.graphics.Outline.Generic) outline;
        android.graphics.Region region = new android.graphics.Region(getHighSpeedVideoFpsRanges$default(this, generic.getRect().translate(f, f2), 0.0f, 0.0f, 3, null));
        android.graphics.Region region2 = new android.graphics.Region();
        androidx.compose.ui.graphics.Path path = generic.getPath();
        if (path instanceof androidx.compose.ui.graphics.AndroidPath) {
            android.graphics.Path internalPath = ((androidx.compose.ui.graphics.AndroidPath) path).getInternalPath();
            internalPath.offset(f, f2);
            region2.setPath(internalPath, region);
            return region2;
        }
        throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    static /* synthetic */ android.graphics.Rect getHighSpeedVideoFpsRanges$default(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, androidx.compose.ui.geometry.Rect rect, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return androidComposeViewAccessibilityDelegateCompat.getHighSpeedVideoFpsRanges(rect, f, f2);
    }

    private final android.graphics.Rect getHighSpeedVideoFpsRanges(androidx.compose.ui.geometry.Rect rect, float f, float f2) {
        return new android.graphics.Rect((int) (rect.getLeft() + f), (int) (rect.getTop() + f2), (int) (rect.getRight() + f), (int) (rect.getBottom() + f2));
    }

    public final boolean dispatchHoverEvent$ui(android.view.MotionEvent event) {
        if (!getInputSizeshNQ4ISI()) {
            return false;
        }
        int action = event.getAction();
        if (action == 7 || action == 9) {
            int hitTestSemanticsAt$ui = hitTestSemanticsAt$ui(event.getX(), event.getY());
            boolean dispatchGenericMotionEvent = this.view.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(event);
            getOutputFormats(hitTestSemanticsAt$ui);
            if (hitTestSemanticsAt$ui == Integer.MIN_VALUE) {
                return dispatchGenericMotionEvent;
            }
            return true;
        }
        if (action != 10) {
            return false;
        }
        if (this.hoveredVirtualViewId != Integer.MIN_VALUE) {
            getOutputFormats(Integer.MIN_VALUE);
            return true;
        }
        return this.view.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(event);
    }

    public final int hitTestSemanticsAt$ui(float x, float y) {
        int i;
        androidx.compose.ui.node.Owner.measureAndLayout$default(this.view, false, 1, null);
        androidx.compose.ui.node.HitTestResult hitTestResult = new androidx.compose.ui.node.HitTestResult();
        androidx.compose.ui.node.LayoutNode.m7551hitTestSemantics6fMxITs$ui$default(this.view.getRoot(), androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(y) & 4294967295L) | (java.lang.Float.floatToRawIntBits(x) << 32)), hitTestResult, 0, false, 12, null);
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(hitTestResult);
        while (true) {
            i = Integer.MIN_VALUE;
            if (lastIndex < 0) {
                break;
            }
            androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(hitTestResult.get(lastIndex));
            if (this.view.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(requireLayoutNode) != null) {
                return Integer.MIN_VALUE;
            }
            if (requireLayoutNode.getNodes().m7594hasH91voCI$ui(androidx.compose.ui.node.NodeKind.m7621constructorimpl(8))) {
                i = getHighSpeedVideoSizes(requireLayoutNode.getSemanticsId());
                androidx.compose.ui.semantics.SemanticsNode SemanticsNode = androidx.compose.ui.semantics.SemanticsNodeKt.SemanticsNode(requireLayoutNode, false);
                if (androidx.compose.ui.semantics.SemanticsOwnerKt.isImportantForAccessibility(SemanticsNode) && !androidx.compose.ui.semantics.SemanticsNode_androidKt.isAccessibilityIgnoredLink(SemanticsNode)) {
                    break;
                }
            }
            lastIndex--;
        }
        return i;
    }

    private final void getOutputFormats(int p0) {
        int i = this.hoveredVirtualViewId;
        if (i == p0) {
            return;
        }
        this.hoveredVirtualViewId = p0;
        getHighSpeedVideoFpsRangesFor$default(this, p0, 128, null, null, 12, null);
        getHighSpeedVideoFpsRangesFor$default(this, i, 256, null, null, 12, null);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final androidx.core.view.accessibility.AccessibilityNodeProviderCompat getAccessibilityNodeProvider(android.view.View host) {
        return this.getOutputFormats;
    }

    private final <T extends java.lang.CharSequence> T getHighSpeedVideoSizes(T p0, int p1) {
        if (p1 <= 0) {
            throw new java.lang.IllegalArgumentException("size should be greater than 0".toString());
        }
        if (p0 == null || p0.length() == 0 || p0.length() <= p1) {
            return p0;
        }
        int i = p1 - 1;
        if (java.lang.Character.isHighSurrogate(p0.charAt(i)) && java.lang.Character.isLowSurrogate(p0.charAt(p1))) {
            p1 = i;
        }
        T t = (T) p0.subSequence(0, p1);
        kotlin.jvm.internal.Intrinsics.checkNotNull(t, "");
        return t;
    }

    public final void onSemanticsChange$ui() {
        this.toString = true;
        if (!isEnabled$ui() || this.getARTIFICIAL_FRAME_PACKAGE_NAME) {
            return;
        }
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = true;
        this.getHighSpeedVideoFpsRangesFor.post(this.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c1, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r7, r0) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071 A[Catch: all -> 0x00cd, TryCatch #0 {all -> 0x00cd, blocks: (B:12:0x0032, B:14:0x005a, B:17:0x0069, B:19:0x0071, B:21:0x007a, B:23:0x0085, B:25:0x0096, B:27:0x009d, B:28:0x00a6, B:38:0x0047, B:40:0x004e), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c1 -> B:13:0x0035). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object boundsUpdatesEventLoop$ui(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1;
        int i;
        androidx.collection.MutableIntSet mutableIntSet;
        kotlinx.coroutines.channels.ChannelIterator<kotlin.Unit> it;
        androidx.collection.MutableIntSet mutableIntSet2;
        java.lang.Object hasNext;
        try {
            if (continuation instanceof androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1) {
                androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 = (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1) continuation;
                if ((androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.getHighSpeedVideoSizes;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutableIntSet = new androidx.collection.MutableIntSet(0, 1, null);
                        it = this.getValidOutputFormatsForInputhNQ4ISI.iterator();
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.getHighSpeedVideoFpsRanges = mutableIntSet;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.getHighSpeedVideoFpsRangesFor = it;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        hasNext = it.hasNext(androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1);
                        if (hasNext != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (kotlinx.coroutines.channels.ChannelIterator) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.getHighSpeedVideoFpsRangesFor;
                        mutableIntSet2 = (androidx.collection.MutableIntSet) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutableIntSet = mutableIntSet2;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.getHighSpeedVideoFpsRanges = mutableIntSet;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.getHighSpeedVideoFpsRangesFor = it;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        hasNext = it.hasNext(androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1);
                        if (hasNext != coroutine_suspended) {
                            mutableIntSet2 = mutableIntSet;
                            obj = hasNext;
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                                it.next();
                                if (isEnabled$ui()) {
                                    int size = this.isOutputSupportedForhNQ4ISI.size();
                                    for (int i2 = 0; i2 < size; i2++) {
                                        androidx.compose.ui.node.LayoutNode valueAt = this.isOutputSupportedForhNQ4ISI.valueAt(i2);
                                        getHighResolutionOutputSizeshNQ4ISI(valueAt, mutableIntSet2);
                                        getHighSpeedVideoSizes(valueAt);
                                    }
                                    mutableIntSet2.clear();
                                    if (!this.getARTIFICIAL_FRAME_PACKAGE_NAME) {
                                        this.getARTIFICIAL_FRAME_PACKAGE_NAME = true;
                                        this.getHighSpeedVideoFpsRangesFor.post(this.a);
                                    }
                                }
                                this.isOutputSupportedForhNQ4ISI.clear();
                                this.getOutputSizes.clear();
                                this.getOutputStallDurationlomOqCM.clear();
                                long j = this.SendRecurringAccessibilityEventsIntervalMillis;
                                androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.getHighSpeedVideoFpsRanges = mutableIntSet2;
                                androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.getHighSpeedVideoFpsRangesFor = it;
                                androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                            } else {
                                this.isOutputSupportedForhNQ4ISI.clear();
                                return kotlin.Unit.INSTANCE;
                            }
                        }
                        return coroutine_suspended;
                    }
                    it = (kotlinx.coroutines.channels.ChannelIterator) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.getHighSpeedVideoFpsRangesFor;
                    mutableIntSet2 = (androidx.collection.MutableIntSet) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                    }
                }
            }
            if (i != 0) {
            }
        } catch (java.lang.Throwable th) {
            this.isOutputSupportedForhNQ4ISI.clear();
            throw th;
        }
        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1(this, continuation);
        java.lang.Object obj2 = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final void onLayoutChange$ui(androidx.compose.ui.node.LayoutNode layoutNode) {
        this.toString = true;
        if (isEnabled$ui()) {
            Camera2StreamConfigurationMap(layoutNode);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Camera2StreamConfigurationMap(androidx.compose.ui.node.LayoutNode p0) {
        if (this.isOutputSupportedForhNQ4ISI.add(p0)) {
            this.getValidOutputFormatsForInputhNQ4ISI.mo9266trySendJP2dKIU(kotlin.Unit.INSTANCE);
        }
    }

    private final void getHighSpeedVideoSizes(androidx.compose.ui.node.LayoutNode p0) {
        if (!p0.isAttached() || this.view.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(p0)) {
            return;
        }
        int semanticsId = p0.getSemanticsId();
        androidx.compose.ui.semantics.ScrollAxisRange scrollAxisRange = this.getOutputSizes.get(semanticsId);
        androidx.compose.ui.semantics.ScrollAxisRange scrollAxisRange2 = this.getOutputStallDurationlomOqCM.get(semanticsId);
        if (scrollAxisRange == null && scrollAxisRange2 == null) {
            return;
        }
        android.view.accessibility.AccessibilityEvent highSpeedVideoSizes = getHighSpeedVideoSizes(semanticsId, 4096);
        if (scrollAxisRange != null) {
            highSpeedVideoSizes.setScrollX((int) scrollAxisRange.getValue().invoke().floatValue());
            highSpeedVideoSizes.setMaxScrollX((int) scrollAxisRange.getMaxValue().invoke().floatValue());
        }
        if (scrollAxisRange2 != null) {
            highSpeedVideoSizes.setScrollY((int) scrollAxisRange2.getValue().invoke().floatValue());
            highSpeedVideoSizes.setMaxScrollY((int) scrollAxisRange2.getMaxValue().invoke().floatValue());
        }
        getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.getHighSpeedVideoFpsRanges(r8, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.node.LayoutNode, java.lang.Boolean>) androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1.getHighResolutionOutputSizeshNQ4ISI);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.node.LayoutNode p0, androidx.collection.MutableIntSet p1) {
        androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration;
        androidx.compose.ui.node.LayoutNode highSpeedVideoFpsRanges;
        if (!p0.isAttached() || this.view.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(p0)) {
            return;
        }
        if (!p0.getNodes().m7594hasH91voCI$ui(androidx.compose.ui.node.NodeKind.m7621constructorimpl(8))) {
            p0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.getHighSpeedVideoFpsRanges(p0, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.node.LayoutNode, java.lang.Boolean>) new kotlin.jvm.functions.Function1<androidx.compose.ui.node.LayoutNode, java.lang.Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1
                @Override // kotlin.jvm.functions.Function1
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public final java.lang.Boolean invoke(androidx.compose.ui.node.LayoutNode layoutNode) {
                    return java.lang.Boolean.valueOf(layoutNode.getNodes().m7594hasH91voCI$ui(androidx.compose.ui.node.NodeKind.m7621constructorimpl(8)));
                }
            });
        }
        if (p0 == null || (semanticsConfiguration = p0.getSemanticsConfiguration()) == null) {
            return;
        }
        if (!semanticsConfiguration.getIsMergingSemanticsOfDescendants() && highSpeedVideoFpsRanges != null) {
            p0 = highSpeedVideoFpsRanges;
        }
        if (p0 != null) {
            int semanticsId = p0.getSemanticsId();
            if (p1.add(semanticsId)) {
                getHighSpeedVideoFpsRangesFor$default(this, getHighSpeedVideoSizes(semanticsId), 2048, 1, null, 8, null);
            }
        }
    }

    private final void getOutputMinFrameDuration() {
        androidx.compose.ui.semantics.SemanticsConfiguration unmergedConfig;
        androidx.collection.MutableIntSet mutableIntSet = new androidx.collection.MutableIntSet(0, 1, null);
        androidx.collection.MutableIntSet mutableIntSet2 = this.accessartificialFrame;
        int[] iArr = mutableIntSet2.elements;
        long[] jArr = mutableIntSet2.metadata;
        int length = jArr.length - 2;
        long j = 128;
        long j2 = 255;
        char c = 7;
        long j3 = -9187201950435737472L;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j4 = jArr[i];
                long[] jArr2 = jArr;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j4 & j2) < j) {
                            int i4 = iArr[(i << 3) + i3];
                            androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getHighSpeedVideoFpsRanges().get(i4);
                            androidx.compose.ui.semantics.SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
                            if (semanticsNode == null || !semanticsNode.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getPaneTitle())) {
                                mutableIntSet.add(i4);
                                androidx.compose.ui.platform.SemanticsNodeCopy semanticsNodeCopy = this.coroutineCreation.get(i4);
                                getHighSpeedVideoFpsRanges(i4, 32, (semanticsNodeCopy == null || (unmergedConfig = semanticsNodeCopy.getUnmergedConfig()) == null) ? null : (java.lang.String) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(unmergedConfig, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getPaneTitle()));
                            }
                        }
                        j4 >>= 8;
                        i3++;
                        j = 128;
                        j2 = 255;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
                jArr = jArr2;
                j = 128;
                j2 = 255;
            }
        }
        this.accessartificialFrame.removeAll(mutableIntSet);
        this.coroutineCreation.clear();
        androidx.collection.IntObjectMap<androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        int[] iArr2 = highSpeedVideoFpsRanges.keys;
        java.lang.Object[] objArr = highSpeedVideoFpsRanges.values;
        long[] jArr3 = highSpeedVideoFpsRanges.metadata;
        int length2 = jArr3.length - 2;
        if (length2 >= 0) {
            int i5 = 0;
            while (true) {
                long j5 = jArr3[i5];
                if ((((~j5) << c) & j5 & j3) != j3) {
                    int i6 = 8 - ((~(i5 - length2)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((j5 & 255) < 128) {
                            int i8 = (i5 << 3) + i7;
                            int i9 = iArr2[i8];
                            androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds2 = (androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds) objArr[i8];
                            if (semanticsNodeWithAdjustedBounds2.getSemanticsNode().getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getPaneTitle()) && this.accessartificialFrame.add(i9)) {
                                getHighSpeedVideoFpsRanges(i9, 16, (java.lang.String) semanticsNodeWithAdjustedBounds2.getSemanticsNode().getUnmergedConfig().get(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getPaneTitle()));
                            }
                            this.coroutineCreation.set(i9, new androidx.compose.ui.platform.SemanticsNodeCopy(semanticsNodeWithAdjustedBounds2.getSemanticsNode(), getHighSpeedVideoFpsRanges()));
                        }
                        j5 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                }
                if (i5 == length2) {
                    break;
                }
                i5++;
                c = 7;
                j3 = -9187201950435737472L;
            }
        }
        this.b = new androidx.compose.ui.platform.SemanticsNodeCopy(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), getHighSpeedVideoFpsRanges());
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x0579, code lost:
    
        if (r0.isEmpty() == false) goto L162;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void getHighSpeedVideoFpsRanges(androidx.collection.IntObjectMap<androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds> p0) {
        java.util.ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        java.util.ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i6;
        int i7;
        int i8;
        int i9;
        androidx.compose.ui.semantics.SemanticsNode semanticsNode;
        int i10;
        boolean z;
        long[] jArr3;
        java.lang.Object[] objArr;
        int i11;
        java.lang.Object[] objArr2;
        long[] jArr4;
        java.lang.Object[] objArr3;
        int i12;
        int i13;
        androidx.compose.ui.semantics.SemanticsNode semanticsNode2;
        int i14;
        java.lang.Object[] objArr4;
        java.util.ArrayList arrayList3;
        int i15;
        int i16;
        boolean z2;
        boolean highResolutionOutputSizeshNQ4ISI;
        java.lang.String text;
        android.view.accessibility.AccessibilityEvent highSpeedVideoSizes;
        androidx.collection.IntObjectMap<androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds> intObjectMap = p0;
        java.util.ArrayList arrayList4 = new java.util.ArrayList(this.AMEXKernel);
        this.AMEXKernel.clear();
        int[] iArr3 = intObjectMap.keys;
        long[] jArr5 = intObjectMap.metadata;
        int i17 = 2;
        int length = jArr5.length - 2;
        if (length < 0) {
            return;
        }
        int i18 = 0;
        while (true) {
            long j = jArr5[i18];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i19 = 8;
                int i20 = 8 - ((~(i18 - length)) >>> 31);
                long j2 = j;
                int i21 = 0;
                while (i21 < i20) {
                    if ((j2 & 255) < 128) {
                        int i22 = iArr3[(i18 << 3) + i21];
                        androidx.compose.ui.platform.SemanticsNodeCopy semanticsNodeCopy = this.coroutineCreation.get(i22);
                        if (semanticsNodeCopy == null) {
                            i4 = i21;
                            i5 = i20;
                            arrayList2 = arrayList4;
                            iArr2 = iArr3;
                            jArr2 = jArr5;
                            i6 = length;
                            i7 = i18;
                            i8 = i17;
                        } else {
                            androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = intObjectMap.get(i22);
                            androidx.compose.ui.semantics.SemanticsNode semanticsNode3 = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
                            if (semanticsNode3 != null) {
                                androidx.collection.MutableScatterMap<androidx.compose.ui.semantics.SemanticsPropertyKey<?>, java.lang.Object> props$ui = semanticsNode3.getUnmergedConfig().getProps$ui();
                                java.lang.Object[] objArr5 = props$ui.keys;
                                java.lang.Object[] objArr6 = props$ui.values;
                                long[] jArr6 = props$ui.metadata;
                                int length2 = jArr6.length - i17;
                                if (length2 >= 0) {
                                    i4 = i21;
                                    int i23 = i20;
                                    int i24 = 0;
                                    z = false;
                                    while (true) {
                                        long j3 = jArr6[i24];
                                        iArr2 = iArr3;
                                        jArr2 = jArr5;
                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i25 = 8 - ((~(i24 - length2)) >>> 31);
                                            long j4 = j3;
                                            int i26 = 0;
                                            while (i26 < i25) {
                                                if ((j4 & 255) < 128) {
                                                    int i27 = (i24 << 3) + i26;
                                                    java.lang.Object obj = objArr5[i27];
                                                    java.lang.Object obj2 = objArr6[i27];
                                                    androidx.compose.ui.semantics.SemanticsPropertyKey semanticsPropertyKey = (androidx.compose.ui.semantics.SemanticsPropertyKey) obj;
                                                    jArr4 = jArr6;
                                                    if (((kotlin.jvm.internal.Intrinsics.areEqual(semanticsPropertyKey, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange()) || kotlin.jvm.internal.Intrinsics.areEqual(semanticsPropertyKey, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getVerticalScrollAxisRange())) && getHighSpeedVideoSizes(i22, arrayList4)) || !kotlin.jvm.internal.Intrinsics.areEqual(obj2, androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), semanticsPropertyKey))) {
                                                        objArr3 = objArr5;
                                                        java.lang.String str = "";
                                                        if (kotlin.jvm.internal.Intrinsics.areEqual(semanticsPropertyKey, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getPaneTitle())) {
                                                            kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
                                                            java.lang.String str2 = (java.lang.String) obj2;
                                                            if (semanticsNodeCopy.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getPaneTitle())) {
                                                                getHighSpeedVideoFpsRanges(i22, 8, str2);
                                                            }
                                                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                                            semanticsNode2 = semanticsNode3;
                                                            i16 = length2;
                                                            i14 = length;
                                                            objArr4 = objArr6;
                                                            i12 = i18;
                                                            i13 = i23;
                                                            arrayList3 = arrayList4;
                                                            i15 = i22;
                                                            j4 >>= 8;
                                                            i26++;
                                                            length2 = i16;
                                                            i22 = i15;
                                                            arrayList4 = arrayList3;
                                                            objArr5 = objArr3;
                                                            jArr6 = jArr4;
                                                            objArr6 = objArr4;
                                                            length = i14;
                                                            semanticsNode3 = semanticsNode2;
                                                            i23 = i13;
                                                            i18 = i12;
                                                        } else {
                                                            if (kotlin.jvm.internal.Intrinsics.areEqual(semanticsPropertyKey, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getStateDescription()) || kotlin.jvm.internal.Intrinsics.areEqual(semanticsPropertyKey, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getToggleableState())) {
                                                                semanticsNode2 = semanticsNode3;
                                                                i16 = length2;
                                                                i14 = length;
                                                                objArr4 = objArr6;
                                                                i12 = i18;
                                                                i13 = i23;
                                                                arrayList3 = arrayList4;
                                                                i15 = i22;
                                                                getHighSpeedVideoFpsRangesFor$default(this, getHighSpeedVideoSizes(i15), 2048, 64, null, 8, null);
                                                                getHighSpeedVideoFpsRangesFor$default(this, getHighSpeedVideoSizes(i15), 2048, 0, null, 8, null);
                                                            } else {
                                                                if (kotlin.jvm.internal.Intrinsics.areEqual(semanticsPropertyKey, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getProgressBarRangeInfo())) {
                                                                    semanticsNode2 = semanticsNode3;
                                                                    int i28 = i22;
                                                                    i13 = i23;
                                                                    i16 = length2;
                                                                    arrayList3 = arrayList4;
                                                                    getHighSpeedVideoFpsRangesFor$default(this, getHighSpeedVideoSizes(i22), 2048, 64, null, 8, null);
                                                                    i15 = i28;
                                                                    getHighSpeedVideoFpsRangesFor$default(this, getHighSpeedVideoSizes(i28), 2048, 0, null, 8, null);
                                                                } else {
                                                                    semanticsNode2 = semanticsNode3;
                                                                    i16 = length2;
                                                                    i13 = i23;
                                                                    arrayList3 = arrayList4;
                                                                    i15 = i22;
                                                                    if (kotlin.jvm.internal.Intrinsics.areEqual(semanticsPropertyKey, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getSelected())) {
                                                                        androidx.compose.ui.semantics.Role role = (androidx.compose.ui.semantics.Role) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode2.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getRole());
                                                                        int m7805getTabo7Vup1c = androidx.compose.ui.semantics.Role.INSTANCE.m7805getTabo7Vup1c();
                                                                        if (role != null && androidx.compose.ui.semantics.Role.m7794equalsimpl0(role.getGetHighSpeedVideoSizes(), m7805getTabo7Vup1c)) {
                                                                            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode2.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getSelected()), java.lang.Boolean.TRUE)) {
                                                                                android.view.accessibility.AccessibilityEvent highSpeedVideoSizes2 = getHighSpeedVideoSizes(getHighSpeedVideoSizes(i15), 4);
                                                                                androidx.compose.ui.semantics.SemanticsNode copyWithMergingEnabled$ui = semanticsNode2.copyWithMergingEnabled$ui();
                                                                                java.util.List list = (java.util.List) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(copyWithMergingEnabled$ui.getConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getContentDescription());
                                                                                java.lang.String fastJoinToString$default = list != null ? androidx.compose.ui.util.ListUtilsKt.fastJoinToString$default(list, ",", null, null, 0, null, null, 62, null) : null;
                                                                                java.util.List list2 = (java.util.List) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(copyWithMergingEnabled$ui.getConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getText());
                                                                                java.lang.String fastJoinToString$default2 = list2 != null ? androidx.compose.ui.util.ListUtilsKt.fastJoinToString$default(list2, ",", null, null, 0, null, null, 62, null) : null;
                                                                                if (fastJoinToString$default != null) {
                                                                                    highSpeedVideoSizes2.setContentDescription(fastJoinToString$default);
                                                                                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                                                                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                                                                                }
                                                                                if (fastJoinToString$default2 != null) {
                                                                                    highSpeedVideoSizes2.getText().add(fastJoinToString$default2);
                                                                                }
                                                                                getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes2);
                                                                            } else {
                                                                                getHighSpeedVideoFpsRangesFor$default(this, getHighSpeedVideoSizes(i15), 2048, 0, null, 8, null);
                                                                            }
                                                                        } else {
                                                                            getHighSpeedVideoFpsRangesFor$default(this, getHighSpeedVideoSizes(i15), 2048, 64, null, 8, null);
                                                                            getHighSpeedVideoFpsRangesFor$default(this, getHighSpeedVideoSizes(i15), 2048, 0, null, 8, null);
                                                                        }
                                                                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(semanticsPropertyKey, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getContentDescription())) {
                                                                        int highSpeedVideoSizes3 = getHighSpeedVideoSizes(i15);
                                                                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
                                                                        getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes3, 2048, (java.lang.Integer) 4, (java.util.List<java.lang.String>) obj2);
                                                                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(semanticsPropertyKey, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getEditableText())) {
                                                                        if (semanticsNode2.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetText())) {
                                                                            androidx.compose.ui.text.AnnotatedString Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(semanticsNodeCopy.getUnmergedConfig());
                                                                            java.lang.String str3 = Camera2StreamConfigurationMap2 != null ? Camera2StreamConfigurationMap2 : "";
                                                                            androidx.compose.ui.text.AnnotatedString Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(semanticsNode2.getUnmergedConfig());
                                                                            java.lang.String str4 = Camera2StreamConfigurationMap3 != null ? Camera2StreamConfigurationMap3 : "";
                                                                            java.lang.CharSequence highSpeedVideoSizes4 = getHighSpeedVideoSizes((androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat) str4, ParcelSafeTextLength);
                                                                            int length3 = str3.length();
                                                                            int length4 = str4.length();
                                                                            int coerceAtMost = kotlin.ranges.RangesKt.coerceAtMost(length3, length4);
                                                                            int i29 = 0;
                                                                            while (true) {
                                                                                if (i29 >= coerceAtMost) {
                                                                                    i14 = length;
                                                                                    objArr4 = objArr6;
                                                                                    break;
                                                                                }
                                                                                objArr4 = objArr6;
                                                                                i14 = length;
                                                                                if (str3.charAt(i29) != str4.charAt(i29)) {
                                                                                    break;
                                                                                }
                                                                                i29++;
                                                                                objArr6 = objArr4;
                                                                                length = i14;
                                                                            }
                                                                            int i30 = 0;
                                                                            while (i30 < coerceAtMost - i29) {
                                                                                int i31 = coerceAtMost;
                                                                                if (str3.charAt((length3 - 1) - i30) != str4.charAt((length4 - 1) - i30)) {
                                                                                    break;
                                                                                }
                                                                                i30++;
                                                                                coerceAtMost = i31;
                                                                            }
                                                                            boolean contains = semanticsNodeCopy.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getPassword());
                                                                            boolean contains2 = semanticsNode2.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getPassword());
                                                                            i12 = i18;
                                                                            boolean contains3 = semanticsNodeCopy.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getEditableText());
                                                                            boolean z3 = contains3 && !contains && contains2;
                                                                            boolean z4 = contains3 && contains && !contains2;
                                                                            if (z3 || z4) {
                                                                                highSpeedVideoSizes = getHighSpeedVideoSizes(getHighSpeedVideoSizes(i15), 0, 0, java.lang.Integer.valueOf(length4), highSpeedVideoSizes4);
                                                                            } else {
                                                                                highSpeedVideoSizes = getHighSpeedVideoSizes(getHighSpeedVideoSizes(i15), 16);
                                                                                highSpeedVideoSizes.setFromIndex(i29);
                                                                                highSpeedVideoSizes.setRemovedCount((length3 - i30) - i29);
                                                                                highSpeedVideoSizes.setAddedCount((length4 - i30) - i29);
                                                                                highSpeedVideoSizes.setBeforeText(str3);
                                                                                highSpeedVideoSizes.getText().add(highSpeedVideoSizes4);
                                                                            }
                                                                            highSpeedVideoSizes.setClassName(TextFieldClassName);
                                                                            getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes);
                                                                            if (z3 || z4) {
                                                                                long getHighResolutionOutputSizeshNQ4ISI = ((androidx.compose.ui.text.TextRange) semanticsNode2.getUnmergedConfig().get(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTextSelectionRange())).getGetHighResolutionOutputSizeshNQ4ISI();
                                                                                highSpeedVideoSizes.setFromIndex(androidx.compose.ui.text.TextRange.m8039getStartimpl(getHighResolutionOutputSizeshNQ4ISI));
                                                                                highSpeedVideoSizes.setToIndex(androidx.compose.ui.text.TextRange.m8034getEndimpl(getHighResolutionOutputSizeshNQ4ISI));
                                                                                getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes);
                                                                            }
                                                                            kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                                                                        } else {
                                                                            i14 = length;
                                                                            objArr4 = objArr6;
                                                                            i12 = i18;
                                                                            getHighSpeedVideoFpsRangesFor$default(this, getHighSpeedVideoSizes(i15), 2048, 2, null, 8, null);
                                                                        }
                                                                    } else {
                                                                        i14 = length;
                                                                        objArr4 = objArr6;
                                                                        i12 = i18;
                                                                        if (kotlin.jvm.internal.Intrinsics.areEqual(semanticsPropertyKey, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTextSelectionRange())) {
                                                                            androidx.compose.ui.text.AnnotatedString Camera2StreamConfigurationMap4 = Camera2StreamConfigurationMap(semanticsNode2.getUnmergedConfig());
                                                                            if (Camera2StreamConfigurationMap4 != null && (text = Camera2StreamConfigurationMap4.getText()) != null) {
                                                                                str = text;
                                                                            }
                                                                            long getHighResolutionOutputSizeshNQ4ISI2 = ((androidx.compose.ui.text.TextRange) semanticsNode2.getUnmergedConfig().get(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTextSelectionRange())).getGetHighResolutionOutputSizeshNQ4ISI();
                                                                            getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoSizes(getHighSpeedVideoSizes(i15), java.lang.Integer.valueOf(androidx.compose.ui.text.TextRange.m8039getStartimpl(getHighResolutionOutputSizeshNQ4ISI2)), java.lang.Integer.valueOf(androidx.compose.ui.text.TextRange.m8034getEndimpl(getHighResolutionOutputSizeshNQ4ISI2)), java.lang.Integer.valueOf(str.length()), getHighSpeedVideoSizes((androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat) str, ParcelSafeTextLength)));
                                                                            getInputSizeshNQ4ISI(semanticsNode2.getId());
                                                                            kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                                                                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(semanticsPropertyKey, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange()) || kotlin.jvm.internal.Intrinsics.areEqual(semanticsPropertyKey, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getVerticalScrollAxisRange())) {
                                                                            Camera2StreamConfigurationMap(semanticsNode2.getLayoutNode());
                                                                            androidx.compose.ui.platform.ScrollObservationScope findById = androidx.compose.ui.platform.SemanticsUtils_androidKt.findById(this.AMEXKernel, i15);
                                                                            kotlin.jvm.internal.Intrinsics.checkNotNull(findById);
                                                                            findById.setHorizontalScrollAxisRange((androidx.compose.ui.semantics.ScrollAxisRange) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode2.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange()));
                                                                            findById.setVerticalScrollAxisRange((androidx.compose.ui.semantics.ScrollAxisRange) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode2.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getVerticalScrollAxisRange()));
                                                                            getHighSpeedVideoFpsRangesFor(findById);
                                                                            kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                                                                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(semanticsPropertyKey, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getFocused())) {
                                                                            kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
                                                                            if (((java.lang.Boolean) obj2).booleanValue()) {
                                                                                getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoSizes(getHighSpeedVideoSizes(semanticsNode2.getId()), 8));
                                                                            }
                                                                            getHighSpeedVideoFpsRangesFor$default(this, getHighSpeedVideoSizes(semanticsNode2.getId()), 2048, 0, null, 8, null);
                                                                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(semanticsPropertyKey, androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getCustomActions())) {
                                                                            java.util.List list3 = (java.util.List) semanticsNode2.getUnmergedConfig().get(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getCustomActions());
                                                                            java.util.List list4 = (java.util.List) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getCustomActions());
                                                                            if (list4 != null) {
                                                                                java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
                                                                                int size = list3.size();
                                                                                for (int i32 = 0; i32 < size; i32++) {
                                                                                    linkedHashSet.add(((androidx.compose.ui.semantics.CustomAccessibilityAction) list3.get(i32)).getLabel());
                                                                                }
                                                                                java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
                                                                                int size2 = list4.size();
                                                                                for (int i33 = 0; i33 < size2; i33++) {
                                                                                    linkedHashSet2.add(((androidx.compose.ui.semantics.CustomAccessibilityAction) list4.get(i33)).getLabel());
                                                                                }
                                                                                if (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) {
                                                                                    z = false;
                                                                                    kotlin.Unit unit7 = kotlin.Unit.INSTANCE;
                                                                                }
                                                                                z = true;
                                                                                kotlin.Unit unit72 = kotlin.Unit.INSTANCE;
                                                                            }
                                                                        } else {
                                                                            if (obj2 instanceof androidx.compose.ui.semantics.AccessibilityAction) {
                                                                                highResolutionOutputSizeshNQ4ISI = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.getHighResolutionOutputSizeshNQ4ISI((androidx.compose.ui.semantics.AccessibilityAction) obj2, androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), semanticsPropertyKey));
                                                                                if (highResolutionOutputSizeshNQ4ISI) {
                                                                                    z2 = false;
                                                                                    kotlin.Unit unit8 = kotlin.Unit.INSTANCE;
                                                                                    z = z2;
                                                                                }
                                                                            }
                                                                            z2 = true;
                                                                            kotlin.Unit unit82 = kotlin.Unit.INSTANCE;
                                                                            z = z2;
                                                                        }
                                                                    }
                                                                }
                                                                i14 = length;
                                                                objArr4 = objArr6;
                                                                i12 = i18;
                                                            }
                                                            j4 >>= 8;
                                                            i26++;
                                                            length2 = i16;
                                                            i22 = i15;
                                                            arrayList4 = arrayList3;
                                                            objArr5 = objArr3;
                                                            jArr6 = jArr4;
                                                            objArr6 = objArr4;
                                                            length = i14;
                                                            semanticsNode3 = semanticsNode2;
                                                            i23 = i13;
                                                            i18 = i12;
                                                        }
                                                    }
                                                } else {
                                                    jArr4 = jArr6;
                                                }
                                                objArr3 = objArr5;
                                                semanticsNode2 = semanticsNode3;
                                                i16 = length2;
                                                i14 = length;
                                                objArr4 = objArr6;
                                                i12 = i18;
                                                i13 = i23;
                                                arrayList3 = arrayList4;
                                                i15 = i22;
                                                j4 >>= 8;
                                                i26++;
                                                length2 = i16;
                                                i22 = i15;
                                                arrayList4 = arrayList3;
                                                objArr5 = objArr3;
                                                jArr6 = jArr4;
                                                objArr6 = objArr4;
                                                length = i14;
                                                semanticsNode3 = semanticsNode2;
                                                i23 = i13;
                                                i18 = i12;
                                            }
                                            jArr3 = jArr6;
                                            objArr = objArr5;
                                            semanticsNode = semanticsNode3;
                                            i11 = length2;
                                            i6 = length;
                                            objArr2 = objArr6;
                                            i7 = i18;
                                            i5 = i23;
                                            i8 = 2;
                                            arrayList2 = arrayList4;
                                            i10 = i22;
                                            if (i25 != 8) {
                                                break;
                                            }
                                        } else {
                                            jArr3 = jArr6;
                                            objArr = objArr5;
                                            semanticsNode = semanticsNode3;
                                            i11 = length2;
                                            i6 = length;
                                            objArr2 = objArr6;
                                            i7 = i18;
                                            i5 = i23;
                                            i8 = 2;
                                            arrayList2 = arrayList4;
                                            i10 = i22;
                                        }
                                        if (i24 == i11) {
                                            break;
                                        }
                                        i24++;
                                        length2 = i11;
                                        i22 = i10;
                                        arrayList4 = arrayList2;
                                        iArr3 = iArr2;
                                        jArr5 = jArr2;
                                        objArr5 = objArr;
                                        jArr6 = jArr3;
                                        objArr6 = objArr2;
                                        length = i6;
                                        semanticsNode3 = semanticsNode;
                                        i23 = i5;
                                        i18 = i7;
                                    }
                                } else {
                                    semanticsNode = semanticsNode3;
                                    i4 = i21;
                                    i5 = i20;
                                    arrayList2 = arrayList4;
                                    iArr2 = iArr3;
                                    jArr2 = jArr5;
                                    i6 = length;
                                    i7 = i18;
                                    i10 = i22;
                                    i8 = i17;
                                    z = false;
                                }
                                if (!z) {
                                    z = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.getHighSpeedVideoFpsRangesFor(semanticsNode, semanticsNodeCopy.getUnmergedConfig());
                                }
                                if (z) {
                                    getHighSpeedVideoFpsRangesFor$default(this, getHighSpeedVideoSizes(i10), 2048, 0, null, 8, null);
                                }
                            } else {
                                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("no value for specified key");
                                throw new kotlin.KotlinNothingValueException();
                            }
                        }
                        i9 = 8;
                    } else {
                        i4 = i21;
                        i5 = i20;
                        arrayList2 = arrayList4;
                        iArr2 = iArr3;
                        jArr2 = jArr5;
                        i6 = length;
                        i7 = i18;
                        i8 = i17;
                        i9 = i19;
                    }
                    j2 >>= i9;
                    i21 = i4 + 1;
                    intObjectMap = p0;
                    i19 = i9;
                    i17 = i8;
                    arrayList4 = arrayList2;
                    iArr3 = iArr2;
                    jArr5 = jArr2;
                    length = i6;
                    i20 = i5;
                    i18 = i7;
                }
                arrayList = arrayList4;
                iArr = iArr3;
                jArr = jArr5;
                int i34 = length;
                int i35 = i18;
                i = i17;
                if (i20 != i19) {
                    return;
                }
                i3 = i34;
                i2 = i35;
            } else {
                arrayList = arrayList4;
                iArr = iArr3;
                jArr = jArr5;
                int i36 = length;
                i = i17;
                i2 = i18;
                i3 = i36;
            }
            if (i2 == i3) {
                return;
            }
            i18 = i2 + 1;
            intObjectMap = p0;
            i17 = i;
            arrayList4 = arrayList;
            iArr3 = iArr;
            jArr5 = jArr;
            length = i3;
        }
    }

    private final boolean getHighSpeedVideoSizes(int p0, java.util.List<androidx.compose.ui.platform.ScrollObservationScope> p1) {
        boolean z;
        androidx.compose.ui.platform.ScrollObservationScope findById = androidx.compose.ui.platform.SemanticsUtils_androidKt.findById(p1, p0);
        if (findById != null) {
            z = false;
        } else {
            findById = new androidx.compose.ui.platform.ScrollObservationScope(p0, this.AMEXKernel, null, null, null, null);
            z = true;
        }
        this.AMEXKernel.add(findById);
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRangesFor(final androidx.compose.ui.platform.ScrollObservationScope p0) {
        if (p0.isValidOwnerScope()) {
            androidx.compose.ui.node.OwnerSnapshotObserver snapshotObserver = this.view.getSnapshotObserver();
            snapshotObserver.getHighResolutionOutputSizeshNQ4ISI.observeReads(p0, this.c, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1
                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ kotlin.Unit invoke() {
                    getHighSpeedVideoFpsRanges();
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoFpsRanges() {
                    int highSpeedVideoSizes;
                    androidx.collection.IntObjectMap highSpeedVideoFpsRanges;
                    androidx.collection.IntObjectMap highSpeedVideoFpsRanges2;
                    androidx.collection.IntObjectMap highSpeedVideoFpsRanges3;
                    androidx.compose.ui.semantics.SemanticsNode semanticsNode;
                    androidx.compose.ui.node.LayoutNode layoutNode;
                    androidx.collection.MutableIntObjectMap mutableIntObjectMap;
                    androidx.collection.MutableIntObjectMap mutableIntObjectMap2;
                    androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat;
                    android.graphics.Rect Camera2StreamConfigurationMap2;
                    androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2;
                    android.graphics.Rect Camera2StreamConfigurationMap3;
                    androidx.compose.ui.semantics.ScrollAxisRange horizontalScrollAxisRange = androidx.compose.ui.platform.ScrollObservationScope.this.getHorizontalScrollAxisRange();
                    androidx.compose.ui.semantics.ScrollAxisRange verticalScrollAxisRange = androidx.compose.ui.platform.ScrollObservationScope.this.getVerticalScrollAxisRange();
                    java.lang.Float oldXValue = androidx.compose.ui.platform.ScrollObservationScope.this.getOldXValue();
                    java.lang.Float oldYValue = androidx.compose.ui.platform.ScrollObservationScope.this.getOldYValue();
                    float floatValue = (horizontalScrollAxisRange == null || oldXValue == null) ? 0.0f : horizontalScrollAxisRange.getValue().invoke().floatValue() - oldXValue.floatValue();
                    float floatValue2 = (verticalScrollAxisRange == null || oldYValue == null) ? 0.0f : verticalScrollAxisRange.getValue().invoke().floatValue() - oldYValue.floatValue();
                    if (floatValue != 0.0f || floatValue2 != 0.0f) {
                        highSpeedVideoSizes = this.getHighSpeedVideoSizes(androidx.compose.ui.platform.ScrollObservationScope.this.getSemanticsNodeId());
                        highSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRanges();
                        androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds) highSpeedVideoFpsRanges.get(this.getInputSizeshNQ4ISI);
                        if (semanticsNodeWithAdjustedBounds != null) {
                            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this;
                            try {
                                accessibilityNodeInfoCompat2 = androidComposeViewAccessibilityDelegateCompat.getOutputMinFrameDuration;
                                if (accessibilityNodeInfoCompat2 != null) {
                                    Camera2StreamConfigurationMap3 = androidComposeViewAccessibilityDelegateCompat.Camera2StreamConfigurationMap(semanticsNodeWithAdjustedBounds);
                                    accessibilityNodeInfoCompat2.setBoundsInScreen(Camera2StreamConfigurationMap3);
                                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                }
                            } catch (java.lang.IllegalStateException unused) {
                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                            }
                        }
                        highSpeedVideoFpsRanges2 = this.getHighSpeedVideoFpsRanges();
                        androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds2 = (androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds) highSpeedVideoFpsRanges2.get(this.getInputFormats);
                        if (semanticsNodeWithAdjustedBounds2 != null) {
                            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = this;
                            try {
                                accessibilityNodeInfoCompat = androidComposeViewAccessibilityDelegateCompat2.getHighSpeedVideoSizesFor;
                                if (accessibilityNodeInfoCompat != null) {
                                    Camera2StreamConfigurationMap2 = androidComposeViewAccessibilityDelegateCompat2.Camera2StreamConfigurationMap(semanticsNodeWithAdjustedBounds2);
                                    accessibilityNodeInfoCompat.setBoundsInScreen(Camera2StreamConfigurationMap2);
                                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                                }
                            } catch (java.lang.IllegalStateException unused2) {
                                kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                            }
                        }
                        this.getView().invalidate();
                        highSpeedVideoFpsRanges3 = this.getHighSpeedVideoFpsRanges();
                        androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds3 = (androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds) highSpeedVideoFpsRanges3.get(highSpeedVideoSizes);
                        if (semanticsNodeWithAdjustedBounds3 != null && (semanticsNode = semanticsNodeWithAdjustedBounds3.getSemanticsNode()) != null && (layoutNode = semanticsNode.getLayoutNode()) != null) {
                            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat3 = this;
                            if (horizontalScrollAxisRange != null) {
                                mutableIntObjectMap2 = androidComposeViewAccessibilityDelegateCompat3.getOutputSizes;
                                mutableIntObjectMap2.set(highSpeedVideoSizes, horizontalScrollAxisRange);
                            }
                            if (verticalScrollAxisRange != null) {
                                mutableIntObjectMap = androidComposeViewAccessibilityDelegateCompat3.getOutputStallDurationlomOqCM;
                                mutableIntObjectMap.set(highSpeedVideoSizes, verticalScrollAxisRange);
                            }
                            androidComposeViewAccessibilityDelegateCompat3.Camera2StreamConfigurationMap(layoutNode);
                        }
                    }
                    if (horizontalScrollAxisRange != null) {
                        androidx.compose.ui.platform.ScrollObservationScope.this.setOldXValue(horizontalScrollAxisRange.getValue().invoke());
                    }
                    if (verticalScrollAxisRange != null) {
                        androidx.compose.ui.platform.ScrollObservationScope.this.setOldYValue(verticalScrollAxisRange.getValue().invoke());
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            });
        }
    }

    private final void getHighSpeedVideoFpsRanges(int p0, int p1, java.lang.String p2) {
        android.view.accessibility.AccessibilityEvent highSpeedVideoSizes = getHighSpeedVideoSizes(getHighSpeedVideoSizes(p0), 32);
        highSpeedVideoSizes.setContentChangeTypes(p1);
        if (p2 != null) {
            highSpeedVideoSizes.getText().add(p2);
        }
        getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes);
    }

    private final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.semantics.SemanticsNode p0, androidx.compose.ui.platform.SemanticsNodeCopy p1) {
        androidx.collection.MutableIntSet mutableIntSetOf = androidx.collection.IntSetKt.mutableIntSetOf();
        java.util.List<androidx.compose.ui.semantics.SemanticsNode> replacedChildren$ui = p0.getReplacedChildren$ui();
        int size = replacedChildren$ui.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.semantics.SemanticsNode semanticsNode = replacedChildren$ui.get(i);
            if (getHighSpeedVideoFpsRanges().containsKey(semanticsNode.getId())) {
                if (!p1.getChildren().contains(semanticsNode.getId())) {
                    Camera2StreamConfigurationMap(p0.getLayoutNode());
                    return;
                }
                mutableIntSetOf.add(semanticsNode.getId());
            }
        }
        androidx.collection.MutableIntSet children = p1.getChildren();
        int[] iArr = children.elements;
        long[] jArr = children.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128 && !mutableIntSetOf.contains(iArr[(i2 << 3) + i4])) {
                            Camera2StreamConfigurationMap(p0.getLayoutNode());
                            return;
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        java.util.List<androidx.compose.ui.semantics.SemanticsNode> replacedChildren$ui2 = p0.getReplacedChildren$ui();
        int size2 = replacedChildren$ui2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            androidx.compose.ui.semantics.SemanticsNode semanticsNode2 = replacedChildren$ui2.get(i5);
            androidx.compose.ui.platform.SemanticsNodeCopy semanticsNodeCopy = this.coroutineCreation.get(semanticsNode2.getId());
            if (semanticsNodeCopy != null && getHighSpeedVideoFpsRanges().containsKey(semanticsNode2.getId())) {
                getHighSpeedVideoFpsRangesFor(semanticsNode2, semanticsNodeCopy);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getHighSpeedVideoSizes(int p0) {
        if (p0 == this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
            return -1;
        }
        return p0;
    }

    private final boolean Camera2StreamConfigurationMap(androidx.compose.ui.semantics.SemanticsNode p0, int p1, boolean p2, boolean p3) {
        androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator Camera2StreamConfigurationMap2;
        int i;
        int i2;
        int id = p0.getId();
        java.lang.Integer num = this.isOutputSupportedFor;
        if (num == null || id != num.intValue()) {
            this.unwrapAs = -1;
            this.isOutputSupportedFor = java.lang.Integer.valueOf(p0.getId());
        }
        java.lang.String Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(p0);
        java.lang.String str = Camera2StreamConfigurationMap3;
        if (str == null || str.length() == 0 || (Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(p0, p1)) == null) {
            return false;
        }
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(p0);
        if (highSpeedVideoFpsRanges == -1) {
            highSpeedVideoFpsRanges = p2 ? 0 : Camera2StreamConfigurationMap3.length();
        }
        int[] following = p2 ? Camera2StreamConfigurationMap2.following(highSpeedVideoFpsRanges) : Camera2StreamConfigurationMap2.preceding(highSpeedVideoFpsRanges);
        if (following == null) {
            return false;
        }
        int i3 = following[0];
        int i4 = following[1];
        if (p3 && getHighSpeedVideoFpsRangesFor(p0)) {
            i = getHighSpeedVideoSizes(p0);
            if (i == -1) {
                i = p2 ? i3 : i4;
            }
            i2 = p2 ? i4 : i3;
        } else {
            i = p2 ? i4 : i3;
            i2 = i;
        }
        this.ArtificialStackFrames = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.PendingTextTraversedEvent(p0, p2 ? 256 : 512, p1, i3, i4, android.os.SystemClock.uptimeMillis());
        getHighSpeedVideoFpsRanges(p0, i, i2, true);
        return true;
    }

    private final void getInputSizeshNQ4ISI(int p0) {
        androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.PendingTextTraversedEvent pendingTextTraversedEvent = this.ArtificialStackFrames;
        if (pendingTextTraversedEvent != null) {
            if (p0 != pendingTextTraversedEvent.getGetHighSpeedVideoSizes().getId()) {
                return;
            }
            if (android.os.SystemClock.uptimeMillis() - pendingTextTraversedEvent.getGetOutputFormats() <= 1000) {
                android.view.accessibility.AccessibilityEvent highSpeedVideoSizes = getHighSpeedVideoSizes(getHighSpeedVideoSizes(pendingTextTraversedEvent.getGetHighSpeedVideoSizes().getId()), 131072);
                highSpeedVideoSizes.setFromIndex(pendingTextTraversedEvent.getGetHighSpeedVideoFpsRanges());
                highSpeedVideoSizes.setToIndex(pendingTextTraversedEvent.getCamera2StreamConfigurationMap());
                highSpeedVideoSizes.setAction(pendingTextTraversedEvent.getGetHighSpeedVideoFpsRangesFor());
                highSpeedVideoSizes.setMovementGranularity(pendingTextTraversedEvent.getGetHighResolutionOutputSizeshNQ4ISI());
                highSpeedVideoSizes.getText().add(Camera2StreamConfigurationMap(pendingTextTraversedEvent.getGetHighSpeedVideoSizes()));
                getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes);
            }
        }
        this.ArtificialStackFrames = null;
    }

    private final boolean getHighSpeedVideoFpsRanges(androidx.compose.ui.semantics.SemanticsNode p0, int p1, int p2, boolean p3) {
        java.lang.String Camera2StreamConfigurationMap2;
        boolean highResolutionOutputSizeshNQ4ISI;
        if (p0.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetSelection())) {
            highResolutionOutputSizeshNQ4ISI = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.getHighResolutionOutputSizeshNQ4ISI(p0);
            if (highResolutionOutputSizeshNQ4ISI) {
                kotlin.jvm.functions.Function3 function3 = (kotlin.jvm.functions.Function3) ((androidx.compose.ui.semantics.AccessibilityAction) p0.getUnmergedConfig().get(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetSelection())).getAction();
                if (function3 != null) {
                    return ((java.lang.Boolean) function3.invoke(java.lang.Integer.valueOf(p1), java.lang.Integer.valueOf(p2), java.lang.Boolean.valueOf(p3))).booleanValue();
                }
                return false;
            }
        }
        if ((p1 == p2 && p2 == this.unwrapAs) || (Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(p0)) == null) {
            return false;
        }
        if (p1 < 0 || p1 != p2 || p2 > Camera2StreamConfigurationMap2.length()) {
            p1 = -1;
        }
        this.unwrapAs = p1;
        java.lang.String str = Camera2StreamConfigurationMap2;
        boolean z = str.length() > 0;
        getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoSizes(getHighSpeedVideoSizes(p0.getId()), z ? java.lang.Integer.valueOf(this.unwrapAs) : null, z ? java.lang.Integer.valueOf(this.unwrapAs) : null, z ? java.lang.Integer.valueOf(Camera2StreamConfigurationMap2.length()) : null, str));
        getInputSizeshNQ4ISI(p0.getId());
        return true;
    }

    private final int getHighSpeedVideoSizes(androidx.compose.ui.semantics.SemanticsNode p0) {
        if (!p0.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getContentDescription()) && p0.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTextSelectionRange())) {
            return androidx.compose.ui.text.TextRange.m8039getStartimpl(((androidx.compose.ui.text.TextRange) p0.getUnmergedConfig().get(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTextSelectionRange())).getGetHighResolutionOutputSizeshNQ4ISI());
        }
        return this.unwrapAs;
    }

    private final int getHighSpeedVideoFpsRanges(androidx.compose.ui.semantics.SemanticsNode p0) {
        if (!p0.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getContentDescription()) && p0.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTextSelectionRange())) {
            return androidx.compose.ui.text.TextRange.m8034getEndimpl(((androidx.compose.ui.text.TextRange) p0.getUnmergedConfig().get(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTextSelectionRange())).getGetHighResolutionOutputSizeshNQ4ISI());
        }
        return this.unwrapAs;
    }

    private final boolean getHighSpeedVideoFpsRangesFor(androidx.compose.ui.semantics.SemanticsNode p0) {
        return !p0.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getContentDescription()) && p0.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getEditableText());
    }

    private final androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator Camera2StreamConfigurationMap(androidx.compose.ui.semantics.SemanticsNode p0, int p1) {
        androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator companion;
        androidx.compose.ui.text.TextLayoutResult textLayoutResult;
        if (p0 == null) {
            return null;
        }
        java.lang.String Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(p0);
        java.lang.String str = Camera2StreamConfigurationMap2;
        if (str == null || str.length() == 0) {
            return null;
        }
        if (p1 == 1) {
            companion = androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator.INSTANCE.getInstance(this.view.getContext().getResources().getConfiguration().locale);
            ((androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator) companion).initialize(Camera2StreamConfigurationMap2);
        } else if (p1 == 2) {
            companion = androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator.INSTANCE.getInstance(this.view.getContext().getResources().getConfiguration().locale);
            ((androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator) companion).initialize(Camera2StreamConfigurationMap2);
        } else {
            if (p1 != 4) {
                if (p1 == 8) {
                    companion = androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator.INSTANCE.getInstance();
                    companion.initialize(Camera2StreamConfigurationMap2);
                } else if (p1 != 16) {
                    return null;
                }
            }
            if (!p0.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getGetTextLayoutResult()) || (textLayoutResult = androidx.compose.ui.platform.SemanticsUtils_androidKt.getTextLayoutResult(p0.getUnmergedConfig())) == null) {
                return null;
            }
            if (p1 == 4) {
                companion = androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator.INSTANCE.getInstance();
                ((androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator) companion).initialize(Camera2StreamConfigurationMap2, textLayoutResult);
            } else {
                androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator companion2 = androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator.INSTANCE.getInstance();
                ((androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator) companion2).initialize(Camera2StreamConfigurationMap2, textLayoutResult, p0);
                companion = companion2;
            }
        }
        return companion;
    }

    private final java.lang.String Camera2StreamConfigurationMap(androidx.compose.ui.semantics.SemanticsNode p0) {
        androidx.compose.ui.text.AnnotatedString annotatedString;
        if (p0 == null) {
            return null;
        }
        if (p0.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getContentDescription())) {
            return androidx.compose.ui.util.ListUtilsKt.fastJoinToString$default((java.util.List) p0.getUnmergedConfig().get(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getContentDescription()), ",", null, null, 0, null, null, 62, null);
        }
        if (p0.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getEditableText())) {
            androidx.compose.ui.text.AnnotatedString Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(p0.getUnmergedConfig());
            if (Camera2StreamConfigurationMap2 != null) {
                return Camera2StreamConfigurationMap2.getText();
            }
            return null;
        }
        java.util.List list = (java.util.List) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(p0.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getText());
        if (list == null || (annotatedString = (androidx.compose.ui.text.AnnotatedString) kotlin.collections.CollectionsKt.firstOrNull(list)) == null) {
            return null;
        }
        return annotatedString.getText();
    }

    private final androidx.compose.ui.text.AnnotatedString Camera2StreamConfigurationMap(androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration) {
        return (androidx.compose.ui.text.AnnotatedString) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsConfiguration, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getEditableText());
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\b"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$ComposeAccessibilityNodeProvider;", "Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;)V", "", "p0", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "createAccessibilityNodeInfo", "(I)Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "p1", "Landroid/os/Bundle;", "p2", "", "performAction", "(IILandroid/os/Bundle;)Z", "", "p3", "", "addExtraDataToAccessibilityNodeInfo", "(ILandroidx/core/view/accessibility/AccessibilityNodeInfoCompat;Ljava/lang/String;Landroid/os/Bundle;)V", "findFocus"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    final class ComposeAccessibilityNodeProvider extends androidx.core.view.accessibility.AccessibilityNodeProviderCompat {
        public ComposeAccessibilityNodeProvider() {
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public final androidx.core.view.accessibility.AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int p0) {
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat highSpeedVideoFpsRanges = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.this.getHighSpeedVideoFpsRanges(p0);
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.this;
            if (androidComposeViewAccessibilityDelegateCompat.getOutputSizeshNQ4ISI) {
                if (p0 == androidComposeViewAccessibilityDelegateCompat.getInputSizeshNQ4ISI) {
                    androidComposeViewAccessibilityDelegateCompat.getOutputMinFrameDuration = highSpeedVideoFpsRanges;
                }
                if (p0 == androidComposeViewAccessibilityDelegateCompat.getInputFormats) {
                    androidComposeViewAccessibilityDelegateCompat.getHighSpeedVideoSizesFor = highSpeedVideoFpsRanges;
                }
            }
            return highSpeedVideoFpsRanges;
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public final boolean performAction(int p0, int p1, android.os.Bundle p2) {
            return androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.this.getHighSpeedVideoFpsRanges(p0, p1, p2);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public final void addExtraDataToAccessibilityNodeInfo(int p0, androidx.core.view.accessibility.AccessibilityNodeInfoCompat p1, java.lang.String p2, android.os.Bundle p3) {
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.this.getHighSpeedVideoFpsRangesFor(p0, p1, p2, p3);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public final androidx.core.view.accessibility.AccessibilityNodeInfoCompat findFocus(int p0) {
            if (p0 != 1) {
                if (p0 == 2) {
                    return createAccessibilityNodeInfo(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.this.getInputSizeshNQ4ISI);
                }
                throw new java.lang.IllegalArgumentException("Unknown focus type: ".concat(java.lang.String.valueOf(p0)));
            }
            if (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.this.getInputFormats == Integer.MIN_VALUE) {
                return null;
            }
            return createAccessibilityNodeInfo(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.this.getInputFormats);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api24Impl;", "", "<init>", "()V", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "p0", "Landroidx/compose/ui/semantics/SemanticsNode;", "p1", "", "getHighSpeedVideoFpsRangesFor", "(Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;Landroidx/compose/ui/semantics/SemanticsNode;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class Api24Impl {
        public static final androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.Api24Impl INSTANCE = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.Api24Impl();

        private Api24Impl() {
        }

        @kotlin.jvm.JvmStatic
        public static final void getHighSpeedVideoFpsRangesFor(androidx.core.view.accessibility.AccessibilityNodeInfoCompat p0, androidx.compose.ui.semantics.SemanticsNode p1) {
            boolean highResolutionOutputSizeshNQ4ISI;
            androidx.compose.ui.semantics.AccessibilityAction accessibilityAction;
            highResolutionOutputSizeshNQ4ISI = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.getHighResolutionOutputSizeshNQ4ISI(p1);
            if (!highResolutionOutputSizeshNQ4ISI || (accessibilityAction = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(p1.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetProgress())) == null) {
                return;
            }
            p0.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionSetProgress, accessibilityAction.getLabel()));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api29Impl;", "", "<init>", "()V", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "p0", "Landroidx/compose/ui/semantics/SemanticsNode;", "p1", "", "getHighSpeedVideoSizes", "(Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;Landroidx/compose/ui/semantics/SemanticsNode;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class Api29Impl {
        public static final androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.Api29Impl INSTANCE = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.Api29Impl();

        private Api29Impl() {
        }

        @kotlin.jvm.JvmStatic
        public static final void getHighSpeedVideoSizes(androidx.core.view.accessibility.AccessibilityNodeInfoCompat p0, androidx.compose.ui.semantics.SemanticsNode p1) {
            boolean highResolutionOutputSizeshNQ4ISI;
            androidx.compose.ui.semantics.Role role = (androidx.compose.ui.semantics.Role) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(p1.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getRole());
            highResolutionOutputSizeshNQ4ISI = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.getHighResolutionOutputSizeshNQ4ISI(p1);
            if (highResolutionOutputSizeshNQ4ISI) {
                int m7799getCarouselo7Vup1c = androidx.compose.ui.semantics.Role.INSTANCE.m7799getCarouselo7Vup1c();
                if (role != null && androidx.compose.ui.semantics.Role.m7794equalsimpl0(role.getGetHighSpeedVideoSizes(), m7799getCarouselo7Vup1c)) {
                    return;
                }
                androidx.compose.ui.semantics.AccessibilityAction accessibilityAction = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(p1.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPageUp());
                if (accessibilityAction != null) {
                    p0.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageUp, accessibilityAction.getLabel()));
                }
                androidx.compose.ui.semantics.AccessibilityAction accessibilityAction2 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(p1.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPageDown());
                if (accessibilityAction2 != null) {
                    p0.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageDown, accessibilityAction2.getLabel()));
                }
                androidx.compose.ui.semantics.AccessibilityAction accessibilityAction3 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(p1.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPageLeft());
                if (accessibilityAction3 != null) {
                    p0.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageLeft, accessibilityAction3.getLabel()));
                }
                androidx.compose.ui.semantics.AccessibilityAction accessibilityAction4 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(p1.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPageRight());
                if (accessibilityAction4 != null) {
                    p0.addAction(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageRight, accessibilityAction4.getLabel()));
                }
            }
        }
    }

    private final void Camera2StreamConfigurationMap() {
        android.os.Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (isEnabled$ui()) {
                getHighSpeedVideoFpsRangesFor(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), this.b);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            android.os.Trace.endSection();
            android.os.Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRanges());
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                android.os.Trace.endSection();
                android.os.Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    getOutputMinFrameDuration();
                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        android.os.Trace.beginSection("measureAndLayout");
        try {
            androidx.compose.ui.node.Owner.measureAndLayout$default(androidComposeViewAccessibilityDelegateCompat.view, false, 1, null);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            android.os.Trace.endSection();
            android.os.Trace.beginSection("checkForSemanticsChanges");
            try {
                androidComposeViewAccessibilityDelegateCompat.Camera2StreamConfigurationMap();
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                android.os.Trace.endSection();
                androidComposeViewAccessibilityDelegateCompat.getARTIFICIAL_FRAME_PACKAGE_NAME = false;
            } finally {
            }
        } finally {
        }
    }
}
