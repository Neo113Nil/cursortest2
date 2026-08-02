package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000Þ\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 û\u00012\u00020\u0001:\u0002û\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001cJ\u0015\u0010 \u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010!J\u0015\u0010#\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b#\u0010!J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b)\u0010*J)\u0010,\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020(2\u0006\u0010'\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b.\u0010*J\u000f\u0010/\u001a\u00020\u0004H\u0002¢\u0006\u0004\b/\u00100J!\u00105\u001a\u0002042\u0006\u00101\u001a\u00020\u00042\n\b\u0002\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0004H\u0007¢\u0006\u0004\b7\u00100J\u000f\u00108\u001a\u00020\u0004H\u0007¢\u0006\u0004\b8\u00100J\r\u0010:\u001a\u000209¢\u0006\u0004\b:\u0010;J\u000f\u0010=\u001a\u00020<H\u0000¢\u0006\u0004\b=\u0010>J8\u0010F\u001a\u0004\u0018\u00010E2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020\u00042\n\b\u0002\u0010C\u001a\u0004\u0018\u00010B2\b\b\u0002\u00103\u001a\u00020DH\u0086@¢\u0006\u0004\bF\u0010GJ?\u0010J\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020\u00042\n\b\u0002\u0010C\u001a\u0004\u0018\u00010B2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010H2\b\b\u0002\u00103\u001a\u00020D¢\u0006\u0004\bJ\u0010KJ\r\u0010L\u001a\u00020\u0006¢\u0006\u0004\bL\u0010MJ)\u0010S\u001a\u00020\u000b2\u0006\u0010N\u001a\u00020\u00062\u0006\u0010P\u001a\u00020O2\b\u0010R\u001a\u0004\u0018\u00010QH\u0002¢\u0006\u0004\bS\u0010TJ'\u0010X\u001a\u00020\u000b2\u0006\u0010P\u001a\u00020O2\u000e\u0010W\u001a\n\u0018\u00010Uj\u0004\u0018\u0001`VH\u0002¢\u0006\u0004\bX\u0010YJ5\u0010`\u001a\u00020\u000b2\u0006\u0010Z\u001a\u00020\u00042\b\u0010\\\u001a\u0004\u0018\u00010[2\u0014\u0010_\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020^\u0018\u00010]¢\u0006\u0004\b`\u0010aJ9\u0010b\u001a\u00020\u000b2\u0006\u0010Z\u001a\u00020\u00042\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010[2\u0016\b\u0002\u0010_\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010]¢\u0006\u0004\bb\u0010aJ3\u0010`\u001a\u00020\u000b2\u0006\u0010Z\u001a\u00020\u00042\u0006\u0010\\\u001a\u00020\u00042\u0014\u0010_\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020^\u0018\u00010]¢\u0006\u0004\b`\u0010cJ5\u0010b\u001a\u00020\u000b2\u0006\u0010Z\u001a\u00020\u00042\u0006\u0010\\\u001a\u00020\u00042\u0016\b\u0002\u0010_\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010]¢\u0006\u0004\bb\u0010cJ)\u0010`\u001a\u00020\u000b2\u0006\u0010Z\u001a\u00020\u00042\u0012\u0010_\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020^0]¢\u0006\u0004\b`\u0010dJ)\u0010b\u001a\u00020\u000b2\u0006\u0010Z\u001a\u00020\u00042\u0012\u0010_\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040]¢\u0006\u0004\bb\u0010dJ)\u0010h\u001a\u00020\u000b2\u0006\u0010e\u001a\u00020\u00042\u0006\u0010f\u001a\u00020\u00142\b\b\u0002\u0010g\u001a\u00020\u0006H\u0002¢\u0006\u0004\bh\u0010iJ)\u0010h\u001a\u00020\u000b2\u0006\u0010e\u001a\u00020\u00042\u0006\u0010j\u001a\u00020\u001f2\b\b\u0002\u0010g\u001a\u00020\u0006H\u0002¢\u0006\u0004\bh\u0010kJ)\u0010n\u001a\u00020\u000b2\u0006\u0010l\u001a\u00020(2\u0006\u0010m\u001a\u00020\u00042\b\b\u0002\u0010g\u001a\u00020\u0006H\u0000¢\u0006\u0004\bn\u0010oJ\u0015\u0010p\u001a\u00020\u000b2\u0006\u0010f\u001a\u00020\u0014¢\u0006\u0004\bp\u0010qJ\u0015\u0010p\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\bp\u0010\rJ\u0015\u0010s\u001a\u00020\u000b2\u0006\u0010r\u001a\u00020\u0014¢\u0006\u0004\bs\u0010qJ\u001d\u0010s\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\bs\u0010tJ\u0015\u0010u\u001a\u00020\u000b2\u0006\u0010j\u001a\u00020\u001f¢\u0006\u0004\bu\u0010vJ\u0015\u0010u\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bu\u0010\rJ\u001d\u0010w\u001a\u00020\u000b2\u0006\u0010l\u001a\u00020(2\u0006\u0010m\u001a\u00020\u0004¢\u0006\u0004\bw\u0010xJ%\u0010w\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010m\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\bw\u0010yJ\u0019\u0010z\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010BH\u0002¢\u0006\u0004\bz\u0010{J\u000f\u0010|\u001a\u00020\u000bH\u0016¢\u0006\u0004\b|\u0010\u0003J\u000f\u0010}\u001a\u00020\u000bH\u0016¢\u0006\u0004\b}\u0010\u0003J7\u0010\u0081\u0001\u001a\u00020\u000b2\u0006\u0010P\u001a\u00020~2\u001d\b\u0002\u0010I\u001a\u0017\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u007fj\u0005\u0018\u0001`\u0080\u0001¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J+\u0010\u0083\u0001\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00042\u0012\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020^0]¢\u0006\u0005\b\u0083\u0001\u0010dJ\u001f\u0010\u0084\u0001\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\\\u001a\u00020\u0006¢\u0006\u0005\b\u0084\u0001\u0010tJ+\u0010\u0085\u0001\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00042\u0012\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020^0]¢\u0006\u0005\b\u0085\u0001\u0010dJ\u0011\u0010\u0086\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\b\u0086\u0001\u0010\u0003J\u0011\u0010\u0087\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\b\u0087\u0001\u0010\u0003J\u0012\u0010\u0088\u0001\u001a\u00020\u000bH\u0086@¢\u0006\u0005\b\u0088\u0001\u0010\u000fJ\u001f\u0010\u0089\u0001\u001a\u00020\u000b2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010HH\u0086@¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u000f\u0010\u008b\u0001\u001a\u00020\u000b¢\u0006\u0005\b\u008b\u0001\u0010\u0003J\u0017\u0010\u008c\u0001\u001a\u00020\u000b2\u0006\u0010e\u001a\u00020\u0004¢\u0006\u0005\b\u008c\u0001\u0010\rJ\u0011\u0010\u008d\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\b\u008d\u0001\u0010\u0003J8\u0010\u008e\u0001\u001a\u00020B2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020\u00042\n\b\u0002\u0010C\u001a\u0004\u0018\u00010B2\b\b\u0002\u00103\u001a\u00020DH\u0002¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u001b\u0010\u0090\u0001\u001a\u00020E2\u0006\u0010C\u001a\u00020BH\u0080@¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u000f\u0010\u0092\u0001\u001a\u00020\u000b¢\u0006\u0005\b\u0092\u0001\u0010\u0003J\u0012\u0010\u0093\u0001\u001a\u00020\u000bH\u0082@¢\u0006\u0005\b\u0093\u0001\u0010\u000fJ\u0012\u0010\u0094\u0001\u001a\u00020\u000bH\u0086@¢\u0006\u0005\b\u0094\u0001\u0010\u000fJ\u001a\u0010\u0097\u0001\u001a\u00020\u000b2\b\u0010\u0096\u0001\u001a\u00030\u0095\u0001¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u0011\u0010\u0099\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\b\u0099\u0001\u0010\u0003J6\u0010\u009b\u0001\u001a\u00020\u000b2\b\u0010C\u001a\u0004\u0018\u00010B2\u0017\b\u0002\u0010\u009a\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020^\u0018\u00010]H\u0086@¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J?\u0010\u009d\u0001\u001a\u00020\u000b2\b\u0010C\u001a\u0004\u0018\u00010B2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010H2\u0017\b\u0002\u0010\u009a\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020^\u0018\u00010]¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u0012\u0010\u009f\u0001\u001a\u00020\u000bH\u0082@¢\u0006\u0005\b\u009f\u0001\u0010\u000fJ6\u0010 \u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020^\u0018\u00010]2\u0014\u0010_\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010]H\u0002¢\u0006\u0006\b \u0001\u0010¡\u0001R\u0017\u0010@\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b@\u0010¢\u0001R\u001a\u0010¤\u0001\u001a\u00030£\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u001a\u0010§\u0001\u001a\u00030¦\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u001a\u0010ª\u0001\u001a\u00030©\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R*\u0010\u00ad\u0001\u001a\u00030¬\u00018\u0001@\u0001X\u0080\u000e¢\u0006\u0018\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R\u0018\u0010´\u0001\u001a\u00030³\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u001a\u0010·\u0001\u001a\u00030¶\u00018\u0002@\u0002X\u0083.¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u0018\u0010º\u0001\u001a\u00030¹\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u001a\u0010½\u0001\u001a\u00030¼\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R\u001a\u0010À\u0001\u001a\u00030¿\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u0018\u0010Ã\u0001\u001a\u00030Â\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001R\u001a\u0010Å\u0001\u001a\u00030¿\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010Á\u0001R\u001a\u0010Æ\u0001\u001a\u00030¿\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010Á\u0001R \u0010È\u0001\u001a\t\u0012\u0004\u0012\u00020\u00040Ç\u00018\u0002@\u0002X\u0083.¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R\u001a\u0010Ë\u0001\u001a\u00030Ê\u00018\u0002@\u0002X\u0083.¢\u0006\b\n\u0006\bË\u0001\u0010Ì\u0001R\u001c\u0010Î\u0001\u001a\u0005\u0018\u00010Í\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÎ\u0001\u0010Ï\u0001R\u001a\u0010Ñ\u0001\u001a\u00030Ð\u00018\u0002@\u0002X\u0083.¢\u0006\b\n\u0006\bÑ\u0001\u0010Ò\u0001R\u001c\u0010Ô\u0001\u001a\u0005\u0018\u00010Ó\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001R.\u00103\u001a\u00020D8\u0001@\u0001X\u0080.¢\u0006\u001e\n\u0005\b3\u0010Ö\u0001\u0012\u0005\bÛ\u0001\u0010\u0003\u001a\u0006\b×\u0001\u0010Ø\u0001\"\u0006\bÙ\u0001\u0010Ú\u0001R\u001c\u0010Ý\u0001\u001a\u0005\u0018\u00010Ü\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÝ\u0001\u0010Þ\u0001R\u0018\u0010ß\u0001\u001a\u00030³\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\bß\u0001\u0010µ\u0001R\u0017\u0010A\u001a\u00020\u00048\u0002@\u0002X\u0083.¢\u0006\u0007\n\u0005\bA\u0010à\u0001R/\u0010á\u0001\u001a\u0002098\u0001@\u0001X\u0080.¢\u0006\u001e\n\u0006\bá\u0001\u0010â\u0001\u0012\u0005\bæ\u0001\u0010\u0003\u001a\u0005\bã\u0001\u0010;\"\u0006\bä\u0001\u0010å\u0001R\u001a\u0010è\u0001\u001a\u00030ç\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bè\u0001\u0010é\u0001R1\u0010ë\u0001\u001a\u00030ê\u00018\u0001@\u0001X\u0080.¢\u0006\u001f\n\u0006\bë\u0001\u0010ì\u0001\u0012\u0005\bñ\u0001\u0010\u0003\u001a\u0006\bí\u0001\u0010î\u0001\"\u0006\bï\u0001\u0010ð\u0001R1\u0010ò\u0001\u001a\u00030³\u00018\u0001@\u0001X\u0080.¢\u0006\u001f\n\u0006\bò\u0001\u0010µ\u0001\u0012\u0005\b÷\u0001\u0010\u0003\u001a\u0006\bó\u0001\u0010ô\u0001\"\u0006\bõ\u0001\u0010ö\u0001R\u0019\u0010ø\u0001\u001a\u00020<8\u0002@\u0002X\u0083.¢\u0006\b\n\u0006\bø\u0001\u0010ù\u0001R\u0017\u0010C\u001a\u00020B8\u0002@\u0002X\u0083.¢\u0006\u0007\n\u0005\bC\u0010ú\u0001"}, d2 = {"Lcom/statsig/androidsdk/StatsigClient;", "Lcom/statsig/androidsdk/LifecycleEventListener;", "<init>", "()V", "", "gateName", "", "checkGate", "(Ljava/lang/String;)Z", "checkGateWithExposureLoggingDisabled", "functionName", "", "enforceInitialized$android_sdk_release", "(Ljava/lang/String;)V", "flush", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/statsig/androidsdk/StatsigOverrides;", "getAllOverrides", "()Lcom/statsig/androidsdk/StatsigOverrides;", "configName", "Lcom/statsig/androidsdk/DynamicConfig;", "getConfig", "(Ljava/lang/String;)Lcom/statsig/androidsdk/DynamicConfig;", "getConfigWithExposureLoggingDisabled", "getDynamicConfigEvaluation", "experimentName", "keepDeviceValue", "getExperiment", "(Ljava/lang/String;Z)Lcom/statsig/androidsdk/DynamicConfig;", "getExperimentEvaluation", "getExperimentWithExposureLoggingDisabled", "Lcom/statsig/androidsdk/FeatureGate;", "getFeatureGate", "(Ljava/lang/String;)Lcom/statsig/androidsdk/FeatureGate;", "getFeatureGateEvaluation", "getFeatureGateWithExposureLoggingDisabled", "Lcom/statsig/androidsdk/ExternalInitializeResponse;", "getInitializeResponseJson", "()Lcom/statsig/androidsdk/ExternalInitializeResponse;", "layerName", "Lcom/statsig/androidsdk/Layer;", "getLayer", "(Ljava/lang/String;Z)Lcom/statsig/androidsdk/Layer;", "client", "getLayerEvaluation", "(Lcom/statsig/androidsdk/StatsigClient;Ljava/lang/String;Z)Lcom/statsig/androidsdk/Layer;", "getLayerWithExposureLoggingDisabled", "getLocalStorageStableID", "()Ljava/lang/String;", "parameterStoreName", "Lcom/statsig/androidsdk/ParameterStoreEvaluationOptions;", "options", "Lcom/statsig/androidsdk/ParameterStore;", "getParameterStore", "(Ljava/lang/String;Lcom/statsig/androidsdk/ParameterStoreEvaluationOptions;)Lcom/statsig/androidsdk/ParameterStore;", "getSessionID", "getStableID", "Lcom/statsig/androidsdk/StatsigMetadata;", "getStatsigMetadata", "()Lcom/statsig/androidsdk/StatsigMetadata;", "Lcom/statsig/androidsdk/Store;", "getStore$android_sdk_release", "()Lcom/statsig/androidsdk/Store;", "Landroid/app/Application;", "application", "sdkKey", "Lcom/statsig/androidsdk/StatsigUser;", "user", "Lcom/statsig/androidsdk/StatsigOptions;", "Lcom/statsig/androidsdk/InitializationDetails;", "initialize", "(Landroid/app/Application;Ljava/lang/String;Lcom/statsig/androidsdk/StatsigUser;Lcom/statsig/androidsdk/StatsigOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/statsig/androidsdk/IStatsigCallback;", com.sun.jna.Callback.METHOD_NAME, "initializeAsync", "(Landroid/app/Application;Ljava/lang/String;Lcom/statsig/androidsdk/StatsigUser;Lcom/statsig/androidsdk/IStatsigCallback;Lcom/statsig/androidsdk/StatsigOptions;)V", "isInitialized", "()Z", "success", "Lcom/statsig/androidsdk/ContextType;", "context", "Lcom/statsig/androidsdk/InitializeResponse;", "initResponse", "logEndDiagnostics", "(ZLcom/statsig/androidsdk/ContextType;Lcom/statsig/androidsdk/InitializeResponse;)V", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "e", "logEndDiagnosticsWhenException", "(Lcom/statsig/androidsdk/ContextType;Ljava/lang/Exception;)V", "eventName", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "", "metadata", "logEventWithAnyMetadata", "(Ljava/lang/String;Ljava/lang/Double;Ljava/util/Map;)V", "logEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "(Ljava/lang/String;Ljava/util/Map;)V", "name", "config", "isManual", "logExposure", "(Ljava/lang/String;Lcom/statsig/androidsdk/DynamicConfig;Z)V", "gate", "(Ljava/lang/String;Lcom/statsig/androidsdk/FeatureGate;Z)V", "layer", "parameterName", "logLayerParameterExposure$android_sdk_release", "(Lcom/statsig/androidsdk/Layer;Ljava/lang/String;Z)V", "manuallyLogConfigExposure", "(Lcom/statsig/androidsdk/DynamicConfig;)V", "experiment", "manuallyLogExperimentExposure", "(Ljava/lang/String;Z)V", "manuallyLogGateExposure", "(Lcom/statsig/androidsdk/FeatureGate;)V", "manuallyLogLayerParameterExposure", "(Lcom/statsig/androidsdk/Layer;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;Z)V", "normalizeUser", "(Lcom/statsig/androidsdk/StatsigUser;)Lcom/statsig/androidsdk/StatsigUser;", "onAppBlur", "onAppFocus", "Landroid/content/Context;", "Lkotlin/Function1;", "Lcom/statsig/androidsdk/DebugViewCallback;", "openDebugView", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "overrideConfig", "overrideGate", "overrideLayer", "pollForUpdates", "populateStatsigMetadata", "refreshCache", "refreshCacheAsync", "(Lcom/statsig/androidsdk/IStatsigCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeAllOverrides", "removeOverride", "resetUser", "setup", "(Landroid/app/Application;Ljava/lang/String;Lcom/statsig/androidsdk/StatsigUser;Lcom/statsig/androidsdk/StatsigOptions;)Lcom/statsig/androidsdk/StatsigUser;", "setupAsync$android_sdk_release", "(Lcom/statsig/androidsdk/StatsigUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shutdown", "shutdownImpl", "shutdownSuspend", "Lcom/statsig/androidsdk/StatsigRuntimeMutableOptions;", "runtimeMutableOptions", "updateRuntimeOptions", "(Lcom/statsig/androidsdk/StatsigRuntimeMutableOptions;)V", "updateStickyValues", "values", "updateUser", "(Lcom/statsig/androidsdk/StatsigUser;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUserAsync", "(Lcom/statsig/androidsdk/StatsigUser;Lcom/statsig/androidsdk/IStatsigCallback;Ljava/util/Map;)V", "updateUserImpl", "widenStringMetadata", "(Ljava/util/Map;)Ljava/util/Map;", "Landroid/app/Application;", "Lcom/statsig/androidsdk/StatsigNetworkConnectivityListener;", "connectivityListener", "Lcom/statsig/androidsdk/StatsigNetworkConnectivityListener;", "Lcom/statsig/androidsdk/Diagnostics;", "diagnostics", "Lcom/statsig/androidsdk/Diagnostics;", "Lcom/statsig/androidsdk/CoroutineDispatcherProvider;", "dispatcherProvider", "Lcom/statsig/androidsdk/CoroutineDispatcherProvider;", "Lcom/statsig/androidsdk/ErrorBoundary;", "errorBoundary", "Lcom/statsig/androidsdk/ErrorBoundary;", "getErrorBoundary$android_sdk_release", "()Lcom/statsig/androidsdk/ErrorBoundary;", "setErrorBoundary$android_sdk_release", "(Lcom/statsig/androidsdk/ErrorBoundary;)V", "Lkotlinx/coroutines/CoroutineScope;", "errorScope", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "exceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lcom/google/gson/Gson;", "gson", "Lcom/google/gson/Gson;", "", "initTime", "J", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/statsig/androidsdk/IntegratedSdkExperiments;", "integratedSdkExperiments", "Lcom/statsig/androidsdk/IntegratedSdkExperiments;", "isBootstrapped", "isInitializing", "Lcom/statsig/androidsdk/KeyValueStorage;", "keyValueStorage", "Lcom/statsig/androidsdk/KeyValueStorage;", "Lcom/statsig/androidsdk/StatsigActivityLifecycleListener;", "lifecycleListener", "Lcom/statsig/androidsdk/StatsigActivityLifecycleListener;", "Lcom/statsig/androidsdk/IStatsigLifetimeCallback;", "lifetimeCallback", "Lcom/statsig/androidsdk/IStatsigLifetimeCallback;", "Lcom/statsig/androidsdk/StatsigLogger;", "logger", "Lcom/statsig/androidsdk/StatsigLogger;", "Lcom/statsig/androidsdk/OnDeviceEvalAdapter;", "onDeviceEvalAdapter", "Lcom/statsig/androidsdk/OnDeviceEvalAdapter;", "Lcom/statsig/androidsdk/StatsigOptions;", "getOptions$android_sdk_release", "()Lcom/statsig/androidsdk/StatsigOptions;", "setOptions$android_sdk_release", "(Lcom/statsig/androidsdk/StatsigOptions;)V", "getOptions$android_sdk_release$annotations", "Lkotlinx/coroutines/Job;", "pollingJob", "Lkotlinx/coroutines/Job;", "retryScope", "Ljava/lang/String;", "statsigClientMetadata", "Lcom/statsig/androidsdk/StatsigMetadata;", "getStatsigClientMetadata$android_sdk_release", "setStatsigClientMetadata$android_sdk_release", "(Lcom/statsig/androidsdk/StatsigMetadata;)V", "getStatsigClientMetadata$android_sdk_release$annotations", "Lkotlinx/coroutines/CompletableJob;", "statsigJob", "Lkotlinx/coroutines/CompletableJob;", "Lcom/statsig/androidsdk/StatsigNetwork;", "statsigNetwork", "Lcom/statsig/androidsdk/StatsigNetwork;", "getStatsigNetwork$android_sdk_release", "()Lcom/statsig/androidsdk/StatsigNetwork;", "setStatsigNetwork$android_sdk_release", "(Lcom/statsig/androidsdk/StatsigNetwork;)V", "getStatsigNetwork$android_sdk_release$annotations", "statsigScope", "getStatsigScope$android_sdk_release", "()Lkotlinx/coroutines/CoroutineScope;", "setStatsigScope$android_sdk_release", "(Lkotlinx/coroutines/CoroutineScope;)V", "getStatsigScope$android_sdk_release$annotations", com.google.android.libraries.places.api.model.PlaceTypes.STORE, "Lcom/statsig/androidsdk/Store;", "Lcom/statsig/androidsdk/StatsigUser;", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StatsigClient implements com.statsig.androidsdk.LifecycleEventListener {
    private static final java.lang.String TAG = "statsig::StatsigClient";
    private android.app.Application application;
    private com.statsig.androidsdk.StatsigNetworkConnectivityListener connectivityListener;
    private com.statsig.androidsdk.Diagnostics diagnostics;
    private com.statsig.androidsdk.ErrorBoundary errorBoundary;
    private final kotlinx.coroutines.CoroutineScope errorScope;
    private kotlinx.coroutines.CoroutineExceptionHandler exceptionHandler;
    private final com.google.gson.Gson gson;
    private java.util.concurrent.atomic.AtomicBoolean initialized;
    private java.util.concurrent.atomic.AtomicBoolean isBootstrapped;
    private java.util.concurrent.atomic.AtomicBoolean isInitializing;
    private com.statsig.androidsdk.KeyValueStorage<java.lang.String> keyValueStorage;
    private com.statsig.androidsdk.StatsigActivityLifecycleListener lifecycleListener;
    private com.statsig.androidsdk.IStatsigLifetimeCallback lifetimeCallback;
    private com.statsig.androidsdk.StatsigLogger logger;
    private com.statsig.androidsdk.OnDeviceEvalAdapter onDeviceEvalAdapter;
    public com.statsig.androidsdk.StatsigOptions options;
    private kotlinx.coroutines.Job pollingJob;
    private final kotlinx.coroutines.CoroutineScope retryScope;
    private java.lang.String sdkKey;
    public com.statsig.androidsdk.StatsigMetadata statsigClientMetadata;
    private kotlinx.coroutines.CompletableJob statsigJob;
    public com.statsig.androidsdk.StatsigNetwork statsigNetwork;
    public kotlinx.coroutines.CoroutineScope statsigScope;
    private com.statsig.androidsdk.Store store;
    private com.statsig.androidsdk.StatsigUser user;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.statsig.androidsdk.StatsigClient.Companion INSTANCE = new com.statsig.androidsdk.StatsigClient.Companion(null);
    private static /* synthetic */ com.statsig.androidsdk.StatsigClient.Companion.KeyValueStorageImplementation keyValueStorageImplementationOverride = com.statsig.androidsdk.StatsigClient.Companion.KeyValueStorageImplementation.LEGACY;
    private final com.statsig.androidsdk.IntegratedSdkExperiments integratedSdkExperiments = new com.statsig.androidsdk.IntegratedSdkExperiments();
    private long initTime = android.os.SystemClock.elapsedRealtime();
    private com.statsig.androidsdk.CoroutineDispatcherProvider dispatcherProvider = new com.statsig.androidsdk.CoroutineDispatcherProvider(null, null, null, 7, null);

    public static /* synthetic */ void getOptions$android_sdk_release$annotations() {
    }

    public static /* synthetic */ void getStatsigClientMetadata$android_sdk_release$annotations() {
    }

    public static /* synthetic */ void getStatsigNetwork$android_sdk_release$annotations() {
    }

    public static /* synthetic */ void getStatsigScope$android_sdk_release$annotations() {
    }

    private final java.util.Map<java.lang.String, java.lang.Object> widenStringMetadata(java.util.Map<java.lang.String, java.lang.String> metadata) {
        return metadata;
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\fH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R(\u0010\u0012\u001a\u00020\u00118\u0007@\u0007X\u0086\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/statsig/androidsdk/StatsigClient$Companion;", "", "<init>", "()V", "Landroid/app/Application;", "application", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lcom/statsig/androidsdk/KeyValueStorage;", "", "createKeyValueStorage$android_sdk_release", "(Landroid/app/Application;Lkotlinx/coroutines/CoroutineScope;)Lcom/statsig/androidsdk/KeyValueStorage;", "Lkotlin/Function2;", "resolveKeyValueStorageFactory", "()Lkotlin/jvm/functions/Function2;", "TAG", "Ljava/lang/String;", "Lcom/statsig/androidsdk/StatsigClient$Companion$KeyValueStorageImplementation;", "keyValueStorageImplementationOverride", "Lcom/statsig/androidsdk/StatsigClient$Companion$KeyValueStorageImplementation;", "getKeyValueStorageImplementationOverride", "()Lcom/statsig/androidsdk/StatsigClient$Companion$KeyValueStorageImplementation;", "setKeyValueStorageImplementationOverride", "(Lcom/statsig/androidsdk/StatsigClient$Companion$KeyValueStorageImplementation;)V", "getKeyValueStorageImplementationOverride$annotations", "KeyValueStorageImplementation"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ void getKeyValueStorageImplementationOverride$annotations() {
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/statsig/androidsdk/StatsigClient$Companion$KeyValueStorageImplementation;", "", "<init>", "(Ljava/lang/String;I)V", "LEGACY", "PREFERENCES_DATASTORE", "MIGRATION"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class KeyValueStorageImplementation {
            private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
            private static final /* synthetic */ com.statsig.androidsdk.StatsigClient.Companion.KeyValueStorageImplementation[] $VALUES;
            public static final com.statsig.androidsdk.StatsigClient.Companion.KeyValueStorageImplementation LEGACY = new com.statsig.androidsdk.StatsigClient.Companion.KeyValueStorageImplementation("LEGACY", 0);
            public static final com.statsig.androidsdk.StatsigClient.Companion.KeyValueStorageImplementation PREFERENCES_DATASTORE = new com.statsig.androidsdk.StatsigClient.Companion.KeyValueStorageImplementation("PREFERENCES_DATASTORE", 1);
            public static final com.statsig.androidsdk.StatsigClient.Companion.KeyValueStorageImplementation MIGRATION = new com.statsig.androidsdk.StatsigClient.Companion.KeyValueStorageImplementation("MIGRATION", 2);

            private KeyValueStorageImplementation(java.lang.String str, int i) {
            }

            static {
                com.statsig.androidsdk.StatsigClient.Companion.KeyValueStorageImplementation[] $values = $values();
                $VALUES = $values;
                $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
            }

            public static com.statsig.androidsdk.StatsigClient.Companion.KeyValueStorageImplementation[] values() {
                return (com.statsig.androidsdk.StatsigClient.Companion.KeyValueStorageImplementation[]) $VALUES.clone();
            }

            public static com.statsig.androidsdk.StatsigClient.Companion.KeyValueStorageImplementation valueOf(java.lang.String str) {
                return (com.statsig.androidsdk.StatsigClient.Companion.KeyValueStorageImplementation) java.lang.Enum.valueOf(com.statsig.androidsdk.StatsigClient.Companion.KeyValueStorageImplementation.class, str);
            }

            public static kotlin.enums.EnumEntries<com.statsig.androidsdk.StatsigClient.Companion.KeyValueStorageImplementation> getEntries() {
                return $ENTRIES;
            }

            private static final /* synthetic */ com.statsig.androidsdk.StatsigClient.Companion.KeyValueStorageImplementation[] $values() {
                return new com.statsig.androidsdk.StatsigClient.Companion.KeyValueStorageImplementation[]{LEGACY, PREFERENCES_DATASTORE, MIGRATION};
            }
        }

        public final com.statsig.androidsdk.StatsigClient.Companion.KeyValueStorageImplementation getKeyValueStorageImplementationOverride() {
            return com.statsig.androidsdk.StatsigClient.keyValueStorageImplementationOverride;
        }

        public final void setKeyValueStorageImplementationOverride(com.statsig.androidsdk.StatsigClient.Companion.KeyValueStorageImplementation keyValueStorageImplementation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyValueStorageImplementation, "");
            com.statsig.androidsdk.StatsigClient.keyValueStorageImplementationOverride = keyValueStorageImplementation;
        }

        public final /* synthetic */ com.statsig.androidsdk.KeyValueStorage createKeyValueStorage$android_sdk_release(android.app.Application application, kotlinx.coroutines.CoroutineScope scope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
            return resolveKeyValueStorageFactory().invoke(application, scope);
        }

        private final kotlin.jvm.functions.Function2<android.app.Application, kotlinx.coroutines.CoroutineScope, com.statsig.androidsdk.KeyValueStorage<java.lang.String>> resolveKeyValueStorageFactory() {
            int i = com.statsig.androidsdk.StatsigClient.Companion.WhenMappings.$EnumSwitchMapping$0[getKeyValueStorageImplementationOverride().ordinal()];
            if (i == 1) {
                return new kotlin.jvm.functions.Function2<android.app.Application, kotlinx.coroutines.CoroutineScope, com.statsig.androidsdk.KeyValueStorage<java.lang.String>>() { // from class: com.statsig.androidsdk.StatsigClient$Companion$resolveKeyValueStorageFactory$1
                    @Override // kotlin.jvm.functions.Function2
                    public final com.statsig.androidsdk.KeyValueStorage<java.lang.String> invoke(android.app.Application application, kotlinx.coroutines.CoroutineScope coroutineScope) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
                        return new com.statsig.androidsdk.LegacyKeyValueStorage(application);
                    }
                };
            }
            if (i == 2) {
                return new kotlin.jvm.functions.Function2<android.app.Application, kotlinx.coroutines.CoroutineScope, com.statsig.androidsdk.KeyValueStorage<java.lang.String>>() { // from class: com.statsig.androidsdk.StatsigClient$Companion$resolveKeyValueStorageFactory$2
                    @Override // kotlin.jvm.functions.Function2
                    public final com.statsig.androidsdk.KeyValueStorage<java.lang.String> invoke(android.app.Application application, kotlinx.coroutines.CoroutineScope coroutineScope) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
                        return new com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage(application, coroutineScope);
                    }
                };
            }
            if (i == 3) {
                return new kotlin.jvm.functions.Function2<android.app.Application, kotlinx.coroutines.CoroutineScope, com.statsig.androidsdk.KeyValueStorage<java.lang.String>>() { // from class: com.statsig.androidsdk.StatsigClient$Companion$resolveKeyValueStorageFactory$3
                    @Override // kotlin.jvm.functions.Function2
                    public final com.statsig.androidsdk.KeyValueStorage<java.lang.String> invoke(android.app.Application application, kotlinx.coroutines.CoroutineScope coroutineScope) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
                        com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage preferencesDataStoreKeyValueStorage = new com.statsig.androidsdk.PreferencesDataStoreKeyValueStorage(application, coroutineScope);
                        return new com.statsig.androidsdk.MigratingKeyValueStorage(preferencesDataStoreKeyValueStorage, new com.statsig.androidsdk.LegacyKeyValueStorage(application), preferencesDataStoreKeyValueStorage);
                    }
                };
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes16.dex */
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.statsig.androidsdk.StatsigClient.Companion.KeyValueStorageImplementation.values().length];
                try {
                    iArr[com.statsig.androidsdk.StatsigClient.Companion.KeyValueStorageImplementation.LEGACY.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.statsig.androidsdk.StatsigClient.Companion.KeyValueStorageImplementation.PREFERENCES_DATASTORE.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.statsig.androidsdk.StatsigClient.Companion.KeyValueStorageImplementation.MIGRATION.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public StatsigClient() {
        kotlinx.coroutines.CoroutineScope CoroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null).plus(this.dispatcherProvider.getIo()));
        this.errorScope = CoroutineScope;
        this.errorBoundary = new com.statsig.androidsdk.ErrorBoundary(CoroutineScope);
        this.statsigJob = kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
        this.initialized = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.isBootstrapped = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.isInitializing = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.retryScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null).plus(this.dispatcherProvider.getIo()));
        this.gson = com.statsig.androidsdk.StatsigUtil.INSTANCE.getOrBuildGson$android_sdk_release();
    }

    public final com.statsig.androidsdk.StatsigMetadata getStatsigClientMetadata$android_sdk_release() {
        com.statsig.androidsdk.StatsigMetadata statsigMetadata = this.statsigClientMetadata;
        if (statsigMetadata != null) {
            return statsigMetadata;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setStatsigClientMetadata$android_sdk_release(com.statsig.androidsdk.StatsigMetadata statsigMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statsigMetadata, "");
        this.statsigClientMetadata = statsigMetadata;
    }

    /* renamed from: getErrorBoundary$android_sdk_release, reason: from getter */
    public final com.statsig.androidsdk.ErrorBoundary getErrorBoundary() {
        return this.errorBoundary;
    }

    public final void setErrorBoundary$android_sdk_release(com.statsig.androidsdk.ErrorBoundary errorBoundary) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorBoundary, "");
        this.errorBoundary = errorBoundary;
    }

    public final kotlinx.coroutines.CoroutineScope getStatsigScope$android_sdk_release() {
        kotlinx.coroutines.CoroutineScope coroutineScope = this.statsigScope;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setStatsigScope$android_sdk_release(kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.statsigScope = coroutineScope;
    }

    public final com.statsig.androidsdk.StatsigNetwork getStatsigNetwork$android_sdk_release() {
        com.statsig.androidsdk.StatsigNetwork statsigNetwork = this.statsigNetwork;
        if (statsigNetwork != null) {
            return statsigNetwork;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setStatsigNetwork$android_sdk_release(com.statsig.androidsdk.StatsigNetwork statsigNetwork) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statsigNetwork, "");
        this.statsigNetwork = statsigNetwork;
    }

    public final com.statsig.androidsdk.StatsigOptions getOptions$android_sdk_release() {
        com.statsig.androidsdk.StatsigOptions statsigOptions = this.options;
        if (statsigOptions != null) {
            return statsigOptions;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setOptions$android_sdk_release(com.statsig.androidsdk.StatsigOptions statsigOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statsigOptions, "");
        this.options = statsigOptions;
    }

    public final void initializeAsync(final android.app.Application application, final java.lang.String sdkKey, final com.statsig.androidsdk.StatsigUser user, final com.statsig.androidsdk.IStatsigCallback callback, final com.statsig.androidsdk.StatsigOptions options) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
        if (this.isInitializing.getAndSet(true)) {
            return;
        }
        this.errorBoundary.initialize(sdkKey);
        com.statsig.androidsdk.ErrorBoundary.capture$default(this.errorBoundary, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$initializeAsync$1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigClient$initializeAsync$1$1", f = "StatsigClient.kt", i = {}, l = {149, 154}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.statsig.androidsdk.StatsigClient$initializeAsync$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                final /* synthetic */ com.statsig.androidsdk.IStatsigCallback $callback;
                final /* synthetic */ com.statsig.androidsdk.StatsigUser $normalizedUser;
                int label;
                final /* synthetic */ com.statsig.androidsdk.StatsigClient this$0;

                /* JADX WARN: Code restructure failed: missing block: B:13:0x005f, code lost:
                
                    if (kotlinx.coroutines.BuildersKt.withContext(r1.getMain(), new com.statsig.androidsdk.StatsigClient$initializeAsync$1.AnonymousClass1.C02001(r7.$callback, r8, null), r7) == r0) goto L17;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
                
                    if (r8 != r0) goto L12;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    long j;
                    com.statsig.androidsdk.CoroutineDispatcherProvider coroutineDispatcherProvider;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        obj = this.this$0.setupAsync$android_sdk_release(this.$normalizedUser, this);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    com.statsig.androidsdk.InitializationDetails initializationDetails = (com.statsig.androidsdk.InitializationDetails) obj;
                    long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    j = this.this$0.initTime;
                    initializationDetails.setDuration(elapsedRealtime - j);
                    coroutineDispatcherProvider = this.this$0.dispatcherProvider;
                    this.label = 2;
                }

                @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigClient$initializeAsync$1$1$1", f = "StatsigClient.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.statsig.androidsdk.StatsigClient$initializeAsync$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C02001 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                    final /* synthetic */ com.statsig.androidsdk.IStatsigCallback $callback;
                    final /* synthetic */ com.statsig.androidsdk.InitializationDetails $initDetails;
                    int label;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        try {
                            com.statsig.androidsdk.IStatsigCallback iStatsigCallback = this.$callback;
                            if (iStatsigCallback != null) {
                                iStatsigCallback.onStatsigInitialize(this.$initDetails);
                            }
                            this.$initDetails.getSuccess();
                            com.statsig.androidsdk.InitializeResponse.FailedInitializeResponse failureDetails = this.$initDetails.getFailureDetails();
                            if (failureDetails != null) {
                                failureDetails.getReason();
                                if (failureDetails.getException() != null) {
                                    java.lang.Exception exception = failureDetails.getException();
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder("initializeAsync failure exception: ");
                                    sb.append(exception);
                                    kotlin.coroutines.jvm.internal.Boxing.boxInt(android.util.Log.e("statsig::StatsigClient", sb.toString()));
                                }
                            }
                            return kotlin.Unit.INSTANCE;
                        } catch (java.lang.Exception e) {
                            throw new com.statsig.androidsdk.ExternalException(e.getMessage());
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        return ((com.statsig.androidsdk.StatsigClient$initializeAsync$1.AnonymousClass1.C02001) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                        return new com.statsig.androidsdk.StatsigClient$initializeAsync$1.AnonymousClass1.C02001(this.$callback, this.$initDetails, continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C02001(com.statsig.androidsdk.IStatsigCallback iStatsigCallback, com.statsig.androidsdk.InitializationDetails initializationDetails, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigClient$initializeAsync$1.AnonymousClass1.C02001> continuation) {
                        super(2, continuation);
                        this.$callback = iStatsigCallback;
                        this.$initDetails = initializationDetails;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((com.statsig.androidsdk.StatsigClient$initializeAsync$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    return new com.statsig.androidsdk.StatsigClient$initializeAsync$1.AnonymousClass1(this.this$0, this.$normalizedUser, this.$callback, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(com.statsig.androidsdk.StatsigClient statsigClient, com.statsig.androidsdk.StatsigUser statsigUser, com.statsig.androidsdk.IStatsigCallback iStatsigCallback, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigClient$initializeAsync$1.AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = statsigClient;
                    this.$normalizedUser = statsigUser;
                    this.$callback = iStatsigCallback;
                }
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.statsig.androidsdk.StatsigUser upVar;
                upVar = com.statsig.androidsdk.StatsigClient.this.setup(application, sdkKey, user, options);
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.statsig.androidsdk.StatsigClient.this.getStatsigScope$android_sdk_release(), null, null, new com.statsig.androidsdk.StatsigClient$initializeAsync$1.AnonymousClass1(com.statsig.androidsdk.StatsigClient.this, upVar, callback, null), 3, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, null, new kotlin.jvm.functions.Function1<java.lang.Exception, kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$initializeAsync$2
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Exception exc) {
                invoke2(exc);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(java.lang.Exception exc) {
                long j;
                com.statsig.androidsdk.StatsigClient.this.logEndDiagnosticsWhenException(com.statsig.androidsdk.ContextType.INITIALIZE, exc);
                try {
                    long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    j = com.statsig.androidsdk.StatsigClient.this.initTime;
                    com.statsig.androidsdk.InitializationDetails initializationDetails = new com.statsig.androidsdk.InitializationDetails(elapsedRealtime - j, false, new com.statsig.androidsdk.InitializeResponse.FailedInitializeResponse(com.statsig.androidsdk.InitializeFailReason.InternalError, exc, null, 4, null));
                    com.statsig.androidsdk.IStatsigCallback iStatsigCallback = callback;
                    if (iStatsigCallback != null) {
                        iStatsigCallback.onStatsigInitialize(initializationDetails);
                    }
                } catch (java.lang.Exception e) {
                    throw new com.statsig.androidsdk.ExternalException(e.getMessage());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }, null, 10, null);
    }

    public final java.lang.Object initialize(android.app.Application application, java.lang.String str, com.statsig.androidsdk.StatsigUser statsigUser, com.statsig.androidsdk.StatsigOptions statsigOptions, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.InitializationDetails> continuation) {
        if (this.isInitializing.getAndSet(true)) {
            return null;
        }
        this.errorBoundary.initialize(str);
        return this.errorBoundary.captureAsync(new com.statsig.androidsdk.StatsigClient$initialize$2(this, application, str, statsigUser, statsigOptions, null), new com.statsig.androidsdk.StatsigClient$initialize$3(this, null), continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean checkGate(final java.lang.String gateName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gateName, "");
        enforceInitialized$android_sdk_release("checkGate");
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        com.statsig.androidsdk.ErrorBoundary.capture$default(this.errorBoundary, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$checkGate$1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [T, com.statsig.androidsdk.FeatureGate] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ?? featureGateEvaluation;
                featureGateEvaluation = com.statsig.androidsdk.StatsigClient.this.getFeatureGateEvaluation(gateName);
                com.statsig.androidsdk.StatsigClient.logExposure$default(com.statsig.androidsdk.StatsigClient.this, gateName, (com.statsig.androidsdk.FeatureGate) featureGateEvaluation, false, 4, (java.lang.Object) null);
                objectRef.element = featureGateEvaluation;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "checkGate", null, gateName, 4, null);
        com.statsig.androidsdk.FeatureGate featureGate = (com.statsig.androidsdk.FeatureGate) objectRef.element;
        if (featureGate == null) {
            featureGate = com.statsig.androidsdk.FeatureGate.INSTANCE.getError(gateName);
        }
        kotlin.jvm.functions.Function1<com.statsig.androidsdk.BaseConfig, kotlin.Unit> evaluationCallback = getOptions$android_sdk_release().getEvaluationCallback();
        if (evaluationCallback != null) {
            evaluationCallback.invoke(featureGate);
        }
        return featureGate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean checkGateWithExposureLoggingDisabled(final java.lang.String gateName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gateName, "");
        enforceInitialized$android_sdk_release("checkGateWithExposureLoggingDisabled");
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        com.statsig.androidsdk.ErrorBoundary.capture$default(this.errorBoundary, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$checkGateWithExposureLoggingDisabled$1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [T, com.statsig.androidsdk.FeatureGate] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.statsig.androidsdk.StatsigLogger statsigLogger;
                ?? featureGateEvaluation;
                statsigLogger = com.statsig.androidsdk.StatsigClient.this.logger;
                if (statsigLogger == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    statsigLogger = null;
                }
                statsigLogger.addNonExposedCheck(gateName);
                featureGateEvaluation = com.statsig.androidsdk.StatsigClient.this.getFeatureGateEvaluation(gateName);
                objectRef.element = featureGateEvaluation;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "checkGateWithExposureLoggingDisabled", null, gateName, 4, null);
        com.statsig.androidsdk.FeatureGate featureGate = (com.statsig.androidsdk.FeatureGate) objectRef.element;
        if (featureGate == null) {
            featureGate = com.statsig.androidsdk.FeatureGate.INSTANCE.getError(gateName);
        }
        kotlin.jvm.functions.Function1<com.statsig.androidsdk.BaseConfig, kotlin.Unit> evaluationCallback = getOptions$android_sdk_release().getEvaluationCallback();
        if (evaluationCallback != null) {
            evaluationCallback.invoke(featureGate);
        }
        return featureGate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.statsig.androidsdk.FeatureGate getFeatureGate(final java.lang.String gateName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gateName, "");
        enforceInitialized$android_sdk_release("getFeatureGate");
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        com.statsig.androidsdk.ErrorBoundary.capture$default(this.errorBoundary, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$getFeatureGate$1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [T, com.statsig.androidsdk.FeatureGate] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ?? featureGateEvaluation;
                featureGateEvaluation = com.statsig.androidsdk.StatsigClient.this.getFeatureGateEvaluation(gateName);
                com.statsig.androidsdk.StatsigClient.logExposure$default(com.statsig.androidsdk.StatsigClient.this, gateName, (com.statsig.androidsdk.FeatureGate) featureGateEvaluation, false, 4, (java.lang.Object) null);
                objectRef.element = featureGateEvaluation;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "getFeatureGate", null, gateName, 4, null);
        com.statsig.androidsdk.FeatureGate featureGate = (com.statsig.androidsdk.FeatureGate) objectRef.element;
        if (featureGate == null) {
            featureGate = com.statsig.androidsdk.FeatureGate.INSTANCE.getError(gateName);
        }
        kotlin.jvm.functions.Function1<com.statsig.androidsdk.BaseConfig, kotlin.Unit> evaluationCallback = getOptions$android_sdk_release().getEvaluationCallback();
        if (evaluationCallback != null) {
            evaluationCallback.invoke(featureGate);
        }
        return featureGate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.statsig.androidsdk.FeatureGate getFeatureGateWithExposureLoggingDisabled(final java.lang.String gateName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gateName, "");
        enforceInitialized$android_sdk_release("getFeatureGateWithExposureLoggingDisabled");
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        com.statsig.androidsdk.ErrorBoundary.capture$default(this.errorBoundary, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$getFeatureGateWithExposureLoggingDisabled$1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [T, com.statsig.androidsdk.FeatureGate] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.statsig.androidsdk.StatsigLogger statsigLogger;
                ?? featureGateEvaluation;
                statsigLogger = com.statsig.androidsdk.StatsigClient.this.logger;
                if (statsigLogger == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    statsigLogger = null;
                }
                statsigLogger.addNonExposedCheck(gateName);
                featureGateEvaluation = com.statsig.androidsdk.StatsigClient.this.getFeatureGateEvaluation(gateName);
                objectRef.element = featureGateEvaluation;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "getFeatureGateWithExposureLoggingDisabled", null, gateName, 4, null);
        com.statsig.androidsdk.FeatureGate featureGate = (com.statsig.androidsdk.FeatureGate) objectRef.element;
        if (featureGate == null) {
            featureGate = com.statsig.androidsdk.FeatureGate.INSTANCE.getError(gateName);
        }
        kotlin.jvm.functions.Function1<com.statsig.androidsdk.BaseConfig, kotlin.Unit> evaluationCallback = getOptions$android_sdk_release().getEvaluationCallback();
        if (evaluationCallback != null) {
            evaluationCallback.invoke(featureGate);
        }
        return featureGate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, com.statsig.androidsdk.DynamicConfig] */
    public final com.statsig.androidsdk.DynamicConfig getConfig(final java.lang.String configName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configName, "");
        enforceInitialized$android_sdk_release("getConfig");
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = com.statsig.androidsdk.DynamicConfig.INSTANCE.getError(configName);
        com.statsig.androidsdk.ErrorBoundary.capture$default(this.errorBoundary, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$getConfig$1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [T, com.statsig.androidsdk.DynamicConfig] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ?? dynamicConfigEvaluation;
                dynamicConfigEvaluation = com.statsig.androidsdk.StatsigClient.this.getDynamicConfigEvaluation(configName);
                com.statsig.androidsdk.StatsigClient.logExposure$default(com.statsig.androidsdk.StatsigClient.this, configName, (com.statsig.androidsdk.DynamicConfig) dynamicConfigEvaluation, false, 4, (java.lang.Object) null);
                objectRef.element = dynamicConfigEvaluation;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "getConfig", null, configName, 4, null);
        kotlin.jvm.functions.Function1<com.statsig.androidsdk.BaseConfig, kotlin.Unit> evaluationCallback = getOptions$android_sdk_release().getEvaluationCallback();
        if (evaluationCallback != null) {
            evaluationCallback.invoke(objectRef.element);
        }
        return (com.statsig.androidsdk.DynamicConfig) objectRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, com.statsig.androidsdk.DynamicConfig] */
    public final com.statsig.androidsdk.DynamicConfig getConfigWithExposureLoggingDisabled(final java.lang.String configName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configName, "");
        enforceInitialized$android_sdk_release("getConfigWithExposureLoggingDisabled");
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = com.statsig.androidsdk.DynamicConfig.INSTANCE.getError(configName);
        com.statsig.androidsdk.ErrorBoundary.capture$default(this.errorBoundary, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$getConfigWithExposureLoggingDisabled$1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [T, com.statsig.androidsdk.DynamicConfig] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.statsig.androidsdk.StatsigLogger statsigLogger;
                ?? dynamicConfigEvaluation;
                statsigLogger = com.statsig.androidsdk.StatsigClient.this.logger;
                if (statsigLogger == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    statsigLogger = null;
                }
                statsigLogger.addNonExposedCheck(configName);
                kotlin.jvm.internal.Ref.ObjectRef<com.statsig.androidsdk.DynamicConfig> objectRef2 = objectRef;
                dynamicConfigEvaluation = com.statsig.androidsdk.StatsigClient.this.getDynamicConfigEvaluation(configName);
                objectRef2.element = dynamicConfigEvaluation;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "getConfigWithExposureLoggingDisabled", null, configName, 4, null);
        kotlin.jvm.functions.Function1<com.statsig.androidsdk.BaseConfig, kotlin.Unit> evaluationCallback = getOptions$android_sdk_release().getEvaluationCallback();
        if (evaluationCallback != null) {
            evaluationCallback.invoke(objectRef.element);
        }
        return (com.statsig.androidsdk.DynamicConfig) objectRef.element;
    }

    public static /* synthetic */ com.statsig.androidsdk.DynamicConfig getExperiment$default(com.statsig.androidsdk.StatsigClient statsigClient, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return statsigClient.getExperiment(str, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, com.statsig.androidsdk.DynamicConfig] */
    public final com.statsig.androidsdk.DynamicConfig getExperiment(final java.lang.String experimentName, final boolean keepDeviceValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(experimentName, "");
        enforceInitialized$android_sdk_release("getExperiment");
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = com.statsig.androidsdk.DynamicConfig.INSTANCE.getError(experimentName);
        com.statsig.androidsdk.ErrorBoundary.capture$default(this.errorBoundary, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$getExperiment$1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [T, com.statsig.androidsdk.DynamicConfig] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ?? experimentEvaluation;
                kotlin.jvm.internal.Ref.ObjectRef<com.statsig.androidsdk.DynamicConfig> objectRef2 = objectRef;
                experimentEvaluation = this.getExperimentEvaluation(experimentName, keepDeviceValue);
                objectRef2.element = experimentEvaluation;
                if (keepDeviceValue) {
                    this.updateStickyValues();
                }
                com.statsig.androidsdk.StatsigClient.logExposure$default(this, experimentName, objectRef.element, false, 4, (java.lang.Object) null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "getExperiment", null, experimentName, 4, null);
        kotlin.jvm.functions.Function1<com.statsig.androidsdk.BaseConfig, kotlin.Unit> evaluationCallback = getOptions$android_sdk_release().getEvaluationCallback();
        if (evaluationCallback != null) {
            evaluationCallback.invoke(objectRef.element);
        }
        return (com.statsig.androidsdk.DynamicConfig) objectRef.element;
    }

    public static /* synthetic */ com.statsig.androidsdk.DynamicConfig getExperimentWithExposureLoggingDisabled$default(com.statsig.androidsdk.StatsigClient statsigClient, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return statsigClient.getExperimentWithExposureLoggingDisabled(str, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, com.statsig.androidsdk.DynamicConfig] */
    public final com.statsig.androidsdk.DynamicConfig getExperimentWithExposureLoggingDisabled(final java.lang.String experimentName, final boolean keepDeviceValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(experimentName, "");
        enforceInitialized$android_sdk_release("getExperimentWithExposureLoggingDisabled");
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = com.statsig.androidsdk.DynamicConfig.INSTANCE.getError(experimentName);
        com.statsig.androidsdk.ErrorBoundary.capture$default(this.errorBoundary, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$getExperimentWithExposureLoggingDisabled$1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [T, com.statsig.androidsdk.DynamicConfig] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.statsig.androidsdk.StatsigLogger statsigLogger;
                ?? experimentEvaluation;
                statsigLogger = com.statsig.androidsdk.StatsigClient.this.logger;
                if (statsigLogger == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    statsigLogger = null;
                }
                statsigLogger.addNonExposedCheck(experimentName);
                kotlin.jvm.internal.Ref.ObjectRef<com.statsig.androidsdk.DynamicConfig> objectRef2 = objectRef;
                experimentEvaluation = com.statsig.androidsdk.StatsigClient.this.getExperimentEvaluation(experimentName, keepDeviceValue);
                objectRef2.element = experimentEvaluation;
                if (keepDeviceValue) {
                    com.statsig.androidsdk.StatsigClient.this.updateStickyValues();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "getExperimentWithExposureLoggingDisabled", null, experimentName, 4, null);
        kotlin.jvm.functions.Function1<com.statsig.androidsdk.BaseConfig, kotlin.Unit> evaluationCallback = getOptions$android_sdk_release().getEvaluationCallback();
        if (evaluationCallback != null) {
            evaluationCallback.invoke(objectRef.element);
        }
        return (com.statsig.androidsdk.DynamicConfig) objectRef.element;
    }

    public static /* synthetic */ com.statsig.androidsdk.Layer getLayer$default(com.statsig.androidsdk.StatsigClient statsigClient, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return statsigClient.getLayer(str, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, com.statsig.androidsdk.Layer] */
    public final com.statsig.androidsdk.Layer getLayer(final java.lang.String layerName, final boolean keepDeviceValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layerName, "");
        enforceInitialized$android_sdk_release("getLayer");
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = com.statsig.androidsdk.Layer.INSTANCE.getError(layerName);
        com.statsig.androidsdk.ErrorBoundary.capture$default(this.errorBoundary, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$getLayer$1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [T, com.statsig.androidsdk.Layer] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ?? layerEvaluation;
                kotlin.jvm.internal.Ref.ObjectRef<com.statsig.androidsdk.Layer> objectRef2 = objectRef;
                com.statsig.androidsdk.StatsigClient statsigClient = this;
                layerEvaluation = statsigClient.getLayerEvaluation(statsigClient, layerName, keepDeviceValue);
                objectRef2.element = layerEvaluation;
                if (keepDeviceValue) {
                    this.updateStickyValues();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "getLayer", null, layerName, 4, null);
        kotlin.jvm.functions.Function1<com.statsig.androidsdk.BaseConfig, kotlin.Unit> evaluationCallback = getOptions$android_sdk_release().getEvaluationCallback();
        if (evaluationCallback != null) {
            evaluationCallback.invoke(objectRef.element);
        }
        return (com.statsig.androidsdk.Layer) objectRef.element;
    }

    public static /* synthetic */ com.statsig.androidsdk.Layer getLayerWithExposureLoggingDisabled$default(com.statsig.androidsdk.StatsigClient statsigClient, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return statsigClient.getLayerWithExposureLoggingDisabled(str, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, com.statsig.androidsdk.Layer] */
    public final com.statsig.androidsdk.Layer getLayerWithExposureLoggingDisabled(final java.lang.String layerName, final boolean keepDeviceValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layerName, "");
        enforceInitialized$android_sdk_release("getLayerWithExposureLoggingDisabled");
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = com.statsig.androidsdk.Layer.INSTANCE.getError(layerName);
        com.statsig.androidsdk.ErrorBoundary.capture$default(this.errorBoundary, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$getLayerWithExposureLoggingDisabled$1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [T, com.statsig.androidsdk.Layer] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.statsig.androidsdk.StatsigLogger statsigLogger;
                ?? layerEvaluation;
                statsigLogger = com.statsig.androidsdk.StatsigClient.this.logger;
                if (statsigLogger == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    statsigLogger = null;
                }
                statsigLogger.addNonExposedCheck(layerName);
                kotlin.jvm.internal.Ref.ObjectRef<com.statsig.androidsdk.Layer> objectRef2 = objectRef;
                layerEvaluation = com.statsig.androidsdk.StatsigClient.this.getLayerEvaluation(null, layerName, keepDeviceValue);
                objectRef2.element = layerEvaluation;
                if (keepDeviceValue) {
                    com.statsig.androidsdk.StatsigClient.this.updateStickyValues();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "getLayerWithExposureLoggingDisabled", null, layerName, 4, null);
        kotlin.jvm.functions.Function1<com.statsig.androidsdk.BaseConfig, kotlin.Unit> evaluationCallback = getOptions$android_sdk_release().getEvaluationCallback();
        if (evaluationCallback != null) {
            evaluationCallback.invoke(objectRef.element);
        }
        return (com.statsig.androidsdk.Layer) objectRef.element;
    }

    public static /* synthetic */ com.statsig.androidsdk.ParameterStore getParameterStore$default(com.statsig.androidsdk.StatsigClient statsigClient, java.lang.String str, com.statsig.androidsdk.ParameterStoreEvaluationOptions parameterStoreEvaluationOptions, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            parameterStoreEvaluationOptions = null;
        }
        return statsigClient.getParameterStore(str, parameterStoreEvaluationOptions);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, com.statsig.androidsdk.ParameterStore] */
    public final com.statsig.androidsdk.ParameterStore getParameterStore(final java.lang.String parameterStoreName, final com.statsig.androidsdk.ParameterStoreEvaluationOptions options) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameterStoreName, "");
        enforceInitialized$android_sdk_release("getParameterStore");
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        java.util.HashMap hashMap = new java.util.HashMap();
        com.statsig.androidsdk.Store store = this.store;
        if (store == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            store = null;
        }
        objectRef.element = new com.statsig.androidsdk.ParameterStore(this, hashMap, parameterStoreName, com.statsig.androidsdk.Store.getEvaluationDetails$android_sdk_release$default(store, false, null, 2, null), options);
        com.statsig.androidsdk.ErrorBoundary.capture$default(this.errorBoundary, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$getParameterStore$1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
            
                if (r1 == null) goto L13;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v3, types: [T, com.statsig.androidsdk.ParameterStore] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke2() {
                com.statsig.androidsdk.StatsigLogger statsigLogger;
                com.statsig.androidsdk.Store store2;
                com.statsig.androidsdk.OnDeviceEvalAdapter onDeviceEvalAdapter;
                T t;
                statsigLogger = com.statsig.androidsdk.StatsigClient.this.logger;
                com.statsig.androidsdk.Store store3 = null;
                if (statsigLogger == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    statsigLogger = null;
                }
                statsigLogger.addNonExposedCheck(parameterStoreName);
                kotlin.jvm.internal.Ref.ObjectRef<com.statsig.androidsdk.ParameterStore> objectRef2 = objectRef;
                store2 = com.statsig.androidsdk.StatsigClient.this.store;
                if (store2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    store3 = store2;
                }
                objectRef2.element = store3.getParamStore(com.statsig.androidsdk.StatsigClient.this, parameterStoreName, options);
                kotlin.jvm.internal.Ref.ObjectRef<com.statsig.androidsdk.ParameterStore> objectRef3 = objectRef;
                onDeviceEvalAdapter = com.statsig.androidsdk.StatsigClient.this.onDeviceEvalAdapter;
                if (onDeviceEvalAdapter != null) {
                    com.statsig.androidsdk.ParameterStore paramStore = onDeviceEvalAdapter.getParamStore(com.statsig.androidsdk.StatsigClient.this, objectRef.element);
                    t = paramStore;
                }
                t = objectRef.element;
                objectRef3.element = t;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "getParameterStore", null, parameterStoreName, 4, null);
        return (com.statsig.androidsdk.ParameterStore) objectRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logEvent$default(com.statsig.androidsdk.StatsigClient statsigClient, java.lang.String str, java.lang.Double d, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            d = null;
        }
        if ((i & 4) != 0) {
            map = null;
        }
        statsigClient.logEvent(str, d, (java.util.Map<java.lang.String, java.lang.String>) map);
    }

    public final void logEvent(java.lang.String eventName, java.lang.Double value, java.util.Map<java.lang.String, java.lang.String> metadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventName, "");
        logEventWithAnyMetadata(eventName, value, (java.util.Map<java.lang.String, ? extends java.lang.Object>) widenStringMetadata(metadata));
    }

    public final void logEventWithAnyMetadata(final java.lang.String eventName, final java.lang.Double value, final java.util.Map<java.lang.String, ? extends java.lang.Object> metadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventName, "");
        enforceInitialized$android_sdk_release("logEvent");
        com.statsig.androidsdk.ErrorBoundary.capture$default(this.errorBoundary, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$logEvent$1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.statsig.androidsdk.StatsigUser statsigUser;
                com.statsig.androidsdk.StatsigNetworkConnectivityListener statsigNetworkConnectivityListener;
                com.statsig.androidsdk.StatsigActivityLifecycleListener statsigActivityLifecycleListener;
                com.statsig.androidsdk.LogEvent logEvent = new com.statsig.androidsdk.LogEvent(eventName);
                logEvent.setValue(value);
                logEvent.setMetadata(metadata);
                statsigUser = this.user;
                if (statsigUser == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    statsigUser = null;
                }
                logEvent.setUser(statsigUser);
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                if (!this.getOptions$android_sdk_release().getDisableCurrentActivityLogging()) {
                    statsigActivityLifecycleListener = this.lifecycleListener;
                    if (statsigActivityLifecycleListener == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        statsigActivityLifecycleListener = null;
                    }
                    android.app.Activity currentActivity = statsigActivityLifecycleListener.getCurrentActivity();
                    if (currentActivity != null) {
                        java.lang.String simpleName = currentActivity.getClass().getSimpleName();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simpleName, "");
                    }
                }
                if (this.getOptions$android_sdk_release().getLogNetworkMetadata()) {
                    statsigNetworkConnectivityListener = this.connectivityListener;
                    if (statsigNetworkConnectivityListener == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        statsigNetworkConnectivityListener = null;
                    }
                    linkedHashMap.putAll(statsigNetworkConnectivityListener.getLogEventNetworkMetadata());
                }
                if (!linkedHashMap.isEmpty()) {
                    logEvent.setStatsigMetadata(kotlin.collections.MapsKt.toMap(linkedHashMap));
                }
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getStatsigScope$android_sdk_release(), null, null, new com.statsig.androidsdk.StatsigClient$logEvent$1.AnonymousClass2(this, logEvent, null), 3, null);
            }

            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigClient$logEvent$1$2", f = "StatsigClient.kt", i = {}, l = {570}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.statsig.androidsdk.StatsigClient$logEvent$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                final /* synthetic */ com.statsig.androidsdk.LogEvent $event;
                int label;
                final /* synthetic */ com.statsig.androidsdk.StatsigClient this$0;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    com.statsig.androidsdk.StatsigLogger statsigLogger;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        statsigLogger = this.this$0.logger;
                        if (statsigLogger == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                            statsigLogger = null;
                        }
                        this.label = 1;
                        if (statsigLogger.log(this.$event, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((com.statsig.androidsdk.StatsigClient$logEvent$1.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    return new com.statsig.androidsdk.StatsigClient$logEvent$1.AnonymousClass2(this.this$0, this.$event, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(com.statsig.androidsdk.StatsigClient statsigClient, com.statsig.androidsdk.LogEvent logEvent, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigClient$logEvent$1.AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = statsigClient;
                    this.$event = logEvent;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "logEvent", null, null, 12, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logEvent$default(com.statsig.androidsdk.StatsigClient statsigClient, java.lang.String str, java.lang.String str2, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            map = null;
        }
        statsigClient.logEvent(str, str2, (java.util.Map<java.lang.String, java.lang.String>) map);
    }

    public final void logEvent(java.lang.String eventName, java.lang.String value, java.util.Map<java.lang.String, java.lang.String> metadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        logEventWithAnyMetadata(eventName, value, (java.util.Map<java.lang.String, ? extends java.lang.Object>) widenStringMetadata(metadata));
    }

    public final void logEventWithAnyMetadata(final java.lang.String eventName, final java.lang.String value, final java.util.Map<java.lang.String, ? extends java.lang.Object> metadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        enforceInitialized$android_sdk_release("logEvent");
        com.statsig.androidsdk.ErrorBoundary.capture$default(this.errorBoundary, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$logEvent$2
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.statsig.androidsdk.StatsigUser statsigUser;
                com.statsig.androidsdk.LogEvent logEvent = new com.statsig.androidsdk.LogEvent(eventName);
                logEvent.setValue(value);
                logEvent.setMetadata(metadata);
                statsigUser = this.user;
                if (statsigUser == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    statsigUser = null;
                }
                logEvent.setUser(statsigUser);
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getStatsigScope$android_sdk_release(), null, null, new com.statsig.androidsdk.StatsigClient$logEvent$2.AnonymousClass1(this, logEvent, null), 3, null);
            }

            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigClient$logEvent$2$1", f = "StatsigClient.kt", i = {}, l = {605}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.statsig.androidsdk.StatsigClient$logEvent$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                final /* synthetic */ com.statsig.androidsdk.LogEvent $event;
                int label;
                final /* synthetic */ com.statsig.androidsdk.StatsigClient this$0;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    com.statsig.androidsdk.StatsigLogger statsigLogger;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        statsigLogger = this.this$0.logger;
                        if (statsigLogger == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                            statsigLogger = null;
                        }
                        this.label = 1;
                        if (statsigLogger.log(this.$event, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((com.statsig.androidsdk.StatsigClient$logEvent$2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    return new com.statsig.androidsdk.StatsigClient$logEvent$2.AnonymousClass1(this.this$0, this.$event, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(com.statsig.androidsdk.StatsigClient statsigClient, com.statsig.androidsdk.LogEvent logEvent, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigClient$logEvent$2.AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = statsigClient;
                    this.$event = logEvent;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "logEvent", null, null, 12, null);
    }

    public final void logEvent(java.lang.String eventName, java.util.Map<java.lang.String, java.lang.String> metadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
        java.util.Map<java.lang.String, java.lang.Object> widenStringMetadata = widenStringMetadata(metadata);
        kotlin.jvm.internal.Intrinsics.checkNotNull(widenStringMetadata);
        logEventWithAnyMetadata(eventName, widenStringMetadata);
    }

    public final void logEventWithAnyMetadata(final java.lang.String eventName, final java.util.Map<java.lang.String, ? extends java.lang.Object> metadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
        enforceInitialized$android_sdk_release("logEvent");
        com.statsig.androidsdk.ErrorBoundary.capture$default(this.errorBoundary, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$logEvent$3
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.statsig.androidsdk.StatsigUser statsigUser;
                com.statsig.androidsdk.LogEvent logEvent = new com.statsig.androidsdk.LogEvent(eventName);
                logEvent.setValue(null);
                logEvent.setMetadata(metadata);
                statsigUser = this.user;
                if (statsigUser == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    statsigUser = null;
                }
                logEvent.setUser(statsigUser);
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getStatsigScope$android_sdk_release(), null, null, new com.statsig.androidsdk.StatsigClient$logEvent$3.AnonymousClass1(this, logEvent, null), 3, null);
            }

            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigClient$logEvent$3$1", f = "StatsigClient.kt", i = {}, l = {637}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.statsig.androidsdk.StatsigClient$logEvent$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                final /* synthetic */ com.statsig.androidsdk.LogEvent $event;
                int label;
                final /* synthetic */ com.statsig.androidsdk.StatsigClient this$0;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    com.statsig.androidsdk.StatsigLogger statsigLogger;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        statsigLogger = this.this$0.logger;
                        if (statsigLogger == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                            statsigLogger = null;
                        }
                        this.label = 1;
                        if (statsigLogger.log(this.$event, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((com.statsig.androidsdk.StatsigClient$logEvent$3.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    return new com.statsig.androidsdk.StatsigClient$logEvent$3.AnonymousClass1(this.this$0, this.$event, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(com.statsig.androidsdk.StatsigClient statsigClient, com.statsig.androidsdk.LogEvent logEvent, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigClient$logEvent$3.AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = statsigClient;
                    this.$event = logEvent;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "logEvent", null, null, 12, null);
    }

    public final void updateRuntimeOptions(final com.statsig.androidsdk.StatsigRuntimeMutableOptions runtimeMutableOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runtimeMutableOptions, "");
        enforceInitialized$android_sdk_release("updateRuntimeOptions");
        com.statsig.androidsdk.ErrorBoundary.capture$default(this.errorBoundary, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$updateRuntimeOptions$1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.statsig.androidsdk.StatsigLogger statsigLogger;
                statsigLogger = com.statsig.androidsdk.StatsigClient.this.logger;
                if (statsigLogger == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    statsigLogger = null;
                }
                statsigLogger.setLoggingEnabled(runtimeMutableOptions.getLoggingEnabled());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "updateRuntimeOptions", null, null, 12, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateUserAsync$default(com.statsig.androidsdk.StatsigClient statsigClient, com.statsig.androidsdk.StatsigUser statsigUser, com.statsig.androidsdk.IStatsigCallback iStatsigCallback, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            iStatsigCallback = null;
        }
        if ((i & 4) != 0) {
            map = null;
        }
        statsigClient.updateUserAsync(statsigUser, iStatsigCallback, map);
    }

    public final void updateUserAsync(final com.statsig.androidsdk.StatsigUser user, final com.statsig.androidsdk.IStatsigCallback callback, final java.util.Map<java.lang.String, ? extends java.lang.Object> values) {
        enforceInitialized$android_sdk_release("updateUserAsync");
        com.statsig.androidsdk.ErrorBoundary.capture$default(this.errorBoundary, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$updateUserAsync$1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.statsig.androidsdk.Diagnostics diagnostics;
                com.statsig.androidsdk.Diagnostics diagnostics2;
                com.statsig.androidsdk.StatsigUser normalizeUser;
                com.statsig.androidsdk.Store store;
                com.statsig.androidsdk.Store store2;
                com.statsig.androidsdk.StatsigUser statsigUser;
                com.statsig.androidsdk.IStatsigLifetimeCallback iStatsigLifetimeCallback;
                diagnostics = com.statsig.androidsdk.StatsigClient.this.diagnostics;
                if (diagnostics == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    diagnostics2 = null;
                } else {
                    diagnostics2 = diagnostics;
                }
                com.statsig.androidsdk.Diagnostics.markStart$default(diagnostics2, com.statsig.androidsdk.KeyType.OVERALL, null, null, com.statsig.androidsdk.ContextType.UPDATE_USER, 6, null);
                com.statsig.androidsdk.StatsigClient statsigClient = com.statsig.androidsdk.StatsigClient.this;
                normalizeUser = statsigClient.normalizeUser(user);
                statsigClient.user = normalizeUser;
                com.statsig.androidsdk.StatsigClient.this.resetUser();
                if (values != null) {
                    store2 = com.statsig.androidsdk.StatsigClient.this.store;
                    if (store2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        store2 = null;
                    }
                    java.util.Map<java.lang.String, ? extends java.lang.Object> map = values;
                    statsigUser = com.statsig.androidsdk.StatsigClient.this.user;
                    if (statsigUser == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        statsigUser = null;
                    }
                    store2.bootstrap(map, statsigUser);
                    com.statsig.androidsdk.StatsigClient.this.logEndDiagnostics(true, com.statsig.androidsdk.ContextType.UPDATE_USER, null);
                    com.statsig.androidsdk.IStatsigCallback iStatsigCallback = callback;
                    if (iStatsigCallback != null) {
                        iStatsigCallback.onStatsigUpdateUser();
                    }
                    iStatsigLifetimeCallback = com.statsig.androidsdk.StatsigClient.this.lifetimeCallback;
                    if (iStatsigLifetimeCallback != null) {
                        iStatsigLifetimeCallback.onValuesUpdated();
                        return;
                    }
                    return;
                }
                store = com.statsig.androidsdk.StatsigClient.this.store;
                if (store == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    store = null;
                }
                store.loadCacheForCurrentUser();
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.statsig.androidsdk.StatsigClient.this.getStatsigScope$android_sdk_release(), null, null, new com.statsig.androidsdk.StatsigClient$updateUserAsync$1.AnonymousClass1(com.statsig.androidsdk.StatsigClient.this, callback, null), 3, null);
            }

            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigClient$updateUserAsync$1$1", f = "StatsigClient.kt", i = {}, l = {699, 700}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.statsig.androidsdk.StatsigClient$updateUserAsync$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                final /* synthetic */ com.statsig.androidsdk.IStatsigCallback $callback;
                int label;
                final /* synthetic */ com.statsig.androidsdk.StatsigClient this$0;

                /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
                
                    if (kotlinx.coroutines.BuildersKt.withContext(r6.getMain(), new com.statsig.androidsdk.StatsigClient$updateUserAsync$1.AnonymousClass1.C02031(r5.$callback, null), r5) == r0) goto L17;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
                
                    if (r6 != r0) goto L12;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    java.lang.Object updateUserImpl;
                    com.statsig.androidsdk.CoroutineDispatcherProvider coroutineDispatcherProvider;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        updateUserImpl = this.this$0.updateUserImpl(this);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    coroutineDispatcherProvider = this.this$0.dispatcherProvider;
                    this.label = 2;
                }

                @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigClient$updateUserAsync$1$1$1", f = "StatsigClient.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.statsig.androidsdk.StatsigClient$updateUserAsync$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C02031 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                    final /* synthetic */ com.statsig.androidsdk.IStatsigCallback $callback;
                    int label;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        try {
                            com.statsig.androidsdk.IStatsigCallback iStatsigCallback = this.$callback;
                            if (iStatsigCallback != null) {
                                iStatsigCallback.onStatsigUpdateUser();
                            }
                            return kotlin.Unit.INSTANCE;
                        } catch (java.lang.Exception e) {
                            throw new com.statsig.androidsdk.ExternalException(e.getMessage());
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        return ((com.statsig.androidsdk.StatsigClient$updateUserAsync$1.AnonymousClass1.C02031) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                        return new com.statsig.androidsdk.StatsigClient$updateUserAsync$1.AnonymousClass1.C02031(this.$callback, continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C02031(com.statsig.androidsdk.IStatsigCallback iStatsigCallback, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigClient$updateUserAsync$1.AnonymousClass1.C02031> continuation) {
                        super(2, continuation);
                        this.$callback = iStatsigCallback;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((com.statsig.androidsdk.StatsigClient$updateUserAsync$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    return new com.statsig.androidsdk.StatsigClient$updateUserAsync$1.AnonymousClass1(this.this$0, this.$callback, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(com.statsig.androidsdk.StatsigClient statsigClient, com.statsig.androidsdk.IStatsigCallback iStatsigCallback, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigClient$updateUserAsync$1.AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = statsigClient;
                    this.$callback = iStatsigCallback;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "updateUserAsync", null, null, 12, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object updateUser$default(com.statsig.androidsdk.StatsigClient statsigClient, com.statsig.androidsdk.StatsigUser statsigUser, java.util.Map map, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        return statsigClient.updateUser(statsigUser, map, continuation);
    }

    public final java.lang.Object updateUser(com.statsig.androidsdk.StatsigUser statsigUser, java.util.Map<java.lang.String, ? extends java.lang.Object> map, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        enforceInitialized$android_sdk_release("updateUser");
        java.lang.Object captureAsync = this.errorBoundary.captureAsync(new com.statsig.androidsdk.StatsigClient$updateUser$2(this, statsigUser, map, null), continuation);
        return captureAsync == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? captureAsync : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object refreshCacheAsync$default(com.statsig.androidsdk.StatsigClient statsigClient, com.statsig.androidsdk.IStatsigCallback iStatsigCallback, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            iStatsigCallback = null;
        }
        return statsigClient.refreshCacheAsync(iStatsigCallback, continuation);
    }

    public final java.lang.Object refreshCacheAsync(final com.statsig.androidsdk.IStatsigCallback iStatsigCallback, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        enforceInitialized$android_sdk_release("refreshCacheAsync");
        com.statsig.androidsdk.ErrorBoundary.capture$default(this.errorBoundary, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$refreshCacheAsync$2
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.statsig.androidsdk.Diagnostics diagnostics;
                com.statsig.androidsdk.Diagnostics diagnostics2;
                diagnostics = com.statsig.androidsdk.StatsigClient.this.diagnostics;
                if (diagnostics == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    diagnostics2 = null;
                } else {
                    diagnostics2 = diagnostics;
                }
                com.statsig.androidsdk.Diagnostics.markStart$default(diagnostics2, com.statsig.androidsdk.KeyType.OVERALL, null, null, com.statsig.androidsdk.ContextType.UPDATE_USER, 6, null);
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.statsig.androidsdk.StatsigClient.this.getStatsigScope$android_sdk_release(), null, null, new com.statsig.androidsdk.StatsigClient$refreshCacheAsync$2.AnonymousClass1(com.statsig.androidsdk.StatsigClient.this, iStatsigCallback, null), 3, null);
            }

            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigClient$refreshCacheAsync$2$1", f = "StatsigClient.kt", i = {}, l = {758, 759}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.statsig.androidsdk.StatsigClient$refreshCacheAsync$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                final /* synthetic */ com.statsig.androidsdk.IStatsigCallback $callback;
                int label;
                final /* synthetic */ com.statsig.androidsdk.StatsigClient this$0;

                /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
                
                    if (kotlinx.coroutines.BuildersKt.withContext(r6.getMain(), new com.statsig.androidsdk.StatsigClient$refreshCacheAsync$2.AnonymousClass1.C02011(r5.$callback, null), r5) == r0) goto L17;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
                
                    if (r6 != r0) goto L12;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    java.lang.Object updateUserImpl;
                    com.statsig.androidsdk.CoroutineDispatcherProvider coroutineDispatcherProvider;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        updateUserImpl = this.this$0.updateUserImpl(this);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    coroutineDispatcherProvider = this.this$0.dispatcherProvider;
                    this.label = 2;
                }

                @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigClient$refreshCacheAsync$2$1$1", f = "StatsigClient.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.statsig.androidsdk.StatsigClient$refreshCacheAsync$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C02011 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                    final /* synthetic */ com.statsig.androidsdk.IStatsigCallback $callback;
                    int label;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        try {
                            com.statsig.androidsdk.IStatsigCallback iStatsigCallback = this.$callback;
                            if (iStatsigCallback != null) {
                                iStatsigCallback.onStatsigUpdateUser();
                            }
                            return kotlin.Unit.INSTANCE;
                        } catch (java.lang.Exception e) {
                            throw new com.statsig.androidsdk.ExternalException(e.getMessage());
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        return ((com.statsig.androidsdk.StatsigClient$refreshCacheAsync$2.AnonymousClass1.C02011) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                        return new com.statsig.androidsdk.StatsigClient$refreshCacheAsync$2.AnonymousClass1.C02011(this.$callback, continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C02011(com.statsig.androidsdk.IStatsigCallback iStatsigCallback, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigClient$refreshCacheAsync$2.AnonymousClass1.C02011> continuation) {
                        super(2, continuation);
                        this.$callback = iStatsigCallback;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((com.statsig.androidsdk.StatsigClient$refreshCacheAsync$2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    return new com.statsig.androidsdk.StatsigClient$refreshCacheAsync$2.AnonymousClass1(this.this$0, this.$callback, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(com.statsig.androidsdk.StatsigClient statsigClient, com.statsig.androidsdk.IStatsigCallback iStatsigCallback, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigClient$refreshCacheAsync$2.AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = statsigClient;
                    this.$callback = iStatsigCallback;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "refreshCacheAsync", null, null, 12, null);
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object refreshCache(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        enforceInitialized$android_sdk_release("refreshCache");
        java.lang.Object captureAsync = this.errorBoundary.captureAsync(new com.statsig.androidsdk.StatsigClient$refreshCache$2(this, null), continuation);
        return captureAsync == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? captureAsync : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.statsig.androidsdk.ExternalInitializeResponse getInitializeResponseJson() {
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        enforceInitialized$android_sdk_release("getInitializeResponseJson");
        com.statsig.androidsdk.ErrorBoundary.capture$default(this.errorBoundary, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$getInitializeResponseJson$1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [T, com.statsig.androidsdk.ExternalInitializeResponse] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.statsig.androidsdk.Store store;
                kotlin.jvm.internal.Ref.ObjectRef<com.statsig.androidsdk.ExternalInitializeResponse> objectRef2 = objectRef;
                store = this.store;
                if (store == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    store = null;
                }
                objectRef2.element = store.getCurrentCacheValuesAndEvaluationReason();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "getInitializeResponseJson", null, null, 12, null);
        com.statsig.androidsdk.ExternalInitializeResponse externalInitializeResponse = (com.statsig.androidsdk.ExternalInitializeResponse) objectRef.element;
        return externalInitializeResponse == null ? com.statsig.androidsdk.ExternalInitializeResponse.INSTANCE.getUninitialized() : externalInitializeResponse;
    }

    public final java.lang.Object shutdownSuspend(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        enforceInitialized$android_sdk_release("shutdownSuspend");
        return this.errorBoundary.captureAsync(new com.statsig.androidsdk.StatsigClient$shutdownSuspend$2(this, null), continuation);
    }

    public final void shutdown() {
        enforceInitialized$android_sdk_release("shutdown");
        kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.statsig.androidsdk.StatsigClient$shutdown$1(this, null), 1, null);
    }

    public final java.lang.Object flush(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        enforceInitialized$android_sdk_release("flush");
        return this.errorBoundary.captureAsync(new com.statsig.androidsdk.StatsigClient$flush$2(this, null), continuation);
    }

    public final void overrideGate(final java.lang.String gateName, final boolean value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gateName, "");
        com.statsig.androidsdk.ErrorBoundary.capture$default(this.errorBoundary, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$overrideGate$1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigClient$overrideGate$1$1", f = "StatsigClient.kt", i = {}, l = {832}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.statsig.androidsdk.StatsigClient$overrideGate$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                int label;
                final /* synthetic */ com.statsig.androidsdk.StatsigClient this$0;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    com.statsig.androidsdk.Store store;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        store = this.this$0.store;
                        if (store == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                            store = null;
                        }
                        this.label = 1;
                        if (store.saveOverridesToLocalStorage(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((com.statsig.androidsdk.StatsigClient$overrideGate$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    return new com.statsig.androidsdk.StatsigClient$overrideGate$1.AnonymousClass1(this.this$0, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(com.statsig.androidsdk.StatsigClient statsigClient, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigClient$overrideGate$1.AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = statsigClient;
                }
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.statsig.androidsdk.Store store;
                store = com.statsig.androidsdk.StatsigClient.this.store;
                if (store == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    store = null;
                }
                store.overrideGate(gateName, value);
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.statsig.androidsdk.StatsigClient.this.getStatsigScope$android_sdk_release(), null, null, new com.statsig.androidsdk.StatsigClient$overrideGate$1.AnonymousClass1(com.statsig.androidsdk.StatsigClient.this, null), 3, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "overrideGate", null, null, 12, null);
    }

    public final void overrideConfig(final java.lang.String configName, final java.util.Map<java.lang.String, ? extends java.lang.Object> value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        com.statsig.androidsdk.ErrorBoundary.capture$default(this.errorBoundary, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$overrideConfig$1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigClient$overrideConfig$1$1", f = "StatsigClient.kt", i = {}, l = {847}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.statsig.androidsdk.StatsigClient$overrideConfig$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                int label;
                final /* synthetic */ com.statsig.androidsdk.StatsigClient this$0;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    com.statsig.androidsdk.Store store;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        store = this.this$0.store;
                        if (store == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                            store = null;
                        }
                        this.label = 1;
                        if (store.saveOverridesToLocalStorage(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((com.statsig.androidsdk.StatsigClient$overrideConfig$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    return new com.statsig.androidsdk.StatsigClient$overrideConfig$1.AnonymousClass1(this.this$0, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(com.statsig.androidsdk.StatsigClient statsigClient, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigClient$overrideConfig$1.AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = statsigClient;
                }
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.statsig.androidsdk.Store store;
                store = com.statsig.androidsdk.StatsigClient.this.store;
                if (store == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    store = null;
                }
                store.overrideConfig(configName, value);
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.statsig.androidsdk.StatsigClient.this.getStatsigScope$android_sdk_release(), null, null, new com.statsig.androidsdk.StatsigClient$overrideConfig$1.AnonymousClass1(com.statsig.androidsdk.StatsigClient.this, null), 3, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "overrideConfig", null, null, 12, null);
    }

    public final void overrideLayer(final java.lang.String configName, final java.util.Map<java.lang.String, ? extends java.lang.Object> value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        com.statsig.androidsdk.ErrorBoundary.capture$default(this.errorBoundary, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$overrideLayer$1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigClient$overrideLayer$1$1", f = "StatsigClient.kt", i = {}, l = {862}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.statsig.androidsdk.StatsigClient$overrideLayer$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                int label;
                final /* synthetic */ com.statsig.androidsdk.StatsigClient this$0;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    com.statsig.androidsdk.Store store;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        store = this.this$0.store;
                        if (store == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                            store = null;
                        }
                        this.label = 1;
                        if (store.saveOverridesToLocalStorage(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((com.statsig.androidsdk.StatsigClient$overrideLayer$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    return new com.statsig.androidsdk.StatsigClient$overrideLayer$1.AnonymousClass1(this.this$0, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(com.statsig.androidsdk.StatsigClient statsigClient, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigClient$overrideLayer$1.AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = statsigClient;
                }
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.statsig.androidsdk.Store store;
                store = com.statsig.androidsdk.StatsigClient.this.store;
                if (store == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    store = null;
                }
                store.overrideLayer(configName, value);
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.statsig.androidsdk.StatsigClient.this.getStatsigScope$android_sdk_release(), null, null, new com.statsig.androidsdk.StatsigClient$overrideLayer$1.AnonymousClass1(com.statsig.androidsdk.StatsigClient.this, null), 3, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "overrideLayer", null, null, 12, null);
    }

    public final void removeOverride(final java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        com.statsig.androidsdk.ErrorBoundary.capture$default(this.errorBoundary, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$removeOverride$1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigClient$removeOverride$1$1", f = "StatsigClient.kt", i = {}, l = {876}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.statsig.androidsdk.StatsigClient$removeOverride$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                int label;
                final /* synthetic */ com.statsig.androidsdk.StatsigClient this$0;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    com.statsig.androidsdk.Store store;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        store = this.this$0.store;
                        if (store == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                            store = null;
                        }
                        this.label = 1;
                        if (store.saveOverridesToLocalStorage(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((com.statsig.androidsdk.StatsigClient$removeOverride$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    return new com.statsig.androidsdk.StatsigClient$removeOverride$1.AnonymousClass1(this.this$0, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(com.statsig.androidsdk.StatsigClient statsigClient, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigClient$removeOverride$1.AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = statsigClient;
                }
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.statsig.androidsdk.Store store;
                store = com.statsig.androidsdk.StatsigClient.this.store;
                if (store == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    store = null;
                }
                store.removeOverride(name2);
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.statsig.androidsdk.StatsigClient.this.getStatsigScope$android_sdk_release(), null, null, new com.statsig.androidsdk.StatsigClient$removeOverride$1.AnonymousClass1(com.statsig.androidsdk.StatsigClient.this, null), 3, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, null, null, null, 14, null);
    }

    public final void removeAllOverrides() {
        com.statsig.androidsdk.ErrorBoundary.capture$default(this.errorBoundary, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$removeAllOverrides$1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigClient$removeAllOverrides$1$1", f = "StatsigClient.kt", i = {}, l = {885}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.statsig.androidsdk.StatsigClient$removeAllOverrides$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                int label;
                final /* synthetic */ com.statsig.androidsdk.StatsigClient this$0;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    com.statsig.androidsdk.Store store;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        store = this.this$0.store;
                        if (store == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                            store = null;
                        }
                        this.label = 1;
                        if (store.saveOverridesToLocalStorage(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((com.statsig.androidsdk.StatsigClient$removeAllOverrides$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    return new com.statsig.androidsdk.StatsigClient$removeAllOverrides$1.AnonymousClass1(this.this$0, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(com.statsig.androidsdk.StatsigClient statsigClient, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigClient$removeAllOverrides$1.AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = statsigClient;
                }
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.statsig.androidsdk.Store store;
                store = com.statsig.androidsdk.StatsigClient.this.store;
                if (store == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    store = null;
                }
                store.removeAllOverrides();
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.statsig.androidsdk.StatsigClient.this.getStatsigScope$android_sdk_release(), null, null, new com.statsig.androidsdk.StatsigClient$removeAllOverrides$1.AnonymousClass1(com.statsig.androidsdk.StatsigClient.this, null), 3, null);
            }

            {
                super(0);
            }
        }, null, null, null, 14, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.Deprecated(message = "This function will be deprecated in a future release - the field is available in StatsigMetadata", replaceWith = @kotlin.ReplaceWith(expression = "getStatsigMetadata().stableID", imports = {}))
    public final java.lang.String getStableID() {
        enforceInitialized$android_sdk_release("getStableID");
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = "";
        com.statsig.androidsdk.ErrorBoundary.capture$default(this.errorBoundary, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$getStableID$1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                kotlin.jvm.internal.Ref.ObjectRef<java.lang.String> objectRef2 = objectRef;
                java.lang.String stableID = this.getStatsigClientMetadata$android_sdk_release().getStableID();
                T t = stableID;
                if (stableID == null) {
                    t = "";
                }
                objectRef2.element = t;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "getStableID", null, null, 12, null);
        return (java.lang.String) objectRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.Deprecated(message = "This function will be deprecated in a future release - the field is available in StatsigMetadata", replaceWith = @kotlin.ReplaceWith(expression = "getStatsigMetadata().stableID", imports = {}))
    public final java.lang.String getSessionID() {
        enforceInitialized$android_sdk_release("getSessionID");
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = "";
        com.statsig.androidsdk.ErrorBoundary.capture$default(this.errorBoundary, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$getSessionID$1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.String] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                objectRef.element = this.getStatsigClientMetadata$android_sdk_release().getSessionID();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "getSessionID", null, null, 12, null);
        return (java.lang.String) objectRef.element;
    }

    public final com.statsig.androidsdk.StatsigMetadata getStatsigMetadata() {
        com.statsig.androidsdk.StatsigMetadata copy;
        enforceInitialized$android_sdk_release("getStatsigMetadata()");
        copy = r2.copy((r28 & 1) != 0 ? r2.stableID : null, (r28 & 2) != 0 ? r2.sdkType : null, (r28 & 4) != 0 ? r2.sdkVersion : null, (r28 & 8) != 0 ? r2.sessionID : null, (r28 & 16) != 0 ? r2.appIdentifier : null, (r28 & 32) != 0 ? r2.appVersion : null, (r28 & 64) != 0 ? r2.deviceManufacturer : null, (r28 & 128) != 0 ? r2.deviceModel : null, (r28 & 256) != 0 ? r2.deviceOS : null, (r28 & 512) != 0 ? r2.locale : null, (r28 & 1024) != 0 ? r2.language : null, (r28 & 2048) != 0 ? r2.systemVersion : null, (r28 & 4096) != 0 ? getStatsigClientMetadata$android_sdk_release().systemName : null);
        return copy;
    }

    public final void manuallyLogGateExposure(final java.lang.String gateName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gateName, "");
        enforceInitialized$android_sdk_release("logManualGateExposure");
        com.statsig.androidsdk.ErrorBoundary.capture$default(this.errorBoundary, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$manuallyLogGateExposure$1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.statsig.androidsdk.Store store;
                store = com.statsig.androidsdk.StatsigClient.this.store;
                if (store == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    store = null;
                }
                com.statsig.androidsdk.StatsigClient.this.logExposure(gateName, store.checkGate(gateName), true);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "logManualGateExposure", null, gateName, 4, null);
    }

    public final void manuallyLogConfigExposure(final java.lang.String configName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configName, "");
        enforceInitialized$android_sdk_release("logManualConfigExposure");
        com.statsig.androidsdk.ErrorBoundary.capture$default(this.errorBoundary, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$manuallyLogConfigExposure$1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.statsig.androidsdk.Store store;
                store = com.statsig.androidsdk.StatsigClient.this.store;
                if (store == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    store = null;
                }
                com.statsig.androidsdk.StatsigClient.this.logExposure(configName, store.getConfig(configName), true);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "logManualConfigExposure", null, configName, 4, null);
    }

    public final void manuallyLogExperimentExposure(final java.lang.String configName, final boolean keepDeviceValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configName, "");
        enforceInitialized$android_sdk_release("logManualExperimentExposure");
        com.statsig.androidsdk.ErrorBoundary.capture$default(this.errorBoundary, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$manuallyLogExperimentExposure$1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.statsig.androidsdk.Store store;
                store = com.statsig.androidsdk.StatsigClient.this.store;
                if (store == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    store = null;
                }
                com.statsig.androidsdk.StatsigClient.this.logExposure(configName, store.getExperiment(configName, keepDeviceValue), true);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "logManualExperimentExposure", null, configName, 4, null);
    }

    public final void manuallyLogLayerParameterExposure(final java.lang.String layerName, final java.lang.String parameterName, final boolean keepDeviceValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layerName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameterName, "");
        enforceInitialized$android_sdk_release("logManualLayerExposure");
        com.statsig.androidsdk.ErrorBoundary.capture$default(this.errorBoundary, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$manuallyLogLayerParameterExposure$1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.statsig.androidsdk.Store store;
                store = com.statsig.androidsdk.StatsigClient.this.store;
                if (store == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    store = null;
                }
                com.statsig.androidsdk.StatsigClient.this.logLayerParameterExposure$android_sdk_release(store.getLayer(null, layerName, keepDeviceValue), parameterName, true);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "logManualLayerExposure", null, layerName, 4, null);
    }

    public final void manuallyLogGateExposure(final com.statsig.androidsdk.FeatureGate gate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gate, "");
        enforceInitialized$android_sdk_release("logManualGateExposure");
        com.statsig.androidsdk.ErrorBoundary.capture$default(this.errorBoundary, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$manuallyLogGateExposure$2
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.statsig.androidsdk.StatsigClient.this.logExposure(gate.getName(), gate, true);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "logManualGateExposure", null, gate.getName(), 4, null);
    }

    public final void manuallyLogConfigExposure(final com.statsig.androidsdk.DynamicConfig config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        enforceInitialized$android_sdk_release("logManualConfigExposure");
        com.statsig.androidsdk.ErrorBoundary.capture$default(this.errorBoundary, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$manuallyLogConfigExposure$2
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.statsig.androidsdk.StatsigClient.this.logExposure(config.getName(), config, true);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "logManualConfigExposure", null, config.getName(), 4, null);
    }

    public final void manuallyLogExperimentExposure(final com.statsig.androidsdk.DynamicConfig experiment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(experiment, "");
        enforceInitialized$android_sdk_release("logManualExperimentExposure");
        com.statsig.androidsdk.ErrorBoundary.capture$default(this.errorBoundary, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$manuallyLogExperimentExposure$2
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.statsig.androidsdk.StatsigClient.this.logExposure(experiment.getName(), experiment, true);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "logManualExperimentExposure", null, experiment.getName(), 4, null);
    }

    public final void manuallyLogLayerParameterExposure(final com.statsig.androidsdk.Layer layer, final java.lang.String parameterName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameterName, "");
        enforceInitialized$android_sdk_release("logManualLayerExposure");
        com.statsig.androidsdk.ErrorBoundary.capture$default(this.errorBoundary, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$manuallyLogLayerParameterExposure$2
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.statsig.androidsdk.StatsigClient.this.logLayerParameterExposure$android_sdk_release(layer, parameterName, true);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, "logManualLayerExposure", null, layer.getName(), 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.statsig.androidsdk.StatsigOverrides getAllOverrides() {
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        com.statsig.androidsdk.ErrorBoundary.capture$default(this.errorBoundary, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$getAllOverrides$1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [T, com.statsig.androidsdk.StatsigOverrides] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                objectRef.element = this.getStore$android_sdk_release().getAllOverrides();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, null, null, null, 14, null);
        com.statsig.androidsdk.StatsigOverrides statsigOverrides = (com.statsig.androidsdk.StatsigOverrides) objectRef.element;
        return statsigOverrides == null ? com.statsig.androidsdk.StatsigOverrides.INSTANCE.empty() : statsigOverrides;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void openDebugView$default(com.statsig.androidsdk.StatsigClient statsigClient, android.content.Context context, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        statsigClient.openDebugView(context, function1);
    }

    public final void openDebugView(final android.content.Context context, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.statsig.androidsdk.ErrorBoundary.capture$default(this.errorBoundary, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$openDebugView$1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.statsig.androidsdk.Store store;
                com.statsig.androidsdk.Store store2;
                com.statsig.androidsdk.StatsigUser statsigUser;
                java.lang.String str;
                store = com.statsig.androidsdk.StatsigClient.this.store;
                java.lang.String str2 = null;
                if (store == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    store = null;
                }
                kotlin.Pair[] pairArr = new kotlin.Pair[4];
                pairArr[0] = kotlin.TuplesKt.to("values", store.getCurrentValuesAsString());
                store2 = com.statsig.androidsdk.StatsigClient.this.store;
                if (store2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    store2 = null;
                }
                pairArr[1] = kotlin.TuplesKt.to("evalReason", store2.getReason());
                statsigUser = com.statsig.androidsdk.StatsigClient.this.user;
                if (statsigUser == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    statsigUser = null;
                }
                pairArr[2] = kotlin.TuplesKt.to("user", statsigUser.getCopyForEvaluation$android_sdk_release());
                pairArr[3] = kotlin.TuplesKt.to("options", com.statsig.androidsdk.StatsigClient.this.getOptions$android_sdk_release().toMap$android_sdk_release());
                java.util.Map<java.lang.String, ? extends java.lang.Object> mapOf = kotlin.collections.MapsKt.mapOf(pairArr);
                com.statsig.androidsdk.DebugView.Companion companion = com.statsig.androidsdk.DebugView.INSTANCE;
                android.content.Context context2 = context;
                str = com.statsig.androidsdk.StatsigClient.this.sdkKey;
                if (str == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    str2 = str;
                }
                companion.show(context2, str2, mapOf, callback);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }
        }, null, null, null, 14, null);
    }

    public final java.lang.Object setupAsync$android_sdk_release(com.statsig.androidsdk.StatsigUser statsigUser, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.InitializationDetails> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.dispatcherProvider.getIo(), new com.statsig.androidsdk.StatsigClient$setupAsync$2(this, statsigUser, null), continuation);
    }

    static /* synthetic */ com.statsig.androidsdk.StatsigUser setup$default(com.statsig.androidsdk.StatsigClient statsigClient, android.app.Application application, java.lang.String str, com.statsig.androidsdk.StatsigUser statsigUser, com.statsig.androidsdk.StatsigOptions statsigOptions, int i, java.lang.Object obj) {
        com.statsig.androidsdk.StatsigClient statsigClient2;
        android.app.Application application2;
        java.lang.String str2;
        com.statsig.androidsdk.StatsigOptions statsigOptions2;
        com.statsig.androidsdk.StatsigUser statsigUser2 = (i & 4) != 0 ? null : statsigUser;
        if ((i & 8) != 0) {
            statsigOptions2 = new com.statsig.androidsdk.StatsigOptions(null, null, false, false, false, 0L, 0, false, 0.0d, null, false, null, false, null, null, null, null, null, null, false, false, null, null, false, false, 33554431, null);
            statsigClient2 = statsigClient;
            application2 = application;
            str2 = str;
        } else {
            statsigClient2 = statsigClient;
            application2 = application;
            str2 = str;
            statsigOptions2 = statsigOptions;
        }
        return statsigClient2.setup(application2, str2, statsigUser2, statsigOptions2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.statsig.androidsdk.StatsigUser setup(android.app.Application application, java.lang.String sdkKey, com.statsig.androidsdk.StatsigUser user, com.statsig.androidsdk.StatsigOptions options) {
        com.statsig.androidsdk.KeyValueStorage<java.lang.String> keyValueStorage;
        com.statsig.androidsdk.StatsigMetadata createStatsigMetadata;
        com.statsig.androidsdk.Diagnostics diagnostics;
        com.statsig.androidsdk.Diagnostics diagnostics2;
        com.statsig.androidsdk.Diagnostics diagnostics3;
        com.statsig.androidsdk.KeyValueStorage<java.lang.String> keyValueStorage2;
        com.statsig.androidsdk.Store store;
        if (!kotlin.text.StringsKt.startsWith$default(sdkKey, "client-", false, 2, (java.lang.Object) null) && !kotlin.text.StringsKt.startsWith$default(sdkKey, "test-", false, 2, (java.lang.Object) null)) {
            throw new java.lang.IllegalArgumentException("Invalid SDK Key provided.  You must provide a client SDK Key from the API Key page of your Statsig console");
        }
        this.initTime = android.os.SystemClock.elapsedRealtime();
        com.statsig.androidsdk.HttpUtils.INSTANCE.maybeInitializeHttpClient(application);
        com.statsig.androidsdk.HttpUtils.Companion companion = com.statsig.androidsdk.HttpUtils.INSTANCE;
        java.util.List<okhttp3.Interceptor> interceptors = options.getInterceptors();
        if (interceptors == null) {
            interceptors = kotlin.collections.CollectionsKt.emptyList();
        }
        companion.addInterceptors$android_sdk_release(interceptors);
        com.statsig.androidsdk.Diagnostics diagnostics4 = new com.statsig.androidsdk.Diagnostics(options.getLoggingCopy$android_sdk_release());
        this.diagnostics = diagnostics4;
        com.statsig.androidsdk.Diagnostics.markStart$default(diagnostics4, com.statsig.androidsdk.KeyType.OVERALL, null, null, null, 14, null);
        this.application = application;
        kotlinx.coroutines.CoroutineScope CoroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null).plus(this.dispatcherProvider.getIo()));
        android.app.Application application2 = application;
        this.integratedSdkExperiments.initialize(new com.statsig.androidsdk.LegacyKeyValueStorage(application2));
        if (keyValueStorageImplementationOverride == com.statsig.androidsdk.StatsigClient.Companion.KeyValueStorageImplementation.LEGACY) {
            keyValueStorageImplementationOverride = this.integratedSdkExperiments.getStorageImplementation$android_sdk_release();
        }
        this.keyValueStorage = INSTANCE.createKeyValueStorage$android_sdk_release(application, CoroutineScope);
        this.sdkKey = sdkKey;
        setOptions$android_sdk_release(options);
        com.statsig.androidsdk.StatsigUser normalizeUser = normalizeUser(user);
        java.util.Map<java.lang.String, ? extends java.lang.Object> initializeValues = options.getInitializeValues();
        this.user = normalizeUser;
        this.lifetimeCallback = options.getLifetimeCallback();
        this.exceptionHandler = this.errorBoundary.getExceptionHandler();
        kotlin.coroutines.CoroutineContext plus = this.statsigJob.plus(this.dispatcherProvider.getMain());
        kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionHandler = this.exceptionHandler;
        if (coroutineExceptionHandler == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            coroutineExceptionHandler = null;
        }
        setStatsigScope$android_sdk_release(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(plus.plus(coroutineExceptionHandler)));
        com.statsig.androidsdk.KeyValueStorage<java.lang.String> keyValueStorage3 = this.keyValueStorage;
        if (keyValueStorage3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            keyValueStorage3 = null;
        }
        com.statsig.androidsdk.NetworkFallbackResolver networkFallbackResolver = new com.statsig.androidsdk.NetworkFallbackResolver(keyValueStorage3, getStatsigScope$android_sdk_release(), this.gson);
        kotlinx.coroutines.CoroutineScope statsigScope$android_sdk_release = getStatsigScope$android_sdk_release();
        com.statsig.androidsdk.KeyValueStorage<java.lang.String> keyValueStorage4 = this.keyValueStorage;
        if (keyValueStorage4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            keyValueStorage = null;
        } else {
            keyValueStorage = keyValueStorage4;
        }
        this.store = new com.statsig.androidsdk.Store(statsigScope$android_sdk_release, keyValueStorage, normalizeUser, sdkKey, options, this.gson);
        com.statsig.androidsdk.StatsigNetworkConnectivityListener statsigNetworkConnectivityListener = new com.statsig.androidsdk.StatsigNetworkConnectivityListener(application2);
        this.connectivityListener = statsigNetworkConnectivityListener;
        if (this.statsigNetwork == null) {
            com.statsig.androidsdk.KeyValueStorage<java.lang.String> keyValueStorage5 = this.keyValueStorage;
            if (keyValueStorage5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                keyValueStorage2 = null;
            } else {
                keyValueStorage2 = keyValueStorage5;
            }
            kotlinx.coroutines.CoroutineScope statsigScope$android_sdk_release2 = getStatsigScope$android_sdk_release();
            com.statsig.androidsdk.Store store2 = this.store;
            if (store2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                store = null;
            } else {
                store = store2;
            }
            setStatsigNetwork$android_sdk_release(com.statsig.androidsdk.StatsigNetworkKt.StatsigNetwork(statsigNetworkConnectivityListener, sdkKey, keyValueStorage2, options, networkFallbackResolver, statsigScope$android_sdk_release2, store, this.gson));
        }
        if (options.getOptOutNonSdkMetadata()) {
            createStatsigMetadata = com.statsig.androidsdk.StatsigMetadataKt.createCoreStatsigMetadata();
        } else {
            createStatsigMetadata = com.statsig.androidsdk.StatsigMetadataKt.createStatsigMetadata();
        }
        setStatsigClientMetadata$android_sdk_release(createStatsigMetadata);
        this.errorBoundary.setMetadata(getStatsigClientMetadata$android_sdk_release());
        this.onDeviceEvalAdapter = options.getOnDeviceEvalAdapter();
        this.initialized.set(true);
        this.lifecycleListener = new com.statsig.androidsdk.StatsigActivityLifecycleListener(application, this);
        kotlinx.coroutines.CoroutineScope statsigScope$android_sdk_release3 = getStatsigScope$android_sdk_release();
        java.lang.String eventLoggingAPI = options.getEventLoggingAPI();
        com.statsig.androidsdk.StatsigMetadata statsigClientMetadata$android_sdk_release = getStatsigClientMetadata$android_sdk_release();
        com.statsig.androidsdk.StatsigNetwork statsigNetwork$android_sdk_release = getStatsigNetwork$android_sdk_release();
        com.statsig.androidsdk.Diagnostics diagnostics5 = this.diagnostics;
        if (diagnostics5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            diagnostics = null;
        } else {
            diagnostics = diagnostics5;
        }
        this.logger = new com.statsig.androidsdk.StatsigLogger(statsigScope$android_sdk_release3, sdkKey, eventLoggingAPI, statsigClientMetadata$android_sdk_release, statsigNetwork$android_sdk_release, normalizeUser, diagnostics, options.getLogEventFallbackUrls(), options.getLoggingEnabled(), this.gson);
        populateStatsigMetadata();
        if (options.getOverrideStableID() == null) {
            getStatsigClientMetadata$android_sdk_release().overrideStableID$android_sdk_release(getLocalStorageStableID());
        }
        if (!getOptions$android_sdk_release().getLoadCacheAsync()) {
            com.statsig.androidsdk.Diagnostics diagnostics6 = this.diagnostics;
            if (diagnostics6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                diagnostics2 = null;
            } else {
                diagnostics2 = diagnostics6;
            }
            com.statsig.androidsdk.Diagnostics.markStart$default(diagnostics2, com.statsig.androidsdk.KeyType.INITIALIZE, com.statsig.androidsdk.StepType.LOAD_CACHE, new com.statsig.androidsdk.Marker(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, java.lang.Boolean.TRUE, 524287, null), null, 8, null);
            com.statsig.androidsdk.Store store3 = this.store;
            if (store3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                store3 = null;
            }
            store3.syncLoadFromLocalStorage();
            com.statsig.androidsdk.Diagnostics diagnostics7 = this.diagnostics;
            if (diagnostics7 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                diagnostics3 = null;
            } else {
                diagnostics3 = diagnostics7;
            }
            diagnostics3.markEnd(com.statsig.androidsdk.KeyType.INITIALIZE, true, (r13 & 4) != 0 ? null : com.statsig.androidsdk.StepType.LOAD_CACHE, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        }
        if (initializeValues != null) {
            com.statsig.androidsdk.Store store4 = this.store;
            if (store4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                store4 = null;
            }
            com.statsig.androidsdk.StatsigUser statsigUser = this.user;
            if (statsigUser == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                statsigUser = null;
            }
            store4.bootstrap(initializeValues, statsigUser);
            this.isBootstrapped.set(true);
        }
        return normalizeUser;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetUser() {
        com.statsig.androidsdk.ErrorBoundary.capture$default(this.errorBoundary, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.statsig.androidsdk.StatsigClient$resetUser$1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.statsig.androidsdk.StatsigLogger statsigLogger;
                kotlinx.coroutines.Job job;
                com.statsig.androidsdk.Store store;
                com.statsig.androidsdk.StatsigUser statsigUser;
                statsigLogger = com.statsig.androidsdk.StatsigClient.this.logger;
                com.statsig.androidsdk.StatsigUser statsigUser2 = null;
                if (statsigLogger == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    statsigLogger = null;
                }
                statsigLogger.onUpdateUser();
                job = com.statsig.androidsdk.StatsigClient.this.pollingJob;
                if (job != null) {
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                }
                store = com.statsig.androidsdk.StatsigClient.this.store;
                if (store == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    store = null;
                }
                statsigUser = com.statsig.androidsdk.StatsigClient.this.user;
                if (statsigUser == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    statsigUser2 = statsigUser;
                }
                store.resetUser(statsigUser2);
            }

            {
                super(0);
            }
        }, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object updateUserImpl(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(this.dispatcherProvider.getIo(), new com.statsig.androidsdk.StatsigClient$updateUserImpl$2(this, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.statsig.androidsdk.FeatureGate getFeatureGateEvaluation(java.lang.String gateName) {
        com.statsig.androidsdk.Store store = this.store;
        com.statsig.androidsdk.StatsigUser statsigUser = null;
        if (store == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            store = null;
        }
        com.statsig.androidsdk.FeatureGate checkGate = store.checkGate(gateName);
        com.statsig.androidsdk.OnDeviceEvalAdapter onDeviceEvalAdapter = this.onDeviceEvalAdapter;
        if (onDeviceEvalAdapter != null) {
            com.statsig.androidsdk.StatsigUser statsigUser2 = this.user;
            if (statsigUser2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                statsigUser = statsigUser2;
            }
            com.statsig.androidsdk.FeatureGate gate = onDeviceEvalAdapter.getGate(checkGate, statsigUser);
            if (gate != null) {
                return gate;
            }
        }
        return checkGate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.statsig.androidsdk.DynamicConfig getDynamicConfigEvaluation(java.lang.String configName) {
        com.statsig.androidsdk.Store store = this.store;
        com.statsig.androidsdk.StatsigUser statsigUser = null;
        if (store == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            store = null;
        }
        com.statsig.androidsdk.DynamicConfig config = store.getConfig(configName);
        com.statsig.androidsdk.OnDeviceEvalAdapter onDeviceEvalAdapter = this.onDeviceEvalAdapter;
        if (onDeviceEvalAdapter != null) {
            com.statsig.androidsdk.StatsigUser statsigUser2 = this.user;
            if (statsigUser2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                statsigUser = statsigUser2;
            }
            com.statsig.androidsdk.DynamicConfig dynamicConfig = onDeviceEvalAdapter.getDynamicConfig(config, statsigUser);
            if (dynamicConfig != null) {
                return dynamicConfig;
            }
        }
        return config;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.statsig.androidsdk.DynamicConfig getExperimentEvaluation(java.lang.String experimentName, boolean keepDeviceValue) {
        com.statsig.androidsdk.Store store = this.store;
        com.statsig.androidsdk.StatsigUser statsigUser = null;
        if (store == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            store = null;
        }
        com.statsig.androidsdk.DynamicConfig experiment = store.getExperiment(experimentName, keepDeviceValue);
        com.statsig.androidsdk.OnDeviceEvalAdapter onDeviceEvalAdapter = this.onDeviceEvalAdapter;
        if (onDeviceEvalAdapter != null) {
            com.statsig.androidsdk.StatsigUser statsigUser2 = this.user;
            if (statsigUser2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                statsigUser = statsigUser2;
            }
            com.statsig.androidsdk.DynamicConfig dynamicConfig = onDeviceEvalAdapter.getDynamicConfig(experiment, statsigUser);
            if (dynamicConfig != null) {
                return dynamicConfig;
            }
        }
        return experiment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.statsig.androidsdk.Layer getLayerEvaluation(com.statsig.androidsdk.StatsigClient client, java.lang.String layerName, boolean keepDeviceValue) {
        com.statsig.androidsdk.Store store = this.store;
        com.statsig.androidsdk.StatsigUser statsigUser = null;
        if (store == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            store = null;
        }
        com.statsig.androidsdk.Layer layer = store.getLayer(client, layerName, keepDeviceValue);
        com.statsig.androidsdk.OnDeviceEvalAdapter onDeviceEvalAdapter = this.onDeviceEvalAdapter;
        if (onDeviceEvalAdapter != null) {
            com.statsig.androidsdk.StatsigUser statsigUser2 = this.user;
            if (statsigUser2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                statsigUser = statsigUser2;
            }
            com.statsig.androidsdk.Layer layer2 = onDeviceEvalAdapter.getLayer(client, layer, statsigUser);
            if (layer2 != null) {
                return layer2;
            }
        }
        return layer;
    }

    public static /* synthetic */ void logLayerParameterExposure$android_sdk_release$default(com.statsig.androidsdk.StatsigClient statsigClient, com.statsig.androidsdk.Layer layer, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        statsigClient.logLayerParameterExposure$android_sdk_release(layer, str, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void logLayerParameterExposure$android_sdk_release(com.statsig.androidsdk.Layer layer, java.lang.String parameterName, boolean isManual) {
        java.lang.String str;
        com.statsig.androidsdk.StatsigLogger statsigLogger;
        com.statsig.androidsdk.StatsigUser statsigUser;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameterName, "");
        if (isInitialized()) {
            java.util.Map<java.lang.String, java.lang.String>[] undelegatedSecondaryExposures$android_sdk_release = layer.getUndelegatedSecondaryExposures$android_sdk_release();
            java.util.Set<java.lang.String> explicitParameters$android_sdk_release = layer.getExplicitParameters$android_sdk_release();
            boolean z = explicitParameters$android_sdk_release != null && explicitParameters$android_sdk_release.contains(parameterName);
            if (z) {
                undelegatedSecondaryExposures$android_sdk_release = layer.getSecondaryExposures$android_sdk_release();
                java.lang.String allocatedExperimentName = layer.getAllocatedExperimentName();
                if (allocatedExperimentName != null) {
                    str = allocatedExperimentName;
                    java.util.Map<java.lang.String, java.lang.String>[] mapArr = undelegatedSecondaryExposures$android_sdk_release;
                    statsigLogger = this.logger;
                    com.statsig.androidsdk.StatsigUser statsigUser2 = null;
                    if (statsigLogger == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        statsigLogger = null;
                    }
                    java.lang.String name2 = layer.getName();
                    java.lang.String ruleIDForParameter = layer.getRuleIDForParameter(parameterName);
                    statsigUser = this.user;
                    if (statsigUser != null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    } else {
                        statsigUser2 = statsigUser;
                    }
                    statsigLogger.logLayerExposure(name2, ruleIDForParameter, mapArr, statsigUser2, str, parameterName, z, layer.getDetails(), isManual);
                }
            }
            str = "";
            java.util.Map<java.lang.String, java.lang.String>[] mapArr2 = undelegatedSecondaryExposures$android_sdk_release;
            statsigLogger = this.logger;
            com.statsig.androidsdk.StatsigUser statsigUser22 = null;
            if (statsigLogger == null) {
            }
            java.lang.String name22 = layer.getName();
            java.lang.String ruleIDForParameter2 = layer.getRuleIDForParameter(parameterName);
            statsigUser = this.user;
            if (statsigUser != null) {
            }
            statsigLogger.logLayerExposure(name22, ruleIDForParameter2, mapArr2, statsigUser22, str, parameterName, z, layer.getDetails(), isManual);
        }
    }

    public final com.statsig.androidsdk.Store getStore$android_sdk_release() {
        com.statsig.androidsdk.Store store = this.store;
        if (store != null) {
            return store;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    static /* synthetic */ void logExposure$default(com.statsig.androidsdk.StatsigClient statsigClient, java.lang.String str, com.statsig.androidsdk.DynamicConfig dynamicConfig, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        statsigClient.logExposure(str, dynamicConfig, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logExposure(java.lang.String name2, com.statsig.androidsdk.DynamicConfig config, boolean isManual) {
        com.statsig.androidsdk.StatsigLogger statsigLogger = this.logger;
        com.statsig.androidsdk.StatsigUser statsigUser = null;
        if (statsigLogger == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            statsigLogger = null;
        }
        com.statsig.androidsdk.StatsigUser statsigUser2 = this.user;
        if (statsigUser2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            statsigUser = statsigUser2;
        }
        statsigLogger.logExposure(name2, config, statsigUser, isManual);
    }

    static /* synthetic */ void logExposure$default(com.statsig.androidsdk.StatsigClient statsigClient, java.lang.String str, com.statsig.androidsdk.FeatureGate featureGate, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        statsigClient.logExposure(str, featureGate, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logExposure(java.lang.String name2, com.statsig.androidsdk.FeatureGate gate, boolean isManual) {
        com.statsig.androidsdk.StatsigLogger statsigLogger = this.logger;
        com.statsig.androidsdk.StatsigUser statsigUser = null;
        if (statsigLogger == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            statsigLogger = null;
        }
        com.statsig.androidsdk.StatsigUser statsigUser2 = this.user;
        if (statsigUser2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            statsigUser = statsigUser2;
        }
        statsigLogger.logExposure(name2, gate, statsigUser, isManual);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateStickyValues() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getStatsigScope$android_sdk_release(), this.dispatcherProvider.getIo(), null, new com.statsig.androidsdk.StatsigClient$updateStickyValues$1(this, null), 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.String] */
    private final java.lang.String getLocalStorageStableID() {
        kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        com.statsig.androidsdk.KeyValueStorage<java.lang.String> keyValueStorage = this.keyValueStorage;
        if (keyValueStorage == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            keyValueStorage = null;
        }
        objectRef.element = com.statsig.androidsdk.KeyValueStorageKt.readValueSync(keyValueStorage, "stableidstore", "STABLE_ID");
        if (objectRef.element == 0) {
            objectRef.element = java.util.UUID.randomUUID().toString();
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getStatsigScope$android_sdk_release(), null, null, new com.statsig.androidsdk.StatsigClient$getLocalStorageStableID$1(this, objectRef, null), 3, null);
        }
        return (java.lang.String) objectRef.element;
    }

    public final boolean isInitialized() {
        return this.initialized.get();
    }

    public final void enforceInitialized$android_sdk_release(java.lang.String functionName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionName, "");
        if (!this.initialized.get()) {
            throw new java.lang.IllegalStateException("The SDK must be initialized prior to invoking ".concat(java.lang.String.valueOf(functionName)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.statsig.androidsdk.StatsigUser normalizeUser(com.statsig.androidsdk.StatsigUser user) {
        com.statsig.androidsdk.StatsigUser statsigUser = new com.statsig.androidsdk.StatsigUser(null);
        if (user != null) {
            statsigUser = user.getCopyForEvaluation$android_sdk_release();
        }
        statsigUser.setStatsigEnvironment$android_sdk_release(getOptions$android_sdk_release().getEnvironment());
        kotlin.jvm.functions.Function1<com.statsig.androidsdk.StatsigUser, kotlin.Unit> userObjectValidator = getOptions$android_sdk_release().getUserObjectValidator();
        if (userObjectValidator != null) {
            userObjectValidator.invoke(statsigUser);
        }
        return statsigUser;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pollForUpdates() {
        com.statsig.androidsdk.StatsigUser statsigUser;
        if (getOptions$android_sdk_release().getEnableAutoValueUpdate()) {
            kotlinx.coroutines.Job job = this.pollingJob;
            if (job != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
            com.statsig.androidsdk.StatsigNetwork statsigNetwork$android_sdk_release = getStatsigNetwork$android_sdk_release();
            java.lang.String api = getOptions$android_sdk_release().getApi();
            com.statsig.androidsdk.StatsigUser statsigUser2 = this.user;
            if (statsigUser2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                statsigUser = null;
            } else {
                statsigUser = statsigUser2;
            }
            this.pollingJob = kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(statsigNetwork$android_sdk_release.pollForChanges(api, statsigUser, getStatsigClientMetadata$android_sdk_release(), (long) (getOptions$android_sdk_release().getAutoValueUpdateIntervalMinutes() * 60.0d * 1000.0d), getOptions$android_sdk_release().getInitializeFallbackUrls()), new com.statsig.androidsdk.StatsigClient$pollForUpdates$1(this, null)), getStatsigScope$android_sdk_release());
        }
    }

    private final void populateStatsigMetadata() {
        getStatsigClientMetadata$android_sdk_release().overrideStableID$android_sdk_release(getOptions$android_sdk_release().getOverrideStableID());
        try {
            android.app.Application application = this.application;
            android.app.Application application2 = null;
            if (application == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                application = null;
            }
            if (application.getPackageManager() == null || getOptions$android_sdk_release().getOptOutNonSdkMetadata()) {
                return;
            }
            android.app.Application application3 = this.application;
            if (application3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                application3 = null;
            }
            android.content.pm.PackageManager packageManager = application3.getPackageManager();
            android.app.Application application4 = this.application;
            if (application4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                application2 = application4;
            }
            android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(application2.getPackageName(), 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageInfo, "");
            getStatsigClientMetadata$android_sdk_release().setAppVersion(packageInfo.versionName);
            getStatsigClientMetadata$android_sdk_release().setAppIdentifier(packageInfo.packageName);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object shutdownImpl(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.statsig.androidsdk.StatsigClient$shutdownImpl$1 statsigClient$shutdownImpl$1;
        int i;
        com.statsig.androidsdk.StatsigClient statsigClient;
        com.statsig.androidsdk.StatsigActivityLifecycleListener statsigActivityLifecycleListener;
        if (continuation instanceof com.statsig.androidsdk.StatsigClient$shutdownImpl$1) {
            statsigClient$shutdownImpl$1 = (com.statsig.androidsdk.StatsigClient$shutdownImpl$1) continuation;
            if ((statsigClient$shutdownImpl$1.label & Integer.MIN_VALUE) != 0) {
                statsigClient$shutdownImpl$1.label -= 2147483648;
                java.lang.Object obj = statsigClient$shutdownImpl$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = statsigClient$shutdownImpl$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.initialized.set(false);
                    kotlinx.coroutines.Job job = this.pollingJob;
                    if (job != null) {
                        kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    }
                    com.statsig.androidsdk.StatsigLogger statsigLogger = this.logger;
                    if (statsigLogger == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        statsigLogger = null;
                    }
                    statsigClient$shutdownImpl$1.L$0 = this;
                    statsigClient$shutdownImpl$1.label = 1;
                    if (statsigLogger.shutdown(statsigClient$shutdownImpl$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    statsigClient = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    statsigClient = (com.statsig.androidsdk.StatsigClient) statsigClient$shutdownImpl$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                statsigActivityLifecycleListener = statsigClient.lifecycleListener;
                if (statsigActivityLifecycleListener == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    statsigActivityLifecycleListener = null;
                }
                statsigActivityLifecycleListener.shutdown();
                statsigClient.isBootstrapped.set(false);
                statsigClient.errorBoundary = new com.statsig.androidsdk.ErrorBoundary(statsigClient.errorScope);
                statsigClient.statsigJob = kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
                statsigClient.isInitializing.set(false);
                return kotlin.Unit.INSTANCE;
            }
        }
        statsigClient$shutdownImpl$1 = new com.statsig.androidsdk.StatsigClient$shutdownImpl$1(this, continuation);
        java.lang.Object obj2 = statsigClient$shutdownImpl$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = statsigClient$shutdownImpl$1.label;
        if (i != 0) {
        }
        statsigActivityLifecycleListener = statsigClient.lifecycleListener;
        if (statsigActivityLifecycleListener == null) {
        }
        statsigActivityLifecycleListener.shutdown();
        statsigClient.isBootstrapped.set(false);
        statsigClient.errorBoundary = new com.statsig.androidsdk.ErrorBoundary(statsigClient.errorScope);
        statsigClient.statsigJob = kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
        statsigClient.isInitializing.set(false);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logEndDiagnostics(boolean success, com.statsig.androidsdk.ContextType context, com.statsig.androidsdk.InitializeResponse initResponse) {
        com.statsig.androidsdk.Diagnostics diagnostics;
        com.statsig.androidsdk.Diagnostics diagnostics2 = this.diagnostics;
        com.statsig.androidsdk.StatsigLogger statsigLogger = null;
        if (diagnostics2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            diagnostics = null;
        } else {
            diagnostics = diagnostics2;
        }
        com.statsig.androidsdk.KeyType keyType = com.statsig.androidsdk.KeyType.OVERALL;
        com.statsig.androidsdk.Store store = this.store;
        if (store == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            store = null;
        }
        diagnostics.markEnd(keyType, success, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : new com.statsig.androidsdk.Marker(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, store.getGlobalEvaluationDetails$android_sdk_release(), initResponse instanceof com.statsig.androidsdk.InitializeResponse.FailedInitializeResponse ? com.statsig.androidsdk.Diagnostics.INSTANCE.formatFailedResponse((com.statsig.androidsdk.InitializeResponse.FailedInitializeResponse) initResponse) : null, null, null, null, 950271, null), (r13 & 16) != 0 ? null : context);
        com.statsig.androidsdk.StatsigLogger statsigLogger2 = this.logger;
        if (statsigLogger2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            statsigLogger = statsigLogger2;
        }
        statsigLogger.logDiagnostics(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logEndDiagnosticsWhenException(com.statsig.androidsdk.ContextType context, java.lang.Exception e) {
        com.statsig.androidsdk.Diagnostics diagnostics;
        com.statsig.androidsdk.ContextType contextType;
        java.lang.Class<?> cls;
        try {
            com.statsig.androidsdk.Diagnostics diagnostics2 = this.diagnostics;
            if (diagnostics2 == null || this.logger == null) {
                return;
            }
            if (diagnostics2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                diagnostics = null;
            } else {
                diagnostics = diagnostics2;
            }
            com.statsig.androidsdk.KeyType keyType = com.statsig.androidsdk.KeyType.OVERALL;
            java.lang.String name2 = (e == null || (cls = e.getClass()) == null) ? null : cls.getName();
            java.lang.String message = e != null ? e.getMessage() : null;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(name2);
            sb.append(": ");
            sb.append(message);
            diagnostics.markEnd(keyType, false, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : new com.statsig.androidsdk.Marker(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new com.statsig.androidsdk.Marker.ErrorMessage(sb.toString(), null, null, 6, null), null, null, null, 983039, null), (r13 & 16) != 0 ? null : context);
            com.statsig.androidsdk.StatsigLogger statsigLogger = this.logger;
            if (statsigLogger == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                contextType = context;
                statsigLogger = null;
            } else {
                contextType = context;
            }
            statsigLogger.logDiagnostics(contextType);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getStatsigScope$android_sdk_release(), this.dispatcherProvider.getIo(), null, new com.statsig.androidsdk.StatsigClient$logEndDiagnosticsWhenException$1(this, null), 2, null);
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.statsig.androidsdk.LifecycleEventListener
    public final void onAppFocus() {
        if (getOptions$android_sdk_release().getDisableLogEventRetries()) {
            return;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.retryScope, this.dispatcherProvider.getIo(), null, new com.statsig.androidsdk.StatsigClient$onAppFocus$1(this, null), 2, null);
    }

    @Override // com.statsig.androidsdk.LifecycleEventListener
    public final void onAppBlur() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getStatsigScope$android_sdk_release(), null, null, new com.statsig.androidsdk.StatsigClient$onAppBlur$1(this, null), 3, null);
    }

    public final void logEvent(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        logEvent$default(this, str, str2, (java.util.Map) null, 4, (java.lang.Object) null);
    }

    public final void logEvent(java.lang.String str, java.lang.Double d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        logEvent$default(this, str, d, (java.util.Map) null, 4, (java.lang.Object) null);
    }

    public final void logEvent(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        logEvent$default(this, str, (java.lang.Double) null, (java.util.Map) null, 6, (java.lang.Object) null);
    }
}
