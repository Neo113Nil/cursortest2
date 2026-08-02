package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u0000 Ø\u00012\u00020\u0001:\u0002Ø\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\nJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\nJ\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\fJ\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u000fJ\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\nJ\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\nJ\u001d\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u000fJ\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0019\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\fJ\u0015\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020 ¢\u0006\u0004\b#\u0010$J\u0019\u0010&\u001a\u0004\u0018\u00010\u00012\b\u0010%\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b&\u0010'J\u001b\u0010)\u001a\u0004\u0018\u00010\u00012\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b)\u0010'J\u001f\u0010*\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010%\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020 2\u0006\u0010,\u001a\u00020\u0006¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b1\u00100J\r\u00102\u001a\u00020 ¢\u0006\u0004\b2\u0010$J\u0015\u00105\u001a\u00020 2\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u001d\u00108\u001a\u00020 2\u0006\u00107\u001a\u00020\u00062\u0006\u0010%\u001a\u000203¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020 ¢\u0006\u0004\b:\u0010$J#\u0010=\u001a\u0004\u0018\u00010<2\u0006\u0010(\u001a\u00020\u00062\b\u0010;\u001a\u0004\u0018\u000103H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b?\u00100J\u001f\u0010?\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010%\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b?\u0010+J\u0017\u0010@\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b@\u00100J\u0017\u0010A\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bA\u00100J$\u0010A\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u0086\b¢\u0006\u0004\bA\u0010BJ\u001d\u0010C\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\bC\u0010DJ)\u0010A\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bA\u0010EJ\u0017\u0010G\u001a\u0004\u0018\u00010\u00012\u0006\u0010F\u001a\u00020\u0006¢\u0006\u0004\bG\u0010\u000fJ\u000f\u0010H\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bH\u0010IJ\u001f\u0010J\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\bJ\u0010KJ\u001f\u0010J\u001a\u0004\u0018\u00010\u00012\u0006\u0010L\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\bJ\u0010MJ<\u0010P\u001a\u00020 2\u0006\u0010L\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00062\u001a\u0010O\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020 0NH\u0086\b¢\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001a\u00020\u00062\u0006\u0010L\u001a\u00020\u0006H\u0000¢\u0006\u0004\bR\u0010\fJ\u0017\u0010S\u001a\u00020\u00062\u0006\u0010L\u001a\u00020\u0006H\u0000¢\u0006\u0004\bS\u0010\fJ\u0017\u0010T\u001a\u00020\u00062\u0006\u0010L\u001a\u00020\u0006H\u0000¢\u0006\u0004\bT\u0010\fJ\u0015\u0010U\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\bU\u0010\fJ\u0015\u0010W\u001a\u00020 2\u0006\u0010V\u001a\u00020\u0006¢\u0006\u0004\bW\u0010.J\u0015\u0010X\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\bX\u0010YJ\r\u0010Z\u001a\u00020 ¢\u0006\u0004\bZ\u0010$J\r\u0010[\u001a\u00020 ¢\u0006\u0004\b[\u0010$J\r\u0010\\\u001a\u00020 ¢\u0006\u0004\b\\\u0010$J\r\u0010]\u001a\u00020 ¢\u0006\u0004\b]\u0010$J\u0015\u0010]\u001a\u00020 2\u0006\u00107\u001a\u00020\u0006¢\u0006\u0004\b]\u0010.J\u001f\u0010]\u001a\u00020 2\u0006\u00107\u001a\u00020\u00062\b\u0010^\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b]\u0010_J\u001f\u0010a\u001a\u00020 2\u0006\u00107\u001a\u00020\u00062\b\u0010`\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\ba\u0010_J)\u0010a\u001a\u00020 2\u0006\u00107\u001a\u00020\u00062\b\u0010`\u001a\u0004\u0018\u00010\u00012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\ba\u0010bJ)\u0010d\u001a\u00020 2\u0006\u00107\u001a\u00020\u00062\b\u0010`\u001a\u0004\u0018\u00010\u00012\b\u0010c\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bd\u0010bJ\u001f\u0010d\u001a\u00020 2\u0006\u00107\u001a\u00020\u00062\b\u0010c\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bd\u0010_J3\u0010g\u001a\u00020 2\u0006\u0010(\u001a\u00020\u00062\b\u0010;\u001a\u0004\u0018\u00010\u00012\u0006\u0010e\u001a\u00020\b2\b\u0010f\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\bg\u0010hJ\r\u0010i\u001a\u00020\u0006¢\u0006\u0004\bi\u0010jJ\u0015\u0010k\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\bk\u0010.J\u0015\u0010k\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\bk\u0010YJ\r\u0010l\u001a\u00020\u0006¢\u0006\u0004\bl\u0010jJ\r\u0010m\u001a\u00020\b¢\u0006\u0004\bm\u0010nJ\u0015\u0010p\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010o¢\u0006\u0004\bp\u0010qJ>\u0010s\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u00062$\u0010O\u001a \u0012\t\u0012\u00070\u0006¢\u0006\u0002\br\u0012\u000b\u0012\t\u0018\u00010\u0001¢\u0006\u0002\br\u0012\u0004\u0012\u00020 0NH\u0086\b¢\u0006\u0004\bs\u0010tJJ\u0010x\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u00062\u0017\u0010v\u001a\u0013\u0012\t\u0012\u00070\u0006¢\u0006\u0002\br\u0012\u0004\u0012\u00020 0u2\u0017\u0010w\u001a\u0013\u0012\t\u0012\u00070\u0006¢\u0006\u0002\br\u0012\u0004\u0012\u00020 0uH\u0086\b¢\u0006\u0004\bx\u0010yJ;\u0010z\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u00062$\u0010O\u001a \u0012\t\u0012\u00070\u0006¢\u0006\u0002\br\u0012\u000b\u0012\t\u0018\u00010\u0001¢\u0006\u0002\br\u0012\u0004\u0012\u00020 0N¢\u0006\u0004\bz\u0010tJ\u001f\u0010{\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0006H\u0002¢\u0006\u0004\b{\u0010DJ\u0015\u0010}\u001a\u00020 2\u0006\u0010|\u001a\u00020\u0006¢\u0006\u0004\b}\u0010.J\u001e\u0010\u007f\u001a\u00020\b2\u0006\u0010~\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0005\b\u007f\u0010\u0080\u0001J0\u0010\u0083\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0082\u00012\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010|\u001a\u00020\u00062\u0007\u0010\u0081\u0001\u001a\u00020\u0000¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J2\u0010\u0086\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0082\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\t\b\u0002\u0010\u0085\u0001\u001a\u00020\b¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u000f\u0010\u0088\u0001\u001a\u00020 ¢\u0006\u0005\b\u0088\u0001\u0010$J/\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0082\u00012\u0006\u0010|\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0018\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0005\b\u001b\u0010\u008b\u0001J\u0019\u0010\u008c\u0001\u001a\u00020 2\b\b\u0002\u0010\u0016\u001a\u00020\u0006¢\u0006\u0005\b\u008c\u0001\u0010.J\u0017\u0010=\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\b=\u0010\nJ\u0017\u0010g\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\bg\u0010\nJ\u000f\u0010g\u001a\u00020 H\u0002¢\u0006\u0004\bg\u0010$J\u0019\u0010\u008d\u0001\u001a\u00020 2\u0006\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u008d\u0001\u0010.J#\u0010\u008f\u0001\u001a\u00020 2\u0006\u0010(\u001a\u00020\u00062\u0007\u0010;\u001a\u00030\u008e\u0001H\u0002¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u0017\u0010{\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\b{\u0010\nJ\u0017\u0010\u0091\u0001\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0005\b\u0091\u0001\u0010\u001eJ\u0012\u0010\u0092\u0001\u001a\u000203H\u0016¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u0011\u0010\u0094\u0001\u001a\u00020 H\u0002¢\u0006\u0005\b\u0094\u0001\u0010$J\u000f\u0010=\u001a\u00020\u0006H\u0002¢\u0006\u0004\b=\u0010jJ(\u0010{\u001a\u00020 2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u00062\u0006\u0010e\u001a\u00020\u0006H\u0002¢\u0006\u0005\b{\u0010\u0095\u0001J\u0019\u0010\u0096\u0001\u001a\u00020 2\u0006\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u0096\u0001\u0010.J \u0010=\u001a\u00020 2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0006H\u0002¢\u0006\u0005\b=\u0010\u0097\u0001J\u0011\u0010\u008f\u0001\u001a\u00020 H\u0002¢\u0006\u0005\b\u008f\u0001\u0010$J\u0019\u0010\u0094\u0001\u001a\u00020 2\u0006\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u0094\u0001\u0010.J\"\u0010\u008f\u0001\u001a\u00020 2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u008f\u0001\u0010\u0097\u0001J\u001f\u0010g\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0006H\u0002¢\u0006\u0004\bg\u0010\u0018J\u001c\u0010\u0098\u0001\u001a\u0004\u0018\u00010<2\u0006\u0010\u0016\u001a\u00020\u0006H\u0000¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u001c\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0016\u001a\u00020\u0006H\u0000¢\u0006\u0006\b\u009a\u0001\u0010\u008b\u0001J(\u0010=\u001a\u00020 2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u00062\u0006\u0010e\u001a\u00020\u0006H\u0002¢\u0006\u0005\b=\u0010\u0095\u0001J!\u0010=\u001a\u00020 2\u0006\u0010(\u001a\u00020\u00062\b\u0010;\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b=\u0010_J\"\u0010\u0096\u0001\u001a\u00020 2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001JJ\u0010g\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u00062(\u0010e\u001a$\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020<\u0018\u00010\u009b\u0001j\u0011\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020<\u0018\u0001`\u009c\u0001H\u0002¢\u0006\u0005\bg\u0010\u009d\u0001J(\u0010)\u001a\u00020 2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u00062\u0006\u0010e\u001a\u00020\u0006H\u0002¢\u0006\u0005\b)\u0010\u0095\u0001J\u0010\u0010\u009e\u0001\u001a\u000203¢\u0006\u0006\b\u009e\u0001\u0010\u0093\u0001J\"\u0010{\u001a\u00020 *\b0\u009f\u0001j\u0003` \u00012\u0006\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0005\b{\u0010¡\u0001J\u0011\u0010¢\u0001\u001a\u00020 H\u0000¢\u0006\u0005\b¢\u0001\u0010$J\u0011\u0010£\u0001\u001a\u00020 H\u0000¢\u0006\u0005\b£\u0001\u0010$J\u0019\u0010¤\u0001\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0005\b¤\u0001\u0010\fJ\u0017\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010\fJ\u001d\u0010g\u001a\u00020\u0006*\u00030¥\u00012\u0006\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0005\bg\u0010¦\u0001J\u0019\u0010\u008f\u0001\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u008f\u0001\u0010\fJ\u001d\u0010=\u001a\u00020\u0006*\u00030¥\u00012\u0006\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0005\b=\u0010¦\u0001J\u001f\u0010\u008f\u0001\u001a\u00020\u0006*\u00030¥\u00012\u0006\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u008f\u0001\u0010¦\u0001J%\u0010=\u001a\u00020 *\u00030¥\u00012\u0006\u0010(\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0006H\u0002¢\u0006\u0005\b=\u0010§\u0001J\u001d\u0010)\u001a\u00020\u0006*\u00030¥\u00012\u0006\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0005\b)\u0010¦\u0001J\u001d\u0010{\u001a\u00020\u0006*\u00030¥\u00012\u0006\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0005\b{\u0010¦\u0001J0\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u00062\u0006\u0010e\u001a\u00020\u00062\u0006\u0010f\u001a\u00020\u0006H\u0002¢\u0006\u0005\b)\u0010¨\u0001J*\u0010\u008f\u0001\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u00062\u0006\u0010e\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u008f\u0001\u0010©\u0001J\u001f\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010DJ\u0019\u0010ª\u0001\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0005\bª\u0001\u0010\fR\u001d\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\u000f\n\u0005\b\u0003\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u0019\u0010)\u001a\u00030¥\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010®\u0001R!\u0010=\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010¯\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R*\u0010\u008f\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u001a0²\u0001j\t\u0012\u0004\u0012\u00020\u001a`³\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b{\u0010´\u0001R:\u0010{\u001a$\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020<\u0018\u00010\u009b\u0001j\u0011\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020<\u0018\u0001`\u009c\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010µ\u0001R!\u0010g\u001a\f\u0012\u0005\u0012\u00030·\u0001\u0018\u00010¶\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b)\u0010¸\u0001R\u0019\u0010\u0094\u0001\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bª\u0001\u0010¹\u0001R\u0019\u0010\u008d\u0001\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010¹\u0001R\u0019\u0010ª\u0001\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010¹\u0001R\u0018\u0010\u0096\u0001\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\bg\u0010¹\u0001R\u0019\u0010¤\u0001\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bº\u0001\u0010¹\u0001R\u0019\u0010¼\u0001\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b»\u0001\u0010¹\u0001R\u0019\u0010»\u0001\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b½\u0001\u0010¹\u0001R\u0019\u0010¾\u0001\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010¹\u0001R\u0019\u0010°\u0001\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010¹\u0001R\u0018\u0010Â\u0001\u001a\u00030¿\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u0018\u0010½\u0001\u001a\u00030¿\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010Á\u0001R\u0018\u0010Ã\u0001\u001a\u00030¿\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010Á\u0001R*\u0010\u0092\u0001\u001a\u0014\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010Ä\u0001\u0018\u00010¶\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b=\u0010¸\u0001R(\u0010Å\u0001\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00068\u0007@BX\u0087\u000e¢\u0006\u000f\n\u0006\bÅ\u0001\u0010¹\u0001\u001a\u0005\bÆ\u0001\u0010jR(\u0010Ç\u0001\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00068\u0007@BX\u0087\u000e¢\u0006\u000f\n\u0006\bÇ\u0001\u0010¹\u0001\u001a\u0005\bÈ\u0001\u0010jR\u0013\u0010É\u0001\u001a\u00020\b8G¢\u0006\u0007\u001a\u0005\bÉ\u0001\u0010nR\u0013\u0010Ë\u0001\u001a\u00020\u00068G¢\u0006\u0007\u001a\u0005\bÊ\u0001\u0010jR\u0011\u0010\t\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010nR\u0013\u0010Í\u0001\u001a\u00020\b8G¢\u0006\u0007\u001a\u0005\bÌ\u0001\u0010nR\u0013\u0010Ï\u0001\u001a\u00020\b8G¢\u0006\u0007\u001a\u0005\bÎ\u0001\u0010nR&\u0010\u001d\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00068\u0007@BX\u0087\u000e¢\u0006\u000e\n\u0005\b\u001d\u0010¹\u0001\u001a\u0005\bÐ\u0001\u0010jR(\u0010Ñ\u0001\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b8\u0007@BX\u0087\u000e¢\u0006\u000f\n\u0006\bÑ\u0001\u0010Ò\u0001\u001a\u0005\bÓ\u0001\u0010nR\u0015\u0010º\u0001\u001a\u00020\u00068CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b{\u0010jR\u001c\u0010À\u0001\u001a\u0005\u0018\u00010\u008e\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010Ô\u0001R\u0016\u0010Ö\u0001\u001a\u00020\u00068AX\u0080\u0004¢\u0006\u0007\u001a\u0005\bÕ\u0001\u0010jR\u0015\u0010×\u0001\u001a\u00020\u00068CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010j"}, d2 = {"Landroidx/compose/runtime/SlotWriter;", "", "Landroidx/compose/runtime/SlotTable;", "table", "<init>", "(Landroidx/compose/runtime/SlotTable;)V", "", "index", "", "isNode", "(I)Z", "nodeCount", "(I)I", "groupKey", "groupObjectKey", "(I)Ljava/lang/Object;", "isValid", "hasObjectKey", "groupSize", "groupAux", "indexInParent", "indexInCurrentGroup", "group", "indexInGroup", "(II)Z", "node", "Landroidx/compose/runtime/Anchor;", io.ktor.http.LinkHeader.Parameters.Anchor, "(Landroidx/compose/runtime/Anchor;)Ljava/lang/Object;", "parent", "(Landroidx/compose/runtime/Anchor;)I", "normalClose", "", "close", "(Z)V", "reset", "()V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "update", "(Ljava/lang/Object;)Ljava/lang/Object;", "p0", "getHighSpeedVideoFpsRanges", "appendSlot", "(Landroidx/compose/runtime/Anchor;Ljava/lang/Object;)V", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "trimTailSlots", "(I)V", "updateAux", "(Ljava/lang/Object;)V", "insertAux", "updateToTableMaps", "", "sourceInformation", "recordGroupSourceInformation", "(Ljava/lang/String;)V", "key", "recordGrouplessCallSourceInformationStart", "(ILjava/lang/String;)V", "recordGrouplessCallSourceInformationEnd", "p1", "Landroidx/compose/runtime/GroupSourceInformation;", "Camera2StreamConfigurationMap", "(ILjava/lang/String;)Landroidx/compose/runtime/GroupSourceInformation;", "updateNode", "updateParentNode", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "slotIndexOfGroupSlotIndex", "(II)I", "(IILjava/lang/Object;)Ljava/lang/Object;", "slotIndex", "clear", "skip", "()Ljava/lang/Object;", "slot", "(Landroidx/compose/runtime/Anchor;I)Ljava/lang/Object;", "groupIndex", "(II)Ljava/lang/Object;", "Lkotlin/Function2;", "block", "forEachTailSlot", "(IILkotlin/jvm/functions/Function2;)V", "slotsStartIndex$runtime", "slotsEndIndex$runtime", "slotsEndAllIndex$runtime", "groupSlotIndex", "amount", "advanceBy", "seek", "(Landroidx/compose/runtime/Anchor;)V", "skipToGroupEnd", "beginInsert", "endInsert", "startGroup", "dataKey", "(ILjava/lang/Object;)V", "objectKey", "startNode", "(ILjava/lang/Object;Ljava/lang/Object;)V", "aux", "startData", "p2", "p3", "getHighResolutionOutputSizeshNQ4ISI", "(ILjava/lang/Object;ZLjava/lang/Object;)V", "endGroup", "()I", "ensureStarted", "skipGroup", "removeGroup", "()Z", "", "groupSlots", "()Ljava/util/Iterator;", "Lkotlin/ParameterName;", "forAllData", "(ILkotlin/jvm/functions/Function2;)V", "Lkotlin/Function1;", "enter", com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.EXIT, "traverseGroupAndChildren", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "forAllDataInRememberOrder", "getHighSpeedVideoFpsRangesFor", "offset", "moveGroup", "groupAnchor", "inGroup", "(Landroidx/compose/runtime/Anchor;Landroidx/compose/runtime/Anchor;)Z", "writer", "", "moveTo", "(Landroidx/compose/runtime/Anchor;ILandroidx/compose/runtime/SlotWriter;)Ljava/util/List;", "removeSourceGroup", "moveFrom", "(Landroidx/compose/runtime/SlotTable;IZ)Ljava/util/List;", "bashCurrentGroup", "moveIntoGroupFrom", "(ILandroidx/compose/runtime/SlotTable;I)Ljava/util/List;", "(I)Landroidx/compose/runtime/Anchor;", "markGroup", "getOutputFormats", "Landroidx/compose/runtime/PrioritySet;", "getHighSpeedVideoSizes", "(ILandroidx/collection/MutableIntList;)V", "anchorIndex", "toString", "()Ljava/lang/String;", "getInputFormats", "(III)V", "getInputSizeshNQ4ISI", "(II)V", "sourceInformationOf$runtime", "(I)Landroidx/compose/runtime/GroupSourceInformation;", "tryAnchor$runtime", "Ljava/util/HashMap;", "Lkotlin/collections/getHighSpeedVideoFpsRangesFor;", "(IILjava/util/HashMap;)Z", "toDebugString", "Ljava/lang/StringBuilder;", "Lkotlin/text/getHighSpeedVideoSizes;", "(Ljava/lang/StringBuilder;I)V", "verifyDataAnchors$runtime", "verifyParentAnchors$runtime", "getOutputMinFrameDuration", "", "([II)I", "([III)V", "(IIII)I", "(III)I", "getHighSpeedVideoSizesFor", "Landroidx/compose/runtime/SlotTable;", "getTable$runtime", "()Landroidx/compose/runtime/SlotTable;", "[I", "", "getOutputStallDuration", "[Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/getHighSpeedVideoFpsRanges;", "Ljava/util/ArrayList;", "Ljava/util/HashMap;", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/collection/MutableIntSet;", "Landroidx/collection/MutableIntObjectMap;", com.visa.cbp.getEncExpo.warmup, "unwrapAs", "getOutputSizes", "getOutputSizeshNQ4ISI", "getValidOutputFormatsForInputhNQ4ISI", "getOutputStallDurationlomOqCM", "Landroidx/compose/runtime/IntStack;", "isOutputSupportedForhNQ4ISI", "Landroidx/compose/runtime/IntStack;", "getOutputMinFrameDurationlomOqCM", "isOutputSupportedFor", "Landroidx/collection/MutableObjectList;", "currentGroup", "getCurrentGroup", "currentGroupEnd", "getCurrentGroupEnd", "isGroupEnd", "getSlotsSize", "slotsSize", "getCollectingSourceInformation", "collectingSourceInformation", "getCollectingCalledInformation", "collectingCalledInformation", "getParent", com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED, "Z", "getClosed", "Landroidx/collection/MutableIntList;", "getSize$runtime", io.ktor.http.ContentDisposition.Parameters.Size, "accessartificialFrame", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SlotWriter {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.collection.MutableIntObjectMap<androidx.collection.MutableObjectList<java.lang.Object>> toString;
    private boolean closed;
    private int currentGroup;
    private int currentGroupEnd;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.collection.MutableIntObjectMap<androidx.collection.MutableIntSet> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private java.util.ArrayList<androidx.compose.runtime.Anchor> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private int getInputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private int getOutputStallDurationlomOqCM;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private int[] getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private int getOutputFormats;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private androidx.collection.MutableIntList isOutputSupportedForhNQ4ISI;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private int getOutputSizeshNQ4ISI;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getOutputStallDuration;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private java.lang.Object[] Camera2StreamConfigurationMap;

    /* renamed from: getValidOutputFormatsForInputhNQ4ISI, reason: from kotlin metadata */
    private int getOutputSizes;
    private final androidx.compose.runtime.SlotTable table;

    /* renamed from: toString, reason: from kotlin metadata */
    private java.util.HashMap<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> getHighSpeedVideoFpsRangesFor;

    /* renamed from: unwrapAs, reason: from kotlin metadata */
    private int getOutputMinFrameDuration;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.runtime.SlotWriter.Companion INSTANCE = new androidx.compose.runtime.SlotWriter.Companion(null);
    public static final int $stable = 8;

    /* renamed from: isOutputSupportedForhNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.runtime.IntStack getOutputMinFrameDurationlomOqCM = new androidx.compose.runtime.IntStack();

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.runtime.IntStack getValidOutputFormatsForInputhNQ4ISI = new androidx.compose.runtime.IntStack();

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final androidx.compose.runtime.IntStack isOutputSupportedFor = new androidx.compose.runtime.IntStack();
    private int parent = -1;

    private static int getHighSpeedVideoFpsRanges(int p0, int p1, int p2, int p3) {
        return p0 > p1 ? -(((p3 - p2) - p0) + 1) : p0;
    }

    private static int getHighSpeedVideoSizes(int p0, int p1, int p2) {
        return p0 < 0 ? (p2 - p1) + p0 + 1 : p0;
    }

    public SlotWriter(androidx.compose.runtime.SlotTable slotTable) {
        this.table = slotTable;
        this.getHighSpeedVideoFpsRanges = slotTable.getGroups();
        this.Camera2StreamConfigurationMap = slotTable.getSlots();
        this.getHighSpeedVideoSizes = slotTable.getAnchors$runtime();
        this.getHighSpeedVideoFpsRangesFor = slotTable.getSourceInformationMap$runtime();
        this.getHighResolutionOutputSizeshNQ4ISI = slotTable.getCalledByMap$runtime();
        this.getInputFormats = slotTable.getGroupsSize();
        this.getOutputFormats = (this.getHighSpeedVideoFpsRanges.length / 5) - slotTable.getGroupsSize();
        this.getOutputMinFrameDuration = slotTable.getSlotsSize();
        this.getOutputSizeshNQ4ISI = this.Camera2StreamConfigurationMap.length - slotTable.getSlotsSize();
        this.getOutputSizes = slotTable.getGroupsSize();
        this.currentGroupEnd = slotTable.getGroupsSize();
    }

    public static final /* synthetic */ int access$dataIndexToDataAnchor(androidx.compose.runtime.SlotWriter slotWriter, int i, int i2, int i3, int i4) {
        return getHighSpeedVideoFpsRanges(i, i2, i3, i4);
    }

    /* renamed from: getTable$runtime, reason: from getter */
    public final androidx.compose.runtime.SlotTable getTable() {
        return this.table;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final int getCurrentGroupEnd() {
        return this.currentGroupEnd;
    }

    public final boolean isGroupEnd() {
        return this.currentGroup == this.currentGroupEnd;
    }

    public final int getSlotsSize() {
        return this.Camera2StreamConfigurationMap.length - this.getOutputSizeshNQ4ISI;
    }

    public final boolean isNode() {
        int i = this.currentGroup;
        return i < this.currentGroupEnd && (this.getHighSpeedVideoFpsRanges[(getOutputMinFrameDuration(i) * 5) + 1] & 1073741824) != 0;
    }

    public final boolean getCollectingSourceInformation() {
        return this.getHighSpeedVideoFpsRangesFor != null;
    }

    public final boolean getCollectingCalledInformation() {
        return this.getHighResolutionOutputSizeshNQ4ISI != null;
    }

    public final boolean isNode(int index) {
        return (this.getHighSpeedVideoFpsRanges[(getOutputMinFrameDuration(index) * 5) + 1] & 1073741824) != 0;
    }

    public final int nodeCount(int index) {
        return this.getHighSpeedVideoFpsRanges[(getOutputMinFrameDuration(index) * 5) + 1] & 67108863;
    }

    public final int groupKey(int index) {
        return this.getHighSpeedVideoFpsRanges[getOutputMinFrameDuration(index) * 5];
    }

    public final java.lang.Object groupObjectKey(int index) {
        int inputSizeshNQ4ISI;
        int outputMinFrameDuration = getOutputMinFrameDuration(index);
        int[] iArr = this.getHighSpeedVideoFpsRanges;
        if ((iArr[(outputMinFrameDuration * 5) + 1] & 536870912) == 0) {
            return null;
        }
        java.lang.Object[] objArr = this.Camera2StreamConfigurationMap;
        inputSizeshNQ4ISI = androidx.compose.runtime.SlotTableKt.getInputSizeshNQ4ISI(iArr, outputMinFrameDuration);
        return objArr[inputSizeshNQ4ISI];
    }

    public final boolean isValid(int index) {
        return getOutputMinFrameDuration(index) * 5 < this.getHighSpeedVideoFpsRanges.length;
    }

    public final boolean hasObjectKey(int index) {
        return (this.getHighSpeedVideoFpsRanges[(getOutputMinFrameDuration(index) * 5) + 1] & 536870912) != 0;
    }

    public final int groupSize(int index) {
        int highSpeedVideoSizes;
        highSpeedVideoSizes = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, getOutputMinFrameDuration(index));
        return highSpeedVideoSizes;
    }

    public final java.lang.Object groupAux(int index) {
        int outputMinFrameDuration = getOutputMinFrameDuration(index);
        int[] iArr = this.getHighSpeedVideoFpsRanges;
        return (iArr[(outputMinFrameDuration * 5) + 1] & 268435456) != 0 ? this.Camera2StreamConfigurationMap[getHighSpeedVideoFpsRangesFor(iArr, outputMinFrameDuration)] : androidx.compose.runtime.Composer.INSTANCE.getEmpty();
    }

    public final boolean indexInParent(int index) {
        int i = this.parent;
        if (index <= i || index >= this.currentGroupEnd) {
            return i == 0 && index == 0;
        }
        return true;
    }

    public final boolean indexInCurrentGroup(int index) {
        return indexInGroup(index, this.currentGroup);
    }

    public final boolean indexInGroup(int index, int group) {
        int highSpeedVideoFpsRanges;
        int groupSize;
        if (group == this.parent) {
            highSpeedVideoFpsRanges = this.currentGroupEnd;
        } else {
            if (group > this.getOutputMinFrameDurationlomOqCM.peekOr(0)) {
                groupSize = groupSize(group);
            } else {
                int indexOf = this.getOutputMinFrameDurationlomOqCM.indexOf(group);
                if (indexOf < 0) {
                    groupSize = groupSize(group);
                } else {
                    highSpeedVideoFpsRanges = (getHighSpeedVideoFpsRanges() - this.getOutputFormats) - this.getValidOutputFormatsForInputhNQ4ISI.peek(indexOf);
                }
            }
            highSpeedVideoFpsRanges = groupSize + group;
        }
        return index > group && index < highSpeedVideoFpsRanges;
    }

    public final java.lang.Object node(int index) {
        int outputMinFrameDuration = getOutputMinFrameDuration(index);
        int[] iArr = this.getHighSpeedVideoFpsRanges;
        if ((iArr[(outputMinFrameDuration * 5) + 1] & 1073741824) != 0) {
            return this.Camera2StreamConfigurationMap[getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRanges(iArr, outputMinFrameDuration))];
        }
        return null;
    }

    public final java.lang.Object node(androidx.compose.runtime.Anchor anchor) {
        return node(anchor.toIndexFor(this));
    }

    public final int getParent() {
        return this.parent;
    }

    public final int parent(int index) {
        return getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, index);
    }

    public final int parent(androidx.compose.runtime.Anchor anchor) {
        if (anchor.getValid()) {
            return getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, anchorIndex(anchor));
        }
        return -1;
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final void close(boolean normalClose) {
        this.closed = true;
        if (normalClose && this.getOutputMinFrameDurationlomOqCM.tos == 0) {
            getInputSizeshNQ4ISI(getSize$runtime());
            Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap.length - this.getOutputSizeshNQ4ISI, this.getInputFormats);
            getHighSpeedVideoSizes();
            getHighResolutionOutputSizeshNQ4ISI();
        }
        this.table.close$runtime(this, this.getHighSpeedVideoFpsRanges, this.getInputFormats, this.Camera2StreamConfigurationMap, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final void reset() {
        if (this.getOutputStallDurationlomOqCM != 0) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Cannot reset when inserting");
        }
        getHighResolutionOutputSizeshNQ4ISI();
        this.currentGroup = 0;
        this.currentGroupEnd = getHighSpeedVideoFpsRanges() - this.getOutputFormats;
        this.getHighSpeedVideoSizesFor = 0;
        this.getInputSizeshNQ4ISI = 0;
        this.getOutputStallDuration = 0;
    }

    public final java.lang.Object update(java.lang.Object value) {
        if (this.getOutputStallDurationlomOqCM > 0 && this.getHighSpeedVideoSizesFor != this.getOutputMinFrameDuration) {
            androidx.collection.MutableIntObjectMap<androidx.collection.MutableObjectList<java.lang.Object>> mutableIntObjectMap = this.toString;
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            int i = 1;
            int i2 = 0;
            if (mutableIntObjectMap == null) {
                mutableIntObjectMap = new androidx.collection.MutableIntObjectMap<>(i2, i, defaultConstructorMarker);
            }
            this.toString = mutableIntObjectMap;
            int i3 = this.parent;
            androidx.collection.MutableObjectList<java.lang.Object> mutableObjectList = mutableIntObjectMap.get(i3);
            if (mutableObjectList == null) {
                mutableObjectList = new androidx.collection.MutableObjectList<>(i2, i, defaultConstructorMarker);
                mutableIntObjectMap.set(i3, mutableObjectList);
            }
            mutableObjectList.add(value);
            return androidx.compose.runtime.Composer.INSTANCE.getEmpty();
        }
        return getHighSpeedVideoFpsRanges(value);
    }

    private final java.lang.Object getHighSpeedVideoFpsRanges(java.lang.Object p0) {
        java.lang.Object skip = skip();
        set(p0);
        return skip;
    }

    public final void appendSlot(androidx.compose.runtime.Anchor anchor, java.lang.Object value) {
        if (this.getOutputStallDurationlomOqCM != 0) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Can only append a slot if not current inserting");
        }
        int i = this.getHighSpeedVideoSizesFor;
        int i2 = this.getInputSizeshNQ4ISI;
        int anchorIndex = anchorIndex(anchor);
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, getOutputMinFrameDuration(anchorIndex + 1));
        this.getHighSpeedVideoSizesFor = Camera2StreamConfigurationMap;
        this.getInputSizeshNQ4ISI = Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes(1, anchorIndex);
        if (i >= Camera2StreamConfigurationMap) {
            i++;
            i2++;
        }
        this.Camera2StreamConfigurationMap[Camera2StreamConfigurationMap] = value;
        this.getHighSpeedVideoSizesFor = i;
        this.getInputSizeshNQ4ISI = i2;
    }

    public final void updateAux(java.lang.Object value) {
        int outputMinFrameDuration = getOutputMinFrameDuration(this.currentGroup);
        if ((this.getHighSpeedVideoFpsRanges[(outputMinFrameDuration * 5) + 1] & 268435456) == 0) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Updating the data of a group that was not created with a data slot");
        }
        this.Camera2StreamConfigurationMap[getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, outputMinFrameDuration))] = value;
    }

    public final void insertAux(java.lang.Object value) {
        if (this.getOutputStallDurationlomOqCM < 0) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Cannot insert auxiliary data when not inserting");
        }
        int i = this.parent;
        int outputMinFrameDuration = getOutputMinFrameDuration(i);
        if ((this.getHighSpeedVideoFpsRanges[(outputMinFrameDuration * 5) + 1] & 268435456) != 0) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Group already has auxiliary data");
        }
        getHighSpeedVideoSizes(1, i);
        int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, outputMinFrameDuration);
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(highSpeedVideoFpsRangesFor);
        int i2 = this.getHighSpeedVideoSizesFor;
        if (i2 > highSpeedVideoFpsRangesFor) {
            int i3 = i2 - highSpeedVideoFpsRangesFor;
            if (i3 >= 3) {
                androidx.compose.runtime.PreconditionsKt.throwIllegalStateException("Moving more than two slot not supported");
            }
            if (i3 > 1) {
                java.lang.Object[] objArr = this.Camera2StreamConfigurationMap;
                objArr[highSpeedVideoFpsRanges + 2] = objArr[highSpeedVideoFpsRanges + 1];
            }
            java.lang.Object[] objArr2 = this.Camera2StreamConfigurationMap;
            objArr2[highSpeedVideoFpsRanges + 1] = objArr2[highSpeedVideoFpsRanges];
        }
        androidx.compose.runtime.SlotTableKt.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, outputMinFrameDuration);
        this.Camera2StreamConfigurationMap[highSpeedVideoFpsRanges] = value;
        this.getHighSpeedVideoSizesFor++;
    }

    public final void updateToTableMaps() {
        this.getHighSpeedVideoFpsRangesFor = this.table.getSourceInformationMap$runtime();
        this.getHighResolutionOutputSizeshNQ4ISI = this.table.getCalledByMap$runtime();
    }

    public final void recordGroupSourceInformation(java.lang.String sourceInformation) {
        if (this.getOutputStallDurationlomOqCM > 0) {
            Camera2StreamConfigurationMap(this.parent, sourceInformation);
        }
    }

    public final void recordGrouplessCallSourceInformationStart(int key, java.lang.String value) {
        if (this.getOutputStallDurationlomOqCM > 0) {
            androidx.collection.MutableIntObjectMap<androidx.collection.MutableIntSet> mutableIntObjectMap = this.getHighResolutionOutputSizeshNQ4ISI;
            if (mutableIntObjectMap != null) {
                androidx.compose.runtime.SlotTableKt.getHighSpeedVideoFpsRanges((androidx.collection.MutableIntObjectMap<androidx.collection.MutableIntSet>) mutableIntObjectMap, key, groupKey(this.parent));
            }
            androidx.compose.runtime.GroupSourceInformation Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(this.parent, (java.lang.String) null);
            if (Camera2StreamConfigurationMap != null) {
                Camera2StreamConfigurationMap.startGrouplessCall(key, value, getHighSpeedVideoFpsRangesFor());
            }
        }
    }

    public final void recordGrouplessCallSourceInformationEnd() {
        androidx.compose.runtime.GroupSourceInformation Camera2StreamConfigurationMap;
        if (this.getOutputStallDurationlomOqCM <= 0 || (Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(this.parent, (java.lang.String) null)) == null) {
            return;
        }
        Camera2StreamConfigurationMap.endGrouplessCall(getHighSpeedVideoFpsRangesFor());
    }

    private final androidx.compose.runtime.GroupSourceInformation Camera2StreamConfigurationMap(int p0, java.lang.String p1) {
        int highSpeedVideoSizes;
        java.util.HashMap<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> hashMap = this.getHighSpeedVideoFpsRangesFor;
        if (hashMap == null) {
            return null;
        }
        java.util.HashMap<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> hashMap2 = hashMap;
        androidx.compose.runtime.Anchor anchor = anchor(p0);
        androidx.compose.runtime.GroupSourceInformation groupSourceInformation = hashMap2.get(anchor);
        if (groupSourceInformation == null) {
            groupSourceInformation = new androidx.compose.runtime.GroupSourceInformation(0, p1, 0);
            if (p1 == null) {
                int i = p0 + 1;
                int i2 = this.currentGroup;
                while (i < i2) {
                    groupSourceInformation.reportGroup(this, i);
                    highSpeedVideoSizes = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, i);
                    i += highSpeedVideoSizes;
                }
            }
            hashMap2.put(anchor, groupSourceInformation);
        }
        return groupSourceInformation;
    }

    public final void updateNode(java.lang.Object value) {
        Camera2StreamConfigurationMap(this.currentGroup, value);
    }

    public final void updateNode(androidx.compose.runtime.Anchor anchor, java.lang.Object value) {
        Camera2StreamConfigurationMap(anchor.toIndexFor(this), value);
    }

    public final void updateParentNode(java.lang.Object value) {
        Camera2StreamConfigurationMap(this.parent, value);
    }

    public final void set(java.lang.Object value) {
        if (this.getHighSpeedVideoSizesFor > this.getInputSizeshNQ4ISI) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Writing to an invalid slot");
        }
        this.Camera2StreamConfigurationMap[getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizesFor - 1)] = value;
    }

    public final java.lang.Object set(int index, java.lang.Object value) {
        return set(getCurrentGroup(), index, value);
    }

    public final int slotIndexOfGroupSlotIndex(int group, int index) {
        int highSpeedVideoSizes = getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, getOutputMinFrameDuration(group));
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, getOutputMinFrameDuration(group + 1));
        int i = highSpeedVideoSizes + index;
        if (i < highSpeedVideoSizes || i >= Camera2StreamConfigurationMap) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Write to an invalid slot index ");
            sb.append(index);
            sb.append(" for group ");
            sb.append(group);
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError(sb.toString());
        }
        return i;
    }

    public final java.lang.Object set(int group, int index, java.lang.Object value) {
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(slotIndexOfGroupSlotIndex(group, index));
        java.lang.Object[] objArr = this.Camera2StreamConfigurationMap;
        java.lang.Object obj = objArr[highSpeedVideoFpsRanges];
        objArr[highSpeedVideoFpsRanges] = value;
        return obj;
    }

    public final java.lang.Object clear(int slotIndex) {
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(slotIndex);
        java.lang.Object[] objArr = this.Camera2StreamConfigurationMap;
        java.lang.Object obj = objArr[highSpeedVideoFpsRanges];
        objArr[highSpeedVideoFpsRanges] = androidx.compose.runtime.Composer.INSTANCE.getEmpty();
        return obj;
    }

    public final java.lang.Object skip() {
        if (this.getOutputStallDurationlomOqCM > 0) {
            getHighSpeedVideoSizes(1, this.parent);
        }
        java.lang.Object[] objArr = this.Camera2StreamConfigurationMap;
        int i = this.getHighSpeedVideoSizesFor;
        this.getHighSpeedVideoSizesFor = i + 1;
        return objArr[getHighSpeedVideoFpsRanges(i)];
    }

    public final java.lang.Object slot(androidx.compose.runtime.Anchor anchor, int index) {
        return slot(anchorIndex(anchor), index);
    }

    public final java.lang.Object slot(int groupIndex, int index) {
        int highSpeedVideoSizes = getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, getOutputMinFrameDuration(groupIndex));
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, getOutputMinFrameDuration(groupIndex + 1));
        int i = index + highSpeedVideoSizes;
        if (highSpeedVideoSizes > i || i >= Camera2StreamConfigurationMap) {
            return androidx.compose.runtime.Composer.INSTANCE.getEmpty();
        }
        return this.Camera2StreamConfigurationMap[getHighSpeedVideoFpsRanges(i)];
    }

    public final void forEachTailSlot(int groupIndex, int count, kotlin.jvm.functions.Function2<? super java.lang.Integer, java.lang.Object, kotlin.Unit> block) {
        int slotsStartIndex$runtime = slotsStartIndex$runtime(groupIndex);
        int slotsEndIndex$runtime = slotsEndIndex$runtime(groupIndex);
        for (int max = java.lang.Math.max(slotsStartIndex$runtime, slotsEndIndex$runtime - count); max < slotsEndIndex$runtime; max++) {
            block.invoke(java.lang.Integer.valueOf(max), this.Camera2StreamConfigurationMap[getHighSpeedVideoFpsRanges(max)]);
        }
    }

    public final int slotsStartIndex$runtime(int groupIndex) {
        return getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, getOutputMinFrameDuration(groupIndex));
    }

    public final int slotsEndIndex$runtime(int groupIndex) {
        return Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, getOutputMinFrameDuration(groupIndex + 1));
    }

    public final int slotsEndAllIndex$runtime(int groupIndex) {
        return Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, getOutputMinFrameDuration(groupIndex + groupSize(groupIndex)));
    }

    private final int getHighSpeedVideoFpsRangesFor() {
        return groupSlotIndex(this.parent);
    }

    public final int groupSlotIndex(int group) {
        androidx.collection.MutableObjectList<java.lang.Object> mutableObjectList;
        int i = this.getHighSpeedVideoSizesFor;
        int slotsStartIndex$runtime = slotsStartIndex$runtime(group);
        androidx.collection.MutableIntObjectMap<androidx.collection.MutableObjectList<java.lang.Object>> mutableIntObjectMap = this.toString;
        return (i - slotsStartIndex$runtime) + ((mutableIntObjectMap == null || (mutableObjectList = mutableIntObjectMap.get(group)) == null) ? 0 : mutableObjectList.getSize());
    }

    public final void seek(androidx.compose.runtime.Anchor anchor) {
        advanceBy(anchor.toIndexFor(this) - this.currentGroup);
    }

    public final void skipToGroupEnd() {
        int i = this.currentGroupEnd;
        this.currentGroup = i;
        this.getHighSpeedVideoSizesFor = Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, getOutputMinFrameDuration(i));
    }

    public final void beginInsert() {
        int i = this.getOutputStallDurationlomOqCM;
        this.getOutputStallDurationlomOqCM = i + 1;
        if (i == 0) {
            getInputFormats();
        }
    }

    public final void endInsert() {
        if (this.getOutputStallDurationlomOqCM <= 0) {
            androidx.compose.runtime.PreconditionsKt.throwIllegalStateException("Unbalanced begin/end insert");
        }
        int i = this.getOutputStallDurationlomOqCM - 1;
        this.getOutputStallDurationlomOqCM = i;
        if (i == 0) {
            if (this.isOutputSupportedFor.tos != this.getOutputMinFrameDurationlomOqCM.tos) {
                androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("startGroup/endGroup mismatch while inserting");
            }
            Camera2StreamConfigurationMap();
        }
    }

    public final void startGroup() {
        if (this.getOutputStallDurationlomOqCM != 0) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Key must be supplied when inserting");
        }
        getHighResolutionOutputSizeshNQ4ISI(0, androidx.compose.runtime.Composer.INSTANCE.getEmpty(), false, androidx.compose.runtime.Composer.INSTANCE.getEmpty());
    }

    public final void startGroup(int key) {
        getHighResolutionOutputSizeshNQ4ISI(key, androidx.compose.runtime.Composer.INSTANCE.getEmpty(), false, androidx.compose.runtime.Composer.INSTANCE.getEmpty());
    }

    public final void startGroup(int key, java.lang.Object dataKey) {
        getHighResolutionOutputSizeshNQ4ISI(key, dataKey, false, androidx.compose.runtime.Composer.INSTANCE.getEmpty());
    }

    public final void startNode(int key, java.lang.Object objectKey) {
        getHighResolutionOutputSizeshNQ4ISI(key, objectKey, true, androidx.compose.runtime.Composer.INSTANCE.getEmpty());
    }

    public final void startNode(int key, java.lang.Object objectKey, java.lang.Object node) {
        getHighResolutionOutputSizeshNQ4ISI(key, objectKey, true, node);
    }

    public final void startData(int key, java.lang.Object objectKey, java.lang.Object aux) {
        getHighResolutionOutputSizeshNQ4ISI(key, objectKey, false, aux);
    }

    public final void startData(int key, java.lang.Object aux) {
        getHighResolutionOutputSizeshNQ4ISI(key, androidx.compose.runtime.Composer.INSTANCE.getEmpty(), false, aux);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void getHighResolutionOutputSizeshNQ4ISI(int p0, java.lang.Object p1, boolean p2, java.lang.Object p3) {
        int highSpeedVideoSizes;
        int i;
        androidx.compose.runtime.GroupSourceInformation sourceInformationOf$runtime;
        int i2 = this.parent;
        java.lang.Object[] objArr = this.getOutputStallDurationlomOqCM > 0;
        this.isOutputSupportedFor.push(this.getOutputStallDuration);
        if (objArr != false) {
            int i3 = this.currentGroup;
            int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, getOutputMinFrameDuration(i3));
            getInputFormats(1);
            this.getHighSpeedVideoSizesFor = Camera2StreamConfigurationMap;
            this.getInputSizeshNQ4ISI = Camera2StreamConfigurationMap;
            int outputMinFrameDuration = getOutputMinFrameDuration(i3);
            int i4 = p1 != androidx.compose.runtime.Composer.INSTANCE.getEmpty() ? 1 : 0;
            int i5 = (p2 || p3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) ? 0 : 1;
            int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap, this.getOutputMinFrameDuration, this.getOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap.length);
            if (highSpeedVideoFpsRanges >= 0 && this.getOutputSizes < i3) {
                highSpeedVideoFpsRanges = -(((this.Camera2StreamConfigurationMap.length - this.getOutputSizeshNQ4ISI) - highSpeedVideoFpsRanges) + 1);
            }
            androidx.compose.runtime.SlotTableKt.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, outputMinFrameDuration, p0, p2, i4, i5, this.parent, highSpeedVideoFpsRanges);
            int i6 = (p2 ? 1 : 0) + i4 + i5;
            if (i6 > 0) {
                getHighSpeedVideoSizes(i6, i3);
                java.lang.Object[] objArr2 = this.Camera2StreamConfigurationMap;
                int i7 = this.getHighSpeedVideoSizesFor;
                if (p2) {
                    objArr2[i7] = p3;
                    i7++;
                }
                if (i4 != 0) {
                    objArr2[i7] = p1;
                    i7++;
                }
                if (i5 != 0) {
                    objArr2[i7] = p3;
                    i7++;
                }
                this.getHighSpeedVideoSizesFor = i7;
            }
            this.getOutputStallDuration = 0;
            i = i3 + 1;
            this.parent = i3;
            this.currentGroup = i;
            if (i2 >= 0 && (sourceInformationOf$runtime = sourceInformationOf$runtime(i2)) != null) {
                sourceInformationOf$runtime.reportGroup(this, i3);
            }
        } else {
            this.getOutputMinFrameDurationlomOqCM.push(i2);
            getInputFormats();
            int i8 = this.currentGroup;
            int outputMinFrameDuration2 = getOutputMinFrameDuration(i8);
            if (!kotlin.jvm.internal.Intrinsics.areEqual(p3, androidx.compose.runtime.Composer.INSTANCE.getEmpty())) {
                if (p2) {
                    updateNode(p3);
                } else {
                    updateAux(p3);
                }
            }
            this.getHighSpeedVideoSizesFor = getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, outputMinFrameDuration2);
            this.getInputSizeshNQ4ISI = Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, getOutputMinFrameDuration(this.currentGroup + 1));
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            this.getOutputStallDuration = iArr[(outputMinFrameDuration2 * 5) + 1] & 67108863;
            this.parent = i8;
            this.currentGroup = i8 + 1;
            highSpeedVideoSizes = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoSizes(iArr, outputMinFrameDuration2);
            i = i8 + highSpeedVideoSizes;
        }
        this.currentGroupEnd = i;
    }

    public final int endGroup() {
        int highSpeedVideoSizes;
        int highSpeedVideoSizes2;
        androidx.collection.MutableObjectList<java.lang.Object> mutableObjectList;
        boolean z = this.getOutputStallDurationlomOqCM > 0;
        int i = this.currentGroup;
        int i2 = this.currentGroupEnd;
        int i3 = this.parent;
        int outputMinFrameDuration = getOutputMinFrameDuration(i3);
        int i4 = this.getOutputStallDuration;
        int i5 = i - i3;
        int i6 = (outputMinFrameDuration * 5) + 1;
        boolean z2 = (this.getHighSpeedVideoFpsRanges[i6] & 1073741824) != 0;
        if (!z) {
            if (i != i2) {
                androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Expected to be at the end of a group");
            }
            highSpeedVideoSizes = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, outputMinFrameDuration);
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            int i7 = iArr[i6] & 67108863;
            androidx.compose.runtime.SlotTableKt.getHighSpeedVideoSizes(iArr, outputMinFrameDuration, i5);
            androidx.compose.runtime.SlotTableKt.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, outputMinFrameDuration, i4);
            int pop = this.getOutputMinFrameDurationlomOqCM.pop();
            Camera2StreamConfigurationMap();
            this.parent = pop;
            int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, i3);
            int pop2 = this.isOutputSupportedFor.pop();
            this.getOutputStallDuration = pop2;
            if (highResolutionOutputSizeshNQ4ISI == pop) {
                this.getOutputStallDuration = pop2 + (z2 ? 0 : i4 - i7);
                return i4;
            }
            int i8 = i5 - highSpeedVideoSizes;
            int i9 = z2 ? 0 : i4 - i7;
            if (i8 != 0 || i9 != 0) {
                while (highResolutionOutputSizeshNQ4ISI != 0 && highResolutionOutputSizeshNQ4ISI != pop && (i9 != 0 || i8 != 0)) {
                    int outputMinFrameDuration2 = getOutputMinFrameDuration(highResolutionOutputSizeshNQ4ISI);
                    if (i8 != 0) {
                        highSpeedVideoSizes2 = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, outputMinFrameDuration2);
                        androidx.compose.runtime.SlotTableKt.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, outputMinFrameDuration2, highSpeedVideoSizes2 + i8);
                    }
                    if (i9 != 0) {
                        int[] iArr2 = this.getHighSpeedVideoFpsRanges;
                        androidx.compose.runtime.SlotTableKt.getHighResolutionOutputSizeshNQ4ISI(iArr2, outputMinFrameDuration2, (iArr2[(outputMinFrameDuration2 * 5) + 1] & 67108863) + i9);
                    }
                    int[] iArr3 = this.getHighSpeedVideoFpsRanges;
                    if ((iArr3[(outputMinFrameDuration2 * 5) + 1] & 1073741824) != 0) {
                        i9 = 0;
                    }
                    highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(iArr3, highResolutionOutputSizeshNQ4ISI);
                }
            }
            this.getOutputStallDuration += i9;
            return i4;
        }
        androidx.collection.MutableIntObjectMap<androidx.collection.MutableObjectList<java.lang.Object>> mutableIntObjectMap = this.toString;
        if (mutableIntObjectMap != null && (mutableObjectList = mutableIntObjectMap.get(i3)) != null) {
            androidx.collection.MutableObjectList<java.lang.Object> mutableObjectList2 = mutableObjectList;
            java.lang.Object[] objArr = mutableObjectList2.content;
            int i10 = mutableObjectList2._size;
            for (int i11 = 0; i11 < i10; i11++) {
                getHighSpeedVideoFpsRanges(objArr[i11]);
            }
            mutableIntObjectMap.remove(i3);
        }
        androidx.compose.runtime.SlotTableKt.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, outputMinFrameDuration, i5);
        androidx.compose.runtime.SlotTableKt.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, outputMinFrameDuration, i4);
        this.getOutputStallDuration = this.isOutputSupportedFor.pop() + (z2 ? 1 : i4);
        int highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, i3);
        this.parent = highResolutionOutputSizeshNQ4ISI2;
        int size$runtime = highResolutionOutputSizeshNQ4ISI2 < 0 ? getSize$runtime() : getOutputMinFrameDuration(highResolutionOutputSizeshNQ4ISI2 + 1);
        int Camera2StreamConfigurationMap = size$runtime >= 0 ? Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, size$runtime) : 0;
        this.getHighSpeedVideoSizesFor = Camera2StreamConfigurationMap;
        this.getInputSizeshNQ4ISI = Camera2StreamConfigurationMap;
        return i4;
    }

    public final void ensureStarted(int index) {
        if (this.getOutputStallDurationlomOqCM > 0) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Cannot call ensureStarted() while inserting");
        }
        int i = this.parent;
        if (i != index) {
            if (index < i || index >= this.currentGroupEnd) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Started group at ");
                sb.append(index);
                sb.append(" must be a subgroup of the group at ");
                sb.append(i);
                androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError(sb.toString());
            }
            int i2 = this.currentGroup;
            int i3 = this.getHighSpeedVideoSizesFor;
            int i4 = this.getInputSizeshNQ4ISI;
            this.currentGroup = index;
            startGroup();
            this.currentGroup = i2;
            this.getHighSpeedVideoSizesFor = i3;
            this.getInputSizeshNQ4ISI = i4;
        }
    }

    public final void ensureStarted(androidx.compose.runtime.Anchor anchor) {
        ensureStarted(anchor.toIndexFor(this));
    }

    public final int skipGroup() {
        int highSpeedVideoSizes;
        int outputMinFrameDuration = getOutputMinFrameDuration(this.currentGroup);
        int i = this.currentGroup;
        highSpeedVideoSizes = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, outputMinFrameDuration);
        int i2 = i + highSpeedVideoSizes;
        this.currentGroup = i2;
        this.getHighSpeedVideoSizesFor = Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, getOutputMinFrameDuration(i2));
        int i3 = this.getHighSpeedVideoFpsRanges[(outputMinFrameDuration * 5) + 1];
        if ((1073741824 & i3) != 0) {
            return 1;
        }
        return i3 & 67108863;
    }

    public final boolean removeGroup() {
        androidx.compose.runtime.Anchor tryAnchor$runtime;
        if (this.getOutputStallDurationlomOqCM != 0) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Cannot remove group while inserting");
        }
        int i = this.currentGroup;
        int i2 = this.getHighSpeedVideoSizesFor;
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, getOutputMinFrameDuration(i));
        int skipGroup = skipGroup();
        androidx.compose.runtime.GroupSourceInformation sourceInformationOf$runtime = sourceInformationOf$runtime(this.parent);
        if (sourceInformationOf$runtime != null && (tryAnchor$runtime = tryAnchor$runtime(i)) != null) {
            sourceInformationOf$runtime.removeAnchor(tryAnchor$runtime);
        }
        androidx.collection.MutableIntList mutableIntList = this.isOutputSupportedForhNQ4ISI;
        if (mutableIntList != null) {
            while (androidx.compose.runtime.PrioritySet.m5261isNotEmptyimpl(mutableIntList) && androidx.compose.runtime.PrioritySet.m5262peekimpl(mutableIntList) >= i) {
                androidx.compose.runtime.PrioritySet.m5263takeMaximpl(mutableIntList);
            }
        }
        boolean highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(i, this.currentGroup - i);
        Camera2StreamConfigurationMap(Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor - Camera2StreamConfigurationMap, i - 1);
        this.currentGroup = i;
        this.getHighSpeedVideoSizesFor = i2;
        this.getOutputStallDuration -= skipGroup;
        return highResolutionOutputSizeshNQ4ISI;
    }

    public final java.util.Iterator<java.lang.Object> groupSlots() {
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, getOutputMinFrameDuration(this.currentGroup));
        int[] iArr = this.getHighSpeedVideoFpsRanges;
        int i = this.currentGroup;
        return new androidx.compose.runtime.SlotWriter$groupSlots$1(Camera2StreamConfigurationMap, Camera2StreamConfigurationMap(iArr, getOutputMinFrameDuration(i + groupSize(i))), this);
    }

    public final void forAllData(int group, kotlin.jvm.functions.Function2<? super java.lang.Integer, java.lang.Object, kotlin.Unit> block) {
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, getOutputMinFrameDuration(getCurrentGroup() + groupSize(getCurrentGroup())));
        for (int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, getOutputMinFrameDuration(group)); Camera2StreamConfigurationMap2 < Camera2StreamConfigurationMap; Camera2StreamConfigurationMap2++) {
            block.invoke(java.lang.Integer.valueOf(Camera2StreamConfigurationMap2), this.Camera2StreamConfigurationMap[getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap2)]);
        }
    }

    public final void traverseGroupAndChildren(int group, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> enter, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> exit) {
        int parent = parent(group);
        int size$runtime = getSize$runtime();
        int groupSize = groupSize(group);
        int i = group;
        while (i < groupSize + group) {
            enter.invoke(java.lang.Integer.valueOf(i));
            int i2 = i + 1;
            int parent2 = i2 < size$runtime ? parent(i2) : -1;
            if (parent2 != i) {
                while (true) {
                    exit.invoke(java.lang.Integer.valueOf(i));
                    if (i != group && parent != parent2) {
                        i = parent;
                        parent = parent(parent);
                    }
                }
            }
            i = i2;
            parent = parent2;
        }
    }

    private final int getHighSpeedVideoFpsRangesFor(int p0, int p1) {
        int highSpeedVideoSizes;
        int groupSize = groupSize(p0) + p0;
        int i = p0 + 1;
        int i2 = 0;
        while (i < groupSize && i2 < p1) {
            int outputMinFrameDuration = getOutputMinFrameDuration(i);
            highSpeedVideoSizes = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, outputMinFrameDuration);
            i += highSpeedVideoSizes;
            if (i < groupSize && (this.getHighSpeedVideoFpsRanges[(outputMinFrameDuration * 5) + 1] & 536870912) == 0) {
                i2++;
            }
        }
        return i;
    }

    public final void moveGroup(int offset) {
        int highSpeedVideoSizes;
        int i;
        int highSpeedVideoSizes2;
        if (this.getOutputStallDurationlomOqCM != 0) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Cannot move a group while inserting");
        }
        if (offset < 0) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Parameter offset is out of bounds");
        }
        if (offset != 0) {
            int i2 = this.currentGroup;
            int i3 = this.parent;
            int i4 = this.currentGroupEnd;
            int i5 = i2;
            for (int i6 = offset; i6 > 0; i6--) {
                highSpeedVideoSizes2 = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, getOutputMinFrameDuration(i5));
                i5 += highSpeedVideoSizes2;
                if (i5 > i4) {
                    androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Parameter offset is out of bounds");
                }
            }
            highSpeedVideoSizes = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, getOutputMinFrameDuration(i5));
            int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, getOutputMinFrameDuration(this.currentGroup));
            int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, getOutputMinFrameDuration(i5));
            int i7 = i5 + highSpeedVideoSizes;
            int Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, getOutputMinFrameDuration(i7));
            int i8 = Camera2StreamConfigurationMap3 - Camera2StreamConfigurationMap2;
            int i9 = 0;
            getHighSpeedVideoSizes(i8, java.lang.Math.max(this.currentGroup - 1, 0));
            getInputFormats(highSpeedVideoSizes);
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            int outputMinFrameDuration = getOutputMinFrameDuration(i7) * 5;
            kotlin.collections.ArraysKt.copyInto(iArr, iArr, getOutputMinFrameDuration(i2) * 5, outputMinFrameDuration, (highSpeedVideoSizes * 5) + outputMinFrameDuration);
            if (i8 > 0) {
                java.lang.Object[] objArr = this.Camera2StreamConfigurationMap;
                int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap2 + i8);
                java.lang.System.arraycopy(objArr, highSpeedVideoFpsRanges, objArr, Camera2StreamConfigurationMap, getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap3 + i8) - highSpeedVideoFpsRanges);
            }
            int i10 = Camera2StreamConfigurationMap2 + i8;
            int i11 = i10 - Camera2StreamConfigurationMap;
            int i12 = this.getOutputMinFrameDuration;
            int i13 = this.getOutputSizeshNQ4ISI;
            int length = this.Camera2StreamConfigurationMap.length;
            int i14 = this.getOutputSizes;
            int i15 = i2;
            while (i15 < i2 + highSpeedVideoSizes) {
                int outputMinFrameDuration2 = getOutputMinFrameDuration(i15);
                int Camera2StreamConfigurationMap4 = Camera2StreamConfigurationMap(iArr, outputMinFrameDuration2);
                if (i14 < outputMinFrameDuration2) {
                    i = i12;
                } else {
                    i9 = i12;
                    i = i9;
                }
                Camera2StreamConfigurationMap(iArr, outputMinFrameDuration2, getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap4 - i11, i9, i13, length));
                i15++;
                i12 = i;
                i9 = 0;
            }
            getHighSpeedVideoFpsRanges(i7, i2, highSpeedVideoSizes);
            if (getHighResolutionOutputSizeshNQ4ISI(i7, highSpeedVideoSizes)) {
                androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Unexpectedly removed anchors");
            }
            getHighSpeedVideoFpsRangesFor(i3, this.currentGroupEnd, i2);
            if (i8 > 0) {
                Camera2StreamConfigurationMap(i10, i8, i7 - 1);
            }
        }
    }

    public final boolean inGroup(androidx.compose.runtime.Anchor groupAnchor, androidx.compose.runtime.Anchor anchor) {
        int highSpeedVideoSizes;
        int anchorIndex = anchorIndex(groupAnchor);
        highSpeedVideoSizes = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, anchorIndex);
        int location = anchor.getLocation();
        return anchorIndex <= location && location < highSpeedVideoSizes + anchorIndex;
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rH\u0002¨\u0006\u0010"}, d2 = {"Landroidx/compose/runtime/SlotWriter$Companion;", "", "<init>", "()V", "moveGroup", "", "Landroidx/compose/runtime/Anchor;", "fromWriter", "Landroidx/compose/runtime/SlotWriter;", "fromIndex", "", "toWriter", "updateFromCursor", "", "updateToCursor", "removeSourceGroup", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ java.util.List access$moveGroup(androidx.compose.runtime.SlotWriter.Companion companion, androidx.compose.runtime.SlotWriter slotWriter, int i, androidx.compose.runtime.SlotWriter slotWriter2, boolean z, boolean z2, boolean z3) {
            return getHighSpeedVideoSizes(slotWriter, i, slotWriter2, z, z2, z3);
        }

        static /* synthetic */ java.util.List getHighSpeedVideoFpsRanges(androidx.compose.runtime.SlotWriter slotWriter, int i, androidx.compose.runtime.SlotWriter slotWriter2, boolean z) {
            return getHighSpeedVideoSizes(slotWriter, i, slotWriter2, false, z, true);
        }

        private static java.util.List<androidx.compose.runtime.Anchor> getHighSpeedVideoSizes(androidx.compose.runtime.SlotWriter slotWriter, int i, androidx.compose.runtime.SlotWriter slotWriter2, boolean z, boolean z2, boolean z3) {
            int highSpeedVideoFpsRangesFor;
            int highSpeedVideoFpsRangesFor2;
            java.util.ArrayList emptyList;
            boolean z4;
            int highSpeedVideoSizes;
            int highSpeedVideoFpsRangesFor3;
            int groupSize = slotWriter.groupSize(i);
            int i2 = i + groupSize;
            int highSpeedVideoSizes2 = slotWriter.getHighSpeedVideoSizes(i);
            int highSpeedVideoSizes3 = slotWriter.getHighSpeedVideoSizes(i2);
            int i3 = highSpeedVideoSizes3 - highSpeedVideoSizes2;
            boolean highResolutionOutputSizeshNQ4ISI = slotWriter.getHighResolutionOutputSizeshNQ4ISI(i);
            slotWriter2.getInputFormats(groupSize);
            slotWriter2.getHighSpeedVideoSizes(i3, slotWriter2.getCurrentGroup());
            if (slotWriter.getInputFormats < i2) {
                slotWriter.getInputSizeshNQ4ISI(i2);
            }
            if (slotWriter.getOutputMinFrameDuration < highSpeedVideoSizes3) {
                slotWriter.Camera2StreamConfigurationMap(highSpeedVideoSizes3, i2);
            }
            int[] iArr = slotWriter2.getHighSpeedVideoFpsRanges;
            int currentGroup = slotWriter2.getCurrentGroup();
            int i4 = currentGroup * 5;
            kotlin.collections.ArraysKt.copyInto(slotWriter.getHighSpeedVideoFpsRanges, iArr, i4, i * 5, i2 * 5);
            java.lang.Object[] objArr = slotWriter2.Camera2StreamConfigurationMap;
            int i5 = slotWriter2.getHighSpeedVideoSizesFor;
            java.lang.System.arraycopy(slotWriter.Camera2StreamConfigurationMap, highSpeedVideoSizes2, objArr, i5, i3);
            int parent = slotWriter2.getParent();
            iArr[i4 + 2] = parent;
            int i6 = currentGroup - i;
            int i7 = currentGroup + groupSize;
            int Camera2StreamConfigurationMap = slotWriter2.Camera2StreamConfigurationMap(iArr, currentGroup);
            int i8 = slotWriter2.getOutputSizes;
            int i9 = slotWriter2.getOutputSizeshNQ4ISI;
            int length = objArr.length;
            int i10 = i8;
            int i11 = currentGroup;
            while (true) {
                if (i11 >= i7) {
                    break;
                }
                if (i11 != currentGroup) {
                    int i12 = (i11 * 5) + 2;
                    iArr[i12] = iArr[i12] + i6;
                }
                int i13 = currentGroup;
                int i14 = i5;
                iArr[(i11 * 5) + 4] = androidx.compose.runtime.SlotWriter.access$dataIndexToDataAnchor(slotWriter2, slotWriter2.Camera2StreamConfigurationMap(iArr, i11) + (i5 - Camera2StreamConfigurationMap), i10 >= i11 ? slotWriter2.getOutputMinFrameDuration : 0, i9, length);
                if (i11 == i10) {
                    i10++;
                }
                i11++;
                currentGroup = i13;
                i5 = i14;
            }
            int i15 = i5;
            slotWriter2.getOutputSizes = i10;
            highSpeedVideoFpsRangesFor = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoFpsRangesFor(slotWriter.getHighSpeedVideoSizes, i, slotWriter.getSize$runtime());
            highSpeedVideoFpsRangesFor2 = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoFpsRangesFor(slotWriter.getHighSpeedVideoSizes, i2, slotWriter.getSize$runtime());
            if (highSpeedVideoFpsRangesFor < highSpeedVideoFpsRangesFor2) {
                java.util.ArrayList arrayList = slotWriter.getHighSpeedVideoSizes;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(highSpeedVideoFpsRangesFor2 - highSpeedVideoFpsRangesFor);
                for (int i16 = highSpeedVideoFpsRangesFor; i16 < highSpeedVideoFpsRangesFor2; i16++) {
                    androidx.compose.runtime.Anchor anchor = (androidx.compose.runtime.Anchor) arrayList.get(i16);
                    anchor.setLocation$runtime(anchor.getLocation() + i6);
                    arrayList2.add(anchor);
                }
                highSpeedVideoFpsRangesFor3 = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoFpsRangesFor(slotWriter2.getHighSpeedVideoSizes, slotWriter2.getCurrentGroup(), slotWriter2.getSize$runtime());
                slotWriter2.getHighSpeedVideoSizes.addAll(highSpeedVideoFpsRangesFor3, arrayList2);
                arrayList.subList(highSpeedVideoFpsRangesFor, highSpeedVideoFpsRangesFor2).clear();
                emptyList = arrayList2;
            } else {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            java.util.List<androidx.compose.runtime.Anchor> list = emptyList;
            if (!list.isEmpty()) {
                java.util.HashMap hashMap = slotWriter.getHighSpeedVideoFpsRangesFor;
                java.util.HashMap hashMap2 = slotWriter2.getHighSpeedVideoFpsRangesFor;
                if (hashMap != null && hashMap2 != null) {
                    int size = list.size();
                    for (int i17 = 0; i17 < size; i17++) {
                        androidx.compose.runtime.Anchor anchor2 = emptyList.get(i17);
                        androidx.compose.runtime.GroupSourceInformation groupSourceInformation = (androidx.compose.runtime.GroupSourceInformation) hashMap.get(anchor2);
                        if (groupSourceInformation != null) {
                            hashMap.remove(anchor2);
                            hashMap2.put(anchor2, groupSourceInformation);
                        }
                    }
                }
            }
            int parent2 = slotWriter2.getParent();
            androidx.compose.runtime.GroupSourceInformation sourceInformationOf$runtime = slotWriter2.sourceInformationOf$runtime(parent);
            if (sourceInformationOf$runtime != null) {
                int i18 = parent2 + 1;
                int currentGroup2 = slotWriter2.getCurrentGroup();
                int i19 = -1;
                while (i18 < currentGroup2) {
                    highSpeedVideoSizes = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoSizes(slotWriter2.getHighSpeedVideoFpsRanges, i18);
                    int i20 = highSpeedVideoSizes + i18;
                    i19 = i18;
                    i18 = i20;
                }
                sourceInformationOf$runtime.addGroupAfter(slotWriter2, i19, currentGroup2);
            }
            int parent3 = slotWriter.parent(i);
            if (z3) {
                if (!z) {
                    boolean highResolutionOutputSizeshNQ4ISI2 = slotWriter.getHighResolutionOutputSizeshNQ4ISI(i, groupSize);
                    slotWriter.Camera2StreamConfigurationMap(highSpeedVideoSizes2, i3, i - 1);
                    z4 = highResolutionOutputSizeshNQ4ISI2;
                } else {
                    int i21 = parent3 >= 0 ? 1 : 0;
                    if (i21 != 0) {
                        slotWriter.startGroup();
                        slotWriter.advanceBy(parent3 - slotWriter.getCurrentGroup());
                        slotWriter.startGroup();
                    }
                    slotWriter.advanceBy(i - slotWriter.getCurrentGroup());
                    z4 = slotWriter.removeGroup();
                    if (i21 != 0) {
                        slotWriter.skipToGroupEnd();
                        slotWriter.endGroup();
                        slotWriter.skipToGroupEnd();
                        slotWriter.endGroup();
                    }
                }
                if (z4) {
                    androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Unexpectedly removed anchors");
                }
            }
            int i22 = slotWriter2.getOutputStallDuration;
            int i23 = iArr[i4 + 1];
            slotWriter2.getOutputStallDuration = i22 + ((1073741824 & i23) == 0 ? i23 & 67108863 : 1);
            if (z2) {
                slotWriter2.currentGroup = i7;
                slotWriter2.getHighSpeedVideoSizesFor = i15 + i3;
            }
            if (highResolutionOutputSizeshNQ4ISI) {
                slotWriter2.getOutputFormats(parent);
            }
            return emptyList;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.util.List<androidx.compose.runtime.Anchor> moveTo(androidx.compose.runtime.Anchor anchor, int offset, androidx.compose.runtime.SlotWriter writer) {
        int highSpeedVideoSizes;
        if (writer.getOutputStallDurationlomOqCM <= 0) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        if (this.getOutputStallDurationlomOqCM != 0) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        if (!anchor.getValid()) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        int anchorIndex = anchorIndex(anchor) + offset;
        int i = this.currentGroup;
        if (i > anchorIndex || anchorIndex >= this.currentGroupEnd) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        int parent = parent(anchorIndex);
        int groupSize = groupSize(anchorIndex);
        int nodeCount = isNode(anchorIndex) ? 1 : nodeCount(anchorIndex);
        java.util.List<androidx.compose.runtime.Anchor> highSpeedVideoFpsRanges = androidx.compose.runtime.SlotWriter.Companion.getHighSpeedVideoFpsRanges(this, anchorIndex, writer, false);
        getOutputFormats(parent);
        boolean z = nodeCount > 0;
        while (parent >= i) {
            int outputMinFrameDuration = getOutputMinFrameDuration(parent);
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            highSpeedVideoSizes = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoSizes(iArr, outputMinFrameDuration);
            androidx.compose.runtime.SlotTableKt.getHighSpeedVideoSizes(iArr, outputMinFrameDuration, highSpeedVideoSizes - groupSize);
            if (z) {
                int[] iArr2 = this.getHighSpeedVideoFpsRanges;
                int i2 = iArr2[(outputMinFrameDuration * 5) + 1];
                if ((1073741824 & i2) != 0) {
                    z = false;
                } else {
                    androidx.compose.runtime.SlotTableKt.getHighResolutionOutputSizeshNQ4ISI(iArr2, outputMinFrameDuration, (i2 & 67108863) - nodeCount);
                }
            }
            parent = parent(parent);
        }
        if (z) {
            if (this.getOutputStallDuration < nodeCount) {
                androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Check failed");
            }
            this.getOutputStallDuration -= nodeCount;
        }
        return highSpeedVideoFpsRanges;
    }

    public static /* synthetic */ java.util.List moveFrom$default(androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.SlotTable slotTable, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        return slotWriter.moveFrom(slotTable, i, z);
    }

    public final java.util.List<androidx.compose.runtime.Anchor> moveFrom(androidx.compose.runtime.SlotTable table, int index, boolean removeSourceGroup) {
        int highSpeedVideoSizes;
        if (this.getOutputStallDurationlomOqCM <= 0) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        if (index == 0 && this.currentGroup == 0 && this.table.getGroupsSize() == 0) {
            highSpeedVideoSizes = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoSizes(table.getGroups(), index);
            if (highSpeedVideoSizes == table.getGroupsSize()) {
                int[] iArr = this.getHighSpeedVideoFpsRanges;
                java.lang.Object[] objArr = this.Camera2StreamConfigurationMap;
                java.util.ArrayList<androidx.compose.runtime.Anchor> arrayList = this.getHighSpeedVideoSizes;
                java.util.HashMap<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> hashMap = this.getHighSpeedVideoFpsRangesFor;
                androidx.collection.MutableIntObjectMap<androidx.collection.MutableIntSet> mutableIntObjectMap = this.getHighResolutionOutputSizeshNQ4ISI;
                int[] groups = table.getGroups();
                int groupsSize = table.getGroupsSize();
                java.lang.Object[] slots = table.getSlots();
                int slotsSize = table.getSlotsSize();
                java.util.HashMap<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> sourceInformationMap$runtime = table.getSourceInformationMap$runtime();
                androidx.collection.MutableIntObjectMap<androidx.collection.MutableIntSet> calledByMap$runtime = table.getCalledByMap$runtime();
                this.getHighSpeedVideoFpsRanges = groups;
                this.Camera2StreamConfigurationMap = slots;
                this.getHighSpeedVideoSizes = table.getAnchors$runtime();
                this.getInputFormats = groupsSize;
                this.getOutputFormats = (groups.length / 5) - groupsSize;
                this.getOutputMinFrameDuration = slotsSize;
                this.getOutputSizeshNQ4ISI = slots.length - slotsSize;
                this.getOutputSizes = groupsSize;
                this.getHighSpeedVideoFpsRangesFor = sourceInformationMap$runtime;
                this.getHighResolutionOutputSizeshNQ4ISI = calledByMap$runtime;
                table.setTo$runtime(iArr, 0, objArr, 0, arrayList, hashMap, mutableIntObjectMap);
                return this.getHighSpeedVideoSizes;
            }
        }
        androidx.compose.runtime.SlotWriter openWriter = table.openWriter();
        try {
            java.util.List<androidx.compose.runtime.Anchor> access$moveGroup = androidx.compose.runtime.SlotWriter.Companion.access$moveGroup(INSTANCE, openWriter, index, this, true, true, removeSourceGroup);
            openWriter.close(true);
            return access$moveGroup;
        } catch (java.lang.Throwable th) {
            openWriter.close(false);
            throw th;
        }
    }

    public final void bashCurrentGroup() {
        androidx.compose.runtime.SlotTableKt.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, this.currentGroup, -3);
    }

    public final java.util.List<androidx.compose.runtime.Anchor> moveIntoGroupFrom(int offset, androidx.compose.runtime.SlotTable table, int index) {
        if (this.getOutputStallDurationlomOqCM > 0 || groupSize(this.currentGroup + offset) != 1) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        int i = this.currentGroup;
        int i2 = this.getHighSpeedVideoSizesFor;
        int i3 = this.getInputSizeshNQ4ISI;
        advanceBy(offset);
        startGroup();
        beginInsert();
        androidx.compose.runtime.SlotWriter openWriter = table.openWriter();
        try {
            java.util.List<androidx.compose.runtime.Anchor> highSpeedVideoFpsRanges = androidx.compose.runtime.SlotWriter.Companion.getHighSpeedVideoFpsRanges(openWriter, index, this, true);
            openWriter.close(true);
            endInsert();
            endGroup();
            this.currentGroup = i;
            this.getHighSpeedVideoSizesFor = i2;
            this.getInputSizeshNQ4ISI = i3;
            return highSpeedVideoFpsRanges;
        } catch (java.lang.Throwable th) {
            openWriter.close(false);
            throw th;
        }
    }

    public static /* synthetic */ androidx.compose.runtime.Anchor anchor$default(androidx.compose.runtime.SlotWriter slotWriter, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = slotWriter.currentGroup;
        }
        return slotWriter.anchor(i);
    }

    public final androidx.compose.runtime.Anchor anchor(int index) {
        int Camera2StreamConfigurationMap;
        java.util.ArrayList<androidx.compose.runtime.Anchor> arrayList = this.getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = androidx.compose.runtime.SlotTableKt.Camera2StreamConfigurationMap(arrayList, index, getSize$runtime());
        if (Camera2StreamConfigurationMap < 0) {
            if (index > this.getInputFormats) {
                index = -(getSize$runtime() - index);
            }
            androidx.compose.runtime.Anchor anchor = new androidx.compose.runtime.Anchor(index);
            arrayList.add(-(Camera2StreamConfigurationMap + 1), anchor);
            return anchor;
        }
        return arrayList.get(Camera2StreamConfigurationMap);
    }

    public static /* synthetic */ void markGroup$default(androidx.compose.runtime.SlotWriter slotWriter, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = slotWriter.parent;
        }
        slotWriter.markGroup(i);
    }

    public final void markGroup(int group) {
        int outputMinFrameDuration = getOutputMinFrameDuration(group);
        int[] iArr = this.getHighSpeedVideoFpsRanges;
        int i = (outputMinFrameDuration * 5) + 1;
        if ((iArr[i] & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0) {
            return;
        }
        androidx.compose.runtime.SlotTableKt.getHighResolutionOutputSizeshNQ4ISI(iArr, outputMinFrameDuration, true);
        if ((this.getHighSpeedVideoFpsRanges[i] & 67108864) != 0) {
            return;
        }
        getOutputFormats(parent(group));
    }

    private final boolean Camera2StreamConfigurationMap(int p0) {
        return p0 >= 0 && (this.getHighSpeedVideoFpsRanges[(getOutputMinFrameDuration(p0) * 5) + 1] & 67108864) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHighResolutionOutputSizeshNQ4ISI(int p0) {
        return p0 >= 0 && (this.getHighSpeedVideoFpsRanges[(getOutputMinFrameDuration(p0) * 5) + 1] & 201326592) != 0;
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        androidx.collection.MutableIntList mutableIntList = this.isOutputSupportedForhNQ4ISI;
        if (mutableIntList != null) {
            while (androidx.compose.runtime.PrioritySet.m5261isNotEmptyimpl(mutableIntList)) {
                getHighSpeedVideoSizes(androidx.compose.runtime.PrioritySet.m5263takeMaximpl(mutableIntList), mutableIntList);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getOutputFormats(int p0) {
        if (p0 >= 0) {
            androidx.collection.MutableIntList mutableIntList = this.isOutputSupportedForhNQ4ISI;
            if (mutableIntList == null) {
                mutableIntList = androidx.compose.runtime.PrioritySet.m5256constructorimpl$default(null, 1, null);
                this.isOutputSupportedForhNQ4ISI = mutableIntList;
            }
            androidx.compose.runtime.PrioritySet.m5253addimpl(mutableIntList, p0);
        }
    }

    private final void getHighSpeedVideoSizes(int p0, androidx.collection.MutableIntList p1) {
        int outputMinFrameDuration = getOutputMinFrameDuration(p0);
        boolean highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(p0);
        int[] iArr = this.getHighSpeedVideoFpsRanges;
        if (((iArr[(outputMinFrameDuration * 5) + 1] & 67108864) != 0) != highSpeedVideoFpsRangesFor) {
            androidx.compose.runtime.SlotTableKt.getHighSpeedVideoFpsRanges(iArr, outputMinFrameDuration, highSpeedVideoFpsRangesFor);
            int parent = parent(p0);
            if (parent >= 0) {
                androidx.compose.runtime.PrioritySet.m5253addimpl(p1, parent);
            }
        }
    }

    private final boolean getHighSpeedVideoFpsRangesFor(int p0) {
        int i = p0 + 1;
        int groupSize = groupSize(p0);
        while (i < p0 + groupSize) {
            if ((this.getHighSpeedVideoFpsRanges[(getOutputMinFrameDuration(i) * 5) + 1] & 201326592) != 0) {
                return true;
            }
            i += groupSize(i);
        }
        return false;
    }

    public final int anchorIndex(androidx.compose.runtime.Anchor anchor) {
        int location = anchor.getLocation();
        return location < 0 ? getSize$runtime() + location : location;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SlotWriter(current = ");
        sb.append(this.currentGroup);
        sb.append(" end=");
        sb.append(this.currentGroupEnd);
        sb.append(" size = ");
        sb.append(getSize$runtime());
        sb.append(" gap=");
        sb.append(this.getInputFormats);
        sb.append('-');
        sb.append(this.getInputFormats + this.getOutputFormats);
        sb.append(')');
        return sb.toString();
    }

    private final void getInputFormats() {
        this.getValidOutputFormatsForInputhNQ4ISI.push((getHighSpeedVideoFpsRanges() - this.getOutputFormats) - this.currentGroupEnd);
    }

    private final int Camera2StreamConfigurationMap() {
        int highSpeedVideoFpsRanges = (getHighSpeedVideoFpsRanges() - this.getOutputFormats) - this.getValidOutputFormatsForInputhNQ4ISI.pop();
        this.currentGroupEnd = highSpeedVideoFpsRanges;
        return highSpeedVideoFpsRanges;
    }

    private final void getHighSpeedVideoFpsRangesFor(int p0, int p1, int p2) {
        int highSpeedVideoSizes;
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(p0, this.getInputFormats);
        while (p2 < p1) {
            this.getHighSpeedVideoFpsRanges[(getOutputMinFrameDuration(p2) * 5) + 2] = highSpeedVideoFpsRanges;
            highSpeedVideoSizes = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, getOutputMinFrameDuration(p2));
            int i = highSpeedVideoSizes + p2;
            getHighSpeedVideoFpsRangesFor(p2, i, p2 + 1);
            p2 = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getInputSizeshNQ4ISI(int p0) {
        int i = this.getOutputFormats;
        int i2 = this.getInputFormats;
        if (i2 != p0) {
            if (!this.getHighSpeedVideoSizes.isEmpty()) {
                getInputSizeshNQ4ISI(i2, p0);
            }
            if (i > 0) {
                int[] iArr = this.getHighSpeedVideoFpsRanges;
                int i3 = p0 * 5;
                int i4 = i * 5;
                int i5 = i2 * 5;
                if (p0 < i2) {
                    kotlin.collections.ArraysKt.copyInto(iArr, iArr, i4 + i3, i3, i5);
                } else {
                    kotlin.collections.ArraysKt.copyInto(iArr, iArr, i5, i5 + i4, i3 + i4);
                }
            }
            if (p0 < i2) {
                i2 = p0 + i;
            }
            int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
            if (i2 >= highSpeedVideoFpsRanges) {
                androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Check failed");
            }
            while (i2 < highSpeedVideoFpsRanges) {
                int i6 = (i2 * 5) + 2;
                int i7 = this.getHighSpeedVideoFpsRanges[i6];
                int highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(getHighSpeedVideoSizesFor(i7), p0);
                if (highSpeedVideoFpsRanges2 != i7) {
                    this.getHighSpeedVideoFpsRanges[i6] = highSpeedVideoFpsRanges2;
                }
                i2++;
                if (i2 == p0) {
                    i2 += i;
                }
            }
        }
        this.getInputFormats = p0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Camera2StreamConfigurationMap(int p0, int p1) {
        int i = this.getOutputSizeshNQ4ISI;
        int i2 = this.getOutputMinFrameDuration;
        int i3 = this.getOutputSizes;
        if (i2 != p0) {
            java.lang.Object[] objArr = this.Camera2StreamConfigurationMap;
            if (p0 < i2) {
                java.lang.System.arraycopy(objArr, p0, objArr, p0 + i, i2 - p0);
            } else {
                int i4 = i2 + i;
                java.lang.System.arraycopy(objArr, i4, objArr, i2, (p0 + i) - i4);
            }
        }
        int min = java.lang.Math.min(p1 + 1, getSize$runtime());
        if (i3 != min) {
            int length = this.Camera2StreamConfigurationMap.length - i;
            if (min < i3) {
                int outputMinFrameDuration = getOutputMinFrameDuration(min);
                int outputMinFrameDuration2 = getOutputMinFrameDuration(i3);
                int i5 = this.getInputFormats;
                while (outputMinFrameDuration < outputMinFrameDuration2) {
                    int i6 = (outputMinFrameDuration * 5) + 4;
                    int i7 = this.getHighSpeedVideoFpsRanges[i6];
                    if (i7 < 0) {
                        androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Unexpected anchor value, expected a positive anchor");
                    }
                    this.getHighSpeedVideoFpsRanges[i6] = -((length - i7) + 1);
                    outputMinFrameDuration++;
                    if (outputMinFrameDuration == i5) {
                        outputMinFrameDuration += this.getOutputFormats;
                    }
                }
            } else {
                int outputMinFrameDuration3 = getOutputMinFrameDuration(i3);
                int outputMinFrameDuration4 = getOutputMinFrameDuration(min);
                while (outputMinFrameDuration3 < outputMinFrameDuration4) {
                    int i8 = (outputMinFrameDuration3 * 5) + 4;
                    int i9 = this.getHighSpeedVideoFpsRanges[i8];
                    if (i9 >= 0) {
                        androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Unexpected anchor value, expected a negative anchor");
                    }
                    this.getHighSpeedVideoFpsRanges[i8] = i9 + length + 1;
                    outputMinFrameDuration3++;
                    if (outputMinFrameDuration3 == this.getInputFormats) {
                        outputMinFrameDuration3 += this.getOutputFormats;
                    }
                }
            }
            this.getOutputSizes = min;
        }
        this.getOutputMinFrameDuration = p0;
    }

    private final void getHighSpeedVideoSizes() {
        int i = this.getOutputMinFrameDuration;
        kotlin.collections.ArraysKt.fill(this.Camera2StreamConfigurationMap, (java.lang.Object) null, i, this.getOutputSizeshNQ4ISI + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getInputFormats(int p0) {
        if (p0 > 0) {
            int i = this.currentGroup;
            getInputSizeshNQ4ISI(i);
            int i2 = this.getInputFormats;
            int i3 = this.getOutputFormats;
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            int length = iArr.length / 5;
            int i4 = length - i3;
            if (i3 < p0) {
                int max = java.lang.Math.max(java.lang.Math.max(length * 2, i4 + p0), 32);
                int[] iArr2 = new int[max * 5];
                int i5 = max - i4;
                kotlin.collections.ArraysKt.copyInto(iArr, iArr2, 0, 0, i2 * 5);
                kotlin.collections.ArraysKt.copyInto(iArr, iArr2, (i2 + i5) * 5, (i3 + i2) * 5, length * 5);
                this.getHighSpeedVideoFpsRanges = iArr2;
                i3 = i5;
            }
            int i6 = this.currentGroupEnd;
            if (i6 >= i2) {
                this.currentGroupEnd = i6 + p0;
            }
            int i7 = i2 + p0;
            this.getInputFormats = i7;
            this.getOutputFormats = i3 - p0;
            int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(i4 > 0 ? getHighSpeedVideoSizes(i + p0) : 0, this.getOutputSizes >= i2 ? this.getOutputMinFrameDuration : 0, this.getOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap.length);
            for (int i8 = i2; i8 < i7; i8++) {
                this.getHighSpeedVideoFpsRanges[(i8 * 5) + 4] = highSpeedVideoFpsRanges;
            }
            int i9 = this.getOutputSizes;
            if (i9 >= i2) {
                this.getOutputSizes = i9 + p0;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoSizes(int p0, int p1) {
        if (p0 > 0) {
            Camera2StreamConfigurationMap(this.getHighSpeedVideoSizesFor, p1);
            int i = this.getOutputMinFrameDuration;
            int i2 = this.getOutputSizeshNQ4ISI;
            if (i2 < p0) {
                java.lang.Object[] objArr = this.Camera2StreamConfigurationMap;
                int length = objArr.length;
                int i3 = length - i2;
                int max = java.lang.Math.max(java.lang.Math.max(length * 2, i3 + p0), 32);
                java.lang.Object[] objArr2 = new java.lang.Object[max];
                for (int i4 = 0; i4 < max; i4++) {
                    objArr2[i4] = null;
                }
                int i5 = max - i3;
                int i6 = i2 + i;
                java.lang.System.arraycopy(objArr, 0, objArr2, 0, i);
                java.lang.System.arraycopy(objArr, i6, objArr2, i + i5, length - i6);
                this.Camera2StreamConfigurationMap = objArr2;
                i2 = i5;
            }
            int i7 = this.getInputSizeshNQ4ISI;
            if (i7 >= i) {
                this.getInputSizeshNQ4ISI = i7 + p0;
            }
            this.getOutputMinFrameDuration = i + p0;
            this.getOutputSizeshNQ4ISI = i2 - p0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHighResolutionOutputSizeshNQ4ISI(int p0, int p1) {
        if (p1 > 0) {
            java.util.ArrayList<androidx.compose.runtime.Anchor> arrayList = this.getHighSpeedVideoSizes;
            getInputSizeshNQ4ISI(p0);
            r0 = arrayList.isEmpty() ? false : getHighResolutionOutputSizeshNQ4ISI(p0, p1, this.getHighSpeedVideoFpsRangesFor);
            this.getInputFormats = p0;
            this.getOutputFormats += p1;
            int i = this.getOutputSizes;
            if (i > p0) {
                this.getOutputSizes = java.lang.Math.max(p0, i - p1);
            }
            int i2 = this.currentGroupEnd;
            if (i2 >= this.getInputFormats) {
                this.currentGroupEnd = i2 - p1;
            }
            int i3 = this.parent;
            if (Camera2StreamConfigurationMap(i3)) {
                getOutputFormats(i3);
            }
        }
        return r0;
    }

    public final androidx.compose.runtime.GroupSourceInformation sourceInformationOf$runtime(int group) {
        androidx.compose.runtime.Anchor tryAnchor$runtime;
        java.util.HashMap<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> hashMap = this.getHighSpeedVideoFpsRangesFor;
        if (hashMap == null || (tryAnchor$runtime = tryAnchor$runtime(group)) == null) {
            return null;
        }
        return hashMap.get(tryAnchor$runtime);
    }

    public final androidx.compose.runtime.Anchor tryAnchor$runtime(int group) {
        androidx.compose.runtime.Anchor highSpeedVideoSizes;
        if (group < 0 || group >= getSize$runtime()) {
            return null;
        }
        highSpeedVideoSizes = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoSizes((java.util.ArrayList<androidx.compose.runtime.Anchor>) this.getHighSpeedVideoSizes, group, getSize$runtime());
        return highSpeedVideoSizes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Camera2StreamConfigurationMap(int p0, int p1, int p2) {
        if (p1 > 0) {
            int i = this.getOutputSizeshNQ4ISI;
            int i2 = p0 + p1;
            Camera2StreamConfigurationMap(i2, p2);
            this.getOutputMinFrameDuration = p0;
            this.getOutputSizeshNQ4ISI = i + p1;
            kotlin.collections.ArraysKt.fill(this.Camera2StreamConfigurationMap, (java.lang.Object) null, p0, i2);
            int i3 = this.getInputSizeshNQ4ISI;
            if (i3 >= p0) {
                this.getInputSizeshNQ4ISI = i3 - p1;
            }
        }
    }

    private final void Camera2StreamConfigurationMap(int p0, java.lang.Object p1) {
        int outputMinFrameDuration = getOutputMinFrameDuration(p0);
        int[] iArr = this.getHighSpeedVideoFpsRanges;
        if (outputMinFrameDuration >= iArr.length || (iArr[(outputMinFrameDuration * 5) + 1] & 1073741824) == 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Updating the node of a group at ");
            sb.append(p0);
            sb.append(" that was not created with as a node group");
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError(sb.toString());
        }
        this.Camera2StreamConfigurationMap[getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, outputMinFrameDuration))] = p1;
    }

    private final void getInputSizeshNQ4ISI(int p0, int p1) {
        int highSpeedVideoFpsRangesFor;
        androidx.compose.runtime.Anchor anchor;
        int location;
        int highSpeedVideoFpsRangesFor2;
        androidx.compose.runtime.Anchor anchor2;
        int location2;
        int i;
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges() - this.getOutputFormats;
        if (p0 < p1) {
            for (highSpeedVideoFpsRangesFor2 = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, p0, highSpeedVideoFpsRanges); highSpeedVideoFpsRangesFor2 < this.getHighSpeedVideoSizes.size() && (location2 = (anchor2 = this.getHighSpeedVideoSizes.get(highSpeedVideoFpsRangesFor2)).getLocation()) < 0 && (i = location2 + highSpeedVideoFpsRanges) < p1; highSpeedVideoFpsRangesFor2++) {
                anchor2.setLocation$runtime(i);
            }
            return;
        }
        for (highSpeedVideoFpsRangesFor = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, p1, highSpeedVideoFpsRanges); highSpeedVideoFpsRangesFor < this.getHighSpeedVideoSizes.size() && (location = (anchor = this.getHighSpeedVideoSizes.get(highSpeedVideoFpsRangesFor)).getLocation()) >= 0; highSpeedVideoFpsRangesFor++) {
            anchor.setLocation$runtime(-(highSpeedVideoFpsRanges - location));
        }
    }

    private final boolean getHighResolutionOutputSizeshNQ4ISI(int p0, int p1, java.util.HashMap<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> p2) {
        int highSpeedVideoFpsRangesFor;
        int i = p1 + p0;
        highSpeedVideoFpsRangesFor = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, i, getHighSpeedVideoFpsRanges() - this.getOutputFormats);
        if (highSpeedVideoFpsRangesFor >= this.getHighSpeedVideoSizes.size()) {
            highSpeedVideoFpsRangesFor--;
        }
        int i2 = highSpeedVideoFpsRangesFor + 1;
        int i3 = 0;
        while (highSpeedVideoFpsRangesFor >= 0) {
            androidx.compose.runtime.Anchor anchor = this.getHighSpeedVideoSizes.get(highSpeedVideoFpsRangesFor);
            int anchorIndex = anchorIndex(anchor);
            if (anchorIndex < p0) {
                break;
            }
            if (anchorIndex < i) {
                anchor.setLocation$runtime(Integer.MIN_VALUE);
                if (p2 != null) {
                    p2.remove(anchor);
                }
                if (i3 == 0) {
                    i3 = highSpeedVideoFpsRangesFor + 1;
                }
                i2 = highSpeedVideoFpsRangesFor;
            }
            highSpeedVideoFpsRangesFor--;
        }
        boolean z = i2 < i3;
        if (z) {
            this.getHighSpeedVideoSizes.subList(i2, i3).clear();
        }
        return z;
    }

    private final void getHighSpeedVideoFpsRanges(int p0, int p1, int p2) {
        int highSpeedVideoFpsRangesFor;
        int highSpeedVideoFpsRangesFor2;
        androidx.compose.runtime.Anchor anchor;
        int anchorIndex;
        int size$runtime = getSize$runtime();
        highSpeedVideoFpsRangesFor = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, p0, size$runtime);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (highSpeedVideoFpsRangesFor >= 0) {
            while (highSpeedVideoFpsRangesFor < this.getHighSpeedVideoSizes.size() && (anchorIndex = anchorIndex((anchor = this.getHighSpeedVideoSizes.get(highSpeedVideoFpsRangesFor)))) >= p0 && anchorIndex < p2 + p0) {
                arrayList.add(anchor);
                this.getHighSpeedVideoSizes.remove(highSpeedVideoFpsRangesFor);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.runtime.Anchor anchor2 = (androidx.compose.runtime.Anchor) arrayList.get(i);
            int anchorIndex2 = anchorIndex(anchor2) + (p1 - p0);
            if (anchorIndex2 >= this.getInputFormats) {
                anchor2.setLocation$runtime(-(size$runtime - anchorIndex2));
            } else {
                anchor2.setLocation$runtime(anchorIndex2);
            }
            highSpeedVideoFpsRangesFor2 = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, anchorIndex2, size$runtime);
            this.getHighSpeedVideoSizes.add(highSpeedVideoFpsRangesFor2, anchor2);
        }
    }

    public final java.lang.String toDebugString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(toString());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append('\n');
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("  parent:    ");
        sb2.append(this.parent);
        sb.append(sb2.toString());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append('\n');
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("  current:   ");
        sb3.append(this.currentGroup);
        sb.append(sb3.toString());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append('\n');
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("  group gap: ");
        sb4.append(this.getInputFormats);
        sb4.append('-');
        sb4.append(this.getInputFormats + this.getOutputFormats);
        sb4.append('(');
        sb4.append(this.getOutputFormats);
        sb4.append(')');
        sb.append(sb4.toString());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append('\n');
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("  slots gap: ");
        sb5.append(this.getOutputMinFrameDuration);
        sb5.append('-');
        sb5.append(this.getOutputMinFrameDuration + this.getOutputSizeshNQ4ISI);
        sb5.append('(');
        sb5.append(this.getOutputSizeshNQ4ISI);
        sb5.append(')');
        sb.append(sb5.toString());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append('\n');
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("  gap owner: ");
        sb6.append(this.getOutputSizes);
        sb.append(sb6.toString());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append('\n');
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
        int size$runtime = getSize$runtime();
        for (int i = 0; i < size$runtime; i++) {
            getHighSpeedVideoFpsRangesFor(sb, i);
            sb.append('\n');
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    private final void getHighSpeedVideoFpsRangesFor(java.lang.StringBuilder sb, int i) {
        int highSpeedVideoSizes;
        java.lang.String Camera2StreamConfigurationMap;
        java.lang.String Camera2StreamConfigurationMap2;
        int outputMinFrameDuration = getOutputMinFrameDuration(i);
        sb.append("Group(");
        if (i < 10) {
            sb.append(' ');
        }
        if (i < 100) {
            sb.append(' ');
        }
        if (i < 1000) {
            sb.append(' ');
        }
        sb.append(i);
        if (outputMinFrameDuration != i) {
            sb.append("(");
            sb.append(outputMinFrameDuration);
            sb.append(")");
        }
        sb.append('#');
        highSpeedVideoSizes = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, outputMinFrameDuration);
        sb.append(highSpeedVideoSizes);
        sb.append(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.ObscuredMaskString);
        int i2 = outputMinFrameDuration * 5;
        int i3 = i2 + 2;
        sb.append(getHighSpeedVideoSizesFor(this.getHighSpeedVideoFpsRanges[i3]));
        sb.append(": key=");
        sb.append(this.getHighSpeedVideoFpsRanges[i2]);
        sb.append(", nodes=");
        int i4 = i2 + 1;
        sb.append(this.getHighSpeedVideoFpsRanges[i4] & 67108863);
        sb.append(", dataAnchor=");
        sb.append(this.getHighSpeedVideoFpsRanges[i2 + 4]);
        sb.append(", parentAnchor=");
        sb.append(this.getHighSpeedVideoFpsRanges[i3]);
        if ((this.getHighSpeedVideoFpsRanges[i4] & 1073741824) != 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(", node=");
            Camera2StreamConfigurationMap2 = androidx.compose.runtime.SlotTableKt.Camera2StreamConfigurationMap(java.lang.String.valueOf(this.Camera2StreamConfigurationMap[getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, outputMinFrameDuration))]), 10);
            sb2.append(Camera2StreamConfigurationMap2);
            sb.append(sb2.toString());
        }
        int highSpeedVideoSizes2 = getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, outputMinFrameDuration);
        int Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, getOutputMinFrameDuration(i + 1));
        if (Camera2StreamConfigurationMap3 > highSpeedVideoSizes2) {
            sb.append(", [");
            for (int i5 = highSpeedVideoSizes2; i5 < Camera2StreamConfigurationMap3; i5++) {
                if (i5 != highSpeedVideoSizes2) {
                    sb.append(", ");
                }
                Camera2StreamConfigurationMap = androidx.compose.runtime.SlotTableKt.Camera2StreamConfigurationMap(java.lang.String.valueOf(this.Camera2StreamConfigurationMap[getHighSpeedVideoFpsRanges(i5)]), 10);
                sb.append(Camera2StreamConfigurationMap);
            }
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        }
        sb.append(")");
    }

    public final void verifyDataAnchors$runtime() {
        int i = this.getOutputSizes;
        int length = this.Camera2StreamConfigurationMap.length;
        int i2 = this.getOutputSizeshNQ4ISI;
        int size$runtime = getSize$runtime();
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        while (i3 < size$runtime) {
            int outputMinFrameDuration = getOutputMinFrameDuration(i3);
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            int i5 = iArr[(outputMinFrameDuration * 5) + 4];
            int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(iArr, outputMinFrameDuration);
            if (Camera2StreamConfigurationMap < i4) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Data index out of order at ");
                sb.append(i3);
                sb.append(", previous = ");
                sb.append(i4);
                sb.append(", current = ");
                sb.append(Camera2StreamConfigurationMap);
                androidx.compose.runtime.PreconditionsKt.throwIllegalStateException(sb.toString());
            }
            if (Camera2StreamConfigurationMap > length - i2) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Data index, ");
                sb2.append(Camera2StreamConfigurationMap);
                sb2.append(", out of bound at ");
                sb2.append(i3);
                androidx.compose.runtime.PreconditionsKt.throwIllegalStateException(sb2.toString());
            }
            if (i5 < 0 && !z) {
                if (i != i3) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Expected the slot gap owner to be ");
                    sb3.append(i);
                    sb3.append(" found gap at ");
                    sb3.append(i3);
                    androidx.compose.runtime.PreconditionsKt.throwIllegalStateException(sb3.toString());
                }
                z = true;
            }
            i3++;
            i4 = Camera2StreamConfigurationMap;
        }
    }

    public final void verifyParentAnchors$runtime() {
        int i = this.getInputFormats;
        int i2 = this.getOutputFormats;
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        for (int i3 = 0; i3 < i; i3++) {
            if (this.getHighSpeedVideoFpsRanges[(i3 * 5) + 2] <= -2) {
                androidx.compose.runtime.PreconditionsKt.throwIllegalStateException("Expected a start relative anchor at ".concat(java.lang.String.valueOf(i3)));
            }
        }
        for (int i4 = i2 + i; i4 < highSpeedVideoFpsRanges; i4++) {
            int i5 = this.getHighSpeedVideoFpsRanges[(i4 * 5) + 2];
            if (getHighSpeedVideoSizesFor(i5) < i) {
                if (i5 <= -2) {
                    androidx.compose.runtime.PreconditionsKt.throwIllegalStateException("Expected a start relative anchor at ".concat(java.lang.String.valueOf(i4)));
                }
            } else if (i5 > -2) {
                androidx.compose.runtime.PreconditionsKt.throwIllegalStateException("Expected an end relative anchor at ".concat(java.lang.String.valueOf(i4)));
            }
        }
    }

    public final int getSize$runtime() {
        return getHighSpeedVideoFpsRanges() - this.getOutputFormats;
    }

    private final int getHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges.length / 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getOutputMinFrameDuration(int p0) {
        return p0 + (this.getOutputFormats * (p0 < this.getInputFormats ? 0 : 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getHighSpeedVideoFpsRanges(int p0) {
        return p0 + (this.getOutputSizeshNQ4ISI * (p0 < this.getOutputMinFrameDuration ? 0 : 1));
    }

    private final int getHighResolutionOutputSizeshNQ4ISI(int[] iArr, int i) {
        return getHighSpeedVideoSizesFor(iArr[(getOutputMinFrameDuration(i) * 5) + 2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getHighSpeedVideoSizes(int p0) {
        return Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, getOutputMinFrameDuration(p0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Camera2StreamConfigurationMap(int[] iArr, int i) {
        return i >= getHighSpeedVideoFpsRanges() ? this.Camera2StreamConfigurationMap.length - this.getOutputSizeshNQ4ISI : getHighSpeedVideoSizes(iArr[(i * 5) + 4], this.getOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap.length);
    }

    private final int getHighSpeedVideoSizes(int[] iArr, int i) {
        int outputFormats;
        if (i >= getHighSpeedVideoFpsRanges()) {
            return this.Camera2StreamConfigurationMap.length - this.getOutputSizeshNQ4ISI;
        }
        outputFormats = androidx.compose.runtime.SlotTableKt.getOutputFormats(iArr, i);
        return getHighSpeedVideoSizes(outputFormats, this.getOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap.length);
    }

    private final void Camera2StreamConfigurationMap(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 4] = getHighSpeedVideoFpsRanges(i2, this.getOutputMinFrameDuration, this.getOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap.length);
    }

    private final int getHighSpeedVideoFpsRanges(int[] iArr, int i) {
        return Camera2StreamConfigurationMap(iArr, i);
    }

    private final int getHighSpeedVideoFpsRangesFor(int[] iArr, int i) {
        return Camera2StreamConfigurationMap(iArr, i) + java.lang.Integer.bitCount(iArr[(i * 5) + 1] >> 29);
    }

    private final int getHighSpeedVideoFpsRanges(int p0, int p1) {
        return p0 < p1 ? p0 : -((getSize$runtime() - p0) + 2);
    }

    private final int getHighSpeedVideoSizesFor(int p0) {
        return p0 > -2 ? p0 : getSize$runtime() + p0 + 2;
    }

    public final void trimTailSlots(int count) {
        if (count <= 0) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        int i = this.parent;
        int highSpeedVideoSizes = getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, getOutputMinFrameDuration(i));
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, getOutputMinFrameDuration(i + 1)) - count;
        if (Camera2StreamConfigurationMap < highSpeedVideoSizes) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        Camera2StreamConfigurationMap(Camera2StreamConfigurationMap, count, i);
        int i2 = this.getHighSpeedVideoSizesFor;
        if (i2 >= highSpeedVideoSizes) {
            this.getHighSpeedVideoSizesFor = i2 - count;
        }
    }

    public final void advanceBy(int amount) {
        if (amount < 0) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Cannot seek backwards");
        }
        if (this.getOutputStallDurationlomOqCM > 0) {
            androidx.compose.runtime.PreconditionsKt.throwIllegalStateException("Cannot call seek() while inserting");
        }
        if (amount == 0) {
            return;
        }
        int i = this.currentGroup + amount;
        if (i < this.parent || i > this.currentGroupEnd) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot seek outside the current group (");
            sb.append(this.parent);
            sb.append('-');
            sb.append(this.currentGroupEnd);
            sb.append(')');
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError(sb.toString());
        }
        this.currentGroup = i;
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, getOutputMinFrameDuration(i));
        this.getHighSpeedVideoSizesFor = Camera2StreamConfigurationMap;
        this.getInputSizeshNQ4ISI = Camera2StreamConfigurationMap;
    }

    public final void forAllDataInRememberOrder(int group, kotlin.jvm.functions.Function2<? super java.lang.Integer, java.lang.Object, kotlin.Unit> block) {
        int i;
        int i2;
        int afterGroupIndex;
        int parent = parent(group);
        int size$runtime = getSize$runtime();
        int groupSize = groupSize(group);
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        int i3 = group;
        androidx.collection.MutableIntList mutableIntList = null;
        androidx.collection.MutableIntSet mutableIntSet = null;
        while (i3 < groupSize + group) {
            int highSpeedVideoSizes = getHighSpeedVideoSizes(i3);
            int i4 = i3 + 1;
            int highSpeedVideoSizes2 = getHighSpeedVideoSizes(i4);
            while (true) {
                i = 0;
                if (highSpeedVideoSizes >= highSpeedVideoSizes2) {
                    break;
                }
                java.lang.Object obj = this.Camera2StreamConfigurationMap[getHighSpeedVideoFpsRanges(highSpeedVideoSizes)];
                if ((obj instanceof androidx.compose.runtime.RememberObserverHolder) && (afterGroupIndex = ((androidx.compose.runtime.RememberObserverHolder) obj).getAfterGroupIndex()) >= 0) {
                    int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(i3, afterGroupIndex);
                    if (mutableIntSet == null) {
                        mutableIntSet = androidx.collection.IntSetKt.mutableIntSetOf();
                    }
                    if (mutableIntList == null) {
                        mutableIntList = new androidx.collection.MutableIntList(i, 1, defaultConstructorMarker);
                    }
                    mutableIntSet.add(highSpeedVideoFpsRangesFor);
                    mutableIntList.add(highSpeedVideoFpsRangesFor);
                    mutableIntList.add(highSpeedVideoSizes);
                } else {
                    block.invoke(java.lang.Integer.valueOf(highSpeedVideoSizes), obj);
                }
                highSpeedVideoSizes++;
            }
            int parent2 = i4 < size$runtime ? parent(i4) : -1;
            if (parent2 != i3) {
                while (true) {
                    if (mutableIntList == null || mutableIntSet == null || !mutableIntSet.remove(i3)) {
                        i2 = size$runtime;
                    } else {
                        int i5 = mutableIntList._size;
                        int i6 = i5 / 2;
                        int i7 = i;
                        int i8 = i7;
                        while (i8 < i6) {
                            int i9 = i8 * 2;
                            int i10 = size$runtime;
                            int i11 = mutableIntList.get(i9);
                            if (i11 == i3) {
                                int i12 = mutableIntList.get(i9 + 1);
                                block.invoke(java.lang.Integer.valueOf(i12), this.Camera2StreamConfigurationMap[getHighSpeedVideoFpsRanges(i12)]);
                            } else if (i9 != i7) {
                                mutableIntList.set(i7, i11);
                                mutableIntList.set(i7 + 1, mutableIntList.get(i9 + 1));
                                i7 += 2;
                            } else {
                                i7 += 2;
                            }
                            i8++;
                            size$runtime = i10;
                        }
                        i2 = size$runtime;
                        if (i7 != i5) {
                            mutableIntList.removeRange(i7, i5);
                        }
                    }
                    if (i3 != group && parent != parent2) {
                        i3 = parent;
                        parent = parent(parent);
                        size$runtime = i2;
                        i = 0;
                    }
                }
            } else {
                i2 = size$runtime;
            }
            parent = parent2;
            i3 = i4;
            size$runtime = i2;
            defaultConstructorMarker = null;
        }
    }
}
